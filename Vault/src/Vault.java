/**
 * @author GDX
 * @version 1.0
 * @date 2022/5/28 16:24
 */

import java.util.Scanner;

public class Vault {
    static int start_row, start_col;
    static int stop_row, stop_col;
    static int vault_row, vault_col;
    static int count;
    static String path = "";

    public static void main(String[] args) {
        System.out.print("请输入棋盘行数:");
        vault_row = ScannerInt();
        System.out.print("请输入棋盘列数:");
        vault_col = ScannerInt();

        while (true) {
            System.out.print("请输入起点行坐标:");
            start_row = ScannerInt();

            System.out.print("请输入起点列坐标:");
            start_col = ScannerInt();
            if (start_row < 0 || start_col < 0 || start_row > vault_row || start_col > vault_col) {
                System.out.println("越界了请重新输入");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("请输入终点行坐标:");
            stop_row = ScannerInt();

            System.out.print("请输入终点列坐标:");
            stop_col = ScannerInt();
            if (stop_row < start_row) {
                System.out.println("好马不走回头路,终点位置有错，请重新输入");
                continue;
            } else if (stop_row > vault_row || stop_col > vault_col) {
                System.out.println("越界了请重新输入");
                continue;
            }
            break;
        }

        dfs(start_row, start_col);
        System.out.println("总路线有:" + count + "条");
    }

    public static int ScannerInt() {
        Scanner sc = new Scanner(System.in);
        while (!(sc.hasNextInt())) {
            System.out.print("您输入的数量不是整型，请重新输入:");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void dfs(int row, int col) {
        path += "(" + row + "," + col + ")";
        if (row < start_row || row > vault_row || col < start_col || col > vault_col) {
            path = path.substring(0, path.lastIndexOf("("));
            return;
        }
        if (row == stop_row && col == stop_col) {
            count++;
            System.out.println("路线" + count + ":" + path);
            path = path.substring(0, path.lastIndexOf("("));
            return;
        }
        dfs(row - 2, col + 1);
        dfs(row - 1, col + 2);
        dfs(row + 1, col + 2);
        dfs(row + 2, col + 1);
        path = path.substring(0, path.lastIndexOf("("));
    }

}





