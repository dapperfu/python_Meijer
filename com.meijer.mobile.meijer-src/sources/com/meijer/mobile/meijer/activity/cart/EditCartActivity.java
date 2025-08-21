package com.meijer.mobile.meijer.activity.cart;

import Am.CartProductSavingsDecorator;
import Nn.AbstractC4279q;
import Nn.AbstractC4299v0;
import V2.CreationExtras;
import Xj.ValueState;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.activity.cart.C11904z0;
import com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.cart.E0;
import com.meijer.mobile.meijer.activity.cart.EditCartActivity;
import com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment;
import com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.C15069d;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import le.C15485b;
import pv.C16563h;
import tr.C17284b;
import vs.CartProductListDecorator;
import wo.C17905b;
import xk.C18188a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001;B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010&J'\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020!2\n\u0010:\u001a\u000605j\u0002`9H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010&J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010&J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b^\u0010U\u001a\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010dR\u001c\u0010k\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010u\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010q¨\u0006{"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/EditCartActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "<init>", "()V", "", "R1", "Lcom/meijer/mobile/meijer/activity/cart/l0;", "cartMetaDataDecorator", "O1", "(Lcom/meijer/mobile/meijer/activity/cart/l0;)V", "", "Lvs/b;", "cartProductList", "Q1", "(Ljava/util/List;)V", "Lg/a;", "result", "Y1", "(Lg/a;)V", "X1", "", "visibility", "a2", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "item", "R", "(Lvs/b;)V", "i", "entryToUpdate", "LXj/t;", "valueState", "Landroid/graphics/Rect;", "stepperHitRect", "a1", "(Lvs/b;LXj/t;Landroid/graphics/Rect;)V", "n", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "Y0", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)V", "entryNumber", "", "note", "b", "(ILjava/lang/String;)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "K", "w0", "Lnk/f;", "product", "N0", "(Lnk/f;)V", "Lwr/f;", "s", "Lwr/f;", "V1", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "LTq/j;", "t", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lcom/meijer/mobile/meijer/activity/cart/E0;", "u", "Lkotlin/Lazy;", "W1", "()Lcom/meijer/mobile/meijer/activity/cart/E0;", "cartViewModel", "LNn/q;", "v", "LNn/q;", "binding", "Landroidx/appcompat/widget/Toolbar;", "w", "y", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lju/l;", "x", "Lju/l;", "productsListSection", "nonEBTProductsListSection", "Lju/d;", "Lju/g;", "z", "Lju/d;", "productsAdapter", "A", "nonEBTProductsAdapter", "Lg/c;", "Landroid/content/Intent;", "B", "Lg/c;", "entryNoteResultLauncher", "C", "Z", "isEBTCardAdded", "D", "isEBTCardRemoved", "E", "substitutionResultLauncher", "F", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class EditCartActivity extends Hilt_EditCartActivity implements Bj.b, C11904z0.a, CartBottomSheetDialogFragment.a {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f102422G = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> nonEBTProductsAdapter;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> entryNoteResultLauncher;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isEBTCardAdded;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean isEBTCardRemoved;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AbstractC4279q binding;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> productsAdapter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartViewModel = new androidx.view.e0(Reflection.b(E0.class), new f(this), new e(this), new g(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy toolbar = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.a1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EditCartActivity.b2(this.f102600a);
        }
    });

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private ju.l productsListSection = new ju.l();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ju.l nonEBTProductsListSection = new ju.l();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/EditCartActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.EditCartActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) EditCartActivity.class);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b implements InterfaceC14275b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, EditCartActivity.this, EditCartActivity.class, "handleEntryNotResult", "handleEntryNotResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            EditCartActivity.this.X1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102443f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f102443f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f102443f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102444f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f102444f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f102444f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f102445f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102446g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f102445f = function0;
            this.f102446g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f102445f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f102446g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h implements InterfaceC14275b, FunctionAdapter {
        h() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, EditCartActivity.this, EditCartActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            EditCartActivity.this.Y1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$i;", "cartViewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$i;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.EditCartActivity$onCreate$4", f = "EditCartActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<E0.CartViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102437a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f102438b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = EditCartActivity.this.new c(continuation);
            cVar.f102438b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.CartViewState cartViewState, Continuation<? super Unit> continuation) {
            return ((c) create(cartViewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zH;
            IntrinsicsKt.f();
            if (this.f102437a == 0) {
                ResultKt.b(obj);
                E0.CartViewState cartViewState = (E0.CartViewState) this.f102438b;
                EditCartActivity editCartActivity = EditCartActivity.this;
                CartMetaDataDecorator cartMetaDataDecorator = cartViewState.getCartMetaDataDecorator();
                if (cartMetaDataDecorator != null) {
                    zH = cartMetaDataDecorator.h();
                } else {
                    zH = false;
                }
                editCartActivity.isEBTCardAdded = zH;
                EditCartActivity.this.O1(cartViewState.getCartMetaDataDecorator());
                AbstractC4279q abstractC4279q = EditCartActivity.this.binding;
                AbstractC4279q abstractC4279q2 = null;
                if (abstractC4279q == null) {
                    Intrinsics.x("binding");
                    abstractC4279q = null;
                }
                abstractC4279q.f22212N.W(cartViewState.getLoadingState().getIsLoading());
                EditCartActivity.this.Q1(cartViewState.i());
                AbstractC4279q abstractC4279q3 = EditCartActivity.this.binding;
                if (abstractC4279q3 == null) {
                    Intrinsics.x("binding");
                } else {
                    abstractC4279q2 = abstractC4279q3;
                }
                abstractC4279q2.f22216R.setEnabled(cartViewState.getIsCartEdited());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$g;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.EditCartActivity$onCreate$5", f = "EditCartActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<E0.AbstractC11832g, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102440a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f102441b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = EditCartActivity.this.new d(continuation);
            dVar.f102441b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.AbstractC11832g abstractC11832g, Continuation<? super Unit> continuation) {
            return ((d) create(abstractC11832g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f102440a == 0) {
                ResultKt.b(obj);
                E0.AbstractC11832g abstractC11832g = (E0.AbstractC11832g) this.f102441b;
                if (abstractC11832g instanceof E0.AbstractC11832g.FailEvent) {
                    AbstractC4279q abstractC4279q = EditCartActivity.this.binding;
                    if (abstractC4279q == null) {
                        Intrinsics.x("binding");
                        abstractC4279q = null;
                    }
                    Snackbar.q0(abstractC4279q.getRoot(), ((E0.AbstractC11832g.FailEvent) abstractC11832g).getMessageResId(), 0).c0();
                } else if (abstractC11832g instanceof E0.AbstractC11832g.z) {
                    EditCartActivity editCartActivity = EditCartActivity.this;
                    editCartActivity.startActivity(editCartActivity.getMeijerIntent().p(EditCartActivity.this, true));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.GoProductDetailEvent) {
                    EditCartActivity.this.startActivity(Bl.g.t(EditCartActivity.this.getFeatureEntryPoint(), ((E0.AbstractC11832g.GoProductDetailEvent) abstractC11832g).getProduct(), false, false, null, 12, null));
                } else if (abstractC11832g instanceof E0.AbstractC11832g.ShowEntryOptionsEvent) {
                    CartBottomSheetDialogFragment.INSTANCE.a(((E0.AbstractC11832g.ShowEntryOptionsEvent) abstractC11832g).getCartEntryActionDecorator()).show(EditCartActivity.this.getSupportFragmentManager(), "cart_bottom_sheet_tag");
                } else if (!(abstractC11832g instanceof E0.AbstractC11832g.CancelUpdateOrderErrorDialog) && !Intrinsics.e(abstractC11832g, E0.AbstractC11832g.C11834b.f102220a) && !Intrinsics.e(abstractC11832g, E0.AbstractC11832g.d.f102222a) && !Intrinsics.e(abstractC11832g, E0.AbstractC11832g.f.f102224a) && !(abstractC11832g instanceof E0.AbstractC11832g.Show503Error) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowCancelUpdateDialog) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowEmptyCartDialogEvent) && !Intrinsics.e(abstractC11832g, E0.AbstractC11832g.o.f102246a) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowHighValuePromoEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowLowStockDialogEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowOutOfStockDialogEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowSelectFulfillmentDialogEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowUpdateOrderFailureMessage) && !(abstractC11832g instanceof E0.AbstractC11832g.StartCheckoutEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.TriggerScrollingEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.OpenCartActivityBottomSheet) && !(abstractC11832g instanceof E0.AbstractC11832g.OpenEBTGetBalancePinPadEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.NavigateToOrderDetailEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.OpenEBTCheckoutPinPadEvent) && !(abstractC11832g instanceof E0.AbstractC11832g.UpdateOrderSuccess) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowCheckBalanceMessage) && !(abstractC11832g instanceof E0.AbstractC11832g.ShowEBTErrorDialog) && !(abstractC11832g instanceof E0.AbstractC11832g.NavigateToNotAvailableForDeliveryEvent)) {
                    if (abstractC11832g instanceof E0.AbstractC11832g.p) {
                        new C15485b(EditCartActivity.this).setTitle(EditCartActivity.this.getString(com.meijer.mobile.meijer.Y.f100473I4)).setCancelable(true).setMessage(EditCartActivity.this.getString(com.meijer.mobile.meijer.Y.f100454H4)).setPositiveButton(EditCartActivity.this.getString(com.meijer.mobile.meijer.Y.f100435G4), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.f1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                EditCartActivity.d.k(dialogInterface, i10);
                            }
                        }).show();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(CartMetaDataDecorator cartMetaDataDecorator) {
        if (cartMetaDataDecorator != null) {
            this.isEBTCardAdded = cartMetaDataDecorator.h();
            AbstractC4279q abstractC4279q = this.binding;
            AbstractC4279q abstractC4279q2 = null;
            if (abstractC4279q == null) {
                Intrinsics.x("binding");
                abstractC4279q = null;
            }
            MaterialTextView cartItemCount = abstractC4279q.f22200B;
            Intrinsics.i(cartItemCount, "cartItemCount");
            ck.d.g(cartItemCount, cartMetaDataDecorator.d());
            AbstractC4279q abstractC4279q3 = this.binding;
            if (abstractC4279q3 == null) {
                Intrinsics.x("binding");
                abstractC4279q3 = null;
            }
            ConstraintLayout cartScreen = abstractC4279q3.f22201C;
            Intrinsics.i(cartScreen, "cartScreen");
            cartScreen.setVisibility(cartMetaDataDecorator.g() ? 0 : 8);
            if (cartMetaDataDecorator.h()) {
                a2(0);
            } else {
                a2(8);
            }
            AbstractC4279q abstractC4279q4 = this.binding;
            if (abstractC4279q4 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4279q2 = abstractC4279q4;
            }
            AbstractC4299v0 abstractC4299v0 = abstractC4279q2.f22205G;
            ConstraintLayout errorEmptyScreen = abstractC4299v0.f22373D;
            Intrinsics.i(errorEmptyScreen, "errorEmptyScreen");
            errorEmptyScreen.setVisibility(cartMetaDataDecorator.f() || cartMetaDataDecorator.e() ? 0 : 8);
            if (cartMetaDataDecorator.f()) {
                abstractC4299v0.f22372C.setText(getString(com.meijer.mobile.meijer.Y.f100502Je));
                abstractC4299v0.f22370A.setText(getString(C17284b.f163292P));
                abstractC4299v0.f22374z.setText(getString(com.meijer.mobile.meijer.Y.f100486Ih));
                MaterialButton cartErrorEmptyNeedHelpButton = abstractC4299v0.f22371B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton.setVisibility(0);
                abstractC4299v0.f22371B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.e1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditCartActivity.P1(this.f102618a, view);
                    }
                });
                return;
            }
            if (cartMetaDataDecorator.e()) {
                abstractC4299v0.f22372C.setText(getString(C17284b.f163303U0));
                abstractC4299v0.f22370A.setText(getString(C17284b.f163352v0));
                abstractC4299v0.f22374z.setText(getString(C17284b.f163350u0));
                MaterialButton cartErrorEmptyNeedHelpButton2 = abstractC4299v0.f22371B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton2, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(EditCartActivity editCartActivity, View view) {
        editCartActivity.startActivity(Bl.a.f3119a.c(editCartActivity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(List<CartProductListDecorator> cartProductList) {
        List<CartProductListDecorator> list = cartProductList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11904z0((CartProductListDecorator) it.next(), this, "EDIT_CART_SCREEN"));
        }
        if (!this.isEBTCardAdded || this.isEBTCardRemoved) {
            this.productsListSection.R(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C11904z0) obj).getItem().getProduct().getIsEbtProduct()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.a();
        List list3 = (List) pair.b();
        List list4 = list2;
        this.productsListSection.R(list4);
        List list5 = list3;
        this.nonEBTProductsListSection.R(list5);
        AbstractC4279q abstractC4279q = null;
        if (list4.isEmpty()) {
            a2(8);
            AbstractC4279q abstractC4279q2 = this.binding;
            if (abstractC4279q2 == null) {
                Intrinsics.x("binding");
                abstractC4279q2 = null;
            }
            abstractC4279q2.f22210L.setVisibility(8);
            W1().n0(E0.AbstractC11813f.y.f102211a);
            this.isEBTCardRemoved = true;
        } else {
            AbstractC4279q abstractC4279q3 = this.binding;
            if (abstractC4279q3 == null) {
                Intrinsics.x("binding");
                abstractC4279q3 = null;
            }
            MaterialTextView ebtListHeader = abstractC4279q3.f22204F;
            Intrinsics.i(ebtListHeader, "ebtListHeader");
            ck.d.g(ebtListHeader, AbstractC6392a.INSTANCE.d(C17905b.f167312c, Integer.valueOf(list2.size())));
        }
        if (!list5.isEmpty()) {
            AbstractC4279q abstractC4279q4 = this.binding;
            if (abstractC4279q4 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4279q = abstractC4279q4;
            }
            MaterialTextView nonEbtListHeader = abstractC4279q.f22209K;
            Intrinsics.i(nonEbtListHeader, "nonEbtListHeader");
            ck.d.g(nonEbtListHeader, AbstractC6392a.INSTANCE.d(C17905b.f167322m, Integer.valueOf(list3.size())));
            return;
        }
        AbstractC4279q abstractC4279q5 = this.binding;
        if (abstractC4279q5 == null) {
            Intrinsics.x("binding");
            abstractC4279q5 = null;
        }
        abstractC4279q5.f22209K.setVisibility(8);
        AbstractC4279q abstractC4279q6 = this.binding;
        if (abstractC4279q6 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4279q = abstractC4279q6;
        }
        abstractC4279q.f22208J.setVisibility(8);
    }

    private final void R1() {
        AbstractC4279q abstractC4279q = this.binding;
        AbstractC4279q abstractC4279q2 = null;
        if (abstractC4279q == null) {
            Intrinsics.x("binding");
            abstractC4279q = null;
        }
        abstractC4279q.f22206H.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCartActivity.S1(this.f102603a, view);
            }
        });
        AbstractC4279q abstractC4279q3 = this.binding;
        if (abstractC4279q3 == null) {
            Intrinsics.x("binding");
            abstractC4279q3 = null;
        }
        abstractC4279q3.f22216R.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCartActivity.T1(this.f102606a, view);
            }
        });
        AbstractC4279q abstractC4279q4 = this.binding;
        if (abstractC4279q4 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4279q2 = abstractC4279q4;
        }
        abstractC4279q2.f22205G.f22374z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCartActivity.U1(this.f102610a, view);
            }
        });
    }

    private final E0 W1() {
        return (E0) this.cartViewModel.getValue();
    }

    private final void a2(int visibility) {
        AbstractC4279q abstractC4279q = this.binding;
        AbstractC4279q abstractC4279q2 = null;
        if (abstractC4279q == null) {
            Intrinsics.x("binding");
            abstractC4279q = null;
        }
        abstractC4279q.f22204F.setVisibility(visibility);
        AbstractC4279q abstractC4279q3 = this.binding;
        if (abstractC4279q3 == null) {
            Intrinsics.x("binding");
            abstractC4279q3 = null;
        }
        abstractC4279q3.f22209K.setVisibility(visibility);
        AbstractC4279q abstractC4279q4 = this.binding;
        if (abstractC4279q4 == null) {
            Intrinsics.x("binding");
            abstractC4279q4 = null;
        }
        abstractC4279q4.f22207I.setVisibility(visibility);
        AbstractC4279q abstractC4279q5 = this.binding;
        if (abstractC4279q5 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4279q2 = abstractC4279q5;
        }
        abstractC4279q2.f22208J.setVisibility(visibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialToolbar b2(EditCartActivity editCartActivity) {
        AbstractC4279q abstractC4279q = editCartActivity.binding;
        if (abstractC4279q == null) {
            Intrinsics.x("binding");
            abstractC4279q = null;
        }
        return abstractC4279q.f22214P;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void K(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        C18188a.f170828a.a(CartProductSavingsDialogFragment.INSTANCE.a(CartProductSavingsDecorator.INSTANCE.b(item)), this, "cart_product_savings_dialog_fragment");
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void N0(nk.f product) {
        Intrinsics.j(product, "product");
        W1().n0(new E0.AbstractC11813f.RemoveEntryFromEllipsis(product));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void R(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        W1().n0(new E0.AbstractC11813f.DeleteProactiveSubstituteAction(item.getProduct().getCode()));
    }

    public final wr.f V1() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("cartInteractor");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void Y0(CartEntryActionDecorator cartEntryActionDecorator) {
        Intrinsics.j(cartEntryActionDecorator, "cartEntryActionDecorator");
        W1().n0(new E0.AbstractC11813f.GetOptionsForEntryAction(cartEntryActionDecorator));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !V1().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void a1(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        W1().n0(new E0.AbstractC11813f.UpdateEntryQuantityAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a, com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void b(int entryNumber, String note) {
        AbstractC14276c<Intent> abstractC14276c = this.entryNoteResultLauncher;
        EntryNoteActivity.Companion companion = EntryNoteActivity.INSTANCE;
        if (note == null) {
            note = "";
        }
        abstractC14276c.a(companion.a(this, entryNumber, note, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE"));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void i(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        W1().n0(new E0.AbstractC11813f.GoProductDetailAction(item.getProduct()));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void n(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        W1().n0(new E0.AbstractC11813f.StepperStateChangedAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11904z0.a
    public void w0(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        this.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this, item, Pp.c.f26245a, null, "Meijer:CartPage", 8, null));
    }

    @Override // Bj.b
    public Toolbar y() {
        Object value = this.toolbar.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (Toolbar) value;
    }

    public EditCartActivity() {
        C15069d<ju.g> c15069d = new C15069d<>();
        c15069d.c(this.productsListSection);
        this.productsAdapter = c15069d;
        C15069d<ju.g> c15069d2 = new C15069d<>();
        c15069d2.c(this.nonEBTProductsListSection);
        this.nonEBTProductsAdapter = c15069d2;
        this.entryNoteResultLauncher = registerForActivityResult(new h.i(), new b());
        this.substitutionResultLauncher = registerForActivityResult(new h.i(), new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(EditCartActivity editCartActivity, View view) {
        editCartActivity.startActivity(editCartActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(EditCartActivity editCartActivity, View view) {
        if (editCartActivity.getFeatureManager().e(AbstractC18503f.i0.f172883h)) {
            editCartActivity.finish();
        } else {
            editCartActivity.startActivity(CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, editCartActivity, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(EditCartActivity editCartActivity, View view) {
        editCartActivity.W1().n0(E0.AbstractC11813f.C11824l.f102197a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(C14274a result) {
        if (result.getResultCode() == 59343) {
            W1().n0(E0.AbstractC11813f.G.f102167a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(C14274a result) {
        if (result.getResultCode() == 8675309) {
            W1().n0(E0.AbstractC11813f.w.f102209a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(EditCartActivity editCartActivity) {
        if (editCartActivity.getFeatureManager().e(AbstractC18503f.i0.f172883h) && editCartActivity.W1().k0().getValue().i().isEmpty()) {
            Intent intentD = editCartActivity.getFeatureEntryPoint().d();
            intentD.setFlags(67108864);
            editCartActivity.startActivity(intentD);
        }
        if (!editCartActivity.onNavigateUp()) {
            editCartActivity.finish();
        }
        return Unit.f143329a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        int x10;
        E0 e0W1 = W1();
        int y10 = 0;
        if (ev2 != null) {
            x10 = (int) ev2.getX();
        } else {
            x10 = 0;
        }
        if (ev2 != null) {
            y10 = (int) ev2.getY();
        }
        e0W1.n0(new E0.AbstractC11813f.CollapseQtyStepperAction(x10, y10));
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.i(layoutInflater, "getLayoutInflater(...)");
        AbstractC4279q abstractC4279q = (AbstractC4279q) Fs.a.a(layoutInflater, com.meijer.mobile.meijer.V.f100243i, null, false);
        this.binding = abstractC4279q;
        if (abstractC4279q == null) {
            Intrinsics.x("binding");
            abstractC4279q = null;
        }
        setContentView(Zr.a.j(abstractC4279q.getRoot(), false, 1, null));
        getLifecycle().a(W1());
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCartActivity.Z1(this.f102593a);
            }
        }, 3, null);
        W1().n0(new E0.AbstractC11813f.SetCartModeAction(true));
        AbstractC4279q abstractC4279q2 = this.binding;
        if (abstractC4279q2 == null) {
            Intrinsics.x("binding");
            abstractC4279q2 = null;
        }
        RecyclerView recyclerView = abstractC4279q2.f22211M;
        recyclerView.setAdapter(this.productsAdapter);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        AbstractC4279q abstractC4279q3 = this.binding;
        if (abstractC4279q3 == null) {
            Intrinsics.x("binding");
            abstractC4279q3 = null;
        }
        RecyclerView recyclerView2 = abstractC4279q3.f22210L;
        recyclerView2.setAdapter(this.nonEBTProductsAdapter);
        recyclerView2.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView2.getContext(), 1));
        C16563h.J(C16563h.O(W1().k0(), new c(null)), C6173t.a(this));
        R1();
        C16563h.J(C16563h.O(W1().getEvents(), new d(null)), C6173t.a(this));
    }
}
