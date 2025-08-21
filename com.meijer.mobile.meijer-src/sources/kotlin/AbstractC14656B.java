package kotlin;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C14675p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u000b,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R$\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Li4/B;", "Li4/p;", "D", "", "<init>", "()V", "Li4/D;", "state", "", "f", "(Li4/D;)V", "a", "()Li4/p;", "", "Li4/h;", "entries", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "e", "(Ljava/util/List;Li4/w;Li4/B$a;)V", "backStackEntry", "g", "(Li4/h;)V", "destination", "Landroid/os/Bundle;", "args", "d", "(Li4/p;Landroid/os/Bundle;Li4/w;Li4/B$a;)Li4/p;", "popUpTo", "", "savedState", "j", "(Li4/h;Z)V", "k", "()Z", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "Li4/D;", "_state", "<set-?>", "b", "Z", "c", "isAttached", "()Li4/D;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14656B<D extends C14675p> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC14658D _state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Li4/B$a;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.B$a */
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Li4/B$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention
    /* renamed from: i4.B$b */
    public @interface b {
        String value();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li4/p;", "D", "Li4/h;", "backStackEntry", "a", "(Li4/h;)Li4/h;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.B$c */
    static final class c extends Lambda implements Function1<C14667h, C14667h> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC14656B<D> f136953f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14682w f136954g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f136955h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC14656B<D> abstractC14656B, C14682w c14682w, a aVar) {
            super(1);
            this.f136953f = abstractC14656B;
            this.f136954g = c14682w;
            this.f136955h = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14667h invoke(C14667h backStackEntry) {
            C14675p c14675pD;
            Intrinsics.j(backStackEntry, "backStackEntry");
            C14675p c14675pE = backStackEntry.getDestination();
            if (c14675pE == null) {
                c14675pE = null;
            }
            if (c14675pE == null || (c14675pD = this.f136953f.d(c14675pE, backStackEntry.c(), this.f136954g, this.f136955h)) == null) {
                return null;
            }
            return Intrinsics.e(c14675pD, c14675pE) ? backStackEntry : this.f136953f.b().a(c14675pD, c14675pD.n(backStackEntry.c()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li4/p;", "D", "Li4/x;", "", "a", "(Li4/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.B$d */
    static final class d extends Lambda implements Function1<C14683x, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f136956f = new d();

        d() {
            super(1);
        }

        public final void a(C14683x navOptions) {
            Intrinsics.j(navOptions, "$this$navOptions");
            navOptions.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14683x c14683x) {
            a(c14683x);
            return Unit.f143329a;
        }
    }

    public abstract D a();

    public C14675p d(D destination, Bundle args, C14682w navOptions, a navigatorExtras) {
        Intrinsics.j(destination, "destination");
        return destination;
    }

    public void h(Bundle savedState) {
        Intrinsics.j(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public boolean k() {
        return true;
    }

    protected final AbstractC14658D b() {
        AbstractC14658D abstractC14658D = this._state;
        if (abstractC14658D != null) {
            return abstractC14658D;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public void e(List<C14667h> entries, C14682w navOptions, a navigatorExtras) {
        Intrinsics.j(entries, "entries");
        Iterator it = SequencesKt.D(SequencesKt.M(CollectionsKt.f0(entries), new c(this, navOptions, navigatorExtras))).iterator();
        while (it.hasNext()) {
            b().i((C14667h) it.next());
        }
    }

    public void f(AbstractC14658D state) {
        Intrinsics.j(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void g(C14667h backStackEntry) {
        Intrinsics.j(backStackEntry, "backStackEntry");
        C14675p c14675pE = backStackEntry.getDestination();
        if (c14675pE == null) {
            c14675pE = null;
        }
        if (c14675pE == null) {
            return;
        }
        d(c14675pE, null, C14684y.a(d.f136956f), null);
        b().f(backStackEntry);
    }

    public void j(C14667h popUpTo, boolean savedState) {
        Intrinsics.j(popUpTo, "popUpTo");
        List<C14667h> value = b().b().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<C14667h> listIterator = value.listIterator(value.size());
        C14667h c14667hPrevious = null;
        while (k()) {
            c14667hPrevious = listIterator.previous();
            if (Intrinsics.e(c14667hPrevious, popUpTo)) {
                break;
            }
        }
        if (c14667hPrevious != null) {
            b().g(c14667hPrevious, savedState);
        }
    }
}
