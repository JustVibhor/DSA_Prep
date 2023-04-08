package com.vibhor.JavaProg;

import java.util.ArrayList;
import java.util.List;

public class googleQues {

    public static void main(String[] args) {
//        System.out.println(path_bta(3, 3));
//        path_bta_2("", 3, 3);
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
//        maze_dekh_de("", maze, 0, 0);
        print_maze_matrix("", maze, 0, 0, path, 0);
    }

    static List<String> dial_pad(String p, String up) {
        if(up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
//            System.out.println(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(dial_pad(p+ch, up.substring(1)));
        }
        return ans;
    }

    static List<String> Dice(String p, int target) {
        if(target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            ans.addAll(Dice(p+i, target-i));
        }
        return ans;
    }

    static int path_bta(int r, int c) {
        if(r==1 || c==1) {
            return 1;
        }

        int right = path_bta(r-1, c);
        int down = path_bta(r, c-1);

        return right+down;
    }

    static void path_bta_2(String p, int r, int c) {
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }


        if(r>1) {
            path_bta_2(p+" Right", r-1, c);

        }

        if(c>1) {
            path_bta_2(p+" Down", r, c-1);

        }

        if(r>1 && c>1) {
            path_bta_2(p+" Diagonal", r-1, c-1);
        }
    }

    static void maze_dekh_de(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length -1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }
        maze[r][c] = false;

        if(r<maze.length-1) {
            maze_dekh_de(p+"Right ", maze, r+1, c);
        }
        if(c<maze[0].length-1) {
            maze_dekh_de(p+"Down ", maze, r, c+1);
        }
        if(r>0) {
            maze_dekh_de(p+"Up ", maze, r-1, c);
        }
        if(c>0) {
            maze_dekh_de(p+"Left ", maze, r, c-1);
        }
        maze[r][c] = true;
    }


    static void print_maze_matrix(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length - 1 && c == maze[0].length) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1) {
            print_maze_matrix(p + "Down ", maze, r+1, c, path, step+1);
        }
        if(c < maze[0].length - 1) {
            print_maze_matrix(p+"Right ", maze, r, c+1, path, step+1);
        }
        if(r>0) {
            print_maze_matrix(p+"Up ", maze, r-1, c, path, step+1);
        }
        if(c>0) {
            print_maze_matrix(p+"Left ", maze, r, c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }





}
