package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.medallia.digital.mobilesdk.q2;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public class JvmClassName {

    /* renamed from: a, reason: collision with root package name */
    private final String f146224a;

    /* renamed from: b, reason: collision with root package name */
    private FqName f146225b;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r9) {
        /*
            r0 = 5
            r1 = 3
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            switch(r9) {
                case 8: goto Lc;
                case 9: goto Lc;
                case 10: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r9 == r1) goto L18
            if (r9 == r0) goto L18
            switch(r9) {
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                default: goto L16;
            }
        L16:
            r4 = r1
            goto L19
        L18:
            r4 = r3
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName"
            r6 = 0
            switch(r9) {
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L26;
                case 5: goto L2b;
                case 6: goto L26;
                case 7: goto L21;
                case 8: goto L2b;
                case 9: goto L2b;
                case 10: goto L2b;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L32
        L26:
            java.lang.String r7 = "fqName"
            r4[r6] = r7
            goto L32
        L2b:
            r4[r6] = r5
            goto L32
        L2e:
            java.lang.String r7 = "classId"
            r4[r6] = r7
        L32:
            java.lang.String r6 = "internalNameByClassId"
            java.lang.String r7 = "byFqNameWithoutInnerClasses"
            r8 = 1
            if (r9 == r1) goto L53
            if (r9 == r0) goto L50
            switch(r9) {
                case 8: goto L4b;
                case 9: goto L46;
                case 10: goto L41;
                default: goto L3e;
            }
        L3e:
            r4[r8] = r5
            goto L55
        L41:
            java.lang.String r5 = "getInternalName"
            r4[r8] = r5
            goto L55
        L46:
            java.lang.String r5 = "getPackageFqName"
            r4[r8] = r5
            goto L55
        L4b:
            java.lang.String r5 = "getFqNameForClassNameWithoutDollars"
            r4[r8] = r5
            goto L55
        L50:
            r4[r8] = r7
            goto L55
        L53:
            r4[r8] = r6
        L55:
            switch(r9) {
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L6c;
                case 4: goto L62;
                case 5: goto L6c;
                case 6: goto L62;
                case 7: goto L5d;
                case 8: goto L6c;
                case 9: goto L6c;
                case 10: goto L6c;
                default: goto L58;
            }
        L58:
            java.lang.String r5 = "byInternalName"
            r4[r3] = r5
            goto L6c
        L5d:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L6c
        L62:
            r4[r3] = r7
            goto L6c
        L65:
            r4[r3] = r6
            goto L6c
        L68:
            java.lang.String r5 = "byClassId"
            r4[r3] = r5
        L6c:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r9 == r1) goto L7d
            if (r9 == r0) goto L7d
            switch(r9) {
                case 8: goto L7d;
                case 9: goto L7d;
                case 10: goto L7d;
                default: goto L77;
            }
        L77:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L82
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L82:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.a(int):void");
    }

    private JvmClassName(String str) {
        if (str == null) {
            a(7);
        }
        this.f146224a = str;
    }

    public static JvmClassName b(ClassId classId) {
        if (classId == null) {
            a(1);
        }
        return new JvmClassName(h(classId));
    }

    public static JvmClassName c(FqName fqName) {
        if (fqName == null) {
            a(4);
        }
        JvmClassName jvmClassName = new JvmClassName(fqName.a().replace('.', '/'));
        jvmClassName.f146225b = fqName;
        return jvmClassName;
    }

    public static JvmClassName d(String str) {
        if (str == null) {
            a(0);
        }
        return new JvmClassName(str);
    }

    public static String h(ClassId classId) {
        if (classId == null) {
            a(2);
        }
        FqName fqNameF = classId.f();
        String strReplace = classId.g().a().replace('.', '$');
        if (!fqNameF.c()) {
            strReplace = fqNameF.a().replace('.', '/') + q2.f92724c + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public FqName e() {
        return new FqName(this.f146224a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f146224a.equals(((JvmClassName) obj).f146224a);
    }

    public String f() {
        String str = this.f146224a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public FqName g() {
        int iLastIndexOf = this.f146224a.lastIndexOf(q2.f92724c);
        if (iLastIndexOf != -1) {
            return new FqName(this.f146224a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        FqName fqName = FqName.f145679d;
        if (fqName == null) {
            a(9);
        }
        return fqName;
    }

    public int hashCode() {
        return this.f146224a.hashCode();
    }

    public String toString() {
        return this.f146224a;
    }
}
