package D5;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.l;
import H1.w;
import V0.C5489q0;
import V0.Shadow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import j0.InterfaceC14888I;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p1.C16338g;
import u1.PlatformTextStyle;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5937a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static Function3<InterfaceC14888I, Composer, Integer, Unit> f5938b = ComposableLambdaKt.composableLambdaInstance(-1192096719, false, a.f5939f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/I;", "", "a", "(Lj0/I;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f5939f = new a();

        a() {
            super(3);
        }

        public final void a(InterfaceC14888I OutlinedButton, Composer composer, int i10) {
            Intrinsics.j(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 81) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1192096719, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.quickconnect.ComposableSingletons$ActionButtonRowKt.lambda-1.<anonymous> (ActionButtonRow.kt:75)");
            }
            String strC = C16338g.c(u5.b.f163703C, composer, 0);
            F5.a aVar = F5.a.f9034a;
            N1.b(strC, null, 0L, 0L, null, null, aVar.d().a().getFamily(), 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(C5489q0.INSTANCE.k(), w.i(aVar.d().a().getSize().getMedium()), (FontWeight) null, (C18280w) null, (C18281x) null, (AbstractC18269l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (F1.k) null, (Shadow) null, (F1.j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer, 1572864, 1572864, 65470);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> a() {
        return f5938b;
    }
}
