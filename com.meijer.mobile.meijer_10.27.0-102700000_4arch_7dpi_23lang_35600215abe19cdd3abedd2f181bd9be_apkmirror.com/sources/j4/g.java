package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.window.r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC14653B;
import kotlin.C14664h;
import kotlin.C14672p;
import kotlin.C14679w;
import kotlin.InterfaceC14659c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.P;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lj4/g;", "Li4/B;", "Lj4/g$b;", "<init>", "()V", "Li4/h;", "backStackEntry", "", "m", "(Li4/h;)V", "", "entries", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "e", "(Ljava/util/List;Li4/w;Li4/B$a;)V", "l", "()Lj4/g$b;", "popUpTo", "", "savedState", "j", "(Li4/h;Z)V", "entry", "p", "Ltv/P;", "n", "()Ltv/P;", "backStack", "", "o", "transitionInProgress", "c", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC14653B.b("dialog")
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g extends AbstractC14653B<b> {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj4/g$b;", "Li4/p;", "Li4/c;", "Lj4/g;", "navigator", "Landroidx/compose/ui/window/h;", "dialogProperties", "Lkotlin/Function1;", "Li4/h;", "", "content", "<init>", "(Lj4/g;Landroidx/compose/ui/window/h;Lkotlin/jvm/functions/Function3;)V", "l", "Landroidx/compose/ui/window/h;", "I", "()Landroidx/compose/ui/window/h;", "m", "Lkotlin/jvm/functions/Function3;", "H", "()Lkotlin/jvm/functions/Function3;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends C14672p implements InterfaceC14659c {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.ui.window.h dialogProperties;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final Function3<C14664h, Composer, Integer, Unit> content;

        public /* synthetic */ b(g gVar, androidx.compose.ui.window.h hVar, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, (i10 & 2) != 0 ? new androidx.compose.ui.window.h(false, false, (r) null, 7, (DefaultConstructorMarker) null) : hVar, function3);
        }

        public final Function3<C14664h, Composer, Integer, Unit> H() {
            return this.content;
        }

        /* renamed from: I, reason: from getter */
        public final androidx.compose.ui.window.h getDialogProperties() {
            return this.dialogProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(g gVar, androidx.compose.ui.window.h hVar, Function3<? super C14664h, ? super Composer, ? super Integer, Unit> function3) {
            super(gVar);
            this.dialogProperties = hVar;
            this.content = function3;
        }
    }

    public final void m(C14664h backStackEntry) {
        j(backStackEntry, false);
    }

    @Override // kotlin.AbstractC14653B
    public void e(List<C14664h> entries, C14679w navOptions, AbstractC14653B.a navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            b().i((C14664h) it.next());
        }
    }

    @Override // kotlin.AbstractC14653B
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this, null, c.f139248a.a(), 2, null);
    }

    @Override // kotlin.AbstractC14653B
    public void j(C14664h popUpTo, boolean savedState) {
        b().h(popUpTo, savedState);
        int iW0 = CollectionsKt.w0(b().c().getValue(), popUpTo);
        int i10 = 0;
        for (Object obj : b().c().getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            C14664h c14664h = (C14664h) obj;
            if (i10 > iW0) {
                p(c14664h);
            }
            i10 = i11;
        }
    }

    public final P<List<C14664h>> n() {
        return b().b();
    }

    public final P<Set<C14664h>> o() {
        return b().c();
    }

    public final void p(C14664h entry) {
        b().e(entry);
    }
}
