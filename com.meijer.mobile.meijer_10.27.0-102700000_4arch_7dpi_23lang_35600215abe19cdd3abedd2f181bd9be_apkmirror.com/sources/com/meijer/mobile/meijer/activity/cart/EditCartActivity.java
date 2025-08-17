package com.meijer.mobile.meijer.activity.cart;

import Mn.AbstractC4274q;
import Mn.AbstractC4294v0;
import V2.CreationExtras;
import Wj.ValueState;
import ak.AbstractC5607a;
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
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.activity.cart.C11779z0;
import com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.cart.E0;
import com.meijer.mobile.meijer.activity.cart.EditCartActivity;
import com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment;
import com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.C14886b;
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
import nu.C15949d;
import tr.C17135b;
import tv.C17154h;
import vs.CartProductListDecorator;
import wk.C17829a;
import wo.C17843b;
import yl.AbstractC18227f;
import zm.CartProductSavingsDecorator;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001;B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010&J'\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020!2\n\u0010:\u001a\u000605j\u0002`9H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010&J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010&J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010`\u001a\u00020]8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b^\u0010U\u001a\u0004\bZ\u0010_R\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010cR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020n0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020n0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010p¨\u0006z"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/EditCartActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "Lcom/meijer/mobile/meijer/activity/cart/z0$a;", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "<init>", "()V", "", "R1", "Lcom/meijer/mobile/meijer/activity/cart/l0;", "cartMetaDataDecorator", "O1", "(Lcom/meijer/mobile/meijer/activity/cart/l0;)V", "", "Lvs/b;", "cartProductList", "Q1", "(Ljava/util/List;)V", "Lg/a;", "result", "Y1", "(Lg/a;)V", "X1", "", "visibility", "a2", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "item", "Q", "(Lvs/b;)V", "i", "entryToUpdate", "LWj/t;", "valueState", "Landroid/graphics/Rect;", "stepperHitRect", "Z0", "(Lvs/b;LWj/t;Landroid/graphics/Rect;)V", "y", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "X0", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)V", "entryNumber", "", "note", "b", "(ILjava/lang/String;)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "I", "s0", "Lmk/f;", "product", "i0", "(Lmk/f;)V", "Lwr/f;", "s", "Lwr/f;", "V1", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "LTq/j;", "t", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lcom/meijer/mobile/meijer/activity/cart/E0;", "u", "Lkotlin/Lazy;", "W1", "()Lcom/meijer/mobile/meijer/activity/cart/E0;", "cartViewModel", "LMn/q;", "v", "LMn/q;", "binding", "Landroidx/appcompat/widget/Toolbar;", "w", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lnu/l;", "x", "Lnu/l;", "productsListSection", "nonEBTProductsListSection", "Lnu/d;", "Lnu/g;", "z", "Lnu/d;", "productsAdapter", "A", "nonEBTProductsAdapter", "Lg/c;", "Landroid/content/Intent;", "B", "Lg/c;", "entryNoteResultLauncher", "C", "Z", "isEBTCardAdded", "D", "isEBTCardRemoved", "E", "substitutionResultLauncher", "F", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EditCartActivity extends Hilt_EditCartActivity implements Aj.b, C11779z0.a, CartBottomSheetDialogFragment.a {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f101567G = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> nonEBTProductsAdapter;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> entryNoteResultLauncher;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isEBTCardAdded;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean isEBTCardRemoved;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AbstractC4274q binding;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> productsAdapter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartViewModel = new androidx.view.e0(Reflection.b(E0.class), new f(this), new e(this), new g(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy toolbar = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.a1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EditCartActivity.b2(this.f101745a);
        }
    });

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private nu.l productsListSection = new nu.l();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private nu.l nonEBTProductsListSection = new nu.l();

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
    /* synthetic */ class b implements InterfaceC14146b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            EditCartActivity.this.X1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f101588f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101588f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101589f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f101589f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101589f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101590f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101591g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101590f = function0;
            this.f101591g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101590f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101591g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h implements InterfaceC14146b, FunctionAdapter {
        h() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            EditCartActivity.this.Y1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$i;", "cartViewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$i;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.EditCartActivity$onCreate$4", f = "EditCartActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<E0.CartViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101582a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101583b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = EditCartActivity.this.new c(continuation);
            cVar.f101583b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.CartViewState cartViewState, Continuation<? super Unit> continuation) {
            return ((c) create(cartViewState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zH;
            IntrinsicsKt.f();
            if (this.f101582a == 0) {
                ResultKt.b(obj);
                E0.CartViewState cartViewState = (E0.CartViewState) this.f101583b;
                EditCartActivity editCartActivity = EditCartActivity.this;
                CartMetaDataDecorator cartMetaDataDecorator = cartViewState.getCartMetaDataDecorator();
                if (cartMetaDataDecorator != null) {
                    zH = cartMetaDataDecorator.h();
                } else {
                    zH = false;
                }
                editCartActivity.isEBTCardAdded = zH;
                EditCartActivity.this.O1(cartViewState.getCartMetaDataDecorator());
                AbstractC4274q abstractC4274q = EditCartActivity.this.binding;
                AbstractC4274q abstractC4274q2 = null;
                if (abstractC4274q == null) {
                    Intrinsics.y("binding");
                    abstractC4274q = null;
                }
                abstractC4274q.f20880N.W(cartViewState.getLoadingState().getIsLoading());
                EditCartActivity.this.Q1(cartViewState.i());
                AbstractC4274q abstractC4274q3 = EditCartActivity.this.binding;
                if (abstractC4274q3 == null) {
                    Intrinsics.y("binding");
                } else {
                    abstractC4274q2 = abstractC4274q3;
                }
                abstractC4274q2.f20884R.setEnabled(cartViewState.getIsCartEdited());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/E0$g;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/E0$g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.EditCartActivity$onCreate$5", f = "EditCartActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<E0.AbstractC11707g, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101585a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101586b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = EditCartActivity.this.new d(continuation);
            dVar.f101586b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E0.AbstractC11707g abstractC11707g, Continuation<? super Unit> continuation) {
            return ((d) create(abstractC11707g, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f101585a == 0) {
                ResultKt.b(obj);
                E0.AbstractC11707g abstractC11707g = (E0.AbstractC11707g) this.f101586b;
                if (abstractC11707g instanceof E0.AbstractC11707g.FailEvent) {
                    AbstractC4274q abstractC4274q = EditCartActivity.this.binding;
                    if (abstractC4274q == null) {
                        Intrinsics.y("binding");
                        abstractC4274q = null;
                    }
                    Snackbar.q0(abstractC4274q.getRoot(), ((E0.AbstractC11707g.FailEvent) abstractC11707g).getMessageResId(), 0).c0();
                } else if (abstractC11707g instanceof E0.AbstractC11707g.z) {
                    EditCartActivity editCartActivity = EditCartActivity.this;
                    editCartActivity.startActivity(editCartActivity.getMeijerIntent().p(EditCartActivity.this, true));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.GoProductDetailEvent) {
                    EditCartActivity.this.startActivity(Al.g.t(EditCartActivity.this.getFeatureEntryPoint(), ((E0.AbstractC11707g.GoProductDetailEvent) abstractC11707g).getProduct(), false, false, null, 12, null));
                } else if (abstractC11707g instanceof E0.AbstractC11707g.ShowEntryOptionsEvent) {
                    CartBottomSheetDialogFragment.INSTANCE.a(((E0.AbstractC11707g.ShowEntryOptionsEvent) abstractC11707g).getCartEntryActionDecorator()).show(EditCartActivity.this.getSupportFragmentManager(), "cart_bottom_sheet_tag");
                } else if (!(abstractC11707g instanceof E0.AbstractC11707g.CancelUpdateOrderErrorDialog) && !Intrinsics.e(abstractC11707g, E0.AbstractC11707g.C11709b.f101365a) && !Intrinsics.e(abstractC11707g, E0.AbstractC11707g.d.f101367a) && !Intrinsics.e(abstractC11707g, E0.AbstractC11707g.f.f101369a) && !(abstractC11707g instanceof E0.AbstractC11707g.Show503Error) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowCancelUpdateDialog) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowEmptyCartDialogEvent) && !Intrinsics.e(abstractC11707g, E0.AbstractC11707g.o.f101391a) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowHighValuePromoEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowLowStockDialogEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowOutOfStockDialogEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowSelectFulfillmentDialogEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowUpdateOrderFailureMessage) && !(abstractC11707g instanceof E0.AbstractC11707g.StartCheckoutEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.TriggerScrollingEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.OpenCartActivityBottomSheet) && !(abstractC11707g instanceof E0.AbstractC11707g.OpenEBTGetBalancePinPadEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.NavigateToOrderDetailEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.OpenEBTCheckoutPinPadEvent) && !(abstractC11707g instanceof E0.AbstractC11707g.UpdateOrderSuccess) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowCheckBalanceMessage) && !(abstractC11707g instanceof E0.AbstractC11707g.ShowEBTErrorDialog) && !(abstractC11707g instanceof E0.AbstractC11707g.NavigateToNotAvailableForDeliveryEvent)) {
                    if (abstractC11707g instanceof E0.AbstractC11707g.p) {
                        new C14886b(EditCartActivity.this).setTitle(EditCartActivity.this.getString(com.meijer.mobile.meijer.Y.f99611I4)).setCancelable(true).setMessage(EditCartActivity.this.getString(com.meijer.mobile.meijer.Y.f99592H4)).setPositiveButton(EditCartActivity.this.getString(com.meijer.mobile.meijer.Y.f99573G4), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.f1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                EditCartActivity.d.k(dialogInterface, i10);
                            }
                        }).show();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(CartMetaDataDecorator cartMetaDataDecorator) {
        if (cartMetaDataDecorator != null) {
            this.isEBTCardAdded = cartMetaDataDecorator.h();
            AbstractC4274q abstractC4274q = this.binding;
            AbstractC4274q abstractC4274q2 = null;
            if (abstractC4274q == null) {
                Intrinsics.y("binding");
                abstractC4274q = null;
            }
            MaterialTextView cartItemCount = abstractC4274q.f20868B;
            Intrinsics.i(cartItemCount, "cartItemCount");
            bk.d.g(cartItemCount, cartMetaDataDecorator.d());
            AbstractC4274q abstractC4274q3 = this.binding;
            if (abstractC4274q3 == null) {
                Intrinsics.y("binding");
                abstractC4274q3 = null;
            }
            ConstraintLayout cartScreen = abstractC4274q3.f20869C;
            Intrinsics.i(cartScreen, "cartScreen");
            cartScreen.setVisibility(cartMetaDataDecorator.g() ? 0 : 8);
            if (cartMetaDataDecorator.h()) {
                a2(0);
            } else {
                a2(8);
            }
            AbstractC4274q abstractC4274q4 = this.binding;
            if (abstractC4274q4 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4274q2 = abstractC4274q4;
            }
            AbstractC4294v0 abstractC4294v0 = abstractC4274q2.f20873G;
            ConstraintLayout errorEmptyScreen = abstractC4294v0.f21041D;
            Intrinsics.i(errorEmptyScreen, "errorEmptyScreen");
            errorEmptyScreen.setVisibility(cartMetaDataDecorator.f() || cartMetaDataDecorator.e() ? 0 : 8);
            if (cartMetaDataDecorator.f()) {
                abstractC4294v0.f21040C.setText(getString(com.meijer.mobile.meijer.Y.f99583Ge));
                abstractC4294v0.f21038A.setText(getString(C17135b.f161992P));
                abstractC4294v0.f21042z.setText(getString(com.meijer.mobile.meijer.Y.f99529Dh));
                MaterialButton cartErrorEmptyNeedHelpButton = abstractC4294v0.f21039B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton.setVisibility(0);
                abstractC4294v0.f21039B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.e1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditCartActivity.P1(this.f101763a, view);
                    }
                });
                return;
            }
            if (cartMetaDataDecorator.e()) {
                abstractC4294v0.f21040C.setText(getString(C17135b.f162003U0));
                abstractC4294v0.f21038A.setText(getString(C17135b.f162052v0));
                abstractC4294v0.f21042z.setText(getString(C17135b.f162050u0));
                MaterialButton cartErrorEmptyNeedHelpButton2 = abstractC4294v0.f21039B;
                Intrinsics.i(cartErrorEmptyNeedHelpButton2, "cartErrorEmptyNeedHelpButton");
                cartErrorEmptyNeedHelpButton2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(EditCartActivity editCartActivity, View view) {
        editCartActivity.startActivity(Al.a.f661a.c(editCartActivity, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(List<CartProductListDecorator> cartProductList) {
        List<CartProductListDecorator> list = cartProductList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11779z0((CartProductListDecorator) it.next(), this, "EDIT_CART_SCREEN"));
        }
        if (!this.isEBTCardAdded || this.isEBTCardRemoved) {
            this.productsListSection.R(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C11779z0) obj).getItem().getProduct().getIsEbtProduct()) {
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
        AbstractC4274q abstractC4274q = null;
        if (list4.isEmpty()) {
            a2(8);
            AbstractC4274q abstractC4274q2 = this.binding;
            if (abstractC4274q2 == null) {
                Intrinsics.y("binding");
                abstractC4274q2 = null;
            }
            abstractC4274q2.f20878L.setVisibility(8);
            W1().n0(E0.AbstractC11688f.y.f101356a);
            this.isEBTCardRemoved = true;
        } else {
            AbstractC4274q abstractC4274q3 = this.binding;
            if (abstractC4274q3 == null) {
                Intrinsics.y("binding");
                abstractC4274q3 = null;
            }
            MaterialTextView ebtListHeader = abstractC4274q3.f20872F;
            Intrinsics.i(ebtListHeader, "ebtListHeader");
            bk.d.g(ebtListHeader, AbstractC5607a.INSTANCE.d(C17843b.f166244c, Integer.valueOf(list2.size())));
        }
        if (!list5.isEmpty()) {
            AbstractC4274q abstractC4274q4 = this.binding;
            if (abstractC4274q4 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4274q = abstractC4274q4;
            }
            MaterialTextView nonEbtListHeader = abstractC4274q.f20877K;
            Intrinsics.i(nonEbtListHeader, "nonEbtListHeader");
            bk.d.g(nonEbtListHeader, AbstractC5607a.INSTANCE.d(C17843b.f166254m, Integer.valueOf(list3.size())));
            return;
        }
        AbstractC4274q abstractC4274q5 = this.binding;
        if (abstractC4274q5 == null) {
            Intrinsics.y("binding");
            abstractC4274q5 = null;
        }
        abstractC4274q5.f20877K.setVisibility(8);
        AbstractC4274q abstractC4274q6 = this.binding;
        if (abstractC4274q6 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4274q = abstractC4274q6;
        }
        abstractC4274q.f20876J.setVisibility(8);
    }

    private final void R1() {
        AbstractC4274q abstractC4274q = this.binding;
        AbstractC4274q abstractC4274q2 = null;
        if (abstractC4274q == null) {
            Intrinsics.y("binding");
            abstractC4274q = null;
        }
        abstractC4274q.f20874H.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCartActivity.S1(this.f101748a, view);
            }
        });
        AbstractC4274q abstractC4274q3 = this.binding;
        if (abstractC4274q3 == null) {
            Intrinsics.y("binding");
            abstractC4274q3 = null;
        }
        abstractC4274q3.f20884R.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCartActivity.T1(this.f101751a, view);
            }
        });
        AbstractC4274q abstractC4274q4 = this.binding;
        if (abstractC4274q4 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4274q2 = abstractC4274q4;
        }
        abstractC4274q2.f20873G.f21042z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCartActivity.U1(this.f101755a, view);
            }
        });
    }

    private final E0 W1() {
        return (E0) this.cartViewModel.getValue();
    }

    private final void a2(int visibility) {
        AbstractC4274q abstractC4274q = this.binding;
        AbstractC4274q abstractC4274q2 = null;
        if (abstractC4274q == null) {
            Intrinsics.y("binding");
            abstractC4274q = null;
        }
        abstractC4274q.f20872F.setVisibility(visibility);
        AbstractC4274q abstractC4274q3 = this.binding;
        if (abstractC4274q3 == null) {
            Intrinsics.y("binding");
            abstractC4274q3 = null;
        }
        abstractC4274q3.f20877K.setVisibility(visibility);
        AbstractC4274q abstractC4274q4 = this.binding;
        if (abstractC4274q4 == null) {
            Intrinsics.y("binding");
            abstractC4274q4 = null;
        }
        abstractC4274q4.f20875I.setVisibility(visibility);
        AbstractC4274q abstractC4274q5 = this.binding;
        if (abstractC4274q5 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4274q2 = abstractC4274q5;
        }
        abstractC4274q2.f20876J.setVisibility(visibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialToolbar b2(EditCartActivity editCartActivity) {
        AbstractC4274q abstractC4274q = editCartActivity.binding;
        if (abstractC4274q == null) {
            Intrinsics.y("binding");
            abstractC4274q = null;
        }
        return abstractC4274q.f20882P;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void I(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        C17829a.f166179a.a(CartProductSavingsDialogFragment.INSTANCE.a(CartProductSavingsDecorator.INSTANCE.b(item)), this, "cart_product_savings_dialog_fragment");
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void Q(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        W1().n0(new E0.AbstractC11688f.DeleteProactiveSubstituteAction(item.getProduct().getCode()));
    }

    public final wr.f V1() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("cartInteractor");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void X0(CartEntryActionDecorator cartEntryActionDecorator) {
        Intrinsics.j(cartEntryActionDecorator, "cartEntryActionDecorator");
        W1().n0(new E0.AbstractC11688f.GetOptionsForEntryAction(cartEntryActionDecorator));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void Z0(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        W1().n0(new E0.AbstractC11688f.UpdateEntryQuantityAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !V1().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a, com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void b(int entryNumber, String note) {
        AbstractC14147c<Intent> abstractC14147c = this.entryNoteResultLauncher;
        EntryNoteActivity.Companion companion = EntryNoteActivity.INSTANCE;
        if (note == null) {
            note = "";
        }
        abstractC14147c.a(companion.a(this, entryNumber, note, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE"));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void i(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        W1().n0(new E0.AbstractC11688f.GoProductDetailAction(item.getProduct()));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.a
    public void i0(mk.f product) {
        Intrinsics.j(product, "product");
        W1().n0(new E0.AbstractC11688f.RemoveEntryFromEllipsis(product));
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void s0(CartProductListDecorator item) {
        Intrinsics.j(item, "item");
        this.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, this, item, Pp.c.f28363a, null, "Meijer:CartPage", 8, null));
    }

    @Override // Aj.b
    public Toolbar v() {
        Object value = this.toolbar.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (Toolbar) value;
    }

    @Override // com.meijer.mobile.meijer.activity.cart.C11779z0.a
    public void y(CartProductListDecorator entryToUpdate, ValueState valueState, Rect stepperHitRect) {
        Intrinsics.j(entryToUpdate, "entryToUpdate");
        Intrinsics.j(valueState, "valueState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        W1().n0(new E0.AbstractC11688f.StepperStateChangedAction(entryToUpdate, valueState.getQuantity(), stepperHitRect));
    }

    public EditCartActivity() {
        C15949d<nu.g> c15949d = new C15949d<>();
        c15949d.c(this.productsListSection);
        this.productsAdapter = c15949d;
        C15949d<nu.g> c15949d2 = new C15949d<>();
        c15949d2.c(this.nonEBTProductsListSection);
        this.nonEBTProductsAdapter = c15949d2;
        this.entryNoteResultLauncher = registerForActivityResult(new h.i(), new b());
        this.substitutionResultLauncher = registerForActivityResult(new h.i(), new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(EditCartActivity editCartActivity, View view) {
        editCartActivity.startActivity(editCartActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(EditCartActivity editCartActivity, View view) {
        if (editCartActivity.getFeatureManager().e(AbstractC18227f.i0.f170583h)) {
            editCartActivity.finish();
        } else {
            editCartActivity.startActivity(CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, editCartActivity, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(EditCartActivity editCartActivity, View view) {
        editCartActivity.W1().n0(E0.AbstractC11688f.C11699l.f101342a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(C14145a result) {
        if (result.getResultCode() == 59343) {
            W1().n0(E0.AbstractC11688f.G.f101312a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(C14145a result) {
        if (result.getResultCode() == 8675309) {
            W1().n0(E0.AbstractC11688f.w.f101354a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(EditCartActivity editCartActivity) {
        if (editCartActivity.getFeatureManager().e(AbstractC18227f.i0.f170583h) && editCartActivity.W1().k0().getValue().i().isEmpty()) {
            Intent intentD = editCartActivity.getFeatureEntryPoint().d();
            intentD.setFlags(67108864);
            editCartActivity.startActivity(intentD);
        }
        if (!editCartActivity.onNavigateUp()) {
            editCartActivity.finish();
        }
        return Unit.f142422a;
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
        e0W1.n0(new E0.AbstractC11688f.CollapseQtyStepperAction(x10, y10));
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.i(layoutInflater, "getLayoutInflater(...)");
        AbstractC4274q abstractC4274q = (AbstractC4274q) Fs.a.a(layoutInflater, com.meijer.mobile.meijer.V.f99387i, null, false);
        this.binding = abstractC4274q;
        if (abstractC4274q == null) {
            Intrinsics.y("binding");
            abstractC4274q = null;
        }
        setContentView(Zr.a.j(abstractC4274q.getRoot(), false, 1, null));
        getLifecycle().a(W1());
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCartActivity.Z1(this.f101738a);
            }
        }, 3, null);
        W1().n0(new E0.AbstractC11688f.SetCartModeAction(true));
        AbstractC4274q abstractC4274q2 = this.binding;
        if (abstractC4274q2 == null) {
            Intrinsics.y("binding");
            abstractC4274q2 = null;
        }
        RecyclerView recyclerView = abstractC4274q2.f20879M;
        recyclerView.setAdapter(this.productsAdapter);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        AbstractC4274q abstractC4274q3 = this.binding;
        if (abstractC4274q3 == null) {
            Intrinsics.y("binding");
            abstractC4274q3 = null;
        }
        RecyclerView recyclerView2 = abstractC4274q3.f20878L;
        recyclerView2.setAdapter(this.nonEBTProductsAdapter);
        recyclerView2.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView2.getContext(), 1));
        C17154h.J(C17154h.O(W1().k0(), new c(null)), C6031t.a(this));
        R1();
        C17154h.J(C17154h.O(W1().getEvents(), new d(null)), C6031t.a(this));
    }
}
