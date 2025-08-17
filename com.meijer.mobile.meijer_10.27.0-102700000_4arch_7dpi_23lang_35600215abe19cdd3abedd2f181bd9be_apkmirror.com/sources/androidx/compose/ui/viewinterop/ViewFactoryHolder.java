package androidx.compose.ui.viewinterop;

import L0.h;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.T1;
import f1.C13829b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R(\u0010,\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010)\"\u0004\b*\u0010+RB\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102RB\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102RB\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u0014\u0010>\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/T1;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/k;", "parentContext", "typedView", "Lf1/b;", "dispatcher", "LL0/h;", "saveStateRegistry", "", "compositeKeyHash", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/k;Landroid/view/View;Lf1/b;LL0/h;ILandroidx/compose/ui/node/Owner;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/k;LL0/h;ILandroidx/compose/ui/node/Owner;)V", "", "H", "()V", "I", "D", "Landroid/view/View;", "E", "Lf1/b;", "getDispatcher", "()Lf1/b;", "F", "LL0/h;", "G", "", "Ljava/lang/String;", "saveStateKey", "LL0/h$a;", "value", "LL0/h$a;", "setSavableRegistryEntry", "(LL0/h$a;)V", "savableRegistryEntry", "J", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "K", "getResetBlock", "setResetBlock", "resetBlock", "L", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements T1 {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final T typedView;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final C13829b dispatcher;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final L0.h saveStateRegistry;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final String saveStateKey;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private h.a savableRegistryEntry;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Function1<? super T, Unit> updateBlock;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Function1<? super T, Unit> resetBlock;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private Function1<? super T, Unit> releaseBlock;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class a extends Lambda implements Function0<Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f52761f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f52761f = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((ViewFactoryHolder) this.f52761f).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f52762f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f52762f = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f52762f.getReleaseBlock().invoke(((ViewFactoryHolder) this.f52762f).typedView);
            this.f52762f.I();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f52763f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f52763f = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f52763f.getResetBlock().invoke(((ViewFactoryHolder) this.f52763f).typedView);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewFactoryHolder<T> f52764f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f52764f = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f52764f.getUpdateBlock().invoke(((ViewFactoryHolder) this.f52764f).typedView);
        }
    }

    /* synthetic */ ViewFactoryHolder(Context context, AbstractC5727k abstractC5727k, View view, C13829b c13829b, L0.h hVar, int i10, Owner owner, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : abstractC5727k, view, (i11 & 8) != 0 ? new C13829b() : c13829b, hVar, i10, owner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        setSavableRegistryEntry(null);
    }

    @Override // androidx.compose.ui.platform.T1
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    @Override // androidx.compose.ui.platform.T1
    public View getViewRoot() {
        return this;
    }

    private final void H() {
        L0.h hVar = this.saveStateRegistry;
        if (hVar != null) {
            setSavableRegistryEntry(hVar.b(this.saveStateKey, new a(this)));
        }
    }

    private final void setSavableRegistryEntry(h.a aVar) {
        h.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.unregister();
        }
        this.savableRegistryEntry = aVar;
    }

    public final C13829b getDispatcher() {
        return this.dispatcher;
    }

    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(Function1<? super T, Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new b(this));
    }

    public final void setResetBlock(Function1<? super T, Unit> function1) {
        this.resetBlock = function1;
        setReset(new c(this));
    }

    public final void setUpdateBlock(Function1<? super T, Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new d(this));
    }

    private ViewFactoryHolder(Context context, AbstractC5727k abstractC5727k, T t10, C13829b c13829b, L0.h hVar, int i10, Owner owner) {
        super(context, abstractC5727k, i10, c13829b, t10, owner);
        this.typedView = t10;
        this.dispatcher = c13829b;
        this.saveStateRegistry = hVar;
        this.compositeKeyHash = i10;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        this.saveStateKey = strValueOf;
        Object objF = hVar != null ? hVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        H();
        this.updateBlock = e.e();
        this.resetBlock = e.e();
        this.releaseBlock = e.e();
    }

    public ViewFactoryHolder(Context context, Function1<? super Context, ? extends T> function1, AbstractC5727k abstractC5727k, L0.h hVar, int i10, Owner owner) {
        this(context, abstractC5727k, function1.invoke(context), null, hVar, i10, owner, 8, null);
    }
}
