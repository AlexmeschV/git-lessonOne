package org.example.Lesson_03;

public class Matrix {
    int[][] matrix; // двумерный массив вещественных чисел
    int rows; // количество строк в матрице
    int columns; // количество столбцов в матрице

    public Matrix() {
        this.matrix = new int[rows][columns]; // создание массива размером [rows][columns]
    }

    public void addRow(int value) {
        if (value >= rows || value < 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
        if (value == 0) {
            throw new IllegalArgumentException("Массив пустой");
        }
        matrix[rows][columns] = value;
        rows++;
        columns++;
    }

    public void addColumn(int value) {
        if (value >= columns || value < 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
        if (value == 0) {
            throw new IllegalArgumentException("Массив пустой");
        }
        matrix[rows][columns] = value;
        rows++;
        columns++;
    }
}
