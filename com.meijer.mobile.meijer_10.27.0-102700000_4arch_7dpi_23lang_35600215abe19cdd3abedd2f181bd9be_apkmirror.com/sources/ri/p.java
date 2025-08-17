package ri;

import Ji.LocalThemeScope;
import Ji.T;
import V0.C5346q0;
import android.content.Context;
import androidx.compose.foundation.text.C5675g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import ji.q1;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ri.p;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u00012\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R-\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lri/p;", "", "Lji/q1$j;", "template", "LJi/M;", "localThemeScope", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "", "Lkotlin/Function0;", "hyperlinkMap", "<init>", "(Lji/q1$j;LJi/M;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lji/q1$j;", "D0", "()Lji/q1$j;", "setTemplate", "(Lji/q1$j;)V", "c", "LJi/M;", "getLocalThemeScope", "()LJi/M;", "d", "Ljava/lang/String;", "E0", "()Ljava/lang/String;", "e", "Landroidx/compose/ui/text/AnnotatedString;", "A0", "()Landroidx/compose/ui/text/AnnotatedString;", "f", "Lkotlin/jvm/functions/Function1;", "C0", "()Lkotlin/jvm/functions/Function1;", "g", "Ljava/util/Map;", "B0", "()Ljava/util/Map;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p implements Ii.h, Ii.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private q1.Label template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString annotatedString;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<TextLayoutResult, Unit> onTextLayout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Function0<Unit>> hyperlinkMap;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {
        a() {
        }

        public final void b(Modifier it, Composer composer, int i10) {
            String string;
            Composer composer2 = composer;
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1961156239, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.label.LabelScopeImpl.getComposer.<anonymous> (Label.kt:275)");
            }
            if (p.this.getAnnotatedString() != null) {
                composer2.startReplaceGroup(-365308486);
                if (p.this.B0() != null) {
                    composer2.startReplaceGroup(-365288770);
                    Modifier modifier = p.this.getTemplate().getModifier();
                    AnnotatedString annotatedString = p.this.getAnnotatedString();
                    TextStyle style = p.this.getTemplate().getStyle().getStyle();
                    int overflow = p.this.getTemplate().getOverflow();
                    boolean softWrap = p.this.getTemplate().getSoftWrap();
                    int maxLines = p.this.getTemplate().getMaxLines();
                    Function1<TextLayoutResult, Unit> function1C0 = p.this.C0();
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(p.this);
                    final p pVar = p.this;
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: ri.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return p.a.c(pVar, ((Integer) obj).intValue());
                            }
                        };
                        composer2.t(objB);
                    }
                    composer2.P();
                    C5675g.a(annotatedString, modifier, style, softWrap, overflow, maxLines, function1C0, (Function1) objB, composer2, 0, 0);
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(-364600539);
                    Modifier modifier2 = p.this.getTemplate().getModifier();
                    AnnotatedString annotatedString2 = p.this.getAnnotatedString();
                    T color = p.this.getTemplate().getColor();
                    N1.c(annotatedString2, modifier2, color != null ? color.getColor() : C5346q0.INSTANCE.j(), 0L, null, null, null, 0L, p.this.getTemplate().getTextDecoration(), p.this.getTemplate().getTextAlign(), 0L, p.this.getTemplate().getOverflow(), p.this.getTemplate().getSoftWrap(), p.this.getTemplate().getMaxLines(), 0, null, p.this.C0(), p.this.getTemplate().getStyle().getStyle(), composer, 0, 0, 50424);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.P();
            } else {
                composer2.startReplaceGroup(-363998333);
                Modifier modifier3 = p.this.getTemplate().getModifier();
                composer2.startReplaceGroup(819544438);
                String text = p.this.getText();
                if (text == null || text.length() == 0) {
                    Integer stringRes = p.this.getTemplate().getStringRes();
                    string = stringRes == null ? null : ((Context) composer2.o(AndroidCompositionLocals_androidKt.g())).getString(stringRes.intValue());
                    if (string == null) {
                        string = "";
                    }
                } else {
                    string = p.this.getText();
                }
                composer2.P();
                T color2 = p.this.getTemplate().getColor();
                N1.b(string, modifier3, color2 != null ? color2.getColor() : C5346q0.INSTANCE.j(), 0L, null, null, null, 0L, p.this.getTemplate().getTextDecoration(), p.this.getTemplate().getTextAlign(), 0L, p.this.getTemplate().getOverflow(), p.this.getTemplate().getSoftWrap(), p.this.getTemplate().getMaxLines(), 0, p.this.C0(), p.this.getTemplate().getStyle().getStyle(), composer, 0, 0, 17656);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            b(modifier, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p pVar, int i10) {
            Function0<Unit> function0;
            AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.u0(pVar.getAnnotatedString().j(i10, i10));
            if (range != null && (function0 = pVar.B0().get(range.getTag())) != null) {
                function0.invoke();
            }
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(q1.Label template, LocalThemeScope localThemeScope, String str, AnnotatedString annotatedString, Function1<? super TextLayoutResult, Unit> onTextLayout, Map<String, ? extends Function0<Unit>> map) {
        Intrinsics.j(template, "template");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(onTextLayout, "onTextLayout");
        this.template = template;
        this.localThemeScope = localThemeScope;
        this.text = str;
        this.annotatedString = annotatedString;
        this.onTextLayout = onTextLayout;
        this.hyperlinkMap = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(TextLayoutResult it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* renamed from: A0, reason: from getter */
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final Map<String, Function0<Unit>> B0() {
        return this.hyperlinkMap;
    }

    public final Function1<TextLayoutResult, Unit> C0() {
        return this.onTextLayout;
    }

    /* renamed from: D0, reason: from getter */
    public final q1.Label getTemplate() {
        return this.template;
    }

    /* renamed from: E0, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // Ii.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1961156239, true, new a());
    }

    public /* synthetic */ p(q1.Label label, LocalThemeScope localThemeScope, String str, AnnotatedString annotatedString, Function1 function1, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(label, localThemeScope, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : annotatedString, (i10 & 16) != 0 ? new Function1() { // from class: ri.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.z0((TextLayoutResult) obj);
            }
        } : function1, (i10 & 32) != 0 ? null : map);
    }
}
