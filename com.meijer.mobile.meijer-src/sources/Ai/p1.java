package Ai;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\u001an\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001an\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LKi/M;", "", "value", "maxValue", "Lki/q1$f$c;", "template", "Lkotlin/Function2;", "", "onValueChange", "", "signifier", "Lkotlin/Function1;", "LAi/y1;", "Lkotlin/ExtensionFunctionType;", "content", "h", "(LKi/M;IILki/q1$f$c;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "g", "(LKi/M;DDLki/q1$f$c;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class p1 {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Ji.c<Integer, C1, C1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Function1<C1, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<C1> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C1 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.p1$a$a, reason: collision with other inner class name */
        public static final class C0019a implements Function0<C1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f1182a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f1183b;

            public C0019a(Ji.h hVar, a aVar) {
                this.f1182a = hVar;
                this.f1183b = aVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ai.C1, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1 invoke() {
                ?? r02 = this.f1182a;
                this.f1183b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public androidx.compose.runtime.z1<C1> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C1 getInitialScope() {
            return this.initialScope;
        }

        public androidx.compose.runtime.z1<Function1<C1, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.o1.e(new C0019a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (androidx.compose.runtime.z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ji.c<Integer, C1, C1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Function1<C1, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<C1> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C1 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<C1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f1187a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f1188b;

            public a(Ji.h hVar, b bVar) {
                this.f1187a = hVar;
                this.f1188b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ai.C1, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1 invoke() {
                ?? r02 = this.f1187a;
                this.f1188b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public androidx.compose.runtime.z1<C1> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C1 getInitialScope() {
            return this.initialScope;
        }

        public androidx.compose.runtime.z1<Function1<C1, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (androidx.compose.runtime.z1) objB;
            this.initialScope = hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r29, final double r30, double r32, ki.q1.f.QuantityInput r34, final kotlin.jvm.functions.Function2<? super java.lang.Double, ? super java.lang.Double, kotlin.Unit> r35, java.lang.String r36, kotlin.jvm.functions.Function1<? super Ai.y1, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.p1.g(Ki.M, double, double, ki.q1$f$c, kotlin.jvm.functions.Function2, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r28, final int r29, int r30, ki.q1.f.QuantityInput r31, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r32, java.lang.String r33, kotlin.jvm.functions.Function1<? super Ai.y1, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.p1.h(Ki.M, int, int, ki.q1$f$c, kotlin.jvm.functions.Function2, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(y1 y1Var) {
        Intrinsics.j(y1Var, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function2 function2, Number cur, Number prev) {
        Intrinsics.j(cur, "cur");
        Intrinsics.j(prev, "prev");
        function2.invoke((Double) cur, (Double) prev);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, double d10, double d11, q1.f.QuantityInput quantityInput, Function2 function2, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, d10, d11, quantityInput, function2, str, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(y1 y1Var) {
        Intrinsics.j(y1Var, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function2 function2, Number cur, Number prev) {
        Intrinsics.j(cur, "cur");
        Intrinsics.j(prev, "prev");
        function2.invoke((Integer) cur, (Integer) prev);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, int i10, int i11, q1.f.QuantityInput quantityInput, Function2 function2, String str, Function1 function1, int i12, int i13, Composer composer, int i14) {
        h(localThemeScope, i10, i11, quantityInput, function2, str, function1, composer, androidx.compose.runtime.J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }
}
