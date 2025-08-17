package com.meijer.mobile.meijer.activity.personalized.modals;

import Co.ProductFullDetails;
import Hl.FulfillmentBarDecorator;
import Ho.ProductSponsorship;
import Ji.LocalThemeScope;
import Mn.Z1;
import Oj.a;
import Ok.Coupon;
import Pk.a;
import Qo.l;
import Rn.a;
import Tl.ToastMessageData;
import V2.CreationExtras;
import an.C5611a;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ce.C6386a;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.jay.widget.StickyHeadersLinearLayoutManager;
import com.meijer.mobile.meijer.activity.find.C12104p0;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.C12490t0;
import com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import e.C13589e;
import fi.GoogleAdAnalytics;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.List;
import je.C14886b;
import ji.InterfaceC14928c0;
import ji.q1;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.l;
import nu.C15949d;
import ou.AbstractC16177a;
import qv.C16648k;
import qv.InterfaceC16622O;
import ss.InterfaceC17023a;
import tr.C17134a;
import tr.C17135b;
import ts.ProductCardDecorator;
import tv.C17154h;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J\u001f\u0010:\u001a\u00020\f2\u0006\u00107\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J+\u0010>\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010<\u001a\u00020!2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010@H\u0014¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\fH\u0014¢\u0006\u0004\bD\u0010\u0006J\u000f\u0010E\u001a\u00020\fH\u0014¢\u0006\u0004\bE\u0010\u0006J\u0017\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bK\u0010\u0016J'\u0010N\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u0010M\u001a\u00020L2\u0006\u00104\u001a\u00020+H\u0016¢\u0006\u0004\bN\u0010OJ'\u0010T\u001a\u00020\f2\u0006\u00107\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ'\u0010V\u001a\u00020\f2\u0006\u00107\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bV\u0010UJ\u001b\u0010Y\u001a\u00020H2\n\u0010X\u001a\u00060!j\u0002`WH\u0016¢\u0006\u0004\bY\u0010ZJ%\u0010]\u001a\u00020\f2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\\\u001a\u00020!H\u0016¢\u0006\u0004\b]\u0010^J%\u0010_\u001a\u00020\f2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\\\u001a\u00020!H\u0016¢\u0006\u0004\b_\u0010^J\u001f\u0010`\u001a\u00020\f2\u0006\u0010[\u001a\u00020!2\u0006\u0010\\\u001a\u00020!H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\bb\u0010 J\u000f\u0010c\u001a\u00020\fH\u0016¢\u0006\u0004\bc\u0010\u0006J\u0019\u0010f\u001a\u00020H2\b\u0010e\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bf\u0010gR\u0016\u0010M\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0089\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0086\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0096\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010¥\u0001\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010«\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0095\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0095\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0086\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010µ\u0001\u001a\u00030³\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bu\u0010´\u0001R\u0015\u0010¹\u0001\u001a\u00030¶\u00018F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001¨\u0006º\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/PersonalizedShoppingListActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "<init>", "()V", "LJi/M;", "localThemeScope", "", "Lvs/f;", "personalizedProducts", "", "G2", "(LJi/M;Ljava/util/List;)V", "LQo/l;", "productQuery", "j3", "(LQo/l;)V", "LOj/a;", "loadingState", "V2", "(LOj/a;)V", "T2", "Lg/a;", "result", "z2", "(Lg/a;)V", "Z2", "LCo/h;", "product", "Y2", "(LCo/h;)V", "", "k3", "(LQo/l;)Ljava/lang/String;", "Lmk/f;", "a3", "(Lmk/f;)V", "LOk/a;", "coupon", "B2", "(LOk/a;)V", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "f3", "(IIIILOk/a;)V", "Lts/a;", "itemClicked", "position", "U2", "(Lts/a;I)V", "productToAdd", "", "quantity", "X2", "(LCo/h;D)V", "message", "Lmk/c;", "e3", "(LJi/M;Ljava/lang/String;Lmk/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "W2", "Landroidx/databinding/p;", "binding", "a0", "(Lts/a;Landroidx/databinding/p;I)V", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "l0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "R", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "U0", "c3", "(Ljava/lang/String;Ljava/lang/String;)V", "m0", "d0", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "LMn/E;", "s", "LMn/E;", "Lnu/d;", "Lnu/g;", "t", "Lnu/d;", "adapter", "Lnu/l;", "u", "Lnu/l;", "allItemsSection", "Lwr/f;", "v", "Lwr/f;", "u2", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lpp/e;", "w", "Lpp/e;", "w2", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "x", "Lkotlin/Lazy;", "y2", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "vm", "LHl/b;", "y", "getFulfillmentBarViewModel", "()LHl/b;", "fulfillmentBarViewModel", "Lg/c;", "Landroid/content/Intent;", "z", "Lg/c;", "substitutionResultLauncher", "A", "Z", "stepperClickedState", "Lcom/meijer/mobile/meijer/activity/find/p0;", "B", "Lcom/meijer/mobile/meijer/activity/find/p0;", "scrollListener", "LPp/b;", "C", "LPp/b;", "searchType", "D", "Ljava/lang/String;", "x2", "()Ljava/lang/String;", "d3", "(Ljava/lang/String;)V", "trackState", "Lcom/google/android/material/snackbar/Snackbar;", "E", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "F", "isBuyAgain", "G", "isFavOnSale", "Lce/a;", "H", "t2", "()Lce/a;", "cartBadge", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lmk/l;", "v2", "()Lmk/l;", "productQueryIntent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PersonalizedShoppingListActivity extends Hilt_PersonalizedShoppingListActivity implements Aj.b, C12490t0.a, C12104p0.b {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean stepperClickedState;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public String trackState;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Snackbar currentSnackbar;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean isBuyAgain;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isFavOnSale;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Mn.E binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> adapter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private nu.l allItemsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public pp.e sponsorshipsDataStore;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(e1.class), new h(this), new g(this), new i(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Hl.b.class), new k(this), new j(this), new l(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new m());

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C12104p0 scrollListener = new C12104p0(this, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.H
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PersonalizedShoppingListActivity.b3(this.f110942a);
        }
    });

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f28356a;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.T
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PersonalizedShoppingListActivity.s2(this.f111035a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mk.d.values().length];
            try {
                iArr[mk.d.f150120a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk.d.f150121b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PersonalizedShoppingListActivity f110985a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$4$1$1$1$1", f = "PersonalizedShoppingListActivity.kt", l = {257}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$a, reason: collision with other inner class name */
            static final class C1708a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110986a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f110987b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110988c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1709a<T> implements InterfaceC17153g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PersonalizedShoppingListActivity f110989a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110990b;

                    C1709a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope) {
                        this.f110989a = personalizedShoppingListActivity;
                        this.f110990b = localThemeScope;
                    }

                    @Override // tv.InterfaceC17153g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(ToastMessageData toastMessageData, Continuation<? super Unit> continuation) {
                        this.f110989a.e3(this.f110990b, toastMessageData.getMessage(), toastMessageData.getProduct());
                        return Unit.f142422a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1708a(this.f110987b, this.f110988c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1708a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super C1708a> continuation) {
                    super(2, continuation);
                    this.f110987b = personalizedShoppingListActivity;
                    this.f110988c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1708a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110986a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17144F<ToastMessageData> toastMessageData = this.f110987b.y2().getToastMessageData();
                        C1709a c1709a = new C1709a(this.f110987b, this.f110988c);
                        this.f110986a = 1;
                        if (toastMessageData.collect(c1709a, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$b, reason: collision with other inner class name */
            static final class C1710b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f110991a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110992b;

                C1710b(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope) {
                    this.f110991a = personalizedShoppingListActivity;
                    this.f110992b = localThemeScope;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1865597818, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:268)");
                    }
                    z1 z1VarB = o1.b(this.f110991a.getFulfillmentBarViewModel().n(), null, composer, 0, 1);
                    if (this.f110991a.getUserManager().b()) {
                        LocalThemeScope localThemeScope = this.f110992b;
                        FulfillmentBarDecorator fulfillmentBarDecorator = (FulfillmentBarDecorator) z1VarB.getValue();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f110991a);
                        final PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f110991a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PersonalizedShoppingListActivity.b.a.C1710b.c(personalizedShoppingListActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Hl.g.b(localThemeScope, fulfillmentBarDecorator, null, (Function0) objB, composer, LocalThemeScope.f15770g | (FulfillmentBarDecorator.f12698m << 3), 2);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
                    personalizedShoppingListActivity.j3(personalizedShoppingListActivity.y2().m1().getValue().getProductQuery());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$4$1$1$1$3", f = "PersonalizedShoppingListActivity.kt", l = {279}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110993a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f110994b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110995c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$4$1$1$1$3$1", f = "PersonalizedShoppingListActivity.kt", l = {280}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$c$a, reason: collision with other inner class name */
                static final class C1711a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110996a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PersonalizedShoppingListActivity f110997b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110998c;

                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$4$1$1$1$3$1$1", f = "PersonalizedShoppingListActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$c$a$a, reason: collision with other inner class name */
                    static final class C1712a extends SuspendLambda implements Function2<e1.ViewState, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f110999a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f111000b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ PersonalizedShoppingListActivity f111001c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111002d;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1712a c1712a = new C1712a(this.f111001c, this.f111002d, continuation);
                            c1712a.f111000b = obj;
                            return c1712a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                            return ((C1712a) create(viewState, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1712a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super C1712a> continuation) {
                            super(2, continuation);
                            this.f111001c = personalizedShoppingListActivity;
                            this.f111002d = localThemeScope;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            boolean z10;
                            IntrinsicsKt.f();
                            if (this.f110999a == 0) {
                                ResultKt.b(obj);
                                e1.ViewState viewState = (e1.ViewState) this.f111000b;
                                this.f111001c.W2(viewState.getLoadingState());
                                bk.k.a(this.f111001c.v(), viewState.getTitle());
                                PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111001c;
                                personalizedShoppingListActivity.isBuyAgain = Intrinsics.e(bk.d.a(personalizedShoppingListActivity, viewState.getTitle()), this.f111001c.getString(com.meijer.mobile.meijer.Y.f100288r0));
                                PersonalizedShoppingListActivity personalizedShoppingListActivity2 = this.f111001c;
                                personalizedShoppingListActivity2.isFavOnSale = Intrinsics.e(bk.d.a(personalizedShoppingListActivity2, viewState.getTitle()), this.f111001c.getString(com.meijer.mobile.meijer.Y.f99593H5));
                                if ((this.f111001c.isBuyAgain && this.f111001c.getFeatureManager().e(AbstractC18227f.k0.f170587h)) || this.f111001c.getFeatureManager().e(AbstractC18227f.l0.f170589h)) {
                                    this.f111001c.y2().t2();
                                }
                                this.f111001c.G2(this.f111002d, viewState.q());
                                if (viewState.getCartDecorator().getIsAvailable()) {
                                    C6386a c6386aT2 = this.f111001c.t2();
                                    c6386aT2.R(viewState.getCartDecorator().getItemCount());
                                    if (c6386aT2.z() && c6386aT2.o() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    c6386aT2.setVisible(z10, true);
                                    Qj.a.a(this.f111001c.v(), com.meijer.mobile.meijer.T.f99051c4, c6386aT2);
                                }
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1711a(this.f110997b, this.f110998c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1711a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super C1711a> continuation) {
                        super(2, continuation);
                        this.f110997b = personalizedShoppingListActivity;
                        this.f110998c = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1711a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110996a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            tv.P<e1.ViewState> pM1 = this.f110997b.y2().m1();
                            C1712a c1712a = new C1712a(this.f110997b, this.f110998c, null);
                            this.f110996a = 1;
                            if (C17154h.k(pM1, c1712a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f110994b, this.f110995c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f110994b = personalizedShoppingListActivity;
                    this.f110995c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110993a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f110994b;
                        AbstractC6023l.b bVar = AbstractC6023l.b.f55277c;
                        C1711a c1711a = new C1711a(personalizedShoppingListActivity, this.f110995c, null);
                        this.f110993a = 1;
                        if (C5994J.b(personalizedShoppingListActivity, bVar, c1711a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
                this.f110985a = personalizedShoppingListActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Mn.E d(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                Intrinsics.j(layoutInflater, "<unused var>");
                Intrinsics.j(viewGroup, "<unused var>");
                C16648k.d(C6031t.a(personalizedShoppingListActivity), null, null, new C1708a(personalizedShoppingListActivity, localThemeScope, null), 3, null);
                Mn.E e10 = personalizedShoppingListActivity.binding;
                if (e10 == null) {
                    Intrinsics.y("binding");
                    e10 = null;
                }
                e10.f19975A.setContent(ComposableLambdaKt.composableLambdaInstance(1865597818, true, new C1710b(personalizedShoppingListActivity, localThemeScope)));
                C16648k.d(C6031t.a(personalizedShoppingListActivity), null, null, new c(personalizedShoppingListActivity, localThemeScope, null), 3, null);
                Mn.E e11 = personalizedShoppingListActivity.binding;
                if (e11 != null) {
                    return e11;
                }
                Intrinsics.y("binding");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Mn.E AndroidViewBinding) {
                Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
                return Unit.f142422a;
            }

            public final void c(final LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2015979571, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.onCreate.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:247)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(AdsTheme))) | composer.D(this.f110985a);
                final PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f110985a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function3() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.e0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return PersonalizedShoppingListActivity.b.a.d(personalizedShoppingListActivity, AdsTheme, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                Function3 function3 = (Function3) objB;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.f0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PersonalizedShoppingListActivity.b.a.e((Mn.E) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                androidx.compose.ui.viewinterop.a.a(function3, null, (Function1) objB2, composer, 384, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1819250526, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.onCreate.<anonymous> (PersonalizedShoppingListActivity.kt:246)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(2015979571, true, new a(PersonalizedShoppingListActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$6", f = "PersonalizedShoppingListActivity.kt", l = {354}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111003a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PersonalizedShoppingListActivity f111005a;

            a(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
                this.f111005a = personalizedShoppingListActivity;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                this.f111005a.stepperClickedState = z10;
                return Unit.f142422a;
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonalizedShoppingListActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111003a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                tv.P<Boolean> pK1 = PersonalizedShoppingListActivity.this.y2().k1();
                a aVar = new a(PersonalizedShoppingListActivity.this);
                this.f111003a = 1;
                if (pK1.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$7", f = "PersonalizedShoppingListActivity.kt", l = {360}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111006a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$7$1", f = "PersonalizedShoppingListActivity.kt", l = {361}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111008a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PersonalizedShoppingListActivity f111009b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PersonalizedShoppingListActivity personalizedShoppingListActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f111009b = personalizedShoppingListActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f111009b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$7$1$1", f = "PersonalizedShoppingListActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$d$a$a, reason: collision with other inner class name */
            static final class C1713a extends SuspendLambda implements Function2<e1.AbstractC12460n, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111010a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f111011b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f111012c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1713a(PersonalizedShoppingListActivity personalizedShoppingListActivity, Continuation<? super C1713a> continuation) {
                    super(2, continuation);
                    this.f111012c = personalizedShoppingListActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1713a c1713a = new C1713a(this.f111012c, continuation);
                    c1713a.f111011b = obj;
                    return c1713a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e1.AbstractC12460n abstractC12460n, Continuation<? super Unit> continuation) {
                    return ((C1713a) create(abstractC12460n, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void q(PersonalizedShoppingListActivity personalizedShoppingListActivity, View view) {
                    personalizedShoppingListActivity.y2().x1(e1.AbstractC12456j.t.f111269a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void r(PersonalizedShoppingListActivity personalizedShoppingListActivity, View view) {
                    personalizedShoppingListActivity.startActivity(personalizedShoppingListActivity.getFeatureEntryPoint().d());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void s(PersonalizedShoppingListActivity personalizedShoppingListActivity, e1.AbstractC12460n abstractC12460n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    personalizedShoppingListActivity.y2().x1(new e1.AbstractC12456j.UserAcceptAddToCartAction(((e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n).a().b()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void t(PersonalizedShoppingListActivity personalizedShoppingListActivity, e1.AbstractC12460n abstractC12460n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    personalizedShoppingListActivity.y2().x1(new e1.AbstractC12456j.ResetActiveStepper(((e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n).a().b().getProductCode()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void u(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f111010a == 0) {
                        ResultKt.b(obj);
                        final e1.AbstractC12460n abstractC12460n = (e1.AbstractC12460n) this.f111011b;
                        if (abstractC12460n instanceof e1.AbstractC12460n.w) {
                            this.f111012c.Z2();
                        } else if (abstractC12460n instanceof e1.AbstractC12460n.g) {
                            this.f111012c.T2();
                        } else if (abstractC12460n instanceof e1.AbstractC12460n.ShoppingListUpdateFailedEvent) {
                            e1.AbstractC12460n.ShoppingListUpdateFailedEvent shoppingListUpdateFailedEvent = (e1.AbstractC12460n.ShoppingListUpdateFailedEvent) abstractC12460n;
                            new Pj.j(this.f111012c, shoppingListUpdateFailedEvent.getMessageResId(), new Object[0]).r(shoppingListUpdateFailedEvent.getTitleResId(), new Object[0]).g();
                        } else {
                            Mn.E e10 = null;
                            if (abstractC12460n instanceof e1.AbstractC12460n.AddToShoppingListSuccessEvent) {
                                Mn.E e11 = this.f111012c.binding;
                                if (e11 == null) {
                                    Intrinsics.y("binding");
                                } else {
                                    e10 = e11;
                                }
                                e1.AbstractC12460n.AddToShoppingListSuccessEvent addToShoppingListSuccessEvent = (e1.AbstractC12460n.AddToShoppingListSuccessEvent) abstractC12460n;
                                Snackbar snackbarQ0 = Snackbar.q0(e10.getRoot(), addToShoppingListSuccessEvent.getMessageResId(), 0);
                                int actionResId = addToShoppingListSuccessEvent.getActionResId();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111012c;
                                snackbarQ0.t0(actionResId, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.h0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        PersonalizedShoppingListActivity.d.a.C1713a.q(personalizedShoppingListActivity, view);
                                    }
                                }).c0();
                                uw.a.INSTANCE.a("Successfully added \"" + addToShoppingListSuccessEvent.getProduct() + "\" to shopping list", new Object[0]);
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.CartUpdateSuccessEvent) {
                                Mn.E e12 = this.f111012c.binding;
                                if (e12 == null) {
                                    Intrinsics.y("binding");
                                } else {
                                    e10 = e12;
                                }
                                e1.AbstractC12460n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12460n.CartUpdateSuccessEvent) abstractC12460n;
                                Snackbar snackbarQ02 = Snackbar.q0(e10.getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0);
                                int actionResId2 = cartUpdateSuccessEvent.getActionResId();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity2 = this.f111012c;
                                snackbarQ02.t0(actionResId2, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.i0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        PersonalizedShoppingListActivity.d.a.C1713a.r(personalizedShoppingListActivity2, view);
                                    }
                                }).c0();
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.OpenLowStockScreenEvent) {
                                this.f111012c.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, this.f111012c, ((e1.AbstractC12460n.OpenLowStockScreenEvent) abstractC12460n).getDecorator(), Pp.c.f28366d, null, "favorite products page", 8, null));
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.ViewItemInShoppingListEvent) {
                                this.f111012c.a3(((e1.AbstractC12460n.ViewItemInShoppingListEvent) abstractC12460n).getProduct());
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.ViewProductDetailsEvent) {
                                this.f111012c.Y2(((e1.AbstractC12460n.ViewProductDetailsEvent) abstractC12460n).getProduct());
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.UpdateToCartFailedEvent) {
                                Mn.E e13 = this.f111012c.binding;
                                if (e13 == null) {
                                    Intrinsics.y("binding");
                                    e13 = null;
                                }
                                View root = e13.getRoot();
                                String string = this.f111012c.getResources().getString(((e1.AbstractC12460n.UpdateToCartFailedEvent) abstractC12460n).getMessageResId());
                                Intrinsics.i(string, "getString(...)");
                                Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                                Intrinsics.i(snackbarR0, "make(...)");
                                Vj.b.b(snackbarR0).c0();
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.ShowChokingWarningDialogEvent) {
                                e1.AbstractC12460n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n;
                                C14886b message = new C14886b(this.f111012c, Bj.p.f3060d).setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Bj.i.f2666J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody());
                                int positiveButtonText = showChokingWarningDialogEvent.a().getPositiveButtonText();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity3 = this.f111012c;
                                C14886b positiveButton = message.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.j0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        PersonalizedShoppingListActivity.d.a.C1713a.s(personalizedShoppingListActivity3, abstractC12460n, dialogInterface, i10);
                                    }
                                });
                                int negativeButtonText = showChokingWarningDialogEvent.a().getNegativeButtonText();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity4 = this.f111012c;
                                positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        PersonalizedShoppingListActivity.d.a.C1713a.t(personalizedShoppingListActivity4, abstractC12460n, dialogInterface, i10);
                                    }
                                }).show();
                            } else if (!(abstractC12460n instanceof e1.AbstractC12460n.UpdateProductsInfoEvent) && !(abstractC12460n instanceof e1.AbstractC12460n.ProductListErrorEvent) && !(abstractC12460n instanceof e1.AbstractC12460n.ProductListSuccess)) {
                                if (abstractC12460n instanceof e1.AbstractC12460n.ShowError) {
                                    e1.AbstractC12460n.ShowError showError = (e1.AbstractC12460n.ShowError) abstractC12460n;
                                    new C14886b(this.f111012c).setCancelable(false).setTitle(bk.d.a(this.f111012c, showError.getTitle())).setMessage(bk.d.a(this.f111012c, showError.getMessage())).setPositiveButton(bk.d.a(this.f111012c, showError.getPositiveButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.l0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            PersonalizedShoppingListActivity.d.a.C1713a.u(dialogInterface, i10);
                                        }
                                    }).show();
                                } else if (!(abstractC12460n instanceof e1.AbstractC12460n.BubbleFacetsToFilterAndSort) && !(abstractC12460n instanceof e1.AbstractC12460n.LaunchFilterAndSortEvent)) {
                                    if (abstractC12460n instanceof e1.AbstractC12460n.ClipCouponFailedEvent) {
                                        e1.AbstractC12460n.ClipCouponFailedEvent clipCouponFailedEvent = (e1.AbstractC12460n.ClipCouponFailedEvent) abstractC12460n;
                                        this.f111012c.f3(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon());
                                    } else if (abstractC12460n instanceof e1.AbstractC12460n.ShowFreeItemsSnackbar) {
                                        Mn.E e14 = this.f111012c.binding;
                                        if (e14 == null) {
                                            Intrinsics.y("binding");
                                        } else {
                                            e10 = e14;
                                        }
                                        View root2 = e10.getRoot();
                                        Resources resources = this.f111012c.getResources();
                                        Intrinsics.i(resources, "getResources(...)");
                                        Snackbar snackbarR02 = Snackbar.r0(root2, bk.d.b(resources, ((e1.AbstractC12460n.ShowFreeItemsSnackbar) abstractC12460n).getMessage()), -2);
                                        Intrinsics.i(snackbarR02, "make(...)");
                                        Snackbar snackbarC = Vj.b.c(snackbarR02);
                                        snackbarC.c0();
                                        this.f111012c.currentSnackbar = snackbarC;
                                    } else if (abstractC12460n instanceof e1.AbstractC12460n.e) {
                                        Snackbar snackbar = this.f111012c.currentSnackbar;
                                        if (snackbar != null) {
                                            snackbar.A();
                                        }
                                    } else if (!Intrinsics.e(abstractC12460n, e1.AbstractC12460n.i.f111348a) && !(abstractC12460n instanceof e1.AbstractC12460n.SubstitutionFailureEvent) && !Intrinsics.e(abstractC12460n, e1.AbstractC12460n.l.f111351a)) {
                                        if (abstractC12460n instanceof e1.AbstractC12460n.ShowPlpEvent) {
                                            this.f111012c.startActivity(Al.g.t(this.f111012c.getFeatureEntryPoint(), ((e1.AbstractC12460n.ShowPlpEvent) abstractC12460n).getProduct(), true, false, null, 12, null));
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111008a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<e1.AbstractC12460n> events = this.f111009b.y2().getEvents();
                    C1713a c1713a = new C1713a(this.f111009b, null);
                    this.f111008a = 1;
                    if (C17154h.k(events, c1713a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonalizedShoppingListActivity.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111006a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                PersonalizedShoppingListActivity personalizedShoppingListActivity = PersonalizedShoppingListActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55277c;
                a aVar = new a(personalizedShoppingListActivity, null);
                this.f111006a = 1;
                if (C5994J.b(personalizedShoppingListActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/personalized/modals/PersonalizedShoppingListActivity$e", "Lou/a;", "LMn/Z1;", "viewBinding", "", "position", "", "A", "(LMn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LMn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends AbstractC16177a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Oj.a f111013e;

        e(Oj.a aVar) {
            this.f111013e = aVar;
        }

        @Override // ou.AbstractC16177a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f20435z.U(this.f111013e.getMessage(), this.f111013e.getIsLoading());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ou.AbstractC16177a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Z1 z(View view) {
            Intrinsics.j(view, "view");
            Z1 z1K0 = Z1.K0(view);
            Intrinsics.i(z1K0, "bind(...)");
            return z1K0;
        }

        @Override // nu.h
        /* renamed from: j */
        public int getLayoutId() {
            return com.meijer.mobile.meijer.V.f99316C0;
        }

        @Override // nu.h
        public long i() {
            return getLayoutId();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$showBeaconDebugInfo$1", f = "PersonalizedShoppingListActivity.kt", l = {977, 1000}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111014a;

        /* renamed from: b, reason: collision with root package name */
        int f111015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f111016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PersonalizedShoppingListActivity f111017d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mk.c f111018e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f111019f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f111020a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f111021b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$f$a$a, reason: collision with other inner class name */
            static final class C1714a implements Function3<InterfaceC14928c0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111022a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f111023b;

                C1714a(LocalThemeScope localThemeScope, String str) {
                    this.f111022a = localThemeScope;
                    this.f111023b = str;
                }

                public final void a(InterfaceC14928c0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-427756068, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.showBeaconDebugInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:990)");
                    }
                    Ci.j.l(this.f111022a, null, this.f111023b, Assemble.getToastVariant().getSuccess(), null, composer, LocalThemeScope.f15770g | (q1.m.Toast.f140129h << 9), 9);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14928c0 interfaceC14928c0, Composer composer, Integer num) {
                    a(interfaceC14928c0, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, String str) {
                this.f111020a = localThemeScope;
                this.f111021b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1744550368, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.showBeaconDebugInfo.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:988)");
                }
                LocalThemeScope localThemeScope = this.f111020a;
                Ji.Q.e(localThemeScope, ji.b1.f139765a, ComposableLambdaKt.c(-427756068, true, new C1714a(localThemeScope, this.f111021b), composer, 54), composer, LocalThemeScope.f15770g | 384 | (ji.b1.f139766b << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f111016c, this.f111017d, this.f111018e, this.f111019f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, PersonalizedShoppingListActivity personalizedShoppingListActivity, mk.c cVar, LocalThemeScope localThemeScope, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f111016c = str;
            this.f111017d = personalizedShoppingListActivity;
            this.f111018e = cVar;
            this.f111019f = localThemeScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
        
            if (qv.Z.b(5000, r9) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f111015b
                java.lang.String r2 = "composeToastView"
                r3 = 2
                r4 = 0
                java.lang.String r5 = "binding"
                r6 = 1
                if (r1 == 0) goto L28
                if (r1 == r6) goto L24
                if (r1 != r3) goto L1c
                java.lang.Object r0 = r9.f111014a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.b(r10)
                goto La8
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                kotlin.ResultKt.b(r10)
                goto L36
            L28:
                kotlin.ResultKt.b(r10)
                r9.f111015b = r6
                r7 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r10 = qv.Z.b(r7, r9)
                if (r10 != r0) goto L36
                goto La7
            L36:
                uw.a$a r10 = uw.a.INSTANCE
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "Showing toast message: "
                r1.append(r7)
                java.lang.String r7 = r9.f111016c
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                r7 = 0
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r10.a(r1, r8)
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity r10 = r9.f111017d
                Mn.E r10 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.Y1(r10)
                if (r10 != 0) goto L5d
                kotlin.jvm.internal.Intrinsics.y(r5)
                r10 = r4
            L5d:
                androidx.compose.ui.platform.ComposeView r10 = r10.f19979z
                kotlin.jvm.internal.Intrinsics.i(r10, r2)
                r10.setVisibility(r7)
                java.lang.String r10 = r9.f111016c
                mk.c r1 = r9.f111018e
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r10)
                java.lang.String r10 = Tl.d.a(r1)
                r7.append(r10)
                java.lang.String r10 = r7.toString()
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity r1 = r9.f111017d
                Mn.E r1 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.Y1(r1)
                if (r1 != 0) goto L88
                kotlin.jvm.internal.Intrinsics.y(r5)
                r1 = r4
            L88:
                androidx.compose.ui.platform.ComposeView r1 = r1.f19979z
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$f$a r7 = new com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$f$a
                Ji.M r8 = r9.f111019f
                r7.<init>(r8, r10)
                r8 = -1744550368(0xffffffff98044620, float:-1.7096004E-24)
                androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r8, r6, r7)
                r1.setContent(r6)
                r9.f111014a = r10
                r9.f111015b = r3
                r6 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r10 = qv.Z.b(r6, r9)
                if (r10 != r0) goto La8
            La7:
                return r0
            La8:
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity r10 = r9.f111017d
                Mn.E r10 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.Y1(r10)
                if (r10 != 0) goto Lb4
                kotlin.jvm.internal.Intrinsics.y(r5)
                goto Lb5
            Lb4:
                r4 = r10
            Lb5:
                androidx.compose.ui.platform.ComposeView r10 = r4.f19979z
                kotlin.jvm.internal.Intrinsics.i(r10, r2)
                r0 = 8
                r10.setVisibility(r0)
                kotlin.Unit r10 = kotlin.Unit.f142422a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111024f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f111024f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111024f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111025f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f111025f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111025f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111026f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111027g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111026f = function0;
            this.f111027g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111026f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111027g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111028f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f111028f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111028f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111029f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f111029f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111029f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111030f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111031g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111030f = function0;
            this.f111031g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111030f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111031g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m implements InterfaceC14146b, FunctionAdapter {
        m() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, PersonalizedShoppingListActivity.this, PersonalizedShoppingListActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            PersonalizedShoppingListActivity.this.z2(p02);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void U0(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
    }

    public void c3(String beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void d1(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(PersonalizedShoppingListActivity personalizedShoppingListActivity, androidx.view.F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        personalizedShoppingListActivity.finish();
        bk.c.b(personalizedShoppingListActivity, 1, com.meijer.mobile.meijer.M.f98599a, com.meijer.mobile.meijer.M.f98601c, 0, 8, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D2(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.p(personalizedShoppingListActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(PersonalizedShoppingListActivity personalizedShoppingListActivity, a.AbstractC0730a action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, a.AbstractC0730a.C0731a.f32566a)) {
            if (personalizedShoppingListActivity.getFeatureManager().e(AbstractC18227f.t0.f170605h)) {
                personalizedShoppingListActivity.startActivity(Al.h.d(personalizedShoppingListActivity, false));
            } else {
                personalizedShoppingListActivity.startActivity(Al.h.h(personalizedShoppingListActivity, false));
            }
        } else {
            if (!Intrinsics.e(action, a.AbstractC0730a.b.f32567a)) {
                throw new NoWhenBranchMatchedException();
            }
            personalizedShoppingListActivity.y2().x1(e1.AbstractC12456j.g.f111239a);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(LocalThemeScope localThemeScope, List<ProductListDecorator> personalizedProducts) {
        nu.h c12490t0;
        if (personalizedProducts.isEmpty()) {
            return;
        }
        List<ProductListDecorator> list = personalizedProducts;
        for (ProductListDecorator productListDecorator : list) {
            if (productListDecorator.getProduct().getIsSponsoredCriteo()) {
                y2().x1(new e1.AbstractC12456j.SendCriteoLoadBeacon(productListDecorator.getProduct().getBeaconInfo().getOnLoadBeacon(), productListDecorator.getProduct().getBeaconInfo().getFormatLevelOnLoadBeacon(), Tl.a.f35036b, productListDecorator.getProduct()));
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (final ProductListDecorator productListDecorator2 : list) {
            if (getFeatureManager().e(AbstractC18227f.T.f170559h)) {
                Pp.b bVar = null;
                CartProductListDecorator cartProductListDecorator = null;
                c12490t0 = new C12496w0(localThemeScope, productListDecorator2, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.H2(this.f111066a, (InterfaceC17023a) obj);
                    }
                }, getFeatureManager(), bVar, cartProductListDecorator, productListDecorator2.getSponsorship(), new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.I2(this.f111069a, productListDecorator2);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.K2(this.f111073a, productListDecorator2);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.L2(this.f110949a);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.M2(productListDecorator2, this);
                    }
                }, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.N2(this.f110953a, (e1.AbstractC12456j) obj);
                    }
                }, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.O2(this.f110955a, (GoogleAdAnalytics) obj);
                    }
                }, this.stepperClickedState, this.isFavOnSale, y2().m1().getValue().getGoogleAdSlot1(), y2().m1().getValue().getGoogleAdSlot2(), y2().m1().getValue().getGoogleAdSlot3(), 48, null);
            } else {
                c12490t0 = new C12490t0(productListDecorator2, this, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.P2(this.f110956a, productListDecorator2);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.N
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.R2(this.f110959a, productListDecorator2);
                    }
                }, getFeatureManager(), getUserManager().b(), null, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.S2(this.f110962a, productListDecorator2, (String) obj);
                    }
                }, 192, null);
            }
            arrayList.add(c12490t0);
        }
        nu.l lVar = this.allItemsSection;
        Mn.E e10 = null;
        if (lVar == null) {
            Intrinsics.y("allItemsSection");
            lVar = null;
        }
        lVar.R(arrayList);
        Mn.E e11 = this.binding;
        if (e11 == null) {
            Intrinsics.y("binding");
        } else {
            e10 = e11;
        }
        e10.f19977C.setBackgroundResource(Bj.g.f2632s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(PersonalizedShoppingListActivity personalizedShoppingListActivity, InterfaceC17023a it) {
        Intrinsics.j(it, "it");
        if (it instanceof InterfaceC17023a.SendCriteoOnViewBeacon) {
            InterfaceC17023a.SendCriteoOnViewBeacon sendCriteoOnViewBeacon = (InterfaceC17023a.SendCriteoOnViewBeacon) it;
            personalizedShoppingListActivity.d1(sendCriteoOnViewBeacon.a(), sendCriteoOnViewBeacon.getFormatLevelBeacon());
        } else if (it instanceof InterfaceC17023a.FindSimilarItems) {
            personalizedShoppingListActivity.m0(((InterfaceC17023a.FindSimilarItems) it).getProduct());
        } else if (it instanceof InterfaceC17023a.ProductItemClicked) {
            InterfaceC17023a.ProductItemClicked productItemClicked = (InterfaceC17023a.ProductItemClicked) it;
            personalizedShoppingListActivity.U2(productItemClicked.getItemClicked(), productItemClicked.getPosition());
        } else if (it instanceof InterfaceC17023a.SendCriteoLoadBeacon) {
            InterfaceC17023a.SendCriteoLoadBeacon sendCriteoLoadBeacon = (InterfaceC17023a.SendCriteoLoadBeacon) it;
            personalizedShoppingListActivity.c3(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon());
        } else {
            if (!(it instanceof InterfaceC17023a.UpdateEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17023a.UpdateEntry updateEntry = (InterfaceC17023a.UpdateEntry) it;
            personalizedShoppingListActivity.X2(updateEntry.getProductToAdd(), updateEntry.getQuantity());
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(personalizedShoppingListActivity.x2());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(PersonalizedShoppingListActivity personalizedShoppingListActivity, e1.AbstractC12456j action) {
        Intrinsics.j(action, "action");
        personalizedShoppingListActivity.y2().x1(action);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O2(PersonalizedShoppingListActivity personalizedShoppingListActivity, GoogleAdAnalytics googleAdAnalytics) {
        Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
        personalizedShoppingListActivity.y2().x1(new e1.AbstractC12456j.GoogleAdClicked(googleAdAnalytics));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q2(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(personalizedShoppingListActivity.x2());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductSponsorship S2(PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator, String it) {
        Intrinsics.j(it, "it");
        return personalizedShoppingListActivity.w2().a(productListDecorator.getProduct().getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C14886b(this).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.P
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PersonalizedShoppingListActivity.g3(this.f110965a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PersonalizedShoppingListActivity.i3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hl.b getFulfillmentBarViewModel() {
        return (Hl.b) this.fulfillmentBarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h3(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(personalizedShoppingListActivity.x2());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(Qo.l productQuery) {
        startActivity(OrderOptionsActivity.INSTANCE.b(this, k3(productQuery)));
    }

    private final String k3(Qo.l productQuery) {
        if (!(productQuery instanceof l.Personalized)) {
            return productQuery instanceof l.Favorites ? "favorite products page" : productQuery instanceof l.Department ? "department tier products page" : productQuery instanceof l.Search ? "home: search" : "";
        }
        int i10 = a.$EnumSwitchMapping$0[((l.Personalized) productQuery).getCategory().ordinal()];
        if (i10 == 1) {
            return "favorites on sale-homescreen";
        }
        if (i10 == 2) {
            return "buy again-homescreen";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6386a t2() {
        return (C6386a) this.cartBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 y2() {
        return (e1) this.vm.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void R(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        y2().x1(new e1.AbstractC12456j.StepperStateChangedAction(productToAdd.getCode(), controlState.getValueState().getQuantity(), stepperHitRect));
    }

    public final void W2(Oj.a loadingState) {
        Intrinsics.j(loadingState, "loadingState");
        if (loadingState instanceof a.Paging) {
            V2(loadingState);
            return;
        }
        Mn.E e10 = null;
        if (loadingState instanceof a.Loading) {
            Mn.E e11 = this.binding;
            if (e11 == null) {
                Intrinsics.y("binding");
            } else {
                e10 = e11;
            }
            e10.f19976B.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
            return;
        }
        if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
            throw new NoWhenBranchMatchedException();
        }
        V2(loadingState);
        Mn.E e12 = this.binding;
        if (e12 == null) {
            Intrinsics.y("binding");
        } else {
            e10 = e12;
        }
        e10.f19976B.U(loadingState.getMessage(), loadingState.getIsLoading());
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !u2().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void a0(ProductCardDecorator itemClicked, androidx.databinding.p binding, int position) {
        Intrinsics.j(itemClicked, "itemClicked");
        Intrinsics.j(binding, "binding");
        y2().x1(new e1.AbstractC12456j.ViewProductDetailsAction(itemClicked.getProduct(), itemClicked.getProductQuery(), position));
    }

    public final void d3(String str) {
        Intrinsics.j(str, "<set-?>");
        this.trackState = str;
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void l0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        y2().x1(new e1.AbstractC12456j.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void m0(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        startActivity(Al.t.e(Al.t.f694a, this, null, Pp.c.f28365c, product, "favorite products page", 2, null));
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String str;
        super.onCreate(savedInstanceState);
        Mn.E eK0 = Mn.E.K0(getLayoutInflater());
        this.binding = eK0;
        C15949d<nu.g> c15949d = null;
        if (eK0 == null) {
            Intrinsics.y("binding");
            eK0 = null;
        }
        setContentView(Zr.a.j(eK0.getRoot(), false, 1, null));
        bk.c.b(this, 0, com.meijer.mobile.meijer.M.f98600b, Al.m.f674a, 0, 8, null);
        androidx.view.I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.C2(this.f111039a, (androidx.view.F) obj);
            }
        }, 3, null);
        getLifecycle().a(y2());
        mk.l lVarV2 = v2();
        if (lVarV2 instanceof l.d) {
            str = "Favorites";
        } else if (lVarV2 instanceof l.Personalized) {
            int i10 = a.$EnumSwitchMapping$0[((l.Personalized) lVarV2).getProductType().ordinal()];
            if (i10 == 1) {
                str = "Favorites on Sale";
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "Buy Again";
            }
        } else {
            str = "";
        }
        d3(str);
        if (x2().length() > 0) {
            getAnalyticsEngine().h(C14476c.h(x2()), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PersonalizedShoppingListActivity.D2(this.f111041a, (TrackingData) obj);
                }
            });
        }
        if ((v2() instanceof l.Recommendations) && getIntent().hasExtra("CAROUSEL_TITLE")) {
            e1 e1VarY2 = y2();
            String stringExtra = getIntent().getStringExtra("CAROUSEL_TITLE");
            e1VarY2.x1(new e1.AbstractC12456j.SendTitle(stringExtra != null ? stringExtra : ""));
        }
        if (getFeatureManager().e(AbstractC18227f.C.f170544h)) {
            e1.s1(y2(), Qo.K.a(v2()), null, 2, null);
        }
        e1.Y1(y2(), Qo.K.a(v2()), false, 2, null);
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonalizedShoppingListActivity.E2(this.f111043a);
            }
        }, 3, null);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1819250526, true, new b()), 1, null);
        Qj.a.a(v(), com.meijer.mobile.meijer.T.f99051c4, t2());
        v().setOnMenuItemClickListener(new Rn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.F2(this.f111047a, (a.AbstractC0730a) obj);
            }
        }));
        C16648k.d(C6031t.a(this), null, null, new c(null), 3, null);
        C16648k.d(C6031t.a(this), null, null, new d(null), 3, null);
        nu.l lVar = new nu.l();
        mk.l lVarV22 = v2();
        l.Personalized personalized = lVarV22 instanceof l.Personalized ? (l.Personalized) lVarV22 : null;
        if ((personalized != null ? personalized.getProductType() : null) == mk.d.f150121b) {
            lVar.O(true);
        } else {
            lVar.N(new C12443d(Qo.K.a(v2())));
        }
        this.allItemsSection = lVar;
        C15949d<nu.g> c15949d2 = new C15949d<>();
        nu.l lVar2 = this.allItemsSection;
        if (lVar2 == null) {
            Intrinsics.y("allItemsSection");
            lVar2 = null;
        }
        c15949d2.c(lVar2);
        this.adapter = c15949d2;
        Mn.E e10 = this.binding;
        if (e10 == null) {
            Intrinsics.y("binding");
            e10 = null;
        }
        RecyclerView recyclerView = e10.f19977C;
        C15949d<nu.g> c15949d3 = this.adapter;
        if (c15949d3 == null) {
            Intrinsics.y("adapter");
        } else {
            c15949d = c15949d3;
        }
        recyclerView.setAdapter(c15949d);
        recyclerView.setLayoutManager(new StickyHeadersLinearLayoutManager(this));
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(this, 1));
        recyclerView.addOnScrollListener(this.scrollListener);
        RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof androidx.recyclerview.widget.x) {
            ((androidx.recyclerview.widget.x) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Mn.E e10 = this.binding;
        if (e10 == null) {
            Intrinsics.y("binding");
            e10 = null;
        }
        e10.f19976B.setProgressBarListener(null);
        super.onDestroy();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        if (!onNavigateUp()) {
            finish();
        }
        bk.c.b(this, 1, com.meijer.mobile.meijer.M.f98599a, com.meijer.mobile.meijer.M.f98601c, 0, 8, null);
        return true;
    }

    public final wr.f u2() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("cartInteractor");
        return null;
    }

    @Override // Aj.b
    public Toolbar v() {
        Mn.E e10 = this.binding;
        if (e10 == null) {
            Intrinsics.y("binding");
            e10 = null;
        }
        MaterialToolbar toolbar = e10.f19978D;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    public final pp.e w2() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("sponsorshipsDataStore");
        return null;
    }

    public final String x2() {
        String str = this.trackState;
        if (str != null) {
            return str;
        }
        Intrinsics.y("trackState");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(PersonalizedShoppingListActivity personalizedShoppingListActivity, View view) {
        personalizedShoppingListActivity.startActivity(personalizedShoppingListActivity.getFeatureEntryPoint().d());
    }

    private final void B2(Coupon coupon) {
        startActivity(Cl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        if (!personalizedShoppingListActivity.onNavigateUp()) {
            personalizedShoppingListActivity.finish();
        }
        bk.c.b(personalizedShoppingListActivity, 1, com.meijer.mobile.meijer.M.f98599a, com.meijer.mobile.meijer.M.f98601c, 0, 8, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(final PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        e1 e1VarY2 = personalizedShoppingListActivity.y2();
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        e1VarY2.onAction(new a.Clip(coupon, C14480g.a(C14476c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.J2(this.f111037a, (TrackingData) obj);
            }
        })));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        personalizedShoppingListActivity.B2(coupon);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        personalizedShoppingListActivity.y2().c2(false);
        personalizedShoppingListActivity.y2().x1(new e1.AbstractC12456j.CollapseQuantityStepperAction(0, 0));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(ProductListDecorator productListDecorator, PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        if (productListDecorator.getProduct().getIsSponsoredCriteo() && (personalizedShoppingListActivity.isBuyAgain || personalizedShoppingListActivity.isFavOnSale)) {
            personalizedShoppingListActivity.y2().c2(true);
            e1 e1VarY2 = personalizedShoppingListActivity.y2();
            List listE = CollectionsKt.e(productListDecorator.getProduct().getBeaconInfo().getOnBasketChangeBeacon());
            Tl.a aVar = Tl.a.f35039e;
            ProductFullDetails product = productListDecorator.getProduct();
            if (!product.getIsSponsoredCriteo()) {
                product = null;
            }
            e1VarY2.x1(new e1.AbstractC12456j.SendCriteoQtyStepperBeacon(listE, aVar, product));
        }
        personalizedShoppingListActivity.y2().x1(new e1.AbstractC12456j.StepperStateChangedAction(productListDecorator.getProduct().getCode(), 0.0d, new Rect()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(final PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        e1 e1VarY2 = personalizedShoppingListActivity.y2();
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        e1VarY2.onAction(new a.Clip(coupon, C14480g.a(C14476c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.Q2(this.f111034a, (TrackingData) obj);
            }
        })));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R2(PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        personalizedShoppingListActivity.B2(coupon);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void U2(ProductCardDecorator itemClicked, int position) {
        y2().x1(new e1.AbstractC12456j.ItemSelectedAction(itemClicked, this.searchType, position));
    }

    private final void V2(Oj.a loadingState) {
        nu.l lVar = null;
        if (!loadingState.getIsLoading()) {
            nu.l lVar2 = this.allItemsSection;
            if (lVar2 == null) {
                Intrinsics.y("allItemsSection");
            } else {
                lVar = lVar2;
            }
            lVar.L();
            return;
        }
        nu.l lVar3 = this.allItemsSection;
        if (lVar3 == null) {
            Intrinsics.y("allItemsSection");
        } else {
            lVar = lVar3;
        }
        lVar.M(new e(loadingState));
    }

    private final void X2(ProductFullDetails productToAdd, double quantity) {
        e1 e1VarY2 = y2();
        String stringExtra = getIntent().getStringExtra("homePageCarouselAnalytics");
        if (!getIntent().hasExtra("homePageCarouselAnalytics")) {
            stringExtra = null;
        }
        e1VarY2.P1(stringExtra);
        y2().x1(new e1.AbstractC12456j.UpdateEntryAction(productToAdd, quantity, new Rect(0, 0, 0, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(ProductFullDetails product) {
        Parcelable parcelable;
        Al.g featureEntryPoint = getFeatureEntryPoint();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        String str = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("personalizedShoppingListProductType", mk.l.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("personalizedShoppingListProductType");
            if (!(parcelableExtra instanceof mk.l)) {
                parcelableExtra = null;
            }
            parcelable = (mk.l) parcelableExtra;
        }
        mk.l lVar = (mk.l) parcelable;
        if (lVar instanceof l.Department) {
            str = "shopDepartmentTierLevel";
        } else if (lVar instanceof l.d) {
            str = "Favorites: Product Clicked";
        } else if (lVar instanceof l.Personalized) {
            int i10 = a.$EnumSwitchMapping$0[((l.Personalized) lVar).getProductType().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    str = "Buy Again: PLP: Product Clicked";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "Favorites on Sale: PLP: Product Clicked";
            }
        }
        startActivity(Al.g.t(featureEntryPoint, product, false, false, str, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2() {
        startActivity(getMeijerIntent().D(this, getFeatureManager().e(AbstractC18227f.O.f170554h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a3(mk.f product) {
        startActivity(getMeijerIntent().G(this, product, getFeatureManager().e(AbstractC18227f.O.f170554h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b3(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        personalizedShoppingListActivity.y2().x1(new e1.AbstractC12456j.CollapseQuantityStepperAction(0, 0));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e3(LocalThemeScope localThemeScope, String message, mk.c product) {
        if (getFeatureManager().e(AbstractC18227f.C18234h.f170580h)) {
            C16648k.d(C6031t.a(this), null, null, new f(message, this, product, localThemeScope, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(final PersonalizedShoppingListActivity personalizedShoppingListActivity, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        personalizedShoppingListActivity.y2().onAction(new a.Clip(coupon, C14480g.a(C14476c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.h3(this.f111038a, (TrackingData) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6386a s2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        C6386a c6386aE = C6386a.e(personalizedShoppingListActivity);
        c6386aE.V(false);
        c6386aE.N(C17134a.f161960c);
        Intrinsics.i(c6386aE, "apply(...)");
        return c6386aE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(C14145a result) {
        int i10;
        switch (result.getResultCode()) {
            case 867530912:
                i10 = C17135b.f162021g;
                break;
            case 867530913:
                i10 = C17135b.f162019f;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            Mn.E e10 = this.binding;
            if (e10 == null) {
                Intrinsics.y("binding");
                e10 = null;
            }
            Snackbar.q0(e10.getRoot(), i10, 0).t0(C17135b.f162001T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PersonalizedShoppingListActivity.A2(this.f111063a, view);
                }
            }).c0();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12104p0.b
    public void d0() {
        y2().x1(e1.AbstractC12456j.f.f111238a);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        int x10;
        if (!getFeatureManager().e(AbstractC18227f.T.f170559h)) {
            e1 e1VarY2 = y2();
            int y10 = 0;
            if (ev2 != null) {
                x10 = (int) ev2.getX();
            } else {
                x10 = 0;
            }
            if (ev2 != null) {
                y10 = (int) ev2.getY();
            }
            e1VarY2.x1(new e1.AbstractC12456j.CollapseQuantityStepperAction(x10, y10));
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        C5611a.a(Qo.K.a(v2())).start();
    }

    public final mk.l v2() {
        Object obj;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("personalizedShoppingListProductType", mk.l.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("personalizedShoppingListProductType");
            if (!(parcelableExtra instanceof mk.l)) {
                parcelableExtra = null;
            }
            obj = (mk.l) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (mk.l) obj;
    }
}
