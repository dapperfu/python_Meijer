package androidx.compose.ui.draganddrop;

import S0.b;
import S0.c;
import S0.d;
import S0.g;
import U0.k;
import X0.f;
import Z.C5504b;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Y;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\\\u0010\u0010\u001aX\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eRj\u0010\u0010\u001aX\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroid/view/View$OnDragListener;", "LS0/c;", "Lkotlin/Function3;", "LS0/g;", "Lkotlin/ParameterName;", "name", "transferData", "LU0/k;", "decorationSize", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "", "startDrag", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "LS0/f;", "target", "a", "(LS0/f;)V", "b", "(LS0/f;)Z", "Lkotlin/jvm/functions/Function3;", "LS0/d;", "LS0/d;", "rootDragAndDropNode", "LZ/b;", "c", "LZ/b;", "interestedTargets", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function3<g, k, Function1<? super f, Unit>, Boolean> startDrag;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d rootDragAndDropNode = new d(null, null, 3, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5504b<S0.f> interestedTargets = new C5504b<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier = new Y<d>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void c(d node) {
        }

        public int hashCode() {
            return this.f50541b.rootDragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public d b() {
            return this.f50541b.rootDragAndDropNode;
        }
    };

    @Override // S0.c
    public void a(S0.f target) {
        this.interestedTargets.add(target);
    }

    @Override // S0.c
    public boolean b(S0.f target) {
        return this.interestedTargets.contains(target);
    }

    /* renamed from: d, reason: from getter */
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        b bVar = new b(event);
        switch (event.getAction()) {
            case 1:
                boolean zK2 = this.rootDragAndDropNode.K2(bVar);
                Iterator<S0.f> it = this.interestedTargets.iterator();
                while (it.hasNext()) {
                    it.next().w0(bVar);
                }
                break;
            case 2:
                this.rootDragAndDropNode.r0(bVar);
                break;
            case 4:
                this.rootDragAndDropNode.T0(bVar);
                this.interestedTargets.clear();
                break;
            case 5:
                this.rootDragAndDropNode.m1(bVar);
                break;
            case 6:
                this.rootDragAndDropNode.j0(bVar);
                break;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidDragAndDropManager(Function3<? super g, ? super k, ? super Function1<? super f, Unit>, Boolean> function3) {
        this.startDrag = function3;
    }
}
