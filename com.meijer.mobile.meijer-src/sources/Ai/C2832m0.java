package Ai;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\\\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ah\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aw\u0010\u001d\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00162!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LKi/M;", "", "value", "Lki/q1$f$e;", "template", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "onValueChange", "LAi/H1;", "Lkotlin/ExtensionFunctionType;", "content", "i", "(LKi/M;Ljava/lang/String;Lki/q1$f$e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "maxCharacters", "Lki/q1$f$d;", "LAi/G1;", "g", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lki/q1$f$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "displayValue", "Lki/q1$f$c;", "Lkotlin/ParameterName;", "name", "proposed", "onKeyboardInputChange", "signifier", "LAi/y1;", "h", "(LKi/M;Ljava/lang/String;Lki/q1$f$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ai.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2832m0 {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.m0$a */
    public static final class a extends Ji.c<Integer, J1, J1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Function1<J1, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<J1> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final J1 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.m0$a$a, reason: collision with other inner class name */
        public static final class C0018a implements Function0<J1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f1138a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f1139b;

            public C0018a(Ji.h hVar, a aVar) {
                this.f1138a = hVar;
                this.f1139b = aVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ai.J1, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final J1 invoke() {
                ?? r02 = this.f1138a;
                this.f1139b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public androidx.compose.runtime.z1<J1> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public J1 getInitialScope() {
            return this.initialScope;
        }

        public androidx.compose.runtime.z1<Function1<J1, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.o1.e(new C0018a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (androidx.compose.runtime.z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.m0$b */
    public static final class b extends Ji.c<Integer, F1, F1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Function1<F1, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<F1> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final F1 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.m0$b$a */
        public static final class a implements Function0<F1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f1143a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f1144b;

            public a(Ji.h hVar, b bVar) {
                this.f1143a = hVar;
                this.f1144b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ai.F1, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F1 invoke() {
                ?? r02 = this.f1143a;
                this.f1144b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public androidx.compose.runtime.z1<F1> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public F1 getInitialScope() {
            return this.initialScope;
        }

        public androidx.compose.runtime.z1<Function1<F1, Unit>> t() {
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.m0$c */
    public static final class c extends Ji.c<Integer, x1, x1> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Function1<x1, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<x1> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final x1 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.m0$c$a */
        public static final class a implements Function0<x1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f1148a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f1149b;

            public a(Ji.h hVar, c cVar) {
                this.f1148a = hVar;
                this.f1149b = cVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ai.x1, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                ?? r02 = this.f1148a;
                this.f1149b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public androidx.compose.runtime.z1<x1> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public x1 getInitialScope() {
            return this.initialScope;
        }

        public androidx.compose.runtime.z1<Function1<x1, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r16, final java.lang.String r17, androidx.compose.ui.Modifier r18, java.lang.Integer r19, final ki.q1.f.TextArea r20, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super Ai.G1, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2832m0.g(Ki.M, java.lang.String, androidx.compose.ui.Modifier, java.lang.Integer, ki.q1$f$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r30, final java.lang.String r31, final ki.q1.f.QuantityInput r32, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r33, androidx.compose.ui.Modifier r34, java.lang.String r35, kotlin.jvm.functions.Function1<? super Ai.y1, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2832m0.h(Ki.M, java.lang.String, ki.q1$f$c, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r14, final java.lang.String r15, final ki.q1.f.TextInput r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r18, kotlin.jvm.functions.Function1<? super Ai.H1, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2832m0.i(Ki.M, java.lang.String, ki.q1$f$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(H1 h12) {
        Intrinsics.j(h12, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, String str, q1.f.TextInput textInput, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, str, textInput, modifier, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(G1 g12) {
        Intrinsics.j(g12, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, String str, Modifier modifier, Integer num, q1.f.TextArea textArea, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, modifier, num, textArea, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(y1 y1Var) {
        Intrinsics.j(y1Var, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, String str, q1.f.QuantityInput quantityInput, Function1 function1, Modifier modifier, String str2, Function1 function12, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, str, quantityInput, function1, modifier, str2, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
