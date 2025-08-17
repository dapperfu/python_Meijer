package com.meijer.mobile.meijer.activity.find;

import Co.ProductFullDetails;
import Hl.FulfillmentBarDecorator;
import Ho.ProductSponsorship;
import Ji.LocalThemeScope;
import Mn.AbstractC4272p1;
import Mn.AbstractC4281s;
import Mn.Z1;
import Mn.r3;
import Oj.a;
import Ok.Coupon;
import Pk.a;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.l;
import Rn.a;
import V2.CreationExtras;
import Zm.C5546t;
import ak.AbstractC5607a;
import an.C5611a;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ce.C6386a;
import com.fullstory.FSPage;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.activity.find.C12104p0;
import com.meijer.mobile.meijer.activity.find.FilteredProductsActivity;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.C12481o0;
import com.meijer.mobile.meijer.activity.personalized.modals.C12490t0;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import kotlin.text.StringsKt;
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
import vs.ProductListDecorator;
import xk.C18066d;
import yl.AbstractC18227f;
import ys.C18300a;
import ys.C18301b;

@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 É\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001WB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u0010\u0007J\u000f\u00103\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u0007J!\u00108\u001a\u0004\u0018\u0001072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010DH\u0014¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0014¢\u0006\u0004\bH\u0010\u0007J\u0015\u0010I\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bI\u0010,J'\u0010L\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\u0006\u0010K\u001a\u00020J2\u0006\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ'\u0010R\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bT\u0010SJ\u001b\u0010W\u001a\u00020\n2\n\u0010V\u001a\u000607j\u0002`UH\u0016¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b]\u0010\\J\u001f\u0010^\u001a\u00020\u000f2\u0006\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020>H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u000fH\u0016¢\u0006\u0004\bc\u0010\u0007J\u000f\u0010d\u001a\u00020\u000fH\u0016¢\u0006\u0004\bd\u0010\u0007J\u0019\u0010g\u001a\u00020\n2\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u000fH\u0016¢\u0006\u0004\bi\u0010\u0007R\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0087\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010K\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009a\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R;\u0010ª\u0001\u001a$\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207\u0018\u00010¦\u0001j\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207\u0018\u0001`§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R\u001f\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010³\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R!\u0010Â\u0001\u001a\u00030¾\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u0084\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Å\u0001\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010È\u0001\u001a\u00030Æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010Ç\u0001¨\u0006Ê\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/FilteredProductsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "LPj/g;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "<init>", "()V", "", "errorMessageId", "", "X2", "(I)Z", "Lg/a;", "result", "", "D2", "(Lg/a;)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LOk/a;", "coupon", "T2", "(IIIILOk/a;)V", "H2", "(LOk/a;)V", "searchResultsCount", "LQo/l;", "productQuery", "n2", "(ILQo/l;)V", "", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0;", "products", "Lcom/meijer/mobile/meijer/activity/personalized/modals/o0;", "ads", "Lou/a;", "G2", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "LOj/a;", "loadingState", "O2", "(LOj/a;)V", "LQo/l$k;", "C2", "(LQo/l$k;)V", "F2", "(LQo/l;)V", "B2", "A2", "Lts/a;", "itemClicked", "position", "", "r2", "(Lts/a;I)Ljava/lang/String;", "W2", "()Ljava/lang/String;", "N2", "(Lts/a;I)V", "LCo/h;", "productToAdd", "", "quantity", "Q2", "(LCo/h;D)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "P2", "Landroidx/databinding/p;", "binding", "a0", "(Lts/a;Landroidx/databinding/p;I)V", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "l0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "R", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "U0", "S2", "(Ljava/lang/String;Ljava/lang/String;)V", "product", "m0", "(LCo/h;)V", "onCreateAccount", "onSignIn", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "d0", "Lwr/f;", "s", "Lwr/f;", "u2", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "LRo/a;", "t", "LRo/a;", "x2", "()LRo/a;", "setProductAnalytics", "(LRo/a;)V", "productAnalytics", "Lpp/e;", "u", "Lpp/e;", "z2", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "v", "Lkotlin/Lazy;", "y2", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "productsViewModel", "LHl/b;", "w", "v2", "()LHl/b;", "fulfillmentViewModel", "LMn/s;", "x", "LMn/s;", "Lnu/d;", "Lnu/g;", "y", "Lnu/d;", "filteredListAdapter", "Lnu/l;", "z", "Lnu/l;", "productsSection", "A", "Ljava/lang/String;", "cmpid", "B", "campaignIdValue", "Lcom/google/android/material/snackbar/Snackbar;", "C", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "LPp/b;", "D", "LPp/b;", "searchType", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "E", "Ljava/util/HashMap;", "departmentBreadcrumbs", "F", "Z", "isDepartmentAnalyticsSent", "G", "LQo/l$k;", "deeplinkFacets", "Lg/c;", "H", "Lg/c;", "filterDepartmentResultRegistrationLauncher", "I", "filterCollectionResultRegistrationLauncher", "Landroid/content/Intent;", "J", "substitutionResultLauncher", "Lcom/meijer/mobile/meijer/activity/find/p0;", "K", "Lcom/meijer/mobile/meijer/activity/find/p0;", "scrollListener", "Lce/a;", "L", "t2", "()Lce/a;", "cartBadge", "w2", "()LQo/l;", "initialProductQuery", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "M", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FilteredProductsActivity extends Hilt_FilteredProductsActivity implements Aj.b, C12490t0.a, Pj.g, C12104p0.b {

    /* renamed from: N, reason: collision with root package name */
    public static final int f106342N = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String cmpid;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Snackbar currentSnackbar;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private HashMap<String, String> departmentBreadcrumbs;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean isDepartmentAnalyticsSent;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private l.k deeplinkFacets;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Ro.a productAnalytics;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public pp.e sponsorshipsDataStore;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AbstractC4281s binding;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> filteredListAdapter;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private nu.l productsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy productsViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.personalized.modals.e1.class), new i(this), new h(this), new j(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentViewModel = new androidx.view.e0(Reflection.b(Hl.b.class), new l(this), new k(this), new m(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f28356a;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Qo.l> filterDepartmentResultRegistrationLauncher = registerForActivityResult(new com.meijer.mobile.meijer.activity.find.filter.b(), new c());

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Qo.l> filterCollectionResultRegistrationLauncher = registerForActivityResult(new com.meijer.mobile.meijer.activity.find.filter.a(), new b());

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new n());

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final C12104p0 scrollListener = new C12104p0(this, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilteredProductsActivity.R2(this.f106911a);
        }
    });

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilteredProductsActivity.q2(this.f106919a);
        }
    });

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
            return new FunctionReferenceImpl(1, FilteredProductsActivity.this, FilteredProductsActivity.class, "handleFilterResultRegistrationResult", "handleFilterResultRegistrationResult(Lcom/meijer/mobile/product/model/search/query/ProductQuery$SortableAndFilterable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(l.k kVar) {
            FilteredProductsActivity.this.C2(kVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14146b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, FilteredProductsActivity.this, FilteredProductsActivity.class, "handleFilterResultRegistrationResult", "handleFilterResultRegistrationResult(Lcom/meijer/mobile/product/model/search/query/ProductQuery$SortableAndFilterable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(l.k kVar) {
            FilteredProductsActivity.this.C2(kVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e1.ViewState f106366a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilteredProductsActivity f106367b;

            a(e1.ViewState viewState, FilteredProductsActivity filteredProductsActivity) {
                this.f106366a = viewState;
                this.f106367b = filteredProductsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(FilteredProductsActivity filteredProductsActivity, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                filteredProductsActivity.y2().x1(new e1.AbstractC12456j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(FilteredProductsActivity filteredProductsActivity, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                filteredProductsActivity.y2().x1(new e1.AbstractC12456j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(FilteredProductsActivity filteredProductsActivity, InterfaceC17023a it) {
                Intrinsics.j(it, "it");
                if (it instanceof InterfaceC17023a.FindSimilarItems) {
                    filteredProductsActivity.m0(((InterfaceC17023a.FindSimilarItems) it).getProduct());
                } else if (it instanceof InterfaceC17023a.ProductItemClicked) {
                    InterfaceC17023a.ProductItemClicked productItemClicked = (InterfaceC17023a.ProductItemClicked) it;
                    filteredProductsActivity.N2(productItemClicked.getItemClicked(), productItemClicked.getPosition());
                } else if (it instanceof InterfaceC17023a.SendCriteoLoadBeacon) {
                    InterfaceC17023a.SendCriteoLoadBeacon sendCriteoLoadBeacon = (InterfaceC17023a.SendCriteoLoadBeacon) it;
                    filteredProductsActivity.S2(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon());
                } else if (it instanceof InterfaceC17023a.SendCriteoOnViewBeacon) {
                    InterfaceC17023a.SendCriteoOnViewBeacon sendCriteoOnViewBeacon = (InterfaceC17023a.SendCriteoOnViewBeacon) it;
                    filteredProductsActivity.d1(sendCriteoOnViewBeacon.a(), sendCriteoOnViewBeacon.getFormatLevelBeacon());
                } else {
                    if (!(it instanceof InterfaceC17023a.UpdateEntry)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC17023a.UpdateEntry updateEntry = (InterfaceC17023a.UpdateEntry) it;
                    filteredProductsActivity.Q2(updateEntry.getProductToAdd(), updateEntry.getQuantity());
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                Coupon coupon = product.getCoupon();
                if (coupon != null) {
                    filteredProductsActivity.y2().onAction(new a.Clip(Ok.e.a(coupon.getOfferId()), C14480g.a(C14476c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.u((TrackingData) obj);
                        }
                    })));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(TrackingData TrackingData) {
                Intrinsics.j(TrackingData, "$this$TrackingData");
                TrackingData.n("Product Search Results Page");
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                Coupon coupon = product.getCoupon();
                if (coupon != null) {
                    filteredProductsActivity.H2(coupon);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(FilteredProductsActivity filteredProductsActivity, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                filteredProductsActivity.y2().x1(new e1.AbstractC12456j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                filteredProductsActivity.m0(product.getProduct());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                filteredProductsActivity.y2().x1(new e1.AbstractC12456j.StepperStateChangedAction(product.getProduct().getCode(), 0.0d, new Rect()));
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                q(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            public final void q(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                AdManagerAdView adManagerAdViewS;
                AdManagerAdView adManagerAdViewS2;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-70410904, i11, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FilteredProductsActivity.kt:517)");
                }
                List<ProductListDecorator> listQ = this.f106366a.q();
                boolean z10 = (this.f106366a.getLoadingState() instanceof a.Paging) && this.f106366a.getLoadingState().getIsLoading();
                GoogleAdData googleAdSlot1 = this.f106366a.getGoogleAdSlot1();
                composer.startReplaceGroup(1054665799);
                AdManagerAdView adManagerAdViewS3 = null;
                if (googleAdSlot1 == null) {
                    adManagerAdViewS = null;
                } else {
                    final FilteredProductsActivity filteredProductsActivity = this.f106367b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(filteredProductsActivity);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FilteredProductsActivity.d.a.w(filteredProductsActivity, (GoogleAdAnalytics) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    adManagerAdViewS = sr.p.S(googleAdSlot1, (Function1) objB, null, composer, GoogleAdData.f131149f, 4);
                }
                composer.P();
                GoogleAdData googleAdSlot2 = this.f106366a.getGoogleAdSlot2();
                composer.startReplaceGroup(1054675911);
                if (googleAdSlot2 == null) {
                    adManagerAdViewS2 = null;
                } else {
                    final FilteredProductsActivity filteredProductsActivity2 = this.f106367b;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(filteredProductsActivity2);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.p
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FilteredProductsActivity.d.a.A(filteredProductsActivity2, (GoogleAdAnalytics) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    adManagerAdViewS2 = sr.p.S(googleAdSlot2, (Function1) objB2, null, composer, GoogleAdData.f131149f, 4);
                }
                composer.P();
                GoogleAdData googleAdSlot3 = this.f106366a.getGoogleAdSlot3();
                composer.startReplaceGroup(1054686023);
                if (googleAdSlot3 != null) {
                    final FilteredProductsActivity filteredProductsActivity3 = this.f106367b;
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(filteredProductsActivity3);
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FilteredProductsActivity.d.a.B(filteredProductsActivity3, (GoogleAdAnalytics) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    adManagerAdViewS3 = sr.p.S(googleAdSlot3, (Function1) objB3, null, composer, GoogleAdData.f131149f, 4);
                }
                AdManagerAdView adManagerAdView = adManagerAdViewS3;
                composer.P();
                boolean zE = this.f106367b.getFeatureManager().e(AbstractC18227f.C18233g.f170578h);
                boolean zE2 = this.f106367b.getFeatureManager().e(AbstractC18227f.k0.f170587h);
                boolean zE3 = this.f106367b.getFeatureManager().e(AbstractC18227f.l0.f170589h);
                boolean zB = this.f106367b.getUserManager().b();
                composer.startReplaceGroup(5004770);
                boolean zD4 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity4 = this.f106367b;
                Object objB4 = composer.B();
                if (zD4 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FilteredProductsActivity.d.a.r(filteredProductsActivity4);
                        }
                    };
                    composer.t(objB4);
                }
                Function0 function0 = (Function0) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD5 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity5 = this.f106367b;
                Object objB5 = composer.B();
                if (zD5 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.s(filteredProductsActivity5, (InterfaceC17023a) obj);
                        }
                    };
                    composer.t(objB5);
                }
                Function1 function1 = (Function1) objB5;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD6 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity6 = this.f106367b;
                Object objB6 = composer.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.t(filteredProductsActivity6, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB6);
                }
                Function1 function12 = (Function1) objB6;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD7 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity7 = this.f106367b;
                Object objB7 = composer.B();
                if (zD7 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.v(filteredProductsActivity7, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB7);
                }
                Function1 function13 = (Function1) objB7;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD8 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity8 = this.f106367b;
                Object objB8 = composer.B();
                if (zD8 || objB8 == Composer.INSTANCE.a()) {
                    objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.x(filteredProductsActivity8, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB8);
                }
                Function1 function14 = (Function1) objB8;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD9 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity9 = this.f106367b;
                Object objB9 = composer.B();
                if (zD9 || objB9 == Composer.INSTANCE.a()) {
                    objB9 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.y(filteredProductsActivity9, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB9);
                }
                Function1 function15 = (Function1) objB9;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD10 = composer.D(this.f106367b);
                final FilteredProductsActivity filteredProductsActivity10 = this.f106367b;
                Object objB10 = composer.B();
                if (zD10 || objB10 == Composer.INSTANCE.a()) {
                    objB10 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FilteredProductsActivity.d.a.z(filteredProductsActivity10);
                        }
                    };
                    composer.t(objB10);
                }
                composer.P();
                C5546t.G(AdsTheme, listQ, function0, function1, function12, function13, function14, null, function15, (Function0) objB10, null, z10, null, adManagerAdViewS, adManagerAdViewS2, adManagerAdView, zE, zE2, zE3, false, zB, composer, LocalThemeScope.f15770g | (i11 & 14), 0, 0, 264768);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(FilteredProductsActivity filteredProductsActivity) {
                filteredProductsActivity.y2().x1(e1.AbstractC12456j.f.f111238a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(FilteredProductsActivity filteredProductsActivity) {
                filteredProductsActivity.y2().x1(new e1.AbstractC12456j.CollapseQuantityStepperAction(0, 0));
                return Unit.f142422a;
            }
        }

        d() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(104300242, i10, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous> (FilteredProductsActivity.kt:515)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-70410904, true, new a((e1.ViewState) o1.b(FilteredProductsActivity.this.y2().m1(), null, composer, 0, 1).getValue(), FilteredProductsActivity.this), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$11", f = "FilteredProductsActivity.kt", l = {604}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106368a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$11$1", f = "FilteredProductsActivity.kt", l = {605}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106370a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilteredProductsActivity f106371b;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$11$1$1", f = "FilteredProductsActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$e$a$a, reason: collision with other inner class name */
            static final class C1586a extends SuspendLambda implements Function2<e1.ViewState, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f106372a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f106373b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ FilteredProductsActivity f106374c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1586a(FilteredProductsActivity filteredProductsActivity, Continuation<? super C1586a> continuation) {
                    super(2, continuation);
                    this.f106374c = filteredProductsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1586a c1586a = new C1586a(this.f106374c, continuation);
                    c1586a.f106373b = obj;
                    return c1586a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                    return ((C1586a) create(viewState, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 808
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.e.a.C1586a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(Pair pair, GoogleAdAnalytics googleAdAnalytics) {
                    ((com.meijer.mobile.meijer.activity.personalized.modals.e1) pair.d()).x1(new e1.AbstractC12456j.GoogleAdClicked(googleAdAnalytics));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final CharSequence s(ProductListDecorator productListDecorator) {
                    return productListDecorator.getProduct().getCode();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(FilteredProductsActivity filteredProductsActivity, l.Department department, String str, TrackingData trackingData) {
                    trackingData.p(filteredProductsActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
                    trackingData.h("tier", department.getDepartment().getId());
                    trackingData.o("category");
                    trackingData.h("tierName", department.getDepartment().getName());
                    trackingData.h("lowStockProducts", str);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(FilteredProductsActivity filteredProductsActivity, ProductListDecorator productListDecorator) {
                    com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarY2 = filteredProductsActivity.y2();
                    Coupon coupon = productListDecorator.getCoupon();
                    Intrinsics.g(coupon);
                    e1VarY2.onAction(new a.Clip(Ok.e.a(coupon.getOfferId()), new TrackingData(C14476c.a("coupon clip"), CollectionsKt.s(C14476c.c("category Page")))));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(FilteredProductsActivity filteredProductsActivity, ProductListDecorator productListDecorator) {
                    Coupon coupon = productListDecorator.getCoupon();
                    Intrinsics.g(coupon);
                    filteredProductsActivity.H2(coupon);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ProductSponsorship x(FilteredProductsActivity filteredProductsActivity, String str) {
                    return filteredProductsActivity.z2().a(str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FilteredProductsActivity filteredProductsActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f106371b = filteredProductsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f106371b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f106370a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    tv.P<e1.ViewState> pM1 = this.f106371b.y2().m1();
                    C1586a c1586a = new C1586a(this.f106371b, null);
                    this.f106370a = 1;
                    if (C17154h.k(pM1, c1586a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FilteredProductsActivity.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106368a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                FilteredProductsActivity filteredProductsActivity = FilteredProductsActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55277c;
                a aVar = new a(filteredProductsActivity, null);
                this.f106368a = 1;
                if (C5994J.b(filteredProductsActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$9", f = "FilteredProductsActivity.kt", l = {325}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106375a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$9$1", f = "FilteredProductsActivity.kt", l = {326}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106377a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilteredProductsActivity f106378b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FilteredProductsActivity filteredProductsActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f106378b = filteredProductsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f106378b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$9$1$1", f = "FilteredProductsActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$f$a$a, reason: collision with other inner class name */
            static final class C1587a extends SuspendLambda implements Function2<e1.AbstractC12460n, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f106379a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f106380b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ FilteredProductsActivity f106381c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$f$a$a$a, reason: collision with other inner class name */
                static final class C1588a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ FilteredProductsActivity f106382a;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$f$a$a$a$a, reason: collision with other inner class name */
                    static final class C1589a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ FilteredProductsActivity f106383a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ z1<FulfillmentBarDecorator> f106384b;

                        C1589a(FilteredProductsActivity filteredProductsActivity, z1<FulfillmentBarDecorator> z1Var) {
                            this.f106383a = filteredProductsActivity;
                            this.f106384b = z1Var;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit c(FilteredProductsActivity filteredProductsActivity) {
                            filteredProductsActivity.startActivity(OrderOptionsActivity.INSTANCE.b(filteredProductsActivity, filteredProductsActivity.w2() instanceof l.Department ? "department tier products page" : ""));
                            return Unit.f142422a;
                        }

                        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                            Intrinsics.j(AdsTheme, "$this$AdsTheme");
                            if ((i10 & 6) == 0) {
                                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                            }
                            if ((i10 & 19) == 18 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(-1218715439, i10, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilteredProductsActivity.kt:497)");
                            }
                            if (this.f106383a.getUserManager().b()) {
                                FulfillmentBarDecorator value = this.f106384b.getValue();
                                composer.startReplaceGroup(5004770);
                                boolean zD = composer.D(this.f106383a);
                                final FilteredProductsActivity filteredProductsActivity = this.f106383a;
                                Object objB = composer.B();
                                if (zD || objB == Composer.INSTANCE.a()) {
                                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.J
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FilteredProductsActivity.f.a.C1587a.C1588a.C1589a.c(filteredProductsActivity);
                                        }
                                    };
                                    composer.t(objB);
                                }
                                composer.P();
                                Hl.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f15770g | (FulfillmentBarDecorator.f12698m << 3), 2);
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                            b(localThemeScope, composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    C1588a(FilteredProductsActivity filteredProductsActivity) {
                        this.f106382a = filteredProductsActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1738142976, i10, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilteredProductsActivity.kt:495)");
                        }
                        Ji.K.b(null, ComposableLambdaKt.c(-1218715439, true, new C1589a(this.f106382a, o1.b(this.f106382a.v2().n(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1587a(FilteredProductsActivity filteredProductsActivity, Continuation<? super C1587a> continuation) {
                    super(2, continuation);
                    this.f106381c = filteredProductsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1587a c1587a = new C1587a(this.f106381c, continuation);
                    c1587a.f106380b = obj;
                    return c1587a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e1.AbstractC12460n abstractC12460n, Continuation<? super Unit> continuation) {
                    return ((C1587a) create(abstractC12460n, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void q(FilteredProductsActivity filteredProductsActivity, DialogInterface dialogInterface, int i10) {
                    filteredProductsActivity.finish();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void r(FilteredProductsActivity filteredProductsActivity, View view) {
                    filteredProductsActivity.startActivity(filteredProductsActivity.getFeatureEntryPoint().d());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void s(FilteredProductsActivity filteredProductsActivity, e1.AbstractC12460n abstractC12460n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    filteredProductsActivity.y2().x1(new e1.AbstractC12456j.UserAcceptAddToCartAction(((e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n).a().b()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void t(FilteredProductsActivity filteredProductsActivity, e1.AbstractC12460n abstractC12460n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    filteredProductsActivity.y2().x1(new e1.AbstractC12456j.ResetActiveStepper(((e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n).a().b().getProductCode()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void u(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f106379a == 0) {
                        ResultKt.b(obj);
                        final e1.AbstractC12460n abstractC12460n = (e1.AbstractC12460n) this.f106380b;
                        AbstractC4281s abstractC4281s = null;
                        if (abstractC12460n instanceof e1.AbstractC12460n.ProductListErrorEvent) {
                            e1.AbstractC12460n.ProductListErrorEvent productListErrorEvent = (e1.AbstractC12460n.ProductListErrorEvent) abstractC12460n;
                            C14886b message = new C14886b(this.f106381c).setCancelable(false).setMessage(productListErrorEvent.getRetrofitException().c(this.f106381c));
                            String string = this.f106381c.getString(yr.Q.f170986b);
                            final FilteredProductsActivity filteredProductsActivity = this.f106381c;
                            message.setPositiveButton(string, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.E
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    FilteredProductsActivity.f.a.C1587a.q(filteredProductsActivity, dialogInterface, i10);
                                }
                            }).show();
                            uw.a.INSTANCE.b(productListErrorEvent.getRetrofitException());
                        } else if (abstractC12460n instanceof e1.AbstractC12460n.ProductListSuccess) {
                            uw.a.INSTANCE.a(this.f106381c.getString(((e1.AbstractC12460n.ProductListSuccess) abstractC12460n).getMessageResId()), new Object[0]);
                        } else if (!Intrinsics.e(abstractC12460n, e1.AbstractC12460n.w.f111371a) && !Intrinsics.e(abstractC12460n, e1.AbstractC12460n.g.f111345a) && !(abstractC12460n instanceof e1.AbstractC12460n.ShoppingListUpdateFailedEvent) && !(abstractC12460n instanceof e1.AbstractC12460n.AddToShoppingListSuccessEvent)) {
                            if (abstractC12460n instanceof e1.AbstractC12460n.CartUpdateSuccessEvent) {
                                AbstractC4281s abstractC4281s2 = this.f106381c.binding;
                                if (abstractC4281s2 == null) {
                                    Intrinsics.y("binding");
                                    abstractC4281s2 = null;
                                }
                                e1.AbstractC12460n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12460n.CartUpdateSuccessEvent) abstractC12460n;
                                Snackbar snackbarQ0 = Snackbar.q0(abstractC4281s2.getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0);
                                int actionResId = cartUpdateSuccessEvent.getActionResId();
                                final FilteredProductsActivity filteredProductsActivity2 = this.f106381c;
                                snackbarQ0.t0(actionResId, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.F
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FilteredProductsActivity.f.a.C1587a.r(filteredProductsActivity2, view);
                                    }
                                }).c0();
                            } else if (abstractC12460n instanceof e1.AbstractC12460n.OpenLowStockScreenEvent) {
                                this.f106381c.substitutionResultLauncher.a(Al.t.e(Al.t.f694a, this.f106381c, ((e1.AbstractC12460n.OpenLowStockScreenEvent) abstractC12460n).getDecorator(), Pp.c.f28366d, null, this.f106381c.W2(), 8, null));
                            } else if (!(abstractC12460n instanceof e1.AbstractC12460n.ViewItemInShoppingListEvent) && !(abstractC12460n instanceof e1.AbstractC12460n.ViewProductDetailsEvent) && !(abstractC12460n instanceof e1.AbstractC12460n.UpdateProductsInfoEvent)) {
                                if (abstractC12460n instanceof e1.AbstractC12460n.UpdateToCartFailedEvent) {
                                    AbstractC4281s abstractC4281s3 = this.f106381c.binding;
                                    if (abstractC4281s3 == null) {
                                        Intrinsics.y("binding");
                                        abstractC4281s3 = null;
                                    }
                                    View root = abstractC4281s3.getRoot();
                                    String string2 = this.f106381c.getResources().getString(((e1.AbstractC12460n.UpdateToCartFailedEvent) abstractC12460n).getMessageResId());
                                    Intrinsics.i(string2, "getString(...)");
                                    Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string2, 0, null, null), 0);
                                    Intrinsics.i(snackbarR0, "make(...)");
                                    Vj.b.b(snackbarR0).c0();
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.ShowChokingWarningDialogEvent) {
                                    AbstractC4281s abstractC4281s4 = this.f106381c.binding;
                                    if (abstractC4281s4 == null) {
                                        Intrinsics.y("binding");
                                        abstractC4281s4 = null;
                                    }
                                    C14886b c14886b = new C14886b(abstractC4281s4.getRoot().getContext(), Bj.p.f3060d);
                                    e1.AbstractC12460n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n;
                                    C14886b message2 = c14886b.setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Bj.i.f2666J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody());
                                    int positiveButtonText = showChokingWarningDialogEvent.a().getPositiveButtonText();
                                    final FilteredProductsActivity filteredProductsActivity3 = this.f106381c;
                                    C14886b positiveButton = message2.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.G
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            FilteredProductsActivity.f.a.C1587a.s(filteredProductsActivity3, abstractC12460n, dialogInterface, i10);
                                        }
                                    });
                                    int negativeButtonText = showChokingWarningDialogEvent.a().getNegativeButtonText();
                                    final FilteredProductsActivity filteredProductsActivity4 = this.f106381c;
                                    positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.H
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            FilteredProductsActivity.f.a.C1587a.t(filteredProductsActivity4, abstractC12460n, dialogInterface, i10);
                                        }
                                    }).show();
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.BubbleFacetsToFilterAndSort) {
                                    l.k kVar = this.f106381c.deeplinkFacets;
                                    if (kVar != null) {
                                        FilteredProductsActivity filteredProductsActivity5 = this.f106381c;
                                        e1.AbstractC12460n.BubbleFacetsToFilterAndSort bubbleFacetsToFilterAndSort = (e1.AbstractC12460n.BubbleFacetsToFilterAndSort) abstractC12460n;
                                        if (!bubbleFacetsToFilterAndSort.getQuery().c1().isEmpty()) {
                                            filteredProductsActivity5.y2().x1(new e1.AbstractC12456j.SetFilterAndSortOptions(Qo.K.b(kVar, bubbleFacetsToFilterAndSort.getQuery())));
                                        }
                                    }
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.ShowError) {
                                    e1.AbstractC12460n.ShowError showError = (e1.AbstractC12460n.ShowError) abstractC12460n;
                                    new C14886b(this.f106381c).setCancelable(false).setTitle(bk.d.a(this.f106381c, showError.getTitle())).setMessage(bk.d.a(this.f106381c, showError.getMessage())).setPositiveButton(bk.d.a(this.f106381c, showError.getPositiveButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.I
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            FilteredProductsActivity.f.a.C1587a.u(dialogInterface, i10);
                                        }
                                    }).show();
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.LaunchFilterAndSortEvent) {
                                    e1.AbstractC12460n.LaunchFilterAndSortEvent launchFilterAndSortEvent = (e1.AbstractC12460n.LaunchFilterAndSortEvent) abstractC12460n;
                                    if (launchFilterAndSortEvent.getQuery() instanceof l.Department) {
                                        this.f106381c.filterDepartmentResultRegistrationLauncher.a(launchFilterAndSortEvent.getQuery());
                                    } else if (launchFilterAndSortEvent.getQuery() instanceof l.BrowseCollection) {
                                        this.f106381c.filterCollectionResultRegistrationLauncher.a(launchFilterAndSortEvent.getQuery());
                                    }
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.ClipCouponFailedEvent) {
                                    e1.AbstractC12460n.ClipCouponFailedEvent clipCouponFailedEvent = (e1.AbstractC12460n.ClipCouponFailedEvent) abstractC12460n;
                                    this.f106381c.T2(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon());
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.ShowFreeItemsSnackbar) {
                                    AbstractC4281s abstractC4281s5 = this.f106381c.binding;
                                    if (abstractC4281s5 == null) {
                                        Intrinsics.y("binding");
                                        abstractC4281s5 = null;
                                    }
                                    View root2 = abstractC4281s5.getRoot();
                                    Resources resources = this.f106381c.getResources();
                                    Intrinsics.i(resources, "getResources(...)");
                                    Snackbar snackbarR02 = Snackbar.r0(root2, bk.d.b(resources, ((e1.AbstractC12460n.ShowFreeItemsSnackbar) abstractC12460n).getMessage()), -2);
                                    Intrinsics.i(snackbarR02, "make(...)");
                                    Snackbar snackbarC = Vj.b.c(snackbarR02);
                                    snackbarC.c0();
                                    this.f106381c.currentSnackbar = snackbarC;
                                } else if (abstractC12460n instanceof e1.AbstractC12460n.e) {
                                    Snackbar snackbar = this.f106381c.currentSnackbar;
                                    if (snackbar != null) {
                                        snackbar.A();
                                    }
                                } else if (!(abstractC12460n instanceof e1.AbstractC12460n.i) && !(abstractC12460n instanceof e1.AbstractC12460n.SubstitutionFailureEvent) && !(abstractC12460n instanceof e1.AbstractC12460n.l)) {
                                    if (abstractC12460n instanceof e1.AbstractC12460n.ShowPlpEvent) {
                                        Intent intentT = Al.g.t(this.f106381c.getFeatureEntryPoint(), ((e1.AbstractC12460n.ShowPlpEvent) abstractC12460n).getProduct(), true, false, null, 12, null);
                                        intentT.putExtra("campaignIdValue", this.f106381c.campaignIdValue);
                                        this.f106381c.startActivity(intentT);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            }
                        }
                        AbstractC4281s abstractC4281s6 = this.f106381c.binding;
                        if (abstractC4281s6 == null) {
                            Intrinsics.y("binding");
                        } else {
                            abstractC4281s = abstractC4281s6;
                        }
                        abstractC4281s.f20940C.setContent(ComposableLambdaKt.composableLambdaInstance(-1738142976, true, new C1588a(this.f106381c)));
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
                int i10 = this.f106377a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<e1.AbstractC12460n> events = this.f106378b.y2().getEvents();
                    C1587a c1587a = new C1587a(this.f106378b, null);
                    this.f106377a = 1;
                    if (C17154h.k(events, c1587a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FilteredProductsActivity.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106375a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                FilteredProductsActivity filteredProductsActivity = FilteredProductsActivity.this;
                AbstractC6023l.b bVar = AbstractC6023l.b.f55277c;
                a aVar = new a(filteredProductsActivity, null);
                this.f106375a = 1;
                if (C5994J.b(filteredProductsActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/find/FilteredProductsActivity$g", "Lou/a;", "LMn/Z1;", "viewBinding", "", "position", "", "A", "(LMn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LMn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends AbstractC16177a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Oj.a f106385e;

        g(Oj.a aVar) {
            this.f106385e = aVar;
        }

        @Override // ou.AbstractC16177a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f20435z.U(this.f106385e.getMessage(), this.f106385e.getIsLoading());
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f106386f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106386f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106387f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f106387f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f106387f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106388f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106389g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106388f = function0;
            this.f106389g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106388f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106389g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106390f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f106390f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106390f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106391f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f106391f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f106391f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106392f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106393g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106392f = function0;
            this.f106393g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106392f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106393g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n implements InterfaceC14146b, FunctionAdapter {
        n() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, FilteredProductsActivity.this, FilteredProductsActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            FilteredProductsActivity.this.D2(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p2() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(l.k productQuery) {
        if (productQuery != null) {
            this.deeplinkFacets = null;
            y2().x1(new e1.AbstractC12456j.SetFilterAndSortOptions(productQuery));
        }
    }

    private final void F2(Qo.l productQuery) {
        if (productQuery == null) {
            throw new IllegalArgumentException("Required ProductQuery was missing");
        }
        com.meijer.mobile.meijer.activity.personalized.modals.e1.Y1(y2(), productQuery, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AbstractC16177a<?>> G2(List<C12490t0> products, List<C12481o0> ads) {
        C12481o0 c12481o0;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : products) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            C12490t0 c12490t0 = (C12490t0) obj;
            if (i10 == 0 && !ads.isEmpty()) {
                C12481o0 c12481o02 = (C12481o0) CollectionsKt.v0(ads, 0);
                if (c12481o02 != null) {
                    arrayList.add(c12481o02);
                }
            } else if (i10 == 10 && ads.size() > 1) {
                C12481o0 c12481o03 = (C12481o0) CollectionsKt.v0(ads, 1);
                if (c12481o03 != null) {
                    arrayList.add(c12481o03);
                }
            } else if (i10 == 20 && ads.size() > 2 && (c12481o0 = (C12481o0) CollectionsKt.v0(ads, 3)) != null) {
                arrayList.add(c12481o0);
            }
            arrayList.add(c12490t0);
            i10 = i11;
        }
        return CollectionsKt.j1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(String str, FilteredProductsActivity filteredProductsActivity, String str2, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("collections");
        track.o("collection");
        track.h("hier1", "Collection|" + str);
        String stringExtra = filteredProductsActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION");
        if (stringExtra != null && !StringsKt.r0(stringExtra)) {
            track.p(filteredProductsActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        } else if (str2 != null && !StringsKt.r0(str2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(z10 ? ": See more items" : ": View All");
            track.p(sb2.toString());
        }
        String str3 = filteredProductsActivity.cmpid;
        if (str3 != null) {
            track.h("cmpid", str3);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(FilteredProductsActivity filteredProductsActivity, a.AbstractC0730a item) {
        Intrinsics.j(item, "item");
        if (Intrinsics.e(item, a.AbstractC0730a.C0731a.f32566a)) {
            filteredProductsActivity.B2();
        } else {
            if (!Intrinsics.e(item, a.AbstractC0730a.b.f32567a)) {
                throw new NoWhenBranchMatchedException();
            }
            filteredProductsActivity.A2();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(FilteredProductsActivity filteredProductsActivity, androidx.view.F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        filteredProductsActivity.finish();
        bk.c.b(filteredProductsActivity, 1, com.meijer.mobile.meijer.M.f98599a, com.meijer.mobile.meijer.M.f98601c, 0, 8, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(ProductFullDetails productToAdd, double quantity) {
        if (X2(Bj.o.f3011d)) {
            y2().x1(new e1.AbstractC12456j.UpdateEntryAction(productToAdd, quantity, new Rect(0, 0, 0, 0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C14886b(this).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                FilteredProductsActivity.U2(this.f106931a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                FilteredProductsActivity.V2(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n2(int searchResultsCount, Qo.l productQuery) {
        String string;
        Collection<List<FilterFacetOption>> collectionValues;
        int size = 0;
        boolean z10 = (productQuery instanceof l.Department) || (productQuery instanceof l.BrowseCollection);
        AbstractC4281s abstractC4281s = this.binding;
        Integer numValueOf = null;
        if (abstractC4281s == null) {
            Intrinsics.y("binding");
            abstractC4281s = null;
        }
        AbstractC4272p1 abstractC4272p1 = abstractC4281s.f20942E;
        MaterialTextView materialTextView = abstractC4272p1.f20853z;
        Intrinsics.g(materialTextView);
        materialTextView.setVisibility((searchResultsCount == 0 || (productQuery instanceof l.Reward)) ? false : true ? 0 : 8);
        materialTextView.setText(AbstractC5607a.INSTANCE.b(C18300a.f171267a, searchResultsCount, NumberFormat.getNumberInstance(Locale.getDefault()).format(Integer.valueOf(searchResultsCount))).b(this));
        Button button = abstractC4272p1.f20852A;
        Intrinsics.g(button);
        button.setVisibility(z10 ? 0 : 8);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilteredProductsActivity.o2(this.f106676a, view);
            }
        });
        if (!z10 || !(productQuery instanceof l.k)) {
            abstractC4272p1.f20852A.setText(C18301b.f171294t);
            return;
        }
        Map<FilterFacet, List<FilterFacetOption>> mapG3 = ((l.k) productQuery).G3();
        if (mapG3 != null && (collectionValues = mapG3.values()) != null) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
            numValueOf = Integer.valueOf(size);
        }
        int iB = C18066d.b(numValueOf, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(FilteredProductsActivity.p2());
            }
        });
        Button button2 = abstractC4272p1.f20852A;
        if (iB == 0) {
            string = getString(C18301b.f171276b, "");
        } else {
            string = getString(C18301b.f171276b, " (" + iB + ')');
        }
        button2.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(int i10, FilteredProductsActivity filteredProductsActivity, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        Ao.e0.a(filteredProductsActivity.z2().a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6386a t2() {
        return (C6386a) this.cartBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hl.b v2() {
        return (Hl.b) this.fulfillmentViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.personalized.modals.e1 y2() {
        return (com.meijer.mobile.meijer.activity.personalized.modals.e1) this.productsViewModel.getValue();
    }

    public final void P2(Oj.a loadingState) {
        Intrinsics.j(loadingState, "loadingState");
        if (loadingState instanceof a.Paging) {
            O2(loadingState);
            return;
        }
        AbstractC4281s abstractC4281s = null;
        if (loadingState instanceof a.Loading) {
            AbstractC4281s abstractC4281s2 = this.binding;
            if (abstractC4281s2 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4281s = abstractC4281s2;
            }
            abstractC4281s.f20941D.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
            return;
        }
        if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
            throw new NoWhenBranchMatchedException();
        }
        O2(loadingState);
        AbstractC4281s abstractC4281s3 = this.binding;
        if (abstractC4281s3 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4281s = abstractC4281s3;
        }
        abstractC4281s.f20941D.U(loadingState.getMessage(), loadingState.getIsLoading());
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void R(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        y2().x1(new e1.AbstractC12456j.StepperStateChangedAction(productToAdd.getCode(), controlState.getValueState().getQuantity(), stepperHitRect));
    }

    public void S2(String beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y2().x1(new e1.AbstractC12456j.SendCriteoLoadBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void U0(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y2().x1(new e1.AbstractC12456j.SendCriteoClickBeacon(beacon, formatLevelBeacon, null, null, 12, null));
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
        ArrayList arrayList = new ArrayList();
        MaterialCardView listItemContainer = ((r3) binding).f20926G;
        Intrinsics.i(listItemContainer, "listItemContainer");
        arrayList.add(listItemContainer);
        Intent intentT = Al.g.t(getFeatureEntryPoint(), itemClicked.getProduct(), true, false, r2(itemClicked, position), 4, null);
        intentT.putExtra("campaignIdValue", this.campaignIdValue);
        Ds.a.f7333a.c(this, intentT, arrayList);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void d1(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y2().x1(new e1.AbstractC12456j.SendCriteoViewBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void l0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Parcelable parcelable;
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        y2().x1(new e1.AbstractC12456j.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
        Intent intent = getIntent();
        Qo.l lVarA = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", mk.l.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
                if (!(parcelableExtra instanceof mk.l)) {
                    parcelableExtra = null;
                }
                parcelable = (mk.l) parcelableExtra;
            }
            mk.l lVar = (mk.l) parcelable;
            if (lVar != null) {
                lVarA = Qo.K.a(lVar);
            }
        }
        if (lVarA instanceof l.BrowseCollection) {
            com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarY2 = y2();
            String stringExtra = getIntent().getStringExtra("KEY_CURATED_CAROUSEL");
            if (stringExtra == null) {
                stringExtra = "";
            }
            e1VarY2.x1(new e1.AbstractC12456j.SendTitle(stringExtra));
        }
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void m0(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        if (X2(Bj.o.f3013e)) {
            startActivity(Al.t.e(Al.t.f694a, this, null, Pp.c.f28365c, product, W2(), 2, null));
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        Parcelable parcelable;
        Intent intent;
        Parcelable parcelable2;
        l.k kVarC;
        super.onCreate(savedInstanceState);
        getLifecycle().a(y2());
        AbstractC4281s abstractC4281sK0 = AbstractC4281s.K0(getLayoutInflater());
        this.binding = abstractC4281sK0;
        if (abstractC4281sK0 == null) {
            Intrinsics.y("binding");
            abstractC4281sK0 = null;
        }
        setContentView(Zr.a.j(abstractC4281sK0.getRoot(), false, 1, null));
        bk.c.b(this, 0, com.meijer.mobile.meijer.M.f98600b, Al.m.f674a, 0, 8, null);
        androidx.view.I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilteredProductsActivity.M2(this.f106580a, (androidx.view.F) obj);
            }
        }, 3, null);
        this.cmpid = getIntent().getStringExtra("cmpid");
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializableExtra = intent2.getSerializableExtra("DEPARTMENT_BREADCRUMBS", HashMap.class);
        } else {
            Object serializableExtra2 = intent2.getSerializableExtra("DEPARTMENT_BREADCRUMBS");
            if (!(serializableExtra2 instanceof HashMap)) {
                serializableExtra2 = null;
            }
            serializableExtra = (HashMap) serializableExtra2;
        }
        this.departmentBreadcrumbs = (HashMap) serializableExtra;
        this.campaignIdValue = getIntent().getStringExtra("campaignIdValue");
        y2().Q1(this.cmpid);
        y2().O1(this.campaignIdValue);
        y2().S1(getIntent().getStringExtra("broseDepartmentCarouselAnalytics"));
        com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarY2 = y2();
        String stringExtra = getIntent().getStringExtra("homePageCarouselAnalytics");
        if (!getIntent().hasExtra("homePageCarouselAnalytics")) {
            stringExtra = null;
        }
        e1VarY2.P1(stringExtra);
        nu.l lVar = new nu.l();
        lVar.O(true);
        this.productsSection = lVar;
        C15949d<nu.g> c15949d = new C15949d<>();
        nu.l lVar2 = this.productsSection;
        if (lVar2 == null) {
            Intrinsics.y("productsSection");
            lVar2 = null;
        }
        c15949d.c(lVar2);
        this.filteredListAdapter = c15949d;
        if (getFeatureManager().e(AbstractC18227f.C.f170544h)) {
            y2().r1(w2(), this.departmentBreadcrumbs);
        }
        AbstractC4281s abstractC4281s = this.binding;
        if (abstractC4281s == null) {
            Intrinsics.y("binding");
            abstractC4281s = null;
        }
        RecyclerView recyclerView = abstractC4281s.f20938A;
        C15949d<nu.g> c15949d2 = this.filteredListAdapter;
        if (c15949d2 == null) {
            Intrinsics.y("filteredListAdapter");
            c15949d2 = null;
        }
        recyclerView.setAdapter(c15949d2);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        recyclerView.addOnScrollListener(this.scrollListener);
        Qo.l lVarW2 = w2();
        if (lVarW2 != null) {
            zj.c.b(v(), false, 1, null);
            if (lVarW2 instanceof l.BrowseCollection) {
                final String name = ((l.BrowseCollection) lVarW2).getCollection().getName();
                y2().R1(name);
                final boolean booleanExtra = getIntent().getBooleanExtra("SEE_MORE_ITEMS", true);
                final String stringExtra2 = getIntent().getStringExtra("KEY_CURATED_CAROUSEL");
                getAnalyticsEngine().h(C14476c.h("Collection:" + name), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FilteredProductsActivity.I2(name, this, stringExtra2, booleanExtra, (TrackingData) obj);
                    }
                });
            }
            if (lVarW2 instanceof l.Reward) {
                getAnalyticsEngine().h(C14476c.h("mPerks:Shoppable Rewards PLP"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FilteredProductsActivity.J2((TrackingData) obj);
                    }
                });
            }
        }
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FilteredProductsActivity.K2(this.f106905a);
            }
        }, 3, null);
        Qj.a.a(v(), com.meijer.mobile.meijer.T.f99051c4, t2());
        v().setOnMenuItemClickListener(new Rn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilteredProductsActivity.L2(this.f106909a, (a.AbstractC0730a) obj);
            }
        }));
        C16648k.d(C6031t.a(this), null, null, new f(null), 3, null);
        if (getFeatureManager().e(AbstractC18227f.T.f170559h)) {
            AbstractC4281s abstractC4281s2 = this.binding;
            if (abstractC4281s2 == null) {
                Intrinsics.y("binding");
                abstractC4281s2 = null;
            }
            abstractC4281s2.f20939B.setContent(ComposableLambdaKt.composableLambdaInstance(104300242, true, new d()));
        } else {
            AbstractC4281s abstractC4281s3 = this.binding;
            if (abstractC4281s3 == null) {
                Intrinsics.y("binding");
                abstractC4281s3 = null;
            }
            ComposeView filteredProductsListCompose = abstractC4281s3.f20939B;
            Intrinsics.i(filteredProductsListCompose, "filteredProductsListCompose");
            filteredProductsListCompose.setVisibility(8);
        }
        C16648k.d(C6031t.a(this), null, null, new e(null), 3, null);
        y2().p2();
        F2(w2());
        Intent intent3 = getIntent();
        Intrinsics.i(intent3, "getIntent(...)");
        if (i10 >= 33) {
            parcelable = (Parcelable) intent3.getParcelableExtra("product_sort_filter_deeplink", Uri.class);
        } else {
            Parcelable parcelableExtra = intent3.getParcelableExtra("product_sort_filter_deeplink");
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
            parcelable = (Uri) parcelableExtra;
        }
        Uri uri = (Uri) parcelable;
        if (uri == null || (intent = getIntent()) == null) {
            return;
        }
        if (i10 >= 33) {
            parcelable2 = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", mk.l.class);
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
            parcelable2 = (mk.l) (parcelableExtra2 instanceof mk.l ? parcelableExtra2 : null);
        }
        mk.l lVar3 = (mk.l) parcelable2;
        if (lVar3 == null || (kVarC = Qo.K.c(lVar3, uri)) == null) {
            return;
        }
        this.deeplinkFacets = kVarC;
        getIntent().removeExtra("product_sort_filter_deeplink");
    }

    @Override // Pj.g
    public void onCreateAccount() {
        startActivity(Al.f.f666a.a(this, getFeatureManager().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // Pj.g
    public void onSignIn() {
        startActivity(Al.k.b(this, false, null, 4000, null, null, null, 118, null));
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
        AbstractC4281s abstractC4281s = this.binding;
        if (abstractC4281s == null) {
            Intrinsics.y("binding");
            abstractC4281s = null;
        }
        MaterialToolbar toolbar = abstractC4281s.f20943F;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    public final Ro.a x2() {
        Ro.a aVar = this.productAnalytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("productAnalytics");
        return null;
    }

    public final pp.e z2() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("sponsorshipsDataStore");
        return null;
    }

    private final void A2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void B2() {
        if (getFeatureManager().e(AbstractC18227f.t0.f170605h)) {
            startActivity(Al.h.c(this, null, null, null, false, null, 62, null));
        } else {
            startActivity(Al.h.g(this, null, null, null, false, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ShowToast"})
    public final void D2(C14145a result) {
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
            AbstractC4281s abstractC4281s = this.binding;
            if (abstractC4281s == null) {
                Intrinsics.y("binding");
                abstractC4281s = null;
            }
            Snackbar.q0(abstractC4281s.getRoot(), i10, 0).t0(C17135b.f162001T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilteredProductsActivity.E2(this.f106924a, view);
                }
            }).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(FilteredProductsActivity filteredProductsActivity, View view) {
        filteredProductsActivity.startActivity(filteredProductsActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(Coupon coupon) {
        startActivity(Cl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(FilteredProductsActivity filteredProductsActivity) {
        if (!filteredProductsActivity.onNavigateUp()) {
            filteredProductsActivity.finish();
        }
        bk.c.b(filteredProductsActivity, 1, com.meijer.mobile.meijer.M.f98599a, com.meijer.mobile.meijer.M.f98601c, 0, 8, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2(ProductCardDecorator itemClicked, int position) {
        y2().x1(new e1.AbstractC12456j.ItemSelectedAction(itemClicked, this.searchType, position));
        ProductSponsorship sponsorship = itemClicked.getSponsorship();
        if (sponsorship != null && sponsorship.getSponsorSource() == Ho.b.f13065c) {
            y2().x1(new e1.AbstractC12456j.SendCriteoClickBeacon(itemClicked.getProduct().getBeaconInfo().e(), itemClicked.getProduct().getBeaconInfo().getFormatLevelOnClickBeacon(), null, null, 12, null));
        }
    }

    private final void O2(Oj.a loadingState) {
        nu.l lVar = null;
        if (!loadingState.getIsLoading()) {
            nu.l lVar2 = this.productsSection;
            if (lVar2 == null) {
                Intrinsics.y("productsSection");
            } else {
                lVar = lVar2;
            }
            lVar.L();
            return;
        }
        nu.l lVar3 = this.productsSection;
        if (lVar3 == null) {
            Intrinsics.y("productsSection");
        } else {
            lVar = lVar3;
        }
        lVar.M(new g(loadingState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R2(FilteredProductsActivity filteredProductsActivity) {
        filteredProductsActivity.y2().x1(new e1.AbstractC12456j.CollapseQuantityStepperAction(0, 0));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(FilteredProductsActivity filteredProductsActivity, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        filteredProductsActivity.y2().onAction(new a.Clip(Ok.e.a(coupon.getOfferId()), new TrackingData(C14476c.a("coupon clip"), CollectionsKt.s(C14476c.c("category Page")))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String W2() {
        Parcelable parcelable;
        Intent intent = getIntent();
        Qo.l lVarA = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", mk.l.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
                if (!(parcelableExtra instanceof mk.l)) {
                    parcelableExtra = null;
                }
                parcelable = (mk.l) parcelableExtra;
            }
            mk.l lVar = (mk.l) parcelable;
            if (lVar != null) {
                lVarA = Qo.K.a(lVar);
            }
        }
        if (lVarA instanceof l.BrowseCollection) {
            return "Collection:" + ((l.BrowseCollection) lVarA).getCollection().getName();
        }
        if (lVarA instanceof l.Department) {
            return "tierName " + ((l.Department) lVarA).getDepartment().getName();
        }
        if (lVarA instanceof l.Search) {
            return "product search page";
        }
        return "Filtered Products page";
    }

    private final boolean X2(int errorMessageId) {
        if (!getUserManager().b()) {
            new Pj.f(this, errorMessageId, this).g();
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(FilteredProductsActivity filteredProductsActivity, View view) {
        filteredProductsActivity.y2().x1(e1.AbstractC12456j.c.a.f111231a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6386a q2(FilteredProductsActivity filteredProductsActivity) {
        C6386a c6386aE = C6386a.e(filteredProductsActivity);
        c6386aE.V(false);
        c6386aE.N(C17134a.f161960c);
        Intrinsics.i(c6386aE, "apply(...)");
        return c6386aE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String r2(final ts.ProductCardDecorator r7, int r8) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.r2(ts.a, int):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Qo.l w2() {
        Parcelable parcelable;
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", mk.l.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
                if (!(parcelableExtra instanceof mk.l)) {
                    parcelableExtra = null;
                }
                parcelable = (mk.l) parcelableExtra;
            }
            mk.l lVar = (mk.l) parcelable;
            if (lVar != null) {
                return Qo.K.a(lVar);
            }
        }
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12104p0.b
    public void d0() {
        y2().x1(e1.AbstractC12456j.f.f111238a);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        int x10;
        if (!getFeatureManager().e(AbstractC18227f.T.f170559h)) {
            com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarY2 = y2();
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
        FSPage fSPageA;
        super.onResume();
        Qo.l lVarW2 = w2();
        if (lVarW2 != null && (fSPageA = C5611a.a(lVarW2)) != null) {
            fSPageA.start();
        }
    }
}
