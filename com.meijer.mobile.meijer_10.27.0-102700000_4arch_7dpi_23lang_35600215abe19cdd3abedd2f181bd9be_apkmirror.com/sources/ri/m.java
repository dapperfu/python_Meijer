package ri;

import Ji.I;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lri/m;", "LIi/g;", "", "", "Lri/p;", "Lcom/meijer/mobile/android_acres_library/atomic_providers/label/LabelProvider;", "LJi/M;", "localThemeScope", "<init>", "(LJi/M;)V", "key", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lji/q1$j;", "template", "Lkotlin/Function0;", "", "w", "(ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", "v", "(ILandroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function2;", "c", "LJi/M;", "getLocalThemeScope", "()LJi/M;", "d", "Lji/q1$j;", "_template", "e", "Lri/p;", "u", "()Lri/p;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m extends Ii.g<Integer, Object, p> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q1.Label _template;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p initialScope;

    /* JADX WARN: Multi-variable type inference failed */
    public m(LocalThemeScope localThemeScope) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.localThemeScope = localThemeScope;
        this._template = new q1.Label(null, null, null, null, 0, false, 0, new I() { // from class: ri.l
            @Override // Ji.I
            public final TextStyle getStyle() {
                return m.t();
            }
        }, null, 383, null);
        this.initialScope = new p(this._template, localThemeScope, "", null, null, null, 56, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle t() {
        return new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777215, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.Label x(m mVar, q1.Label it) {
        Intrinsics.j(it, "it");
        return mVar._template;
    }

    @Override // Ii.g
    public /* bridge */ /* synthetic */ Function2 k(Integer num, Modifier modifier) {
        return v(num.intValue(), modifier);
    }

    @Override // Ii.i
    /* renamed from: u, reason: from getter and merged with bridge method [inline-methods] */
    public p a() {
        return this.initialScope;
    }

    public Function2<Composer, Integer, Unit> v(int key, Modifier modifier) {
        Intrinsics.j(modifier, "modifier");
        return w(key, modifier, new Function1() { // from class: ri.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.x(this.f158659a, (q1.Label) obj);
            }
        });
    }

    public final Function2<Composer, Integer, Unit> w(int key, Modifier modifier, Function1<? super q1.Label, q1.Label> template) {
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(template, "template");
        this._template = template.invoke(this._template);
        return super.k(Integer.valueOf(key), modifier);
    }
}
