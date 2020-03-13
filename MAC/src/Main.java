public class Main {
}

    public void convertCSV ("E:\\Devel\MAC\mac.txt") throws IOException {
        // Gets the CSV files.
        File[] csvFiles = dir.listFiles();
        // Sets up the Workbook and gets the 1st (0) sheet.
        File excelFile = new File("E:\\Devel\MAC\mac.xls");
        InputStream input = new FileInputStream(excelFile);
        HSSFWorkbook workbook = new HSSFWorkbook(input);
        HSSFSheet sheet = workbook.getSheetAt(0);

        int rowNo = 0;
        int columnNo = 0;

        // Loop through the files.
        for(File file : csvFiles) {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Получает строку, и если она не существует, то он создаст ее.
                Row tempRow = sheet.getRow(rowNo);
                if(tempRow == null)
                    tempRow = sheet.createRow(rowNo);

                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                // While there is more text to get it will loop.
                while(lineScanner.hasNext()) {
                    // Gets the cell in that row and if it is null then it will be created.
                    Cell tempCell = tempRow.getCell(columnNo, Row.CREATE_NULL_AS_BLANK);
                    String output = lineScanner.next();
                    // Write the output to that cell.
                    tempCell.setCellValue(new HSSFRichTextString(output));
                    columnNo++;
                }
                // Resets the column count for the new row.
                columnNo = 0;
                rowNo++;
            }
        }
        // Writes the file and closes everything.
        FileOutputStream out = new FileOutputStream(excelFile);
        workbook.write(out);
        input.close();
        out.close();
    }