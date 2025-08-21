package com.meijer.mobile.meijer.activity.find;

import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Il.FulfillmentBarDecorator;
import Ki.LocalThemeScope;
import Nn.AbstractC4277p1;
import Nn.AbstractC4286s;
import Nn.Z1;
import Nn.r3;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.l;
import Sn.a;
import V2.CreationExtras;
import an.C5747t;
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
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import bn.C6396a;
import com.fullstory.FSPage;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.activity.find.C12229p0;
import com.meijer.mobile.meijer.activity.find.FilteredProductsActivity;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.C12607o0;
import com.meijer.mobile.meijer.activity.personalized.modals.C12616t0;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import ee.C13790a;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import ku.AbstractC15424a;
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16553F;
import ss.InterfaceC17146a;
import tr.C17283a;
import tr.C17284b;
import ts.ProductCardDecorator;
import vs.ProductListDecorator;
import yk.C18328d;
import ys.C18371a;
import ys.C18372b;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 Ë\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001WB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u0010\u0007J\u000f\u00103\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u0007J!\u00108\u001a\u0004\u0018\u0001072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010DH\u0014¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0014¢\u0006\u0004\bH\u0010\u0007J\u0015\u0010I\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bI\u0010,J'\u0010L\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\u0006\u0010K\u001a\u00020J2\u0006\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ'\u0010R\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bT\u0010SJ\u001b\u0010W\u001a\u00020\n2\n\u0010V\u001a\u000607j\u0002`UH\u0016¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b]\u0010\\J\u001f\u0010^\u001a\u00020\u000f2\u0006\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020>H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u000fH\u0016¢\u0006\u0004\bc\u0010\u0007J\u000f\u0010d\u001a\u00020\u000fH\u0016¢\u0006\u0004\bd\u0010\u0007J\u0019\u0010g\u001a\u00020\n2\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u000fH\u0016¢\u0006\u0004\bi\u0010\u0007R\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0087\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010K\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009a\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R;\u0010ª\u0001\u001a$\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207\u0018\u00010¦\u0001j\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207\u0018\u0001`§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010¯\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¬\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001e\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010µ\u0001R\u001f\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010µ\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u0084\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ç\u0001\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010Ê\u0001\u001a\u00030È\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010É\u0001¨\u0006Ì\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/FilteredProductsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "LQj/g;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "<init>", "()V", "", "errorMessageId", "", "Y2", "(I)Z", "Lg/a;", "result", "", "E2", "(Lg/a;)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "U2", "(IIIILPk/a;)V", "I2", "(LPk/a;)V", "searchResultsCount", "LQo/l;", "productQuery", "o2", "(ILQo/l;)V", "", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0;", "products", "Lcom/meijer/mobile/meijer/activity/personalized/modals/o0;", "ads", "Lku/a;", "H2", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "LPj/a;", "loadingState", "P2", "(LPj/a;)V", "LQo/l$k;", "D2", "(LQo/l$k;)V", "G2", "(LQo/l;)V", "C2", "B2", "Lts/a;", "itemClicked", "position", "", "s2", "(Lts/a;I)Ljava/lang/String;", "X2", "()Ljava/lang/String;", "O2", "(Lts/a;I)V", "LCo/h;", "productToAdd", "", "quantity", "R2", "(LCo/h;D)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Q2", "Landroidx/databinding/p;", "binding", "c0", "(Lts/a;Landroidx/databinding/p;I)V", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "o0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "S", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "W0", "T2", "(Ljava/lang/String;Ljava/lang/String;)V", "product", "p0", "(LCo/h;)V", "onCreateAccount", "onSignIn", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "f0", "Lwr/f;", "s", "Lwr/f;", "v2", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "LRo/a;", "t", "LRo/a;", "y2", "()LRo/a;", "setProductAnalytics", "(LRo/a;)V", "productAnalytics", "Lpp/e;", "u", "Lpp/e;", "A2", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "v", "Lkotlin/Lazy;", "z2", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "productsViewModel", "LIl/b;", "w", "w2", "()LIl/b;", "fulfillmentViewModel", "LNn/s;", "x", "LNn/s;", "Lju/d;", "Lju/g;", "y", "Lju/d;", "filteredListAdapter", "Lju/l;", "z", "Lju/l;", "productsSection", "A", "Ljava/lang/String;", "cmpid", "B", "campaignIdValue", "Lcom/google/android/material/snackbar/Snackbar;", "C", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "LPp/b;", "D", "LPp/b;", "searchType", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "E", "Ljava/util/HashMap;", "departmentBreadcrumbs", "F", "Z", "isDepartmentAnalyticsSent", "G", "isFallbackWhiteLabel", "H", "LQo/l$k;", "deeplinkFacets", "Lg/c;", "I", "Lg/c;", "filterDepartmentResultRegistrationLauncher", "J", "filterCollectionResultRegistrationLauncher", "Landroid/content/Intent;", "K", "substitutionResultLauncher", "Lcom/meijer/mobile/meijer/activity/find/p0;", "L", "Lcom/meijer/mobile/meijer/activity/find/p0;", "scrollListener", "Lee/a;", "M", "u2", "()Lee/a;", "cartBadge", "x2", "()LQo/l;", "initialProductQuery", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "N", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FilteredProductsActivity extends Hilt_FilteredProductsActivity implements Bj.b, C12616t0.a, Qj.g, C12229p0.b {

    /* renamed from: O, reason: collision with root package name */
    public static final int f107197O = 8;

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
    private boolean isFallbackWhiteLabel;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private l.k deeplinkFacets;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Ro.a productAnalytics;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public pp.e sponsorshipsDataStore;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AbstractC4286s binding;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> filteredListAdapter;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private ju.l productsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy productsViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.personalized.modals.e1.class), new i(this), new h(this), new j(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentViewModel = new androidx.view.e0(Reflection.b(Il.b.class), new l(this), new k(this), new m(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f26238a;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Qo.l> filterDepartmentResultRegistrationLauncher = registerForActivityResult(new com.meijer.mobile.meijer.activity.find.filter.b(), new c());

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Qo.l> filterCollectionResultRegistrationLauncher = registerForActivityResult(new com.meijer.mobile.meijer.activity.find.filter.a(), new b());

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new n());

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final C12229p0 scrollListener = new C12229p0(this, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilteredProductsActivity.S2(this.f107767a);
        }
    });

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilteredProductsActivity.r2(this.f107775a);
        }
    });

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
            return new FunctionReferenceImpl(1, FilteredProductsActivity.this, FilteredProductsActivity.class, "handleFilterResultRegistrationResult", "handleFilterResultRegistrationResult(Lcom/meijer/mobile/product/model/search/query/ProductQuery$SortableAndFilterable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(l.k kVar) {
            FilteredProductsActivity.this.D2(kVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14275b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(l.k kVar) {
            FilteredProductsActivity.this.D2(kVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e1.ViewState f107222a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilteredProductsActivity f107223b;

            a(e1.ViewState viewState, FilteredProductsActivity filteredProductsActivity) {
                this.f107222a = viewState;
                this.f107223b = filteredProductsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(FilteredProductsActivity filteredProductsActivity, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                filteredProductsActivity.z2().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(FilteredProductsActivity filteredProductsActivity, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                filteredProductsActivity.z2().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(FilteredProductsActivity filteredProductsActivity, InterfaceC17146a it) {
                Intrinsics.j(it, "it");
                if (it instanceof InterfaceC17146a.FindSimilarItems) {
                    filteredProductsActivity.p0(((InterfaceC17146a.FindSimilarItems) it).getProduct());
                } else if (it instanceof InterfaceC17146a.ProductItemClicked) {
                    InterfaceC17146a.ProductItemClicked productItemClicked = (InterfaceC17146a.ProductItemClicked) it;
                    filteredProductsActivity.O2(productItemClicked.getItemClicked(), productItemClicked.getPosition());
                } else if (it instanceof InterfaceC17146a.SendCriteoLoadBeacon) {
                    InterfaceC17146a.SendCriteoLoadBeacon sendCriteoLoadBeacon = (InterfaceC17146a.SendCriteoLoadBeacon) it;
                    filteredProductsActivity.T2(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon());
                } else if (it instanceof InterfaceC17146a.SendCriteoOnViewBeacon) {
                    InterfaceC17146a.SendCriteoOnViewBeacon sendCriteoOnViewBeacon = (InterfaceC17146a.SendCriteoOnViewBeacon) it;
                    filteredProductsActivity.d1(sendCriteoOnViewBeacon.a(), sendCriteoOnViewBeacon.getFormatLevelBeacon());
                } else {
                    if (!(it instanceof InterfaceC17146a.UpdateEntry)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC17146a.UpdateEntry updateEntry = (InterfaceC17146a.UpdateEntry) it;
                    filteredProductsActivity.R2(updateEntry.getProductToAdd(), updateEntry.getQuantity());
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                Coupon coupon = product.getCoupon();
                if (coupon != null) {
                    filteredProductsActivity.z2().onAction(new a.Clip(Pk.e.a(coupon.getOfferId()), C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.u((TrackingData) obj);
                        }
                    })));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit u(TrackingData TrackingData) {
                Intrinsics.j(TrackingData, "$this$TrackingData");
                TrackingData.n("Product Search Results Page");
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                Coupon coupon = product.getCoupon();
                if (coupon != null) {
                    filteredProductsActivity.I2(coupon);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(FilteredProductsActivity filteredProductsActivity, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                filteredProductsActivity.z2().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                filteredProductsActivity.p0(product.getProduct());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(FilteredProductsActivity filteredProductsActivity, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                filteredProductsActivity.z2().A1(new e1.AbstractC12581j.StepperStateChangedAction(product.getProduct().getCode(), 0.0d, new Rect()));
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                q(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
                    ComposerKt.U(-70410904, i11, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FilteredProductsActivity.kt:533)");
                }
                List<ProductListDecorator> listQ = this.f107222a.q();
                boolean z10 = (this.f107222a.getLoadingState() instanceof a.Paging) && this.f107222a.getLoadingState().getIsLoading();
                GoogleAdData googleAdSlot1 = this.f107222a.getGoogleAdSlot1();
                composer.startReplaceGroup(1054665799);
                AdManagerAdView adManagerAdViewS3 = null;
                if (googleAdSlot1 == null) {
                    adManagerAdViewS = null;
                } else {
                    final FilteredProductsActivity filteredProductsActivity = this.f107223b;
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
                    adManagerAdViewS = sr.p.S(googleAdSlot1, (Function1) objB, null, composer, GoogleAdData.f134248f, 4);
                }
                composer.P();
                GoogleAdData googleAdSlot2 = this.f107222a.getGoogleAdSlot2();
                composer.startReplaceGroup(1054675911);
                if (googleAdSlot2 == null) {
                    adManagerAdViewS2 = null;
                } else {
                    final FilteredProductsActivity filteredProductsActivity2 = this.f107223b;
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
                    adManagerAdViewS2 = sr.p.S(googleAdSlot2, (Function1) objB2, null, composer, GoogleAdData.f134248f, 4);
                }
                composer.P();
                GoogleAdData googleAdSlot3 = this.f107222a.getGoogleAdSlot3();
                composer.startReplaceGroup(1054686023);
                if (googleAdSlot3 != null) {
                    final FilteredProductsActivity filteredProductsActivity3 = this.f107223b;
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
                    adManagerAdViewS3 = sr.p.S(googleAdSlot3, (Function1) objB3, null, composer, GoogleAdData.f134248f, 4);
                }
                AdManagerAdView adManagerAdView = adManagerAdViewS3;
                composer.P();
                boolean zE = this.f107223b.getFeatureManager().e(AbstractC18503f.C18509g.f172878h);
                boolean zE2 = this.f107223b.getFeatureManager().e(AbstractC18503f.k0.f172887h);
                boolean zE3 = this.f107223b.getFeatureManager().e(AbstractC18503f.l0.f172889h);
                boolean zE4 = this.f107223b.getFeatureManager().e(AbstractC18503f.C18526x.f172912h);
                boolean zB = this.f107223b.getUserManager().b();
                composer.startReplaceGroup(5004770);
                boolean zD4 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity4 = this.f107223b;
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
                boolean zD5 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity5 = this.f107223b;
                Object objB5 = composer.B();
                if (zD5 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FilteredProductsActivity.d.a.s(filteredProductsActivity5, (InterfaceC17146a) obj);
                        }
                    };
                    composer.t(objB5);
                }
                Function1 function1 = (Function1) objB5;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD6 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity6 = this.f107223b;
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
                boolean zD7 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity7 = this.f107223b;
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
                boolean zD8 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity8 = this.f107223b;
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
                boolean zD9 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity9 = this.f107223b;
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
                boolean zD10 = composer.D(this.f107223b);
                final FilteredProductsActivity filteredProductsActivity10 = this.f107223b;
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
                C5747t.G(AdsTheme, listQ, function0, function1, function12, function13, function14, null, function15, (Function0) objB10, null, z10, null, adManagerAdViewS, adManagerAdViewS2, adManagerAdView, zE, zE2, zE3, zE4, false, zB, composer, LocalThemeScope.f17314g | (i11 & 14), 0, 0, 526912);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(FilteredProductsActivity filteredProductsActivity) {
                filteredProductsActivity.z2().A1(e1.AbstractC12581j.f.f112103a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(FilteredProductsActivity filteredProductsActivity) {
                filteredProductsActivity.z2().A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(0, 0));
                return Unit.f143329a;
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
                ComposerKt.U(104300242, i10, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous> (FilteredProductsActivity.kt:531)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-70410904, true, new a((e1.ViewState) o1.b(FilteredProductsActivity.this.z2().o1(), null, composer, 0, 1).getValue(), FilteredProductsActivity.this), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$11", f = "FilteredProductsActivity.kt", l = {621}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107224a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$11$1", f = "FilteredProductsActivity.kt", l = {622}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107226a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilteredProductsActivity f107227b;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$11$1$1", f = "FilteredProductsActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$e$a$a, reason: collision with other inner class name */
            static final class C1595a extends SuspendLambda implements Function2<e1.ViewState, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f107228a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f107229b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ FilteredProductsActivity f107230c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1595a(FilteredProductsActivity filteredProductsActivity, Continuation<? super C1595a> continuation) {
                    super(2, continuation);
                    this.f107230c = filteredProductsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1595a c1595a = new C1595a(this.f107230c, continuation);
                    c1595a.f107229b = obj;
                    return c1595a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                    return ((C1595a) create(viewState, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 844
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.e.a.C1595a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(Pair pair, GoogleAdAnalytics googleAdAnalytics) {
                    ((com.meijer.mobile.meijer.activity.personalized.modals.e1) pair.d()).A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                    return Unit.f143329a;
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
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(FilteredProductsActivity filteredProductsActivity, ProductListDecorator productListDecorator) {
                    com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarZ2 = filteredProductsActivity.z2();
                    Coupon coupon = productListDecorator.getCoupon();
                    Intrinsics.g(coupon);
                    e1VarZ2.onAction(new a.Clip(Pk.e.a(coupon.getOfferId()), new TrackingData(C14756c.a("coupon clip"), CollectionsKt.s(C14756c.c("category Page")))));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(FilteredProductsActivity filteredProductsActivity, ProductListDecorator productListDecorator) {
                    Coupon coupon = productListDecorator.getCoupon();
                    Intrinsics.g(coupon);
                    filteredProductsActivity.I2(coupon);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ProductSponsorship x(FilteredProductsActivity filteredProductsActivity, String str) {
                    return filteredProductsActivity.A2().a(str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FilteredProductsActivity filteredProductsActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107227b = filteredProductsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f107227b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107226a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    pv.P<e1.ViewState> pO1 = this.f107227b.z2().o1();
                    C1595a c1595a = new C1595a(this.f107227b, null);
                    this.f107226a = 1;
                    if (C16563h.k(pO1, c1595a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107224a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                FilteredProductsActivity filteredProductsActivity = FilteredProductsActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55501c;
                a aVar = new a(filteredProductsActivity, null);
                this.f107224a = 1;
                if (C6136J.b(filteredProductsActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$9", f = "FilteredProductsActivity.kt", l = {331}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107231a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$9$1", f = "FilteredProductsActivity.kt", l = {332}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107233a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilteredProductsActivity f107234b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FilteredProductsActivity filteredProductsActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107234b = filteredProductsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f107234b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$onCreate$9$1$1", f = "FilteredProductsActivity.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$f$a$a, reason: collision with other inner class name */
            static final class C1596a extends SuspendLambda implements Function2<e1.AbstractC12585n, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f107235a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f107236b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ FilteredProductsActivity f107237c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$f$a$a$a, reason: collision with other inner class name */
                static final class C1597a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ FilteredProductsActivity f107238a;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity$f$a$a$a$a, reason: collision with other inner class name */
                    static final class C1598a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ FilteredProductsActivity f107239a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ z1<FulfillmentBarDecorator> f107240b;

                        C1598a(FilteredProductsActivity filteredProductsActivity, z1<FulfillmentBarDecorator> z1Var) {
                            this.f107239a = filteredProductsActivity;
                            this.f107240b = z1Var;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit c(FilteredProductsActivity filteredProductsActivity) {
                            filteredProductsActivity.startActivity(OrderOptionsActivity.INSTANCE.b(filteredProductsActivity, filteredProductsActivity.x2() instanceof l.Department ? "department tier products page" : ""));
                            return Unit.f143329a;
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
                                ComposerKt.U(-1218715439, i10, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilteredProductsActivity.kt:513)");
                            }
                            if (this.f107239a.getUserManager().b()) {
                                FulfillmentBarDecorator value = this.f107240b.getValue();
                                composer.startReplaceGroup(5004770);
                                boolean zD = composer.D(this.f107239a);
                                final FilteredProductsActivity filteredProductsActivity = this.f107239a;
                                Object objB = composer.B();
                                if (zD || objB == Composer.INSTANCE.a()) {
                                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.J
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FilteredProductsActivity.f.a.C1596a.C1597a.C1598a.c(filteredProductsActivity);
                                        }
                                    };
                                    composer.t(objB);
                                }
                                composer.P();
                                Il.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | (FulfillmentBarDecorator.f14849m << 3), 2);
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                            b(localThemeScope, composer, num.intValue());
                            return Unit.f143329a;
                        }
                    }

                    C1597a(FilteredProductsActivity filteredProductsActivity) {
                        this.f107238a = filteredProductsActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1738142976, i10, -1, "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilteredProductsActivity.kt:511)");
                        }
                        Ki.K.b(null, ComposableLambdaKt.c(-1218715439, true, new C1598a(this.f107238a, o1.b(this.f107238a.w2().n(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1596a(FilteredProductsActivity filteredProductsActivity, Continuation<? super C1596a> continuation) {
                    super(2, continuation);
                    this.f107237c = filteredProductsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1596a c1596a = new C1596a(this.f107237c, continuation);
                    c1596a.f107236b = obj;
                    return c1596a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e1.AbstractC12585n abstractC12585n, Continuation<? super Unit> continuation) {
                    return ((C1596a) create(abstractC12585n, continuation)).invokeSuspend(Unit.f143329a);
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
                public static final void s(FilteredProductsActivity filteredProductsActivity, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    filteredProductsActivity.z2().A1(new e1.AbstractC12581j.UserAcceptAddToCartAction(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void t(FilteredProductsActivity filteredProductsActivity, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    filteredProductsActivity.z2().A1(new e1.AbstractC12581j.ResetActiveStepper(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b().getProductCode()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void u(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    String str;
                    IntrinsicsKt.f();
                    if (this.f107235a == 0) {
                        ResultKt.b(obj);
                        final e1.AbstractC12585n abstractC12585n = (e1.AbstractC12585n) this.f107236b;
                        AbstractC4286s abstractC4286s = null;
                        if (abstractC12585n instanceof e1.AbstractC12585n.ProductListErrorEvent) {
                            e1.AbstractC12585n.ProductListErrorEvent productListErrorEvent = (e1.AbstractC12585n.ProductListErrorEvent) abstractC12585n;
                            C15485b message = new C15485b(this.f107237c).setCancelable(false).setMessage(productListErrorEvent.getRetrofitException().c(this.f107237c));
                            String string = this.f107237c.getString(yr.Q.f171761b);
                            final FilteredProductsActivity filteredProductsActivity = this.f107237c;
                            message.setPositiveButton(string, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.E
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    FilteredProductsActivity.f.a.C1596a.q(filteredProductsActivity, dialogInterface, i10);
                                }
                            }).show();
                            qw.a.INSTANCE.b(productListErrorEvent.getRetrofitException());
                        } else if (abstractC12585n instanceof e1.AbstractC12585n.ProductListSuccess) {
                            qw.a.INSTANCE.a(this.f107237c.getString(((e1.AbstractC12585n.ProductListSuccess) abstractC12585n).getMessageResId()), new Object[0]);
                        } else if (!Intrinsics.e(abstractC12585n, e1.AbstractC12585n.x.f112237a) && !Intrinsics.e(abstractC12585n, e1.AbstractC12585n.g.f112210a) && !(abstractC12585n instanceof e1.AbstractC12585n.ShoppingListUpdateFailedEvent) && !(abstractC12585n instanceof e1.AbstractC12585n.AddToShoppingListSuccessEvent)) {
                            if (abstractC12585n instanceof e1.AbstractC12585n.CartUpdateSuccessEvent) {
                                AbstractC4286s abstractC4286s2 = this.f107237c.binding;
                                if (abstractC4286s2 == null) {
                                    Intrinsics.x("binding");
                                    abstractC4286s2 = null;
                                }
                                e1.AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12585n.CartUpdateSuccessEvent) abstractC12585n;
                                Snackbar snackbarQ0 = Snackbar.q0(abstractC4286s2.getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0);
                                int actionResId = cartUpdateSuccessEvent.getActionResId();
                                final FilteredProductsActivity filteredProductsActivity2 = this.f107237c;
                                snackbarQ0.t0(actionResId, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.F
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FilteredProductsActivity.f.a.C1596a.r(filteredProductsActivity2, view);
                                    }
                                }).c0();
                            } else if (abstractC12585n instanceof e1.AbstractC12585n.OpenLowStockScreenEvent) {
                                this.f107237c.substitutionResultLauncher.a(Bl.t.e(Bl.t.f3152a, this.f107237c, ((e1.AbstractC12585n.OpenLowStockScreenEvent) abstractC12585n).getDecorator(), Pp.c.f26248d, null, this.f107237c.X2(), 8, null));
                            } else if (!(abstractC12585n instanceof e1.AbstractC12585n.ViewItemInShoppingListEvent) && !(abstractC12585n instanceof e1.AbstractC12585n.ViewProductDetailsEvent) && !(abstractC12585n instanceof e1.AbstractC12585n.UpdateProductsInfoEvent)) {
                                if (abstractC12585n instanceof e1.AbstractC12585n.UpdateToCartFailedEvent) {
                                    AbstractC4286s abstractC4286s3 = this.f107237c.binding;
                                    if (abstractC4286s3 == null) {
                                        Intrinsics.x("binding");
                                        abstractC4286s3 = null;
                                    }
                                    View root = abstractC4286s3.getRoot();
                                    String string2 = this.f107237c.getResources().getString(((e1.AbstractC12585n.UpdateToCartFailedEvent) abstractC12585n).getMessageResId());
                                    Intrinsics.i(string2, "getString(...)");
                                    Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string2, 0, null, null), 0);
                                    Intrinsics.i(snackbarR0, "make(...)");
                                    Wj.b.b(snackbarR0).c0();
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.ShowChokingWarningDialogEvent) {
                                    AbstractC4286s abstractC4286s4 = this.f107237c.binding;
                                    if (abstractC4286s4 == null) {
                                        Intrinsics.x("binding");
                                        abstractC4286s4 = null;
                                    }
                                    C15485b c15485b = new C15485b(abstractC4286s4.getRoot().getContext(), Cj.p.f5105d);
                                    e1.AbstractC12585n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n;
                                    C15485b message2 = c15485b.setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Cj.i.f4711J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody());
                                    int positiveButtonText = showChokingWarningDialogEvent.a().getPositiveButtonText();
                                    final FilteredProductsActivity filteredProductsActivity3 = this.f107237c;
                                    C15485b positiveButton = message2.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.G
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            FilteredProductsActivity.f.a.C1596a.s(filteredProductsActivity3, abstractC12585n, dialogInterface, i10);
                                        }
                                    });
                                    int negativeButtonText = showChokingWarningDialogEvent.a().getNegativeButtonText();
                                    final FilteredProductsActivity filteredProductsActivity4 = this.f107237c;
                                    positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.H
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            FilteredProductsActivity.f.a.C1596a.t(filteredProductsActivity4, abstractC12585n, dialogInterface, i10);
                                        }
                                    }).show();
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.BubbleFacetsToFilterAndSort) {
                                    l.k kVar = this.f107237c.deeplinkFacets;
                                    if (kVar != null) {
                                        FilteredProductsActivity filteredProductsActivity5 = this.f107237c;
                                        e1.AbstractC12585n.BubbleFacetsToFilterAndSort bubbleFacetsToFilterAndSort = (e1.AbstractC12585n.BubbleFacetsToFilterAndSort) abstractC12585n;
                                        if (!bubbleFacetsToFilterAndSort.getQuery().c1().isEmpty()) {
                                            filteredProductsActivity5.z2().A1(new e1.AbstractC12581j.SetFilterAndSortOptions(Qo.K.b(kVar, bubbleFacetsToFilterAndSort.getQuery())));
                                        }
                                    }
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.ShowError) {
                                    e1.AbstractC12585n.ShowError showError = (e1.AbstractC12585n.ShowError) abstractC12585n;
                                    new C15485b(this.f107237c).setCancelable(false).setTitle(ck.d.a(this.f107237c, showError.getTitle())).setMessage(ck.d.a(this.f107237c, showError.getMessage())).setPositiveButton(ck.d.a(this.f107237c, showError.getPositiveButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.I
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            FilteredProductsActivity.f.a.C1596a.u(dialogInterface, i10);
                                        }
                                    }).show();
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.LaunchFilterAndSortEvent) {
                                    e1.AbstractC12585n.LaunchFilterAndSortEvent launchFilterAndSortEvent = (e1.AbstractC12585n.LaunchFilterAndSortEvent) abstractC12585n;
                                    if (launchFilterAndSortEvent.getQuery() instanceof l.Department) {
                                        this.f107237c.filterDepartmentResultRegistrationLauncher.a(launchFilterAndSortEvent.getQuery());
                                    } else if (launchFilterAndSortEvent.getQuery() instanceof l.BrowseCollection) {
                                        this.f107237c.filterCollectionResultRegistrationLauncher.a(launchFilterAndSortEvent.getQuery());
                                    }
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.ClipCouponFailedEvent) {
                                    e1.AbstractC12585n.ClipCouponFailedEvent clipCouponFailedEvent = (e1.AbstractC12585n.ClipCouponFailedEvent) abstractC12585n;
                                    this.f107237c.U2(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon());
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.ShowFreeItemsSnackbar) {
                                    AbstractC4286s abstractC4286s5 = this.f107237c.binding;
                                    if (abstractC4286s5 == null) {
                                        Intrinsics.x("binding");
                                        abstractC4286s5 = null;
                                    }
                                    View root2 = abstractC4286s5.getRoot();
                                    Resources resources = this.f107237c.getResources();
                                    Intrinsics.i(resources, "getResources(...)");
                                    Snackbar snackbarR02 = Snackbar.r0(root2, ck.d.b(resources, ((e1.AbstractC12585n.ShowFreeItemsSnackbar) abstractC12585n).getMessage()), -2);
                                    Intrinsics.i(snackbarR02, "make(...)");
                                    Snackbar snackbarC = Wj.b.c(snackbarR02);
                                    snackbarC.c0();
                                    this.f107237c.currentSnackbar = snackbarC;
                                } else if (abstractC12585n instanceof e1.AbstractC12585n.e) {
                                    Snackbar snackbar = this.f107237c.currentSnackbar;
                                    if (snackbar != null) {
                                        snackbar.A();
                                    }
                                } else if (!(abstractC12585n instanceof e1.AbstractC12585n.j) && !(abstractC12585n instanceof e1.AbstractC12585n.SubstitutionFailureEvent) && !(abstractC12585n instanceof e1.AbstractC12585n.m)) {
                                    if (abstractC12585n instanceof e1.AbstractC12585n.ShowPlpEvent) {
                                        Bl.g featureEntryPoint = this.f107237c.getFeatureEntryPoint();
                                        ProductFullDetails product = ((e1.AbstractC12585n.ShowPlpEvent) abstractC12585n).getProduct();
                                        if (this.f107237c.isFallbackWhiteLabel) {
                                            str = this.f107237c.z2().getWhiteLabelFallbackCarousel() + ": PLP: Product Clicked";
                                        } else {
                                            str = null;
                                        }
                                        Intent intentT = Bl.g.t(featureEntryPoint, product, true, false, str, 4, null);
                                        intentT.putExtra("campaignIdValue", this.f107237c.campaignIdValue);
                                        this.f107237c.startActivity(intentT);
                                    } else if (!Intrinsics.e(abstractC12585n, e1.AbstractC12585n.i.f112213a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            }
                        }
                        AbstractC4286s abstractC4286s6 = this.f107237c.binding;
                        if (abstractC4286s6 == null) {
                            Intrinsics.x("binding");
                        } else {
                            abstractC4286s = abstractC4286s6;
                        }
                        abstractC4286s.f22272C.setContent(ComposableLambdaKt.composableLambdaInstance(-1738142976, true, new C1597a(this.f107237c)));
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
                int i10 = this.f107233a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<e1.AbstractC12585n> events = this.f107234b.z2().getEvents();
                    C1596a c1596a = new C1596a(this.f107234b, null);
                    this.f107233a = 1;
                    if (C16563h.k(events, c1596a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107231a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                FilteredProductsActivity filteredProductsActivity = FilteredProductsActivity.this;
                AbstractC6165l.b bVar = AbstractC6165l.b.f55501c;
                a aVar = new a(filteredProductsActivity, null);
                this.f107231a = 1;
                if (C6136J.b(filteredProductsActivity, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/find/FilteredProductsActivity$g", "Lku/a;", "LNn/Z1;", "viewBinding", "", "position", "", "A", "(LNn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends AbstractC15424a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Pj.a f107241e;

        g(Pj.a aVar) {
            this.f107241e = aVar;
        }

        @Override // ku.AbstractC15424a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f21767z.U(this.f107241e.getMessage(), this.f107241e.getIsLoading());
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107242f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f107242f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107242f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107243f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f107243f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107243f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107244f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107245g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107244f = function0;
            this.f107245g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107244f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107245g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f107246f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107246f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107247f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f107247f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107247f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107248f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107249g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107248f = function0;
            this.f107249g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107248f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107249g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n implements InterfaceC14275b, FunctionAdapter {
        n() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            FilteredProductsActivity.this.E2(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q2() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(l.k productQuery) {
        if (productQuery != null) {
            this.deeplinkFacets = null;
            z2().A1(new e1.AbstractC12581j.SetFilterAndSortOptions(productQuery));
        }
    }

    private final void G2(Qo.l productQuery) {
        if (productQuery == null) {
            throw new IllegalArgumentException("Required ProductQuery was missing");
        }
        com.meijer.mobile.meijer.activity.personalized.modals.e1.c2(z2(), productQuery, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AbstractC15424a<?>> H2(List<C12616t0> products, List<C12607o0> ads) {
        C12607o0 c12607o0;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : products) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            C12616t0 c12616t0 = (C12616t0) obj;
            if (i10 == 0 && !ads.isEmpty()) {
                C12607o0 c12607o02 = (C12607o0) CollectionsKt.v0(ads, 0);
                if (c12607o02 != null) {
                    arrayList.add(c12607o02);
                }
            } else if (i10 == 10 && ads.size() > 1) {
                C12607o0 c12607o03 = (C12607o0) CollectionsKt.v0(ads, 1);
                if (c12607o03 != null) {
                    arrayList.add(c12607o03);
                }
            } else if (i10 == 20 && ads.size() > 2 && (c12607o0 = (C12607o0) CollectionsKt.v0(ads, 3)) != null) {
                arrayList.add(c12607o0);
            }
            arrayList.add(c12616t0);
            i10 = i11;
        }
        return CollectionsKt.j1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(String str, FilteredProductsActivity filteredProductsActivity, String str2, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("collections");
        track.o("collection");
        track.h("hier1", "Collection|" + str);
        String stringExtra = filteredProductsActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION");
        if (stringExtra != null && !StringsKt.s0(stringExtra)) {
            track.p(filteredProductsActivity.getIntent().getStringExtra("com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"));
        } else if (str2 != null && !StringsKt.s0(str2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(z10 ? ": See more items" : ": View All");
            track.p(sb2.toString());
        }
        String str3 = filteredProductsActivity.cmpid;
        if (str3 != null) {
            track.h("cmpid", str3);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(FilteredProductsActivity filteredProductsActivity, a.AbstractC0780a item) {
        Intrinsics.j(item, "item");
        if (Intrinsics.e(item, a.AbstractC0780a.C0781a.f34922a)) {
            filteredProductsActivity.C2();
        } else {
            if (!Intrinsics.e(item, a.AbstractC0780a.b.f34923a)) {
                throw new NoWhenBranchMatchedException();
            }
            filteredProductsActivity.B2();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(FilteredProductsActivity filteredProductsActivity, androidx.view.F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        filteredProductsActivity.finish();
        ck.c.b(filteredProductsActivity, 1, com.meijer.mobile.meijer.M.f99457a, com.meijer.mobile.meijer.M.f99459c, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(ProductFullDetails productToAdd, double quantity) {
        if (Y2(Cj.o.f5056d)) {
            z2().A1(new e1.AbstractC12581j.UpdateEntryAction(productToAdd, quantity, new Rect(0, 0, 0, 0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C15485b(this).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                FilteredProductsActivity.V2(this.f107787a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                FilteredProductsActivity.W2(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void o2(int searchResultsCount, Qo.l productQuery) {
        String string;
        Collection<List<FilterFacetOption>> collectionValues;
        int size = 0;
        boolean z10 = (productQuery instanceof l.Department) || (productQuery instanceof l.BrowseCollection);
        AbstractC4286s abstractC4286s = this.binding;
        Integer numValueOf = null;
        if (abstractC4286s == null) {
            Intrinsics.x("binding");
            abstractC4286s = null;
        }
        AbstractC4277p1 abstractC4277p1 = abstractC4286s.f22274E;
        MaterialTextView materialTextView = abstractC4277p1.f22185z;
        Intrinsics.g(materialTextView);
        materialTextView.setVisibility((searchResultsCount == 0 || (productQuery instanceof l.Reward)) ? false : true ? 0 : 8);
        materialTextView.setText(AbstractC6392a.INSTANCE.b(C18371a.f172042a, searchResultsCount, NumberFormat.getNumberInstance(Locale.getDefault()).format(Integer.valueOf(searchResultsCount))).b(this));
        Button button = abstractC4277p1.f22184A;
        Intrinsics.g(button);
        button.setVisibility(z10 ? 0 : 8);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilteredProductsActivity.p2(this.f107532a, view);
            }
        });
        if (!z10 || !(productQuery instanceof l.k)) {
            abstractC4277p1.f22184A.setText(C18372b.f172069t);
            return;
        }
        Map<FilterFacet, List<FilterFacetOption>> mapF3 = ((l.k) productQuery).F3();
        if (mapF3 != null && (collectionValues = mapF3.values()) != null) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
            numValueOf = Integer.valueOf(size);
        }
        int iB = C18328d.b(numValueOf, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(FilteredProductsActivity.q2());
            }
        });
        Button button2 = abstractC4277p1.f22184A;
        if (iB == 0) {
            string = getString(C18372b.f172051b, "");
        } else {
            string = getString(C18372b.f172051b, " (" + iB + ')');
        }
        button2.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t2(int i10, FilteredProductsActivity filteredProductsActivity, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        Ao.e0.a(filteredProductsActivity.A2().a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C13790a u2() {
        return (C13790a) this.cartBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Il.b w2() {
        return (Il.b) this.fulfillmentViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.personalized.modals.e1 z2() {
        return (com.meijer.mobile.meijer.activity.personalized.modals.e1) this.productsViewModel.getValue();
    }

    public final pp.e A2() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("sponsorshipsDataStore");
        return null;
    }

    public final void Q2(Pj.a loadingState) {
        Intrinsics.j(loadingState, "loadingState");
        if (loadingState instanceof a.Paging) {
            P2(loadingState);
            return;
        }
        AbstractC4286s abstractC4286s = null;
        if (loadingState instanceof a.Loading) {
            AbstractC4286s abstractC4286s2 = this.binding;
            if (abstractC4286s2 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4286s = abstractC4286s2;
            }
            abstractC4286s.f22273D.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
            return;
        }
        if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
            throw new NoWhenBranchMatchedException();
        }
        P2(loadingState);
        AbstractC4286s abstractC4286s3 = this.binding;
        if (abstractC4286s3 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4286s = abstractC4286s3;
        }
        abstractC4286s.f22273D.U(loadingState.getMessage(), loadingState.getIsLoading());
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void S(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        z2().A1(new e1.AbstractC12581j.StepperStateChangedAction(productToAdd.getCode(), controlState.getValueState().getQuantity(), stepperHitRect));
    }

    public void T2(String beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        z2().A1(new e1.AbstractC12581j.SendCriteoLoadBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void W0(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        z2().A1(new e1.AbstractC12581j.SendCriteoClickBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !v2().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void c0(ProductCardDecorator itemClicked, androidx.databinding.p binding, int position) {
        Intrinsics.j(itemClicked, "itemClicked");
        Intrinsics.j(binding, "binding");
        ArrayList arrayList = new ArrayList();
        MaterialCardView listItemContainer = ((r3) binding).f22258G;
        Intrinsics.i(listItemContainer, "listItemContainer");
        arrayList.add(listItemContainer);
        Intent intentT = Bl.g.t(getFeatureEntryPoint(), itemClicked.getProduct(), true, false, s2(itemClicked, position), 4, null);
        intentT.putExtra("campaignIdValue", this.campaignIdValue);
        Ds.a.f6640a.c(this, intentT, arrayList);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void d1(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        z2().A1(new e1.AbstractC12581j.SendCriteoViewBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void o0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Parcelable parcelable;
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        z2().A1(new e1.AbstractC12581j.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
        Intent intent = getIntent();
        Qo.l lVarA = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", nk.l.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
                if (!(parcelableExtra instanceof nk.l)) {
                    parcelableExtra = null;
                }
                parcelable = (nk.l) parcelableExtra;
            }
            nk.l lVar = (nk.l) parcelable;
            if (lVar != null) {
                lVarA = Qo.K.a(lVar);
            }
        }
        if (lVarA instanceof l.BrowseCollection) {
            com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarZ2 = z2();
            String stringExtra = getIntent().getStringExtra("KEY_CURATED_CAROUSEL");
            if (stringExtra == null) {
                stringExtra = "";
            }
            e1VarZ2.A1(new e1.AbstractC12581j.SendTitle(stringExtra));
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
        getLifecycle().a(z2());
        AbstractC4286s abstractC4286sM0 = AbstractC4286s.M0(getLayoutInflater());
        this.binding = abstractC4286sM0;
        if (abstractC4286sM0 == null) {
            Intrinsics.x("binding");
            abstractC4286sM0 = null;
        }
        setContentView(Zr.a.j(abstractC4286sM0.getRoot(), false, 1, null));
        ck.c.b(this, 0, com.meijer.mobile.meijer.M.f99458b, Bl.m.f3132a, 0, 8, null);
        androidx.view.I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilteredProductsActivity.N2(this.f107436a, (androidx.view.F) obj);
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
        this.isFallbackWhiteLabel = getIntent().getBooleanExtra("IS_WHITE_LABEL", false);
        this.campaignIdValue = getIntent().getStringExtra("campaignIdValue");
        z2().T1(this.cmpid);
        z2().R1(this.campaignIdValue);
        z2().V1(getIntent().getStringExtra("broseDepartmentCarouselAnalytics"));
        com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarZ2 = z2();
        String stringExtra = getIntent().getStringExtra("homePageCarouselAnalytics");
        if (!getIntent().hasExtra("homePageCarouselAnalytics")) {
            stringExtra = null;
        }
        e1VarZ2.S1(stringExtra);
        ju.l lVar = new ju.l();
        lVar.O(true);
        this.productsSection = lVar;
        C15069d<ju.g> c15069d = new C15069d<>();
        ju.l lVar2 = this.productsSection;
        if (lVar2 == null) {
            Intrinsics.x("productsSection");
            lVar2 = null;
        }
        c15069d.c(lVar2);
        this.filteredListAdapter = c15069d;
        if (getFeatureManager().e(AbstractC18503f.C.f172844h)) {
            z2().u1(x2(), this.departmentBreadcrumbs);
        }
        AbstractC4286s abstractC4286s = this.binding;
        if (abstractC4286s == null) {
            Intrinsics.x("binding");
            abstractC4286s = null;
        }
        RecyclerView recyclerView = abstractC4286s.f22270A;
        C15069d<ju.g> c15069d2 = this.filteredListAdapter;
        if (c15069d2 == null) {
            Intrinsics.x("filteredListAdapter");
            c15069d2 = null;
        }
        recyclerView.setAdapter(c15069d2);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(recyclerView.getContext(), 1));
        recyclerView.addOnScrollListener(this.scrollListener);
        Qo.l lVarX2 = x2();
        if (lVarX2 != null) {
            Aj.c.b(y(), false, 1, null);
            if (lVarX2 instanceof l.BrowseCollection) {
                final String name = ((l.BrowseCollection) lVarX2).getCollection().getName();
                z2().U1(name);
                final boolean booleanExtra = getIntent().getBooleanExtra("SEE_MORE_ITEMS", true);
                final String stringExtra2 = getIntent().getStringExtra("KEY_CURATED_CAROUSEL");
                getAnalyticsEngine().b(C14756c.h("Collection:" + name), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FilteredProductsActivity.J2(name, this, stringExtra2, booleanExtra, (TrackingData) obj);
                    }
                });
            }
            if (this.isFallbackWhiteLabel && (lVarX2 instanceof l.Department)) {
                z2().h2(((l.Department) lVarX2).getDepartment().getName());
            }
            if (lVarX2 instanceof l.Reward) {
                getAnalyticsEngine().b(C14756c.h("mPerks:Shoppable Rewards PLP"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FilteredProductsActivity.K2((TrackingData) obj);
                    }
                });
            }
        }
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FilteredProductsActivity.L2(this.f107761a);
            }
        }, 3, null);
        Rj.a.a(y(), com.meijer.mobile.meijer.T.f99907c4, u2());
        y().setOnMenuItemClickListener(new Sn.a(new Function1() { // from class: com.meijer.mobile.meijer.activity.find.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilteredProductsActivity.M2(this.f107765a, (a.AbstractC0780a) obj);
            }
        }));
        C15809k.d(C6173t.a(this), null, null, new f(null), 3, null);
        if (getFeatureManager().e(AbstractC18503f.T.f172859h)) {
            AbstractC4286s abstractC4286s2 = this.binding;
            if (abstractC4286s2 == null) {
                Intrinsics.x("binding");
                abstractC4286s2 = null;
            }
            abstractC4286s2.f22271B.setContent(ComposableLambdaKt.composableLambdaInstance(104300242, true, new d()));
        } else {
            AbstractC4286s abstractC4286s3 = this.binding;
            if (abstractC4286s3 == null) {
                Intrinsics.x("binding");
                abstractC4286s3 = null;
            }
            ComposeView filteredProductsListCompose = abstractC4286s3.f22271B;
            Intrinsics.i(filteredProductsListCompose, "filteredProductsListCompose");
            filteredProductsListCompose.setVisibility(8);
        }
        C15809k.d(C6173t.a(this), null, null, new e(null), 3, null);
        z2().u2();
        G2(x2());
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
            parcelable2 = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", nk.l.class);
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
            parcelable2 = (nk.l) (parcelableExtra2 instanceof nk.l ? parcelableExtra2 : null);
        }
        nk.l lVar3 = (nk.l) parcelable2;
        if (lVar3 == null || (kVarC = Qo.K.c(lVar3, uri)) == null) {
            return;
        }
        this.deeplinkFacets = kVarC;
        getIntent().removeExtra("product_sort_filter_deeplink");
    }

    @Override // Qj.g
    public void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // Qj.g
    public void onSignIn() {
        startActivity(Bl.k.b(this, false, null, 4000, null, null, null, 118, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void p0(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        if (Y2(Cj.o.f5058e)) {
            startActivity(Bl.t.e(Bl.t.f3152a, this, null, Pp.c.f26247c, product, X2(), 2, null));
        }
    }

    public final wr.f v2() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("cartInteractor");
        return null;
    }

    @Override // Bj.b
    public Toolbar y() {
        AbstractC4286s abstractC4286s = this.binding;
        if (abstractC4286s == null) {
            Intrinsics.x("binding");
            abstractC4286s = null;
        }
        MaterialToolbar toolbar = abstractC4286s.f22275F;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    public final Ro.a y2() {
        Ro.a aVar = this.productAnalytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("productAnalytics");
        return null;
    }

    private final void B2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void C2() {
        if (getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            startActivity(Bl.h.c(this, null, null, null, false, null, 62, null));
        } else {
            startActivity(Bl.h.g(this, null, null, null, false, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ShowToast"})
    public final void E2(C14274a result) {
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
            AbstractC4286s abstractC4286s = this.binding;
            if (abstractC4286s == null) {
                Intrinsics.x("binding");
                abstractC4286s = null;
            }
            Snackbar.q0(abstractC4286s.getRoot(), i10, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilteredProductsActivity.F2(this.f107780a, view);
                }
            }).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(FilteredProductsActivity filteredProductsActivity, View view) {
        filteredProductsActivity.startActivity(filteredProductsActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(Coupon coupon) {
        startActivity(Dl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(FilteredProductsActivity filteredProductsActivity) {
        if (!filteredProductsActivity.onNavigateUp()) {
            filteredProductsActivity.finish();
        }
        ck.c.b(filteredProductsActivity, 1, com.meijer.mobile.meijer.M.f99457a, com.meijer.mobile.meijer.M.f99459c, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(ProductCardDecorator itemClicked, int position) {
        z2().A1(new e1.AbstractC12581j.ItemSelectedAction(itemClicked, this.searchType, position));
        ProductSponsorship sponsorship = itemClicked.getSponsorship();
        if (sponsorship != null && sponsorship.getSponsorSource() == Ho.b.f13875c) {
            z2().A1(new e1.AbstractC12581j.SendCriteoClickBeacon(itemClicked.getProduct().getBeaconInfo().e(), itemClicked.getProduct().getBeaconInfo().getFormatLevelOnClickBeacon(), null, null, 12, null));
        }
    }

    private final void P2(Pj.a loadingState) {
        ju.l lVar = null;
        if (!loadingState.getIsLoading()) {
            ju.l lVar2 = this.productsSection;
            if (lVar2 == null) {
                Intrinsics.x("productsSection");
            } else {
                lVar = lVar2;
            }
            lVar.L();
            return;
        }
        ju.l lVar3 = this.productsSection;
        if (lVar3 == null) {
            Intrinsics.x("productsSection");
        } else {
            lVar = lVar3;
        }
        lVar.M(new g(loadingState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S2(FilteredProductsActivity filteredProductsActivity) {
        filteredProductsActivity.z2().A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(0, 0));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(FilteredProductsActivity filteredProductsActivity, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        filteredProductsActivity.z2().onAction(new a.Clip(Pk.e.a(coupon.getOfferId()), new TrackingData(C14756c.a("coupon clip"), CollectionsKt.s(C14756c.c("category Page")))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String X2() {
        Parcelable parcelable;
        Intent intent = getIntent();
        Qo.l lVarA = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", nk.l.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
                if (!(parcelableExtra instanceof nk.l)) {
                    parcelableExtra = null;
                }
                parcelable = (nk.l) parcelableExtra;
            }
            nk.l lVar = (nk.l) parcelable;
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

    private final boolean Y2(int errorMessageId) {
        if (!getUserManager().b()) {
            new Qj.f(this, errorMessageId, this).g();
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(FilteredProductsActivity filteredProductsActivity, View view) {
        filteredProductsActivity.z2().A1(e1.AbstractC12581j.c.a.f112096a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13790a r2(FilteredProductsActivity filteredProductsActivity) {
        C13790a c13790aE = C13790a.e(filteredProductsActivity);
        c13790aE.V(false);
        c13790aE.N(C17283a.f163260c);
        Intrinsics.i(c13790aE, "apply(...)");
        return c13790aE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String s2(final ts.ProductCardDecorator r7, int r8) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.s2(ts.a, int):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Qo.l x2() {
        Parcelable parcelable;
        Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT", nk.l.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT");
                if (!(parcelableExtra instanceof nk.l)) {
                    parcelableExtra = null;
                }
                parcelable = (nk.l) parcelableExtra;
            }
            nk.l lVar = (nk.l) parcelable;
            if (lVar != null) {
                return Qo.K.a(lVar);
            }
        }
        return null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        int x10;
        if (!getFeatureManager().e(AbstractC18503f.T.f172859h)) {
            com.meijer.mobile.meijer.activity.personalized.modals.e1 e1VarZ2 = z2();
            int y10 = 0;
            if (ev2 != null) {
                x10 = (int) ev2.getX();
            } else {
                x10 = 0;
            }
            if (ev2 != null) {
                y10 = (int) ev2.getY();
            }
            e1VarZ2.A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(x10, y10));
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12229p0.b
    public void f0() {
        z2().A1(e1.AbstractC12581j.f.f112103a);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        FSPage fSPageA;
        super.onResume();
        Qo.l lVarX2 = x2();
        if (lVarX2 != null && (fSPageA = C6396a.a(lVarX2)) != null) {
            fSPageA.start();
        }
    }
}
