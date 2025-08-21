package com.meijer.mobile.meijer.activity.personalized.modals;

import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Il.FulfillmentBarDecorator;
import Ki.LocalThemeScope;
import Nn.Z1;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Qo.l;
import Sn.a;
import Ul.ToastMessageData;
import V2.CreationExtras;
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
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bn.C6396a;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.jay.widget.StickyHeadersLinearLayoutManager;
import com.meijer.mobile.meijer.activity.find.C12229p0;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.C12616t0;
import com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import e.C13737e;
import ee.C13790a;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.List;
import ju.C15069d;
import ju.InterfaceC15068c;
import ki.InterfaceC15162c0;
import ki.q1;
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
import ku.AbstractC15424a;
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import nk.l;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import ss.InterfaceC17146a;
import tr.C17283a;
import tr.C17284b;
import ts.ProductCardDecorator;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J7\u00103\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020.H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u00020!2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J+\u0010A\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010?\u001a\u00020\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010CH\u0014¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0007H\u0014¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0007H\u0014¢\u0006\u0004\bH\u0010\u0006J\u0017\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bN\u0010\u001aJ'\u0010Q\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u0010P\u001a\u00020O2\u0006\u00107\u001a\u00020.H\u0016¢\u0006\u0004\bQ\u0010RJ'\u0010W\u001a\u00020\u00072\u0006\u0010:\u001a\u00020!2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ'\u0010Y\u001a\u00020\u00072\u0006\u0010:\u001a\u00020!2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bY\u0010XJ\u001b\u0010\\\u001a\u00020K2\n\u0010[\u001a\u00060\tj\u0002`ZH\u0016¢\u0006\u0004\b\\\u0010]J%\u0010`\u001a\u00020\u00072\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ%\u0010b\u001a\u00020\u00072\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\bb\u0010aJ\u001f\u0010c\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\be\u0010$J\u000f\u0010f\u001a\u00020\u0007H\u0016¢\u0006\u0004\bf\u0010\u0006J\u0019\u0010i\u001a\u00020K2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010jR\u0016\u0010P\u001a\u00020k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u008c\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u0091\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0099\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R(\u0010§\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0005\b¤\u0001\u0010\u000b\"\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010©\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010£\u0001R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010¯\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u0098\u0001R\u0019\u0010±\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0098\u0001R!\u0010¶\u0001\u001a\u00030²\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0089\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010¹\u0001\u001a\u00030·\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010¸\u0001R\u0015\u0010½\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/PersonalizedShoppingListActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "<init>", "()V", "", "f3", "", "c3", "()Ljava/lang/String;", "LKi/M;", "localThemeScope", "", "Lvs/f;", "personalizedProducts", "H2", "(LKi/M;Ljava/util/List;)V", "LQo/l;", "productQuery", "n3", "(LQo/l;)V", "LPj/a;", "loadingState", "W2", "(LPj/a;)V", "U2", "Lg/a;", "result", "B2", "(Lg/a;)V", "a3", "LCo/h;", "product", "Z2", "(LCo/h;)V", "o3", "(LQo/l;)Ljava/lang/String;", "Lnk/f;", "b3", "(Lnk/f;)V", "LPk/a;", "coupon", "D2", "(LPk/a;)V", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "j3", "(IIIILPk/a;)V", "Lts/a;", "itemClicked", "position", "V2", "(Lts/a;I)V", "productToAdd", "", "quantity", "Y2", "(LCo/h;D)V", "message", "Lnk/c;", "i3", "(LKi/M;Ljava/lang/String;Lnk/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "X2", "Landroidx/databinding/p;", "binding", "c0", "(Lts/a;Landroidx/databinding/p;I)V", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "o0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "S", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "W0", "e3", "(Ljava/lang/String;Ljava/lang/String;)V", "p0", "f0", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "LNn/E;", "s", "LNn/E;", "Lju/d;", "Lju/g;", "t", "Lju/d;", "adapter", "Lju/l;", "u", "Lju/l;", "allItemsSection", "Lwr/f;", "v", "Lwr/f;", "w2", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lpp/e;", "w", "Lpp/e;", "y2", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "x", "Lkotlin/Lazy;", "A2", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "vm", "LIl/b;", "y", "getFulfillmentBarViewModel", "()LIl/b;", "fulfillmentBarViewModel", "Lg/c;", "Landroid/content/Intent;", "z", "Lg/c;", "substitutionResultLauncher", "A", "Z", "stepperClickedState", "Lcom/meijer/mobile/meijer/activity/find/p0;", "B", "Lcom/meijer/mobile/meijer/activity/find/p0;", "scrollListener", "LPp/b;", "C", "LPp/b;", "searchType", "D", "Ljava/lang/String;", "z2", "h3", "(Ljava/lang/String;)V", "trackState", "E", "carouselTitle", "Lcom/google/android/material/snackbar/Snackbar;", "F", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "G", "isBuyAgain", "H", "isFavOnSale", "Lee/a;", "I", "v2", "()Lee/a;", "cartBadge", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lnk/l;", "x2", "()Lnk/l;", "productQueryIntent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PersonalizedShoppingListActivity extends Hilt_PersonalizedShoppingListActivity implements Bj.b, C12616t0.a, C12229p0.b {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean stepperClickedState;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public String trackState;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Snackbar currentSnackbar;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isBuyAgain;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean isFavOnSale;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Nn.E binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> adapter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private ju.l allItemsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public pp.e sponsorshipsDataStore;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(e1.class), new h(this), new g(this), new i(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Il.b.class), new k(this), new j(this), new l(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new m());

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C12229p0 scrollListener = new C12229p0(this, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.H
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PersonalizedShoppingListActivity.d3(this.f111803a);
        }
    });

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f26238a;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private String carouselTitle = "";

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.T
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PersonalizedShoppingListActivity.u2(this.f111897a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[nk.d.values().length];
            try {
                iArr[nk.d.f152478a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nk.d.f152479b.ordinal()] = 2;
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
            final /* synthetic */ PersonalizedShoppingListActivity f111847a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$3$1$1$1$1", f = "PersonalizedShoppingListActivity.kt", l = {241}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$a, reason: collision with other inner class name */
            static final class C1717a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111848a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f111849b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111850c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1718a<T> implements InterfaceC16562g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PersonalizedShoppingListActivity f111851a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111852b;

                    C1718a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope) {
                        this.f111851a = personalizedShoppingListActivity;
                        this.f111852b = localThemeScope;
                    }

                    @Override // pv.InterfaceC16562g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(ToastMessageData toastMessageData, Continuation<? super Unit> continuation) {
                        this.f111851a.i3(this.f111852b, toastMessageData.getMessage(), toastMessageData.getProduct());
                        return Unit.f143329a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1717a(this.f111849b, this.f111850c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1717a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super C1717a> continuation) {
                    super(2, continuation);
                    this.f111849b = personalizedShoppingListActivity;
                    this.f111850c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1717a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f111848a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16553F<ToastMessageData> toastMessageData = this.f111849b.A2().getToastMessageData();
                        C1718a c1718a = new C1718a(this.f111849b, this.f111850c);
                        this.f111848a = 1;
                        if (toastMessageData.collect(c1718a, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$b, reason: collision with other inner class name */
            static final class C1719b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f111853a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111854b;

                C1719b(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope) {
                    this.f111853a = personalizedShoppingListActivity;
                    this.f111854b = localThemeScope;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1865597818, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:252)");
                    }
                    z1 z1VarB = o1.b(this.f111853a.getFulfillmentBarViewModel().n(), null, composer, 0, 1);
                    if (this.f111853a.getUserManager().b()) {
                        LocalThemeScope localThemeScope = this.f111854b;
                        FulfillmentBarDecorator fulfillmentBarDecorator = (FulfillmentBarDecorator) z1VarB.getValue();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f111853a);
                        final PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111853a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PersonalizedShoppingListActivity.b.a.C1719b.c(personalizedShoppingListActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Il.g.b(localThemeScope, fulfillmentBarDecorator, null, (Function0) objB, composer, LocalThemeScope.f17314g | (FulfillmentBarDecorator.f14849m << 3), 2);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
                    personalizedShoppingListActivity.n3(personalizedShoppingListActivity.A2().o1().getValue().getProductQuery());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$3$1$1$1$3", f = "PersonalizedShoppingListActivity.kt", l = {263}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111855a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f111856b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111857c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$3$1$1$1$3$1", f = "PersonalizedShoppingListActivity.kt", l = {264}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$c$a, reason: collision with other inner class name */
                static final class C1720a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f111858a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PersonalizedShoppingListActivity f111859b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111860c;

                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$3$1$1$1$3$1$1", f = "PersonalizedShoppingListActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$b$a$c$a$a, reason: collision with other inner class name */
                    static final class C1721a extends SuspendLambda implements Function2<e1.ViewState, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f111861a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f111862b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ PersonalizedShoppingListActivity f111863c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111864d;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1721a c1721a = new C1721a(this.f111863c, this.f111864d, continuation);
                            c1721a.f111862b = obj;
                            return c1721a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                            return ((C1721a) create(viewState, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1721a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super C1721a> continuation) {
                            super(2, continuation);
                            this.f111863c = personalizedShoppingListActivity;
                            this.f111864d = localThemeScope;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            boolean z10;
                            IntrinsicsKt.f();
                            if (this.f111861a == 0) {
                                ResultKt.b(obj);
                                e1.ViewState viewState = (e1.ViewState) this.f111862b;
                                this.f111863c.X2(viewState.getLoadingState());
                                ck.k.a(this.f111863c.y(), viewState.getTitle());
                                PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111863c;
                                personalizedShoppingListActivity.isBuyAgain = Intrinsics.e(ck.d.a(personalizedShoppingListActivity, viewState.getTitle()), this.f111863c.getString(com.meijer.mobile.meijer.Y.f101150r0));
                                PersonalizedShoppingListActivity personalizedShoppingListActivity2 = this.f111863c;
                                personalizedShoppingListActivity2.isFavOnSale = Intrinsics.e(ck.d.a(personalizedShoppingListActivity2, viewState.getTitle()), this.f111863c.getString(com.meijer.mobile.meijer.Y.f100455H5));
                                if ((this.f111863c.isBuyAgain && this.f111863c.getFeatureManager().e(AbstractC18503f.k0.f172887h)) || this.f111863c.getFeatureManager().e(AbstractC18503f.l0.f172889h)) {
                                    this.f111863c.A2().y2();
                                }
                                this.f111863c.H2(this.f111864d, viewState.q());
                                if (viewState.getCartDecorator().getIsAvailable()) {
                                    C13790a c13790aV2 = this.f111863c.v2();
                                    c13790aV2.R(viewState.getCartDecorator().getItemCount());
                                    if (c13790aV2.z() && c13790aV2.o() > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    c13790aV2.setVisible(z10, true);
                                    Rj.a.a(this.f111863c.y(), com.meijer.mobile.meijer.T.f99907c4, c13790aV2);
                                }
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1720a(this.f111859b, this.f111860c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1720a(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super C1720a> continuation) {
                        super(2, continuation);
                        this.f111859b = personalizedShoppingListActivity;
                        this.f111860c = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1720a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f111858a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            pv.P<e1.ViewState> pO1 = this.f111859b.A2().o1();
                            C1721a c1721a = new C1721a(this.f111859b, this.f111860c, null);
                            this.f111858a = 1;
                            if (C16563h.k(pO1, c1721a, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f111856b, this.f111857c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f111856b = personalizedShoppingListActivity;
                    this.f111857c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f111855a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111856b;
                        AbstractC6165l.b bVar = AbstractC6165l.b.f55501c;
                        C1720a c1720a = new C1720a(personalizedShoppingListActivity, this.f111857c, null);
                        this.f111855a = 1;
                        if (C6136J.b(personalizedShoppingListActivity, bVar, c1720a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
                this.f111847a = personalizedShoppingListActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Nn.E d(PersonalizedShoppingListActivity personalizedShoppingListActivity, LocalThemeScope localThemeScope, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                Intrinsics.j(layoutInflater, "<unused var>");
                Intrinsics.j(viewGroup, "<unused var>");
                C15809k.d(C6173t.a(personalizedShoppingListActivity), null, null, new C1717a(personalizedShoppingListActivity, localThemeScope, null), 3, null);
                Nn.E e10 = personalizedShoppingListActivity.binding;
                if (e10 == null) {
                    Intrinsics.x("binding");
                    e10 = null;
                }
                e10.f21307A.setContent(ComposableLambdaKt.composableLambdaInstance(1865597818, true, new C1719b(personalizedShoppingListActivity, localThemeScope)));
                C15809k.d(C6173t.a(personalizedShoppingListActivity), null, null, new c(personalizedShoppingListActivity, localThemeScope, null), 3, null);
                Nn.E e11 = personalizedShoppingListActivity.binding;
                if (e11 != null) {
                    return e11;
                }
                Intrinsics.x("binding");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Nn.E AndroidViewBinding) {
                Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
                return Unit.f143329a;
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
                    ComposerKt.U(2015979571, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.onCreate.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:231)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(AdsTheme))) | composer.D(this.f111847a);
                final PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111847a;
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
                            return PersonalizedShoppingListActivity.b.a.e((Nn.E) obj);
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
                return Unit.f143329a;
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
                ComposerKt.U(-1819250526, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.onCreate.<anonymous> (PersonalizedShoppingListActivity.kt:230)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(2015979571, true, new a(PersonalizedShoppingListActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$5", f = "PersonalizedShoppingListActivity.kt", l = {338}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111865a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PersonalizedShoppingListActivity f111867a;

            a(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
                this.f111867a = personalizedShoppingListActivity;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                this.f111867a.stepperClickedState = z10;
                return Unit.f143329a;
            }

            @Override // pv.InterfaceC16562g
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111865a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                pv.P<Boolean> pM1 = PersonalizedShoppingListActivity.this.A2().m1();
                a aVar = new a(PersonalizedShoppingListActivity.this);
                this.f111865a = 1;
                if (pM1.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$6", f = "PersonalizedShoppingListActivity.kt", l = {344}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111868a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$6$1", f = "PersonalizedShoppingListActivity.kt", l = {345}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111870a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PersonalizedShoppingListActivity f111871b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PersonalizedShoppingListActivity personalizedShoppingListActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f111871b = personalizedShoppingListActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f111871b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$onCreate$6$1$1", f = "PersonalizedShoppingListActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$d$a$a, reason: collision with other inner class name */
            static final class C1722a extends SuspendLambda implements Function2<e1.AbstractC12585n, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111872a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f111873b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PersonalizedShoppingListActivity f111874c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1722a(PersonalizedShoppingListActivity personalizedShoppingListActivity, Continuation<? super C1722a> continuation) {
                    super(2, continuation);
                    this.f111874c = personalizedShoppingListActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1722a c1722a = new C1722a(this.f111874c, continuation);
                    c1722a.f111873b = obj;
                    return c1722a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e1.AbstractC12585n abstractC12585n, Continuation<? super Unit> continuation) {
                    return ((C1722a) create(abstractC12585n, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void q(PersonalizedShoppingListActivity personalizedShoppingListActivity, View view) {
                    personalizedShoppingListActivity.A2().A1(e1.AbstractC12581j.t.f112134a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void r(PersonalizedShoppingListActivity personalizedShoppingListActivity, View view) {
                    personalizedShoppingListActivity.startActivity(personalizedShoppingListActivity.getFeatureEntryPoint().d());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void s(PersonalizedShoppingListActivity personalizedShoppingListActivity, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    personalizedShoppingListActivity.A2().A1(new e1.AbstractC12581j.UserAcceptAddToCartAction(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void t(PersonalizedShoppingListActivity personalizedShoppingListActivity, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    personalizedShoppingListActivity.A2().A1(new e1.AbstractC12581j.ResetActiveStepper(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b().getProductCode()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void u(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f111872a == 0) {
                        ResultKt.b(obj);
                        final e1.AbstractC12585n abstractC12585n = (e1.AbstractC12585n) this.f111873b;
                        if (abstractC12585n instanceof e1.AbstractC12585n.x) {
                            this.f111874c.a3();
                        } else if (abstractC12585n instanceof e1.AbstractC12585n.g) {
                            this.f111874c.U2();
                        } else if (abstractC12585n instanceof e1.AbstractC12585n.ShoppingListUpdateFailedEvent) {
                            e1.AbstractC12585n.ShoppingListUpdateFailedEvent shoppingListUpdateFailedEvent = (e1.AbstractC12585n.ShoppingListUpdateFailedEvent) abstractC12585n;
                            new Qj.j(this.f111874c, shoppingListUpdateFailedEvent.getMessageResId(), new Object[0]).r(shoppingListUpdateFailedEvent.getTitleResId(), new Object[0]).g();
                        } else if (abstractC12585n instanceof e1.AbstractC12585n.i) {
                            this.f111874c.f3();
                        } else {
                            String strC3 = null;
                            Nn.E e10 = null;
                            Nn.E e11 = null;
                            Nn.E e12 = null;
                            if (abstractC12585n instanceof e1.AbstractC12585n.AddToShoppingListSuccessEvent) {
                                Nn.E e13 = this.f111874c.binding;
                                if (e13 == null) {
                                    Intrinsics.x("binding");
                                } else {
                                    e10 = e13;
                                }
                                e1.AbstractC12585n.AddToShoppingListSuccessEvent addToShoppingListSuccessEvent = (e1.AbstractC12585n.AddToShoppingListSuccessEvent) abstractC12585n;
                                Snackbar snackbarQ0 = Snackbar.q0(e10.getRoot(), addToShoppingListSuccessEvent.getMessageResId(), 0);
                                int actionResId = addToShoppingListSuccessEvent.getActionResId();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity = this.f111874c;
                                snackbarQ0.t0(actionResId, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.h0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        PersonalizedShoppingListActivity.d.a.C1722a.q(personalizedShoppingListActivity, view);
                                    }
                                }).c0();
                                qw.a.INSTANCE.a("Successfully added \"" + addToShoppingListSuccessEvent.getProduct() + "\" to shopping list", new Object[0]);
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.CartUpdateSuccessEvent) {
                                Nn.E e14 = this.f111874c.binding;
                                if (e14 == null) {
                                    Intrinsics.x("binding");
                                } else {
                                    e11 = e14;
                                }
                                e1.AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12585n.CartUpdateSuccessEvent) abstractC12585n;
                                Snackbar snackbarQ02 = Snackbar.q0(e11.getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0);
                                int actionResId2 = cartUpdateSuccessEvent.getActionResId();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity2 = this.f111874c;
                                snackbarQ02.t0(actionResId2, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.i0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        PersonalizedShoppingListActivity.d.a.C1722a.r(personalizedShoppingListActivity2, view);
                                    }
                                }).c0();
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.OpenLowStockScreenEvent) {
                                this.f111874c.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this.f111874c, ((e1.AbstractC12585n.OpenLowStockScreenEvent) abstractC12585n).getDecorator(), Pp.c.f26248d, null, "favorite products page", 8, null));
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.ViewItemInShoppingListEvent) {
                                this.f111874c.b3(((e1.AbstractC12585n.ViewItemInShoppingListEvent) abstractC12585n).getProduct());
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.ViewProductDetailsEvent) {
                                this.f111874c.Z2(((e1.AbstractC12585n.ViewProductDetailsEvent) abstractC12585n).getProduct());
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.UpdateToCartFailedEvent) {
                                Nn.E e15 = this.f111874c.binding;
                                if (e15 == null) {
                                    Intrinsics.x("binding");
                                    e15 = null;
                                }
                                View root = e15.getRoot();
                                String string = this.f111874c.getResources().getString(((e1.AbstractC12585n.UpdateToCartFailedEvent) abstractC12585n).getMessageResId());
                                Intrinsics.i(string, "getString(...)");
                                Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                                Intrinsics.i(snackbarR0, "make(...)");
                                Wj.b.b(snackbarR0).c0();
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.ShowChokingWarningDialogEvent) {
                                e1.AbstractC12585n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n;
                                C15485b message = new C15485b(this.f111874c, Cj.p.f5105d).setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Cj.i.f4711J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody());
                                int positiveButtonText = showChokingWarningDialogEvent.a().getPositiveButtonText();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity3 = this.f111874c;
                                C15485b positiveButton = message.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.j0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        PersonalizedShoppingListActivity.d.a.C1722a.s(personalizedShoppingListActivity3, abstractC12585n, dialogInterface, i10);
                                    }
                                });
                                int negativeButtonText = showChokingWarningDialogEvent.a().getNegativeButtonText();
                                final PersonalizedShoppingListActivity personalizedShoppingListActivity4 = this.f111874c;
                                positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.k0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                        PersonalizedShoppingListActivity.d.a.C1722a.t(personalizedShoppingListActivity4, abstractC12585n, dialogInterface, i10);
                                    }
                                }).show();
                            } else if (!(abstractC12585n instanceof e1.AbstractC12585n.UpdateProductsInfoEvent) && !(abstractC12585n instanceof e1.AbstractC12585n.ProductListErrorEvent) && !(abstractC12585n instanceof e1.AbstractC12585n.ProductListSuccess)) {
                                if (abstractC12585n instanceof e1.AbstractC12585n.ShowError) {
                                    e1.AbstractC12585n.ShowError showError = (e1.AbstractC12585n.ShowError) abstractC12585n;
                                    new C15485b(this.f111874c).setCancelable(false).setTitle(ck.d.a(this.f111874c, showError.getTitle())).setMessage(ck.d.a(this.f111874c, showError.getMessage())).setPositiveButton(ck.d.a(this.f111874c, showError.getPositiveButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.l0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            PersonalizedShoppingListActivity.d.a.C1722a.u(dialogInterface, i10);
                                        }
                                    }).show();
                                } else if (!(abstractC12585n instanceof e1.AbstractC12585n.BubbleFacetsToFilterAndSort) && !(abstractC12585n instanceof e1.AbstractC12585n.LaunchFilterAndSortEvent)) {
                                    if (abstractC12585n instanceof e1.AbstractC12585n.ClipCouponFailedEvent) {
                                        e1.AbstractC12585n.ClipCouponFailedEvent clipCouponFailedEvent = (e1.AbstractC12585n.ClipCouponFailedEvent) abstractC12585n;
                                        this.f111874c.j3(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon());
                                    } else if (abstractC12585n instanceof e1.AbstractC12585n.ShowFreeItemsSnackbar) {
                                        Nn.E e16 = this.f111874c.binding;
                                        if (e16 == null) {
                                            Intrinsics.x("binding");
                                        } else {
                                            e12 = e16;
                                        }
                                        View root2 = e12.getRoot();
                                        Resources resources = this.f111874c.getResources();
                                        Intrinsics.i(resources, "getResources(...)");
                                        Snackbar snackbarR02 = Snackbar.r0(root2, ck.d.b(resources, ((e1.AbstractC12585n.ShowFreeItemsSnackbar) abstractC12585n).getMessage()), -2);
                                        Intrinsics.i(snackbarR02, "make(...)");
                                        Snackbar snackbarC = Wj.b.c(snackbarR02);
                                        snackbarC.c0();
                                        this.f111874c.currentSnackbar = snackbarC;
                                    } else if (abstractC12585n instanceof e1.AbstractC12585n.e) {
                                        Snackbar snackbar = this.f111874c.currentSnackbar;
                                        if (snackbar != null) {
                                            snackbar.A();
                                        }
                                    } else if (!Intrinsics.e(abstractC12585n, e1.AbstractC12585n.j.f112214a) && !(abstractC12585n instanceof e1.AbstractC12585n.SubstitutionFailureEvent) && !Intrinsics.e(abstractC12585n, e1.AbstractC12585n.m.f112217a)) {
                                        if (abstractC12585n instanceof e1.AbstractC12585n.ShowPlpEvent) {
                                            Bl.g featureEntryPoint = this.f111874c.getFeatureEntryPoint();
                                            ProductFullDetails product = ((e1.AbstractC12585n.ShowPlpEvent) abstractC12585n).getProduct();
                                            if (this.f111874c.x2() instanceof l.Recommendations) {
                                                strC3 = this.f111874c.c3();
                                            }
                                            this.f111874c.startActivity(Bl.g.t(featureEntryPoint, product, true, false, strC3, 4, null));
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111870a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<e1.AbstractC12585n> events = this.f111871b.A2().getEvents();
                    C1722a c1722a = new C1722a(this.f111871b, null);
                    this.f111870a = 1;
                    if (C16563h.k(events, c1722a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111868a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                PersonalizedShoppingListActivity personalizedShoppingListActivity = PersonalizedShoppingListActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55501c;
                a aVar = new a(personalizedShoppingListActivity, null);
                this.f111868a = 1;
                if (C6136J.b(personalizedShoppingListActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/personalized/modals/PersonalizedShoppingListActivity$e", "Lku/a;", "LNn/Z1;", "viewBinding", "", "position", "", "A", "(LNn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends AbstractC15424a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Pj.a f111875e;

        e(Pj.a aVar) {
            this.f111875e = aVar;
        }

        @Override // ku.AbstractC15424a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f21767z.U(this.f111875e.getMessage(), this.f111875e.getIsLoading());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ku.AbstractC15424a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Z1 z(View view) {
            Intrinsics.j(view, "view");
            Z1 z1M0 = Z1.M0(view);
            Intrinsics.i(z1M0, "bind(...)");
            return z1M0;
        }

        @Override // ju.h
        /* renamed from: j */
        public int getLayoutId() {
            return com.meijer.mobile.meijer.V.f100172C0;
        }

        @Override // ju.h
        public long i() {
            return getLayoutId();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$showBeaconDebugInfo$1", f = "PersonalizedShoppingListActivity.kt", l = {1014, 1037}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111876a;

        /* renamed from: b, reason: collision with root package name */
        int f111877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f111878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PersonalizedShoppingListActivity f111879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ nk.c f111880e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f111881f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f111882a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f111883b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$f$a$a, reason: collision with other inner class name */
            static final class C1723a implements Function3<InterfaceC15162c0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111884a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f111885b;

                C1723a(LocalThemeScope localThemeScope, String str) {
                    this.f111884a = localThemeScope;
                    this.f111885b = str;
                }

                public final void a(InterfaceC15162c0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-427756068, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.showBeaconDebugInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:1027)");
                    }
                    Di.j.l(this.f111884a, null, this.f111885b, Assemble.getToastVariant().getSuccess(), null, composer, LocalThemeScope.f17314g | (q1.m.Toast.f142384h << 9), 9);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15162c0 interfaceC15162c0, Composer composer, Integer num) {
                    a(interfaceC15162c0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, String str) {
                this.f111882a = localThemeScope;
                this.f111883b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1744550368, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.showBeaconDebugInfo.<anonymous>.<anonymous> (PersonalizedShoppingListActivity.kt:1025)");
                }
                LocalThemeScope localThemeScope = this.f111882a;
                Ki.Q.e(localThemeScope, ki.b1.f142020a, ComposableLambdaKt.c(-427756068, true, new C1723a(localThemeScope, this.f111883b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (ki.b1.f142021b << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f111878c, this.f111879d, this.f111880e, this.f111881f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, PersonalizedShoppingListActivity personalizedShoppingListActivity, nk.c cVar, LocalThemeScope localThemeScope, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f111878c = str;
            this.f111879d = personalizedShoppingListActivity;
            this.f111880e = cVar;
            this.f111881f = localThemeScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
        
            if (mv.Z.b(5000, r9) == r0) goto L21;
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
                int r1 = r9.f111877b
                java.lang.String r2 = "composeToastView"
                r3 = 2
                r4 = 0
                java.lang.String r5 = "binding"
                r6 = 1
                if (r1 == 0) goto L28
                if (r1 == r6) goto L24
                if (r1 != r3) goto L1c
                java.lang.Object r0 = r9.f111876a
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
                r9.f111877b = r6
                r7 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r10 = mv.Z.b(r7, r9)
                if (r10 != r0) goto L36
                goto La7
            L36:
                qw.a$a r10 = qw.a.INSTANCE
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "Showing toast message: "
                r1.append(r7)
                java.lang.String r7 = r9.f111878c
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                r7 = 0
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r10.a(r1, r8)
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity r10 = r9.f111879d
                Nn.E r10 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.Y1(r10)
                if (r10 != 0) goto L5d
                kotlin.jvm.internal.Intrinsics.x(r5)
                r10 = r4
            L5d:
                androidx.compose.ui.platform.ComposeView r10 = r10.f21311z
                kotlin.jvm.internal.Intrinsics.i(r10, r2)
                r10.setVisibility(r7)
                java.lang.String r10 = r9.f111878c
                nk.c r1 = r9.f111880e
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r10)
                java.lang.String r10 = Ul.d.a(r1)
                r7.append(r10)
                java.lang.String r10 = r7.toString()
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity r1 = r9.f111879d
                Nn.E r1 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.Y1(r1)
                if (r1 != 0) goto L88
                kotlin.jvm.internal.Intrinsics.x(r5)
                r1 = r4
            L88:
                androidx.compose.ui.platform.ComposeView r1 = r1.f21311z
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$f$a r7 = new com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity$f$a
                Ki.M r8 = r9.f111881f
                r7.<init>(r8, r10)
                r8 = -1744550368(0xffffffff98044620, float:-1.7096004E-24)
                androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r8, r6, r7)
                r1.setContent(r6)
                r9.f111876a = r10
                r9.f111877b = r3
                r6 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r10 = mv.Z.b(r6, r9)
                if (r10 != r0) goto La8
            La7:
                return r0
            La8:
                com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity r10 = r9.f111879d
                Nn.E r10 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.Y1(r10)
                if (r10 != 0) goto Lb4
                kotlin.jvm.internal.Intrinsics.x(r5)
                goto Lb5
            Lb4:
                r4 = r10
            Lb5:
                androidx.compose.ui.platform.ComposeView r10 = r4.f21311z
                kotlin.jvm.internal.Intrinsics.i(r10, r2)
                r0 = 8
                r10.setVisibility(r0)
                kotlin.Unit r10 = kotlin.Unit.f143329a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111886f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f111886f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111886f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111887f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f111887f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111887f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111888f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111889g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111888f = function0;
            this.f111889g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111888f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111889g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111890f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f111890f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111890f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111891f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f111891f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111891f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111892f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111893g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111892f = function0;
            this.f111893g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111892f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111893g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m implements InterfaceC14275b, FunctionAdapter {
        m() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            PersonalizedShoppingListActivity.this.B2(p02);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void W0(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void d1(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
    }

    public void e3(String beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 A2() {
        return (e1) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(PersonalizedShoppingListActivity personalizedShoppingListActivity, androidx.view.F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        personalizedShoppingListActivity.finish();
        ck.c.b(personalizedShoppingListActivity, 1, com.meijer.mobile.meijer.M.f99457a, com.meijer.mobile.meijer.M.f99459c, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(PersonalizedShoppingListActivity personalizedShoppingListActivity, a.AbstractC0780a action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, a.AbstractC0780a.C0781a.f34922a)) {
            if (personalizedShoppingListActivity.getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
                personalizedShoppingListActivity.startActivity(Bl.h.d(personalizedShoppingListActivity, false));
            } else {
                personalizedShoppingListActivity.startActivity(Bl.h.h(personalizedShoppingListActivity, false));
            }
        } else {
            if (!Intrinsics.e(action, a.AbstractC0780a.b.f34923a)) {
                throw new NoWhenBranchMatchedException();
            }
            personalizedShoppingListActivity.A2().A1(e1.AbstractC12581j.g.f112104a);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(LocalThemeScope localThemeScope, List<ProductListDecorator> personalizedProducts) {
        InterfaceC15068c c12616t0;
        if (personalizedProducts.isEmpty()) {
            return;
        }
        List<ProductListDecorator> list = personalizedProducts;
        for (ProductListDecorator productListDecorator : list) {
            if (productListDecorator.getProduct().getIsSponsoredCriteo()) {
                A2().A1(new e1.AbstractC12581j.SendCriteoLoadBeacon(productListDecorator.getProduct().getBeaconInfo().getOnLoadBeacon(), productListDecorator.getProduct().getBeaconInfo().getFormatLevelOnLoadBeacon(), Ul.a.f37566b, productListDecorator.getProduct()));
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (final ProductListDecorator productListDecorator2 : list) {
            if (getFeatureManager().e(AbstractC18503f.T.f172859h)) {
                Pp.b bVar = null;
                CartProductListDecorator cartProductListDecorator = null;
                c12616t0 = new C12622w0(localThemeScope, productListDecorator2, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.I2(this.f111925a, (InterfaceC17146a) obj);
                    }
                }, getFeatureManager(), bVar, cartProductListDecorator, productListDecorator2.getSponsorship(), new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.J2(this.f111928a, productListDecorator2);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.L2(this.f111932a, productListDecorator2);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.M2(this.f111936a);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.N2(productListDecorator2, this);
                    }
                }, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.O2(this.f111812a, (e1.AbstractC12581j) obj);
                    }
                }, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.P2(this.f111814a, (GoogleAdAnalytics) obj);
                    }
                }, this.stepperClickedState, this.isFavOnSale, A2().o1().getValue().getGoogleAdSlot1(), A2().o1().getValue().getGoogleAdSlot2(), A2().o1().getValue().getGoogleAdSlot3(), 48, null);
            } else {
                c12616t0 = new C12616t0(productListDecorator2, this, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.Q2(this.f111816a, productListDecorator2);
                    }
                }, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PersonalizedShoppingListActivity.S2(this.f111818a, productListDecorator2);
                    }
                }, getFeatureManager(), getUserManager().b(), null, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.N
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PersonalizedShoppingListActivity.T2(this.f111821a, productListDecorator2, (String) obj);
                    }
                }, 192, null);
            }
            arrayList.add(c12616t0);
        }
        ju.l lVar = this.allItemsSection;
        Nn.E e10 = null;
        if (lVar == null) {
            Intrinsics.x("allItemsSection");
            lVar = null;
        }
        lVar.R(arrayList);
        Nn.E e11 = this.binding;
        if (e11 == null) {
            Intrinsics.x("binding");
        } else {
            e10 = e11;
        }
        e10.f21309C.setBackgroundResource(Cj.g.f4677s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(PersonalizedShoppingListActivity personalizedShoppingListActivity, InterfaceC17146a it) {
        Intrinsics.j(it, "it");
        if (it instanceof InterfaceC17146a.SendCriteoOnViewBeacon) {
            InterfaceC17146a.SendCriteoOnViewBeacon sendCriteoOnViewBeacon = (InterfaceC17146a.SendCriteoOnViewBeacon) it;
            personalizedShoppingListActivity.d1(sendCriteoOnViewBeacon.a(), sendCriteoOnViewBeacon.getFormatLevelBeacon());
        } else if (it instanceof InterfaceC17146a.FindSimilarItems) {
            personalizedShoppingListActivity.p0(((InterfaceC17146a.FindSimilarItems) it).getProduct());
        } else if (it instanceof InterfaceC17146a.ProductItemClicked) {
            InterfaceC17146a.ProductItemClicked productItemClicked = (InterfaceC17146a.ProductItemClicked) it;
            personalizedShoppingListActivity.V2(productItemClicked.getItemClicked(), productItemClicked.getPosition());
        } else if (it instanceof InterfaceC17146a.SendCriteoLoadBeacon) {
            InterfaceC17146a.SendCriteoLoadBeacon sendCriteoLoadBeacon = (InterfaceC17146a.SendCriteoLoadBeacon) it;
            personalizedShoppingListActivity.e3(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon());
        } else {
            if (!(it instanceof InterfaceC17146a.UpdateEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17146a.UpdateEntry updateEntry = (InterfaceC17146a.UpdateEntry) it;
            personalizedShoppingListActivity.Y2(updateEntry.getProductToAdd(), updateEntry.getQuantity());
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(personalizedShoppingListActivity.z2());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O2(PersonalizedShoppingListActivity personalizedShoppingListActivity, e1.AbstractC12581j action) {
        Intrinsics.j(action, "action");
        personalizedShoppingListActivity.A2().A1(action);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(PersonalizedShoppingListActivity personalizedShoppingListActivity, GoogleAdAnalytics googleAdAnalytics) {
        Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
        personalizedShoppingListActivity.A2().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R2(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(personalizedShoppingListActivity.z2());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductSponsorship T2(PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator, String it) {
        Intrinsics.j(it, "it");
        return personalizedShoppingListActivity.y2().a(productListDecorator.getProduct().getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g3(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.p(personalizedShoppingListActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Il.b getFulfillmentBarViewModel() {
        return (Il.b) this.fulfillmentBarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C15485b(this).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.P
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PersonalizedShoppingListActivity.k3(this.f111826a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                PersonalizedShoppingListActivity.m3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l3(PersonalizedShoppingListActivity personalizedShoppingListActivity, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(personalizedShoppingListActivity.z2());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3(Qo.l productQuery) {
        startActivity(OrderOptionsActivity.INSTANCE.b(this, o3(productQuery)));
    }

    private final String o3(Qo.l productQuery) {
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
    public final C13790a v2() {
        return (C13790a) this.cartBadge.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void S(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        A2().A1(new e1.AbstractC12581j.StepperStateChangedAction(productToAdd.getCode(), controlState.getValueState().getQuantity(), stepperHitRect));
    }

    public final void X2(Pj.a loadingState) {
        Intrinsics.j(loadingState, "loadingState");
        if (loadingState instanceof a.Paging) {
            W2(loadingState);
            return;
        }
        Nn.E e10 = null;
        if (loadingState instanceof a.Loading) {
            Nn.E e11 = this.binding;
            if (e11 == null) {
                Intrinsics.x("binding");
            } else {
                e10 = e11;
            }
            e10.f21308B.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
            return;
        }
        if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
            throw new NoWhenBranchMatchedException();
        }
        W2(loadingState);
        Nn.E e12 = this.binding;
        if (e12 == null) {
            Intrinsics.x("binding");
        } else {
            e10 = e12;
        }
        e10.f21308B.U(loadingState.getMessage(), loadingState.getIsLoading());
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !w2().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void c0(ProductCardDecorator itemClicked, androidx.databinding.p binding, int position) {
        Intrinsics.j(itemClicked, "itemClicked");
        Intrinsics.j(binding, "binding");
        A2().A1(new e1.AbstractC12581j.ViewProductDetailsAction(itemClicked.getProduct(), itemClicked.getProductQuery(), position));
    }

    public final void h3(String str) {
        Intrinsics.j(str, "<set-?>");
        this.trackState = str;
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void o0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        A2().A1(new e1.AbstractC12581j.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Nn.E eM0 = Nn.E.M0(getLayoutInflater());
        this.binding = eM0;
        C15069d<ju.g> c15069d = null;
        if (eM0 == null) {
            Intrinsics.x("binding");
            eM0 = null;
        }
        setContentView(Zr.a.j(eM0.getRoot(), false, 1, null));
        ck.c.b(this, 0, com.meijer.mobile.meijer.M.f99458b, Bl.m.f3132a, 0, 8, null);
        androidx.view.I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.E2(this.f111901a, (androidx.view.F) obj);
            }
        }, 3, null);
        getLifecycle().a(A2());
        if ((x2() instanceof l.Recommendations) && getIntent().hasExtra("CAROUSEL_TITLE")) {
            String stringExtra = getIntent().getStringExtra("CAROUSEL_TITLE");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.carouselTitle = stringExtra;
            A2().A1(new e1.AbstractC12581j.SendTitle(this.carouselTitle));
        }
        if (getFeatureManager().e(AbstractC18503f.C.f172844h)) {
            e1.v1(A2(), Qo.K.a(x2()), null, 2, null);
        }
        e1.c2(A2(), Qo.K.a(x2()), false, 2, null);
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonalizedShoppingListActivity.F2(this.f111903a);
            }
        }, 3, null);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1819250526, true, new b()), 1, null);
        Rj.a.a(y(), com.meijer.mobile.meijer.T.f99907c4, v2());
        y().setOnMenuItemClickListener(new Sn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.G2(this.f111905a, (a.AbstractC0780a) obj);
            }
        }));
        C15809k.d(C6173t.a(this), null, null, new c(null), 3, null);
        C15809k.d(C6173t.a(this), null, null, new d(null), 3, null);
        ju.l lVar = new ju.l();
        nk.l lVarX2 = x2();
        l.Personalized personalized = lVarX2 instanceof l.Personalized ? (l.Personalized) lVarX2 : null;
        if ((personalized != null ? personalized.getProductType() : null) == nk.d.f152479b) {
            lVar.O(true);
        } else {
            lVar.N(new C12568d(Qo.K.a(x2())));
        }
        this.allItemsSection = lVar;
        C15069d<ju.g> c15069d2 = new C15069d<>();
        ju.l lVar2 = this.allItemsSection;
        if (lVar2 == null) {
            Intrinsics.x("allItemsSection");
            lVar2 = null;
        }
        c15069d2.c(lVar2);
        this.adapter = c15069d2;
        Nn.E e10 = this.binding;
        if (e10 == null) {
            Intrinsics.x("binding");
            e10 = null;
        }
        RecyclerView recyclerView = e10.f21309C;
        C15069d<ju.g> c15069d3 = this.adapter;
        if (c15069d3 == null) {
            Intrinsics.x("adapter");
        } else {
            c15069d = c15069d3;
        }
        recyclerView.setAdapter(c15069d);
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
        Nn.E e10 = this.binding;
        if (e10 == null) {
            Intrinsics.x("binding");
            e10 = null;
        }
        e10.f21308B.setProgressBarListener(null);
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
        ck.c.b(this, 1, com.meijer.mobile.meijer.M.f99457a, com.meijer.mobile.meijer.M.f99459c, 0, 8, null);
        return true;
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void p0(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        startActivity(Bl.t.e(Bl.t.f3152a, this, null, Pp.c.f26247c, product, "favorite products page", 2, null));
    }

    public final wr.f w2() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("cartInteractor");
        return null;
    }

    @Override // Bj.b
    public Toolbar y() {
        Nn.E e10 = this.binding;
        if (e10 == null) {
            Intrinsics.x("binding");
            e10 = null;
        }
        MaterialToolbar toolbar = e10.f21310D;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    public final pp.e y2() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("sponsorshipsDataStore");
        return null;
    }

    public final String z2() {
        String str = this.trackState;
        if (str != null) {
            return str;
        }
        Intrinsics.x("trackState");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(C14274a result) {
        int i10;
        switch (result.getResultCode()) {
            case 867530912:
                i10 = C17284b.f163321g;
                break;
            case 867530913:
                i10 = C17284b.f163319f;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            Nn.E e10 = this.binding;
            if (e10 == null) {
                Intrinsics.x("binding");
                e10 = null;
            }
            Snackbar.q0(e10.getRoot(), i10, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PersonalizedShoppingListActivity.C2(this.f111909a, view);
                }
            }).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(PersonalizedShoppingListActivity personalizedShoppingListActivity, View view) {
        personalizedShoppingListActivity.startActivity(personalizedShoppingListActivity.getFeatureEntryPoint().d());
    }

    private final void D2(Coupon coupon) {
        startActivity(Dl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        if (!personalizedShoppingListActivity.onNavigateUp()) {
            personalizedShoppingListActivity.finish();
        }
        ck.c.b(personalizedShoppingListActivity, 1, com.meijer.mobile.meijer.M.f99457a, com.meijer.mobile.meijer.M.f99459c, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(final PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        e1 e1VarA2 = personalizedShoppingListActivity.A2();
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        e1VarA2.onAction(new a.Clip(coupon, C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.K2(this.f111899a, (TrackingData) obj);
            }
        })));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        personalizedShoppingListActivity.D2(coupon);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        personalizedShoppingListActivity.A2().g2(false);
        personalizedShoppingListActivity.A2().A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(0, 0));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(ProductListDecorator productListDecorator, PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        if (productListDecorator.getProduct().getIsSponsoredCriteo() && (personalizedShoppingListActivity.isBuyAgain || personalizedShoppingListActivity.isFavOnSale)) {
            personalizedShoppingListActivity.A2().g2(true);
            e1 e1VarA2 = personalizedShoppingListActivity.A2();
            List listE = CollectionsKt.e(productListDecorator.getProduct().getBeaconInfo().getOnBasketChangeBeacon());
            Ul.a aVar = Ul.a.f37569e;
            ProductFullDetails product = productListDecorator.getProduct();
            if (!product.getIsSponsoredCriteo()) {
                product = null;
            }
            e1VarA2.A1(new e1.AbstractC12581j.SendCriteoQtyStepperBeacon(listE, aVar, product));
        }
        personalizedShoppingListActivity.A2().A1(new e1.AbstractC12581j.StepperStateChangedAction(productListDecorator.getProduct().getCode(), 0.0d, new Rect()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q2(final PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        e1 e1VarA2 = personalizedShoppingListActivity.A2();
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        e1VarA2.onAction(new a.Clip(coupon, C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.R2(this.f111896a, (TrackingData) obj);
            }
        })));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S2(PersonalizedShoppingListActivity personalizedShoppingListActivity, ProductListDecorator productListDecorator) {
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        personalizedShoppingListActivity.D2(coupon);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void V2(ProductCardDecorator itemClicked, int position) {
        A2().A1(new e1.AbstractC12581j.ItemSelectedAction(itemClicked, this.searchType, position));
    }

    private final void W2(Pj.a loadingState) {
        ju.l lVar = null;
        if (!loadingState.getIsLoading()) {
            ju.l lVar2 = this.allItemsSection;
            if (lVar2 == null) {
                Intrinsics.x("allItemsSection");
            } else {
                lVar = lVar2;
            }
            lVar.L();
            return;
        }
        ju.l lVar3 = this.allItemsSection;
        if (lVar3 == null) {
            Intrinsics.x("allItemsSection");
        } else {
            lVar = lVar3;
        }
        lVar.M(new e(loadingState));
    }

    private final void Y2(ProductFullDetails productToAdd, double quantity) {
        e1 e1VarA2 = A2();
        String stringExtra = getIntent().getStringExtra("homePageCarouselAnalytics");
        if (!getIntent().hasExtra("homePageCarouselAnalytics")) {
            stringExtra = null;
        }
        e1VarA2.S1(stringExtra);
        A2().A1(new e1.AbstractC12581j.UpdateEntryAction(productToAdd, quantity, new Rect(0, 0, 0, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(ProductFullDetails product) {
        Parcelable parcelable;
        Bl.g featureEntryPoint = getFeatureEntryPoint();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        String strC3 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("personalizedShoppingListProductType", nk.l.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("personalizedShoppingListProductType");
            if (!(parcelableExtra instanceof nk.l)) {
                parcelableExtra = null;
            }
            parcelable = (nk.l) parcelableExtra;
        }
        nk.l lVar = (nk.l) parcelable;
        if (lVar instanceof l.Department) {
            strC3 = "shopDepartmentTierLevel";
        } else if (lVar instanceof l.d) {
            strC3 = "Favorites: Product Clicked";
        } else if (lVar instanceof l.Personalized) {
            int i10 = a.$EnumSwitchMapping$0[((l.Personalized) lVar).getProductType().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    strC3 = "Buy Again: PLP: Product Clicked";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                strC3 = "Favorites on Sale: PLP: Product Clicked";
            }
        } else if (lVar instanceof l.Recommendations) {
            strC3 = c3();
        }
        startActivity(Bl.g.t(featureEntryPoint, product, false, false, strC3, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a3() {
        startActivity(getMeijerIntent().D(this, getFeatureManager().e(AbstractC18503f.O.f172854h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b3(nk.f product) {
        startActivity(getMeijerIntent().G(this, product, getFeatureManager().e(AbstractC18503f.O.f172854h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c3() {
        e1.ViewState value = A2().o1().getValue();
        if (value.getIsBuyAgain()) {
            return "Buy Again: PLP: Product Clicked";
        }
        if (value.getIsFavoriteOnSale()) {
            return "Favorites on Sale: PLP: Product Clicked";
        }
        if (value.getIsWhiteLabelCarousel()) {
            return this.carouselTitle + ": PLP: Product Clicked";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d3(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        personalizedShoppingListActivity.A2().A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(0, 0));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f3() {
        /*
            r5 = this;
            nk.l r0 = r5.x2()
            boolean r1 = r0 instanceof nk.l.d
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Favorites"
            goto L6e
        Lb:
            boolean r1 = r0 instanceof nk.l.Personalized
            java.lang.String r2 = "Favorites on Sale"
            java.lang.String r3 = "Buy Again"
            if (r1 == 0) goto L31
            nk.l$e r0 = (nk.l.Personalized) r0
            nk.d r0 = r0.getProductType()
            int[] r1 = com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.a.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 != r1) goto L29
        L27:
            r0 = r3
            goto L6e
        L29:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L2f:
            r0 = r2
            goto L6e
        L31:
            boolean r0 = r0 instanceof nk.l.Recommendations
            java.lang.String r1 = ""
            if (r0 == 0) goto L6d
            com.meijer.mobile.meijer.activity.personalized.modals.e1 r0 = r5.A2()
            pv.P r0 = r0.o1()
            java.lang.Object r0 = r0.getValue()
            com.meijer.mobile.meijer.activity.personalized.modals.e1$q r0 = (com.meijer.mobile.meijer.activity.personalized.modals.e1.ViewState) r0
            boolean r4 = r0.getIsBuyAgain()
            if (r4 == 0) goto L4c
            goto L27
        L4c:
            boolean r3 = r0.getIsFavoriteOnSale()
            if (r3 == 0) goto L53
            goto L2f
        L53:
            boolean r0 = r0.getIsWhiteLabelCarousel()
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Collection:"
            r0.append(r1)
            java.lang.String r1 = r5.carouselTitle
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L6e
        L6d:
            r0 = r1
        L6e:
            r5.h3(r0)
            java.lang.String r0 = r5.z2()
            int r0 = r0.length()
            if (r0 <= 0) goto L8f
            hi.a r0 = r5.getAnalyticsEngine()
            java.lang.String r1 = r5.z2()
            ii.h$b r1 = ii.C14756c.h(r1)
            com.meijer.mobile.meijer.activity.personalized.modals.O r2 = new com.meijer.mobile.meijer.activity.personalized.modals.O
            r2.<init>()
            r0.b(r1, r2)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity.f3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3(LocalThemeScope localThemeScope, String message, nk.c product) {
        if (getFeatureManager().e(AbstractC18503f.C18510h.f172880h)) {
            C15809k.d(C6173t.a(this), null, null, new f(message, this, product, localThemeScope, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(final PersonalizedShoppingListActivity personalizedShoppingListActivity, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        personalizedShoppingListActivity.A2().onAction(new a.Clip(coupon, C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalizedShoppingListActivity.l3(this.f111900a, (TrackingData) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13790a u2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
        C13790a c13790aE = C13790a.e(personalizedShoppingListActivity);
        c13790aE.V(false);
        c13790aE.N(C17283a.f163260c);
        Intrinsics.i(c13790aE, "apply(...)");
        return c13790aE;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        int x10;
        if (!getFeatureManager().e(AbstractC18503f.T.f172859h)) {
            e1 e1VarA2 = A2();
            int y10 = 0;
            if (ev2 != null) {
                x10 = (int) ev2.getX();
            } else {
                x10 = 0;
            }
            if (ev2 != null) {
                y10 = (int) ev2.getY();
            }
            e1VarA2.A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(x10, y10));
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12229p0.b
    public void f0() {
        A2().A1(e1.AbstractC12581j.f.f112103a);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        C6396a.a(Qo.K.a(x2())).start();
    }

    public final nk.l x2() {
        Object obj;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("personalizedShoppingListProductType", nk.l.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("personalizedShoppingListProductType");
            if (!(parcelableExtra instanceof nk.l)) {
                parcelableExtra = null;
            }
            obj = (nk.l) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (nk.l) obj;
    }
}
