package L0;

import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"", "T", "", "inputs", "LL0/k;", "saver", "", "key", "Lkotlin/Function0;", "init", "c", "([Ljava/lang/Object;LL0/k;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "LL0/h;", "value", "", "d", "(LL0/h;Ljava/lang/Object;)V", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "", "a", "I", "MaxSupportedRadix", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17727a = 36;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d<T> f17728f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k<T, ? extends Object> f17729g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f17730h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f17731i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f17732j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object[] f17733k;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d<T> dVar, k<T, ? extends Object> kVar, h hVar, String str, T t10, Object[] objArr) {
            super(0);
            this.f17728f = dVar;
            this.f17729g = kVar;
            this.f17730h = hVar;
            this.f17731i = str;
            this.f17732j = t10;
            this.f17733k = objArr;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f17728f.i(this.f17729g, this.f17730h, this.f17731i, this.f17732j, this.f17733k);
        }
    }

    public static final String b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> T c(Object[] objArr, k<T, ? extends Object> kVar, String str, Function0<? extends T> function0, Composer composer, int i10, int i11) {
        Object[] objArr2;
        T t10;
        Object objF;
        if ((i11 & 2) != 0) {
            kVar = l.b();
        }
        k<T, ? extends Object> kVar2 = kVar;
        int i12 = i11 & 4;
        T tInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int iA = C5859f.a(composer, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(iA, CharsKt.a(f17727a));
            Intrinsics.i(str, "toString(...)");
        }
        String str2 = str;
        Intrinsics.h(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        h hVar = (h) composer.o(j.e());
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            if (hVar != null && (objF = hVar.f(str2)) != null) {
                tInvoke = kVar2.b(objF);
            }
            if (tInvoke == null) {
                tInvoke = function0.invoke();
            }
            objArr2 = objArr;
            Object dVar = new d(kVar2, hVar, str2, tInvoke, objArr2);
            composer.t(dVar);
            objB = dVar;
        } else {
            objArr2 = objArr;
        }
        d dVar2 = (d) objB;
        Object objG = dVar2.g(objArr2);
        if (objG == null) {
            objG = function0.invoke();
        }
        boolean zD = composer.D(dVar2) | ((((i10 & 112) ^ 48) > 32 && composer.D(kVar2)) || (i10 & 48) == 32) | composer.D(hVar) | composer.V(str2) | composer.D(objG) | composer.D(objArr2);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            Object[] objArr3 = objArr2;
            t10 = (T) objG;
            Object aVar = new a(dVar2, kVar2, hVar, str2, t10, objArr3);
            composer.t(aVar);
            objB2 = aVar;
        } else {
            t10 = (T) objG;
        }
        J.i((Function0) objB2, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(h hVar, Object obj) {
        String strB;
        if (obj == null || hVar.a(obj)) {
            return;
        }
        if (obj instanceof M0.l) {
            M0.l lVar = (M0.l) obj;
            if (lVar.e() == o1.k() || lVar.e() == o1.r() || lVar.e() == o1.o()) {
                strB = "MutableState containing " + lVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strB = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strB = b(obj);
        }
        throw new IllegalArgumentException(strB);
    }
}
