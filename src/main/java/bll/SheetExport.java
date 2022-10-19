/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dto.DiemSo;
import dto.HocVien;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import resoure.type.Message;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class SheetExport {
    private static void writeFile(ArrayList<Object[]> data, String fileName, String sheetName) throws IOException {

        String fullName=fileName+".xls";
        String path="src/main/java/exports/"+fullName;
        File file=new File(path);
        FileOutputStream outputStream=new FileOutputStream(file);
        Workbook workbook=new HSSFWorkbook();
        Sheet sheet= workbook.createSheet(sheetName);
        int numRow=0;
        for (Object[] index : data)
        {
            Row row= sheet.createRow(numRow++);
            int cellNum=0;
            for (Object obj : index)
            {
                Cell cell= row.createCell(cellNum++);
                if(obj instanceof String)
                    cell.setCellValue((String) obj);
                else if(obj instanceof Double)
                    cell.setCellValue((Double)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();

    }
    public static Message exportHocVien(String[] header, ArrayList<HocVien> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);

        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).parseArrayFormatDate());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile="HOCVIEN-"+timestamp.getTime();
        try {
            writeFile(result,nameFile,"HocVien");
            return Message.OK;
        } catch (IOException e) {
            return Message.ERROR_EXPORT_XLS;
        }
    }
    public static Message exportDiemSo(String[] header, ArrayList<DiemSo> data)
    {
        ArrayList<Object[]> result=new ArrayList<>();
        result.add(header);
        for (int index=0;index<data.size();index++)
        {
            result.add(data.get(index).parseArray());
        }
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String nameFile="DIEMSO-"+timestamp.getTime();
        try {
            writeFile(result,nameFile,"Diem So");
            return Message.OK;
        } catch (IOException e) {
            return Message.ERROR_EXPORT_XLS;
        }
    }
}
