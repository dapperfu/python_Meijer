package sk;

import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\f\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00042\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\f\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0018\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0017\u0010 \u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006#"}, d2 = {"Lsk/a;", "", "<init>", "()V", "", "city", "state", "zip", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "parts", "a", "([Ljava/lang/String;)Ljava/lang/String;", "f", "line1", "line2", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "addressLine1", "addressLine2", "zipCode", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "CANADIAN_POSTAL_CODE_RAW_REGEX", "US_ZIP_CODE_BASIC_RAW_REGEX", "e", "()Ljava/util/regex/Pattern;", "US_ZIP_CODE_EXTENDED_RAW_REGEX", "PHONE_NUMBER_RAW_REGEX", "PHONE_NUMBER_ALL_ZEROS_REGEX", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: sk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16981a {

    /* renamed from: a, reason: collision with root package name */
    public static final C16981a f160555a = new C16981a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern CANADIAN_POSTAL_CODE_RAW_REGEX;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern US_ZIP_CODE_BASIC_RAW_REGEX;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Pattern US_ZIP_CODE_EXTENDED_RAW_REGEX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern PHONE_NUMBER_RAW_REGEX;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final Pattern PHONE_NUMBER_ALL_ZEROS_REGEX;

    public final String b(String line1, String line2) {
        if (line1 == null || StringsKt.r0(line1)) {
            line1 = null;
        }
        if (line2 == null || StringsKt.r0(line2)) {
            line2 = null;
        }
        String strB0 = CollectionsKt.B0(CollectionsKt.r(line1, line2), ", ", null, null, 0, null, null, 62, null);
        if (StringsKt.r0(strB0)) {
            return null;
        }
        return strB0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[PHI: r12
      0x0056: PHI (r12v6 java.lang.String) = (r12v5 java.lang.String), (r12v11 java.lang.String) binds: [B:30:0x0066, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto La
            boolean r1 = kotlin.text.StringsKt.r0(r11)
            if (r1 != 0) goto La
            goto Lb
        La:
            r11 = r0
        Lb:
            if (r12 == 0) goto L14
            boolean r1 = kotlin.text.StringsKt.r0(r12)
            if (r1 != 0) goto L14
            goto L15
        L14:
            r12 = r0
        L15:
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            java.util.List r11 = kotlin.collections.CollectionsKt.r(r11)
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r8 = 62
            r9 = 0
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt.B0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r12 = kotlin.text.StringsKt.r0(r11)
            if (r12 != 0) goto L35
            goto L36
        L35:
            r11 = r0
        L36:
            if (r13 == 0) goto L58
            java.util.regex.Pattern r12 = sk.C16981a.CANADIAN_POSTAL_CODE_RAW_REGEX
            r5 = 4
            r6 = 0
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            r4 = 0
            r1 = r13
            java.lang.String r13 = kotlin.text.StringsKt.Q(r1, r2, r3, r4, r5, r6)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r12 = r12.matches()
            if (r12 == 0) goto L52
            r12 = r1
            goto L53
        L52:
            r12 = r0
        L53:
            if (r12 != 0) goto L56
            goto L59
        L56:
            r0 = r12
            goto L69
        L58:
            r1 = r13
        L59:
            if (r1 == 0) goto L69
            r12 = 5
            java.lang.String r12 = kotlin.text.StringsKt.J1(r1, r12)
            if (r12 == 0) goto L69
            boolean r13 = kotlin.text.StringsKt.r0(r12)
            if (r13 != 0) goto L69
            goto L56
        L69:
            java.lang.String[] r11 = new java.lang.String[]{r11, r0}
            java.util.List r11 = kotlin.collections.CollectionsKt.r(r11)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = " "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt.B0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.C16981a.c(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    static {
        Pattern patternCompile = Pattern.compile("^[ABCEGHJKLMNPRSTVXYabceghjklmnprstvxy][0-9][ABCEGHJKLMNPRSTVWXYZabceghjklmnprstvwxyz][0-9][ABCEGHJKLMNPRSTVWXYZabceghjklmnprstvwxyz][0-9]$");
        Intrinsics.i(patternCompile, "compile(...)");
        CANADIAN_POSTAL_CODE_RAW_REGEX = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^[0123456789]{5}$");
        Intrinsics.i(patternCompile2, "compile(...)");
        US_ZIP_CODE_BASIC_RAW_REGEX = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("^[0123456789]{9}$");
        Intrinsics.i(patternCompile3, "compile(...)");
        US_ZIP_CODE_EXTENDED_RAW_REGEX = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("^[0123456789]{10}$");
        Intrinsics.i(patternCompile4, "compile(...)");
        PHONE_NUMBER_RAW_REGEX = patternCompile4;
        Pattern patternCompile5 = Pattern.compile("^[0]{10}$");
        Intrinsics.i(patternCompile5, "compile(...)");
        PHONE_NUMBER_ALL_ZEROS_REGEX = patternCompile5;
    }

    public final String a(String... parts) {
        Intrinsics.j(parts, "parts");
        ArrayList arrayList = new ArrayList();
        for (String str : parts) {
            if (str != null && !StringsKt.r0(str)) {
                arrayList.add(str);
            }
        }
        return CollectionsKt.B0(arrayList, " ", null, null, 0, null, null, 62, null);
    }

    public final Pattern e() {
        return US_ZIP_CODE_EXTENDED_RAW_REGEX;
    }

    public final String f(String... parts) {
        Intrinsics.j(parts, "parts");
        ArrayList arrayList = new ArrayList();
        for (String str : parts) {
            if (str != null && !StringsKt.r0(str)) {
                arrayList.add(str);
            }
        }
        return CollectionsKt.B0(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final String g(String zip) {
        String strJ1;
        if (CANADIAN_POSTAL_CODE_RAW_REGEX.matcher(zip == null ? "" : zip).matches()) {
            return zip == null ? "" : zip;
        }
        String str = null;
        if (zip != null && (strJ1 = StringsKt.J1(zip, 5)) != null && !StringsKt.r0(strJ1)) {
            str = strJ1;
        }
        return str == null ? "" : str;
    }

    private C16981a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r10 = this;
            java.lang.String[] r12 = new java.lang.String[]{r11, r12}
            java.util.List r12 = kotlin.collections.CollectionsKt.p(r12)
            r0 = 0
            if (r11 == 0) goto L11
            boolean r11 = kotlin.text.StringsKt.r0(r11)
            if (r11 == 0) goto L12
        L11:
            r12 = r0
        L12:
            if (r12 == 0) goto L50
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r12.iterator()
        L1f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L39
            java.lang.Object r12 = r11.next()
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L1f
            int r2 = r2.length()
            if (r2 != 0) goto L35
            goto L1f
        L35:
            r1.add(r12)
            goto L1f
        L39:
            r8 = 62
            r9 = 0
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt.B0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L50
            boolean r12 = kotlin.text.StringsKt.r0(r11)
            if (r12 != 0) goto L50
            goto L51
        L50:
            r11 = r0
        L51:
            java.lang.String r12 = r10.c(r13, r14, r15)
            boolean r13 = kotlin.text.StringsKt.r0(r12)
            if (r13 != 0) goto L5c
            goto L5d
        L5c:
            r12 = r0
        L5d:
            java.lang.String[] r12 = new java.lang.String[]{r11, r12}
            java.util.List r12 = kotlin.collections.CollectionsKt.p(r12)
            if (r11 == 0) goto L6d
            boolean r11 = kotlin.text.StringsKt.r0(r11)
            if (r11 == 0) goto L6e
        L6d:
            r12 = r0
        L6e:
            if (r12 == 0) goto Lac
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r12.iterator()
        L7b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L95
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L7b
            int r13 = r13.length()
            if (r13 != 0) goto L91
            goto L7b
        L91:
            r1.add(r12)
            goto L7b
        L95:
            r8 = 62
            r9 = 0
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt.B0(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto Lac
            boolean r12 = kotlin.text.StringsKt.r0(r11)
            if (r12 != 0) goto Lac
            r0 = r11
        Lac:
            if (r0 != 0) goto Lb1
            java.lang.String r11 = ""
            return r11
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.C16981a.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
