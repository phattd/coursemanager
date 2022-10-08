/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package resoure.type;

public enum Prefix {
    COURSE {
        @Override
        public String toString() {
            return "KHOA_HOC_PREFIX";
        }
    },
    STUDENT {
        @Override
        public String toString() {
            return "HOC_SINH_PREFIX";
        }
    },
    SCROPE {
        @Override
        public String toString() {
            return "DIEM_SO_PREFIX";
        }
    },
    TIME_TABLE {
        @Override
        public String toString() {
            return "THOI_GIAN_BIEU_PREFIX";
        }
    },
    TEACHER {
        @Override
        public String toString() {
            return "GIANG_VIEN_PREFIX";
        }
    }
}
