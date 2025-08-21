package m2;

import android.text.SpannableStringBuilder;
import fsimpl.C14170dq;
import java.util.Locale;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15655a {

    /* renamed from: d, reason: collision with root package name */
    static final s f150501d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f150502e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f150503f;

    /* renamed from: g, reason: collision with root package name */
    static final C15655a f150504g;

    /* renamed from: h, reason: collision with root package name */
    static final C15655a f150505h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f150506a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150507b;

    /* renamed from: c, reason: collision with root package name */
    private final s f150508c;

    /* renamed from: m2.a$a, reason: collision with other inner class name */
    public static final class C2320a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f150509a;

        /* renamed from: b, reason: collision with root package name */
        private int f150510b;

        /* renamed from: c, reason: collision with root package name */
        private s f150511c;

        private static C15655a b(boolean z10) {
            return z10 ? C15655a.f150505h : C15655a.f150504g;
        }

        private void c(boolean z10) {
            this.f150509a = z10;
            this.f150511c = C15655a.f150501d;
            this.f150510b = 2;
        }

        public C15655a a() {
            return (this.f150510b == 2 && this.f150511c == C15655a.f150501d) ? b(this.f150509a) : new C15655a(this.f150509a, this.f150510b, this.f150511c);
        }

        public C2320a() {
            c(C15655a.e(Locale.getDefault()));
        }
    }

    /* renamed from: m2.a$b */
    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f150512f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f150513a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f150514b;

        /* renamed from: c, reason: collision with root package name */
        private final int f150515c;

        /* renamed from: d, reason: collision with root package name */
        private int f150516d;

        /* renamed from: e, reason: collision with root package name */
        private char f150517e;

        int d() {
            this.f150516d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f150516d < this.f150515c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f150516d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f150512f[i10] = Character.getDirectionality(i10);
            }
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f150512f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f150516d;
            do {
                int i11 = this.f150516d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f150513a;
                int i12 = i11 - 1;
                this.f150516d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f150517e = cCharAt;
                if (cCharAt == '&') {
                    return C14170dq.XOR;
                }
            } while (cCharAt != ';');
            this.f150516d = i10;
            this.f150517e = ';';
            return C14170dq.DARKEN;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f150516d;
                if (i10 >= this.f150515c) {
                    return C14170dq.XOR;
                }
                CharSequence charSequence = this.f150513a;
                this.f150516d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f150517e = cCharAt;
            } while (cCharAt != ';');
            return C14170dq.XOR;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f150516d;
            while (true) {
                int i11 = this.f150516d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f150513a;
                int i12 = i11 - 1;
                this.f150516d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f150517e = cCharAt2;
                if (cCharAt2 == '<') {
                    return C14170dq.XOR;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f150516d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f150513a;
                            int i14 = i13 - 1;
                            this.f150516d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f150517e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f150516d = i10;
            this.f150517e = '>';
            return C14170dq.DARKEN;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f150516d;
            while (true) {
                int i11 = this.f150516d;
                if (i11 >= this.f150515c) {
                    this.f150516d = i10;
                    this.f150517e = '<';
                    return C14170dq.DARKEN;
                }
                CharSequence charSequence = this.f150513a;
                this.f150516d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f150517e = cCharAt2;
                if (cCharAt2 == '>') {
                    return C14170dq.XOR;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f150516d;
                        if (i12 < this.f150515c) {
                            CharSequence charSequence2 = this.f150513a;
                            this.f150516d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f150517e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f150513a.charAt(this.f150516d - 1);
            this.f150517e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f150513a, this.f150516d);
                this.f150516d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f150516d--;
            byte bC = c(this.f150517e);
            if (!this.f150514b) {
                return bC;
            }
            char c10 = this.f150517e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f150513a.charAt(this.f150516d);
            this.f150517e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f150513a, this.f150516d);
                this.f150516d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f150516d++;
            byte bC = c(this.f150517e);
            if (!this.f150514b) {
                return bC;
            }
            char c10 = this.f150517e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        int e() {
            this.f150516d = this.f150515c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f150516d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        if (bA == 1 || bA == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f150513a = charSequence;
            this.f150514b = z10;
            this.f150515c = charSequence.length();
        }
    }

    private String f(CharSequence charSequence, s sVar) {
        boolean zIsRtl = sVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f150506a || !(zIsRtl || b(charSequence) == 1)) ? this.f150506a ? (!zIsRtl || b(charSequence) == -1) ? f150503f : "" : "" : f150502e;
    }

    private String g(CharSequence charSequence, s sVar) {
        boolean zIsRtl = sVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f150506a || !(zIsRtl || a(charSequence) == 1)) ? this.f150506a ? (!zIsRtl || a(charSequence) == -1) ? f150503f : "" : "" : f150502e;
    }

    static {
        s sVar = t.f150533c;
        f150501d = sVar;
        f150502e = Character.toString((char) 8206);
        f150503f = Character.toString((char) 8207);
        f150504g = new C15655a(false, 2, sVar);
        f150505h = new C15655a(true, 2, sVar);
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C15655a c() {
        return new C2320a().a();
    }

    public boolean d() {
        return (this.f150507b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f150508c, true);
    }

    public CharSequence i(CharSequence charSequence, s sVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = sVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? t.f150532b : t.f150531a));
        }
        if (zIsRtl != this.f150506a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? t.f150532b : t.f150531a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f150508c, true);
    }

    public String k(String str, s sVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, sVar, z10).toString();
    }

    C15655a(boolean z10, int i10, s sVar) {
        this.f150506a = z10;
        this.f150507b = i10;
        this.f150508c = sVar;
    }

    static boolean e(Locale locale) {
        if (u.a(locale) == 1) {
            return true;
        }
        return false;
    }
}
