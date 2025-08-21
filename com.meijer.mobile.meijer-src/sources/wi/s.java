package wi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "Lki/q1$s;", "template", "", "checked", "enabled", "showHelperText", "Lkotlin/Function1;", "", "onCheckedChange", "b", "(LKi/M;Lki/q1$s;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Object, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f167186a = new a();

        public final void a(Object obj) {
            Intrinsics.j(obj, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((Ji.h) obj);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ji.c<Integer, Object, Object> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<Object, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<Object> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Object initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f167190a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f167191b;

            public a(Ji.h hVar, b bVar) {
                this.f167190a = hVar;
                this.f167191b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke() {
                Ji.h hVar = this.f167190a;
                this.f167191b.t().getValue().invoke(hVar);
                return hVar;
            }
        }

        @Override // Ji.c
        public z1<Object> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public Object getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<Object, Unit>> t() {
            return this.latestContent;
        }

        public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r17, final ki.q1.s r18, final boolean r19, boolean r20, boolean r21, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.s.b(Ki.M, ki.q1$s, boolean, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, q1.s sVar, boolean z10, boolean z11, boolean z12, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, sVar, z10, z11, z12, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
