class TDA {
    int arr[][];

    TDA(int rsize, int csize) {
        arr = new int[rsize][csize];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertion(int row, int col, int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[row][col] == Integer.MIN_VALUE) {
                        arr[row][col] = value;
                        return;
                    } else {
                        System.out.println("Cell is filled");
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void search_by_index(int r, int c) {
        try {
            if (arr[r][c] != Integer.MIN_VALUE) {
                System.out.println("Value is present in " + arr[r][c]);
            } else {
                System.out.println("No data found");
            }

        } catch (Exception e) {
            System.out.println("Invalid id");
        }
    }

    public void search_by_value(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] == value) {
                        System.out.println("The value is present at " + i + " " + j);
                        return;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid value");
        }
    }

    public void delete_by_index(int r, int c) {
        try {
            if (arr[r][c] != Integer.MIN_VALUE) {
                System.out.println("data deleted " + arr[r][c] + " deleted");
                arr[r][c] = Integer.MIN_VALUE;
            } else {
                System.out.println("Index is empty");
            }
        } catch (Exception e) {
            System.out.println("Invalid id");
        }
    }

    public void delete_by_value(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == value) {
                        arr[i][j] = Integer.MIN_VALUE;
                        System.out.println("Data deleted at index " + i + " " + j);
                        return;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }
}

public class Array {
    public static void main(String[] args) {

        TDA tda = new TDA(3, 3);
        tda.insertion(0, 0, 10);
        tda.insertion(0, 1, 20);
        tda.insertion(0, 2, 30);
        tda.insertion(1, 0, 40);
        tda.insertion(1, 1, 60);
        tda.insertion(1, 2, 70);
        tda.insertion(2, 0, 80);
        tda.insertion(2, 1, 90);
        tda.insertion(2, 2, 100);
        tda.print();

        System.out.println("Searching by index");

        tda.search_by_index(1, 2);

        System.out.println("Search the value");
        tda.search_by_value(70);
        System.out.println("Delete by index");
        tda.delete_by_index(2, 1);
        System.out.println("Delete by value");
        tda.delete_by_value(60);


    }
}
