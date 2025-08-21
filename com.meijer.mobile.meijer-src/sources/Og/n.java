package Og;

/* loaded from: classes8.dex */
final class n extends c {
    @Override // Og.c
    int c(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
            return 1;
        }
        if (c10 >= 'a' && c10 <= 'z') {
            sb2.append((char) (c10 - 'S'));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '+'));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - 'E'));
            return 2;
        }
        if (c10 == '`') {
            sb2.append((char) 2);
            sb2.append((char) 0);
            return 2;
        }
        if (c10 <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) (c10 - '@'));
            return 2;
        }
        if (c10 > 127) {
            sb2.append("\u0001\u001e");
            return c((char) (c10 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c10 - '`'));
        return 2;
    }

    @Override // Og.c
    public int f() {
        return 2;
    }

    n() {
    }
}
