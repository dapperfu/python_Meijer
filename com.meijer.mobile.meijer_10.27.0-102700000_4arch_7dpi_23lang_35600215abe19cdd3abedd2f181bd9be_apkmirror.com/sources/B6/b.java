package B6;

import C6.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y6.Error;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"LC6/f;", "Ly6/s;", "a", "(LC6/f;)Ly6/s;", "", "", "e", "(LC6/f;)Ljava/util/List;", "Ly6/s$a;", "c", "b", "(LC6/f;)Ly6/s$a;", "d", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.f3701g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.f3702h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<Error> d(f fVar) throws IOException {
        Intrinsics.j(fVar, "<this>");
        if (fVar.getPeekedToken() == f.a.f3704j) {
            fVar.G2();
            return CollectionsKt.m();
        }
        fVar.y();
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add(a(fVar));
        }
        fVar.x();
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final y6.Error a(C6.f r9) throws java.io.IOException {
        /*
            r9.s()
            java.lang.String r0 = ""
            r1 = 0
            r3 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        Lb:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L70
            java.lang.String r2 = r9.nextName()
            int r8 = r2.hashCode()
            switch(r8) {
                case -1809421292: goto L4b;
                case -1197189282: goto L3d;
                case 3433509: goto L2f;
                case 954925063: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L53
        L1d:
            java.lang.String r8 = "message"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L53
            java.lang.String r2 = r9.nextString()
            if (r2 != 0) goto L2d
            r3 = r0
            goto Lb
        L2d:
            r3 = r2
            goto Lb
        L2f:
            java.lang.String r8 = "path"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L38
            goto L53
        L38:
            java.util.List r5 = e(r9)
            goto Lb
        L3d:
            java.lang.String r8 = "locations"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L46
            goto L53
        L46:
            java.util.List r4 = c(r9)
            goto Lb
        L4b:
            java.lang.String r8 = "extensions"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L62
        L53:
            if (r7 != 0) goto L5a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
        L5a:
            java.lang.Object r8 = C6.a.d(r9)
            r7.put(r2, r8)
            goto Lb
        L62:
            java.lang.Object r2 = C6.a.d(r9)
            boolean r6 = r2 instanceof java.util.Map
            if (r6 == 0) goto L6e
            java.util.Map r2 = (java.util.Map) r2
            r6 = r2
            goto Lb
        L6e:
            r6 = r1
            goto Lb
        L70:
            r9.F()
            y6.s r2 = new y6.s
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.b.a(C6.f):y6.s");
    }

    private static final Error.Location b(f fVar) throws IOException {
        fVar.s();
        int iNextInt = -1;
        int iNextInt2 = -1;
        while (fVar.hasNext()) {
            String strNextName = fVar.nextName();
            if (Intrinsics.e(strNextName, "line")) {
                iNextInt = fVar.nextInt();
            } else if (Intrinsics.e(strNextName, "column")) {
                iNextInt2 = fVar.nextInt();
            } else {
                fVar.skipValue();
            }
        }
        fVar.F();
        return new Error.Location(iNextInt, iNextInt2);
    }

    private static final List<Error.Location> c(f fVar) throws IOException {
        if (fVar.getPeekedToken() == f.a.f3704j) {
            return (List) fVar.G2();
        }
        ArrayList arrayList = new ArrayList();
        fVar.y();
        while (fVar.hasNext()) {
            arrayList.add(b(fVar));
        }
        fVar.x();
        return arrayList;
    }

    private static final List<Object> e(f fVar) throws IOException {
        if (fVar.getPeekedToken() == f.a.f3704j) {
            return (List) fVar.G2();
        }
        ArrayList arrayList = new ArrayList();
        fVar.y();
        while (fVar.hasNext()) {
            int i10 = a.$EnumSwitchMapping$0[fVar.getPeekedToken().ordinal()];
            if (i10 != 1 && i10 != 2) {
                String strNextString = fVar.nextString();
                Intrinsics.g(strNextString);
                arrayList.add(strNextString);
            } else {
                arrayList.add(Integer.valueOf(fVar.nextInt()));
            }
        }
        fVar.x();
        return arrayList;
    }
}
