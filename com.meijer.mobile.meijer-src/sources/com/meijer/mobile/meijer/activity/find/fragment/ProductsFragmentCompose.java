package com.meijer.mobile.meijer.activity.find.fragment;

import Ao.C2898u;
import Ao.e0;
import Bl.t;
import Cj.o;
import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Ki.K;
import Ki.LocalThemeScope;
import Nn.AbstractC4316z1;
import Nn.Z1;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Qo.l;
import V2.CreationExtras;
import an.C5747t;
import an.InterfaceC5728a;
import an.x0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.X;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.InterfaceC6162j;
import androidx.view.InterfaceC6172s;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import bk.AbstractC6392a;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.find.C12229p0;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import j2.C14923c;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import mv.Z;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.P;
import sr.p;
import ss.InterfaceC17146a;
import tr.C17284b;
import ts.ProductCardDecorator;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import x4.InterfaceC18089i;
import yo.C18335a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 Þ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002ß\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u00020$2\b\b\u0001\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\t2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0018H\u0002¢\u0006\u0004\b8\u0010\u001eJ\u001f\u0010<\u001a\u00020\t2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\"H\u0002¢\u0006\u0004\b<\u0010=J#\u0010A\u001a\u00020\t2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010@\u001a\u00020$H\u0002¢\u0006\u0004\bA\u0010BJ7\u0010I\u001a\u00020\t2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020\"2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010\u000fJ\u0019\u0010P\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ+\u0010W\u001a\u00020V2\u0006\u0010S\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010O\u001a\u0004\u0018\u00010NH\u0017¢\u0006\u0004\bW\u0010XJ!\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020V2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010\u0006J!\u0010_\u001a\u00020\t2\u0006\u0010]\u001a\u00020\u00182\b\u0010^\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b_\u0010\u001eJ\u000f\u0010`\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010\u0006J\u0019\u0010c\u001a\u00020\t2\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\tH\u0016¢\u0006\u0004\be\u0010\u0006J\u000f\u0010f\u001a\u00020\tH\u0016¢\u0006\u0004\bf\u0010\u0006J\u000f\u0010g\u001a\u00020\tH\u0016¢\u0006\u0004\bg\u0010\u0006J\u0017\u0010h\u001a\u00020\t2\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\tH\u0016¢\u0006\u0004\bj\u0010\u0006R\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0089\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\b_\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u001a\u0010µ\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R!\u0010»\u0001\u001a\u00030¶\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010¾\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010Á\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001c\u0010Å\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010É\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001c\u0010Í\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001b\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001c\u0010Ô\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R)\u0010Ú\u0001\u001a\u0014\u0012\u000f\u0012\r ×\u0001*\u0005\u0018\u00010Ö\u00010Ö\u00010Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ê\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006à\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragmentCompose;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "LQj/g;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "Lan/a;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "D1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V", "LPj/a;", "loadingState", "X1", "(LPj/a;)V", "a2", "LCo/h;", "productToAdd", "", "quantity", "Y1", "(LCo/h;D)V", "", "", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "Z1", "(Ljava/lang/String;Ljava/lang/String;)V", "product", "p0", "(LCo/h;)V", "", "errorMessageId", "", "j2", "(I)Z", "Lg/a;", "result", "handleSubstitutionResult", "(Lg/a;)V", "productTitle", "c2", "(Ljava/lang/String;)V", "count", "h2", "(I)V", "totalResults", "tokenMatchCount", "embeddingsCount", "i2", "(III)V", "suggestion", "originalTerm", "N1", "Lts/a;", "itemClicked", "position", "S1", "(Lts/a;I)V", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "noResultDecorator", "shouldShowZeroResults", "V1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Z)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "d2", "(IIIILPk/a;)V", "M1", "(LPk/a;)V", "W1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "query", "searchMethod", "i", "e", "Landroid/view/MotionEvent;", "ev", "X", "(Landroid/view/MotionEvent;)V", "onCreateAccount", "onSignIn", "F", "B", "(Z)V", "f0", "Lwr/f;", "f", "Lwr/f;", "getCartInteractor", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lyo/k;", "g", "Lyo/k;", "C1", "()Lyo/k;", "setUserManager$Meijer_playstoreRelease", "(Lyo/k;)V", "userManager", "Lyo/a;", "h", "Lyo/a;", "getAppPrefManager$Meijer_playstoreRelease", "()Lyo/a;", "setAppPrefManager$Meijer_playstoreRelease", "(Lyo/a;)V", "appPrefManager", "Lzl/k;", "Lzl/k;", "z1", "()Lzl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lzl/k;)V", "featureManager", "Lhi/a;", "j", "Lhi/a;", "x1", "()Lhi/a;", "setAnalyticsEngine$Meijer_playstoreRelease", "(Lhi/a;)V", "analyticsEngine", "LRo/a;", "k", "LRo/a;", "getProductAnalytics$Meijer_playstoreRelease", "()LRo/a;", "setProductAnalytics$Meijer_playstoreRelease", "(LRo/a;)V", "productAnalytics", "LDl/e;", "l", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "LBl/g;", "m", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "Lpp/e;", "n", "Lpp/e;", "B1", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "LPp/b;", "o", "LPp/b;", "searchType", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "p", "Lkotlin/Lazy;", "A1", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "productsViewModel", "q", "Z", "sendSearchResultsAnalytics", "r", "I", "productCount", "Lvs/b;", "s", "Lvs/b;", "itemToSubstitute", "Lju/l;", "t", "Lju/l;", "productsSection", "LNn/z1;", "u", "LNn/z1;", "_binding", "v", "Ljava/lang/String;", "searchTerm", "Lcom/google/android/material/snackbar/Snackbar;", "w", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "x", "Lg/c;", "substitutionResultLauncher", "y1", "()LNn/z1;", "binding", "y", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ProductsFragmentCompose extends Hilt_ProductsFragmentCompose implements Qj.g, C12229p0.b, InterfaceC5728a {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f107698z = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Ro.a productAnalytics;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public pp.e sponsorshipsDataStore;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f26238a;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy productsViewModel;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean sendSearchResultsAnalytics;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int productCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator itemToSubstitute;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private ju.l productsSection;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private AbstractC4316z1 _binding;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private String searchTerm;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Snackbar currentSnackbar;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragmentCompose$a;", "", "<init>", "()V", "", "query", "LPp/b;", "searchType", "Lvs/b;", "productToSubstitute", "Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragmentCompose;", "a", "(Ljava/lang/String;LPp/b;Lvs/b;)Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragmentCompose;", "ARG_SEARCH_QUERY", "Ljava/lang/String;", "ARG_SEARCH_TYPE", "ARG_ITEM_TO_SUBSTITUTE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProductsFragmentCompose a(String query, Pp.b searchType, CartProductListDecorator productToSubstitute) {
            Intrinsics.j(searchType, "searchType");
            ProductsFragmentCompose productsFragmentCompose = new ProductsFragmentCompose();
            productsFragmentCompose.setArguments(C14923c.b(TuplesKt.a("ARG_SEARCH_QUERY", query), TuplesKt.a("ARG_SEARCH_TYPE", searchType), TuplesKt.a("ARG_ITEM_TO_SUBSTITUTE", productToSubstitute)));
            return productsFragmentCompose;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pp.b.values().length];
            try {
                iArr[Pp.b.f26240c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pp.b.f26241d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e1.ViewState f107719a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductsFragmentCompose f107720b;

            a(e1.ViewState viewState, ProductsFragmentCompose productsFragmentCompose) {
                this.f107719a = viewState;
                this.f107720b = productsFragmentCompose;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(ProductsFragmentCompose productsFragmentCompose, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                productsFragmentCompose.A1().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(ProductsFragmentCompose productsFragmentCompose, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                productsFragmentCompose.A1().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(ProductsFragmentCompose productsFragmentCompose, InterfaceC17146a it) {
                Intrinsics.j(it, "it");
                if (it instanceof InterfaceC17146a.FindSimilarItems) {
                    productsFragmentCompose.p0(((InterfaceC17146a.FindSimilarItems) it).getProduct());
                } else if (it instanceof InterfaceC17146a.ProductItemClicked) {
                    InterfaceC17146a.ProductItemClicked productItemClicked = (InterfaceC17146a.ProductItemClicked) it;
                    productsFragmentCompose.S1(productItemClicked.getItemClicked(), productItemClicked.getPosition());
                } else if (it instanceof InterfaceC17146a.SendCriteoLoadBeacon) {
                    InterfaceC17146a.SendCriteoLoadBeacon sendCriteoLoadBeacon = (InterfaceC17146a.SendCriteoLoadBeacon) it;
                    productsFragmentCompose.Z1(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon());
                } else if (it instanceof InterfaceC17146a.SendCriteoOnViewBeacon) {
                    InterfaceC17146a.SendCriteoOnViewBeacon sendCriteoOnViewBeacon = (InterfaceC17146a.SendCriteoOnViewBeacon) it;
                    productsFragmentCompose.d1(sendCriteoOnViewBeacon.a(), sendCriteoOnViewBeacon.getFormatLevelBeacon());
                } else {
                    if (!(it instanceof InterfaceC17146a.UpdateEntry)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC17146a.UpdateEntry updateEntry = (InterfaceC17146a.UpdateEntry) it;
                    productsFragmentCompose.Y1(updateEntry.getProductToAdd(), updateEntry.getQuantity());
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(ProductsFragmentCompose productsFragmentCompose, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                Coupon coupon = product.getCoupon();
                if (coupon != null) {
                    productsFragmentCompose.A1().onAction(new a.Clip(Pk.e.a(coupon.getOfferId()), C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductsFragmentCompose.c.a.u((TrackingData) obj);
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
            public static final Unit v(ProductsFragmentCompose productsFragmentCompose, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                Coupon coupon = product.getCoupon();
                if (coupon != null) {
                    productsFragmentCompose.M1(coupon);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit w(ProductsFragmentCompose productsFragmentCompose, GoogleAdAnalytics googleAdAnalytics) {
                Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                productsFragmentCompose.A1().A1(new e1.AbstractC12581j.GoogleAdClicked(googleAdAnalytics));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit x(ProductsFragmentCompose productsFragmentCompose, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                if (productsFragmentCompose.j2(o.f5058e)) {
                    productsFragmentCompose.p0(product.getProduct());
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(ProductsFragmentCompose productsFragmentCompose, ProductListDecorator product) {
                Intrinsics.j(product, "product");
                productsFragmentCompose.A1().A1(new e1.AbstractC12581j.StepperStateChangedAction(product.getProduct().getCode(), 0.0d, new Rect()));
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
                    ComposerKt.U(-1794032807, i11, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose.onCreateView.<anonymous>.<anonymous>.<anonymous> (ProductsFragmentCompose.kt:185)");
                }
                List<ProductListDecorator> listQ = this.f107719a.q();
                Pp.b bVar = this.f107720b.searchType;
                CartProductListDecorator cartProductListDecorator = this.f107720b.itemToSubstitute;
                boolean z10 = (this.f107719a.getLoadingState() instanceof a.Paging) && this.f107719a.getLoadingState().getIsLoading();
                GoogleAdData googleAdSlot1 = this.f107719a.getGoogleAdSlot1();
                composer.startReplaceGroup(-1783537336);
                AdManagerAdView adManagerAdViewS3 = null;
                if (googleAdSlot1 == null) {
                    adManagerAdViewS = null;
                } else {
                    final ProductsFragmentCompose productsFragmentCompose = this.f107720b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(productsFragmentCompose);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProductsFragmentCompose.c.a.w(productsFragmentCompose, (GoogleAdAnalytics) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    adManagerAdViewS = p.S(googleAdSlot1, (Function1) objB, null, composer, GoogleAdData.f134248f, 4);
                }
                composer.P();
                GoogleAdData googleAdSlot2 = this.f107719a.getGoogleAdSlot2();
                composer.startReplaceGroup(-1783527864);
                if (googleAdSlot2 == null) {
                    adManagerAdViewS2 = null;
                } else {
                    final ProductsFragmentCompose productsFragmentCompose2 = this.f107720b;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(productsFragmentCompose2);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProductsFragmentCompose.c.a.A(productsFragmentCompose2, (GoogleAdAnalytics) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    adManagerAdViewS2 = p.S(googleAdSlot2, (Function1) objB2, null, composer, GoogleAdData.f134248f, 4);
                }
                composer.P();
                GoogleAdData googleAdSlot3 = this.f107719a.getGoogleAdSlot3();
                composer.startReplaceGroup(-1783518392);
                if (googleAdSlot3 != null) {
                    final ProductsFragmentCompose productsFragmentCompose3 = this.f107720b;
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(productsFragmentCompose3);
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProductsFragmentCompose.c.a.B(productsFragmentCompose3, (GoogleAdAnalytics) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    adManagerAdViewS3 = p.S(googleAdSlot3, (Function1) objB3, null, composer, GoogleAdData.f134248f, 4);
                }
                composer.P();
                boolean zE = this.f107720b.z1().e(AbstractC18503f.C18509g.f172878h);
                boolean zE2 = this.f107720b.z1().e(AbstractC18503f.k0.f172887h);
                boolean zE3 = this.f107720b.z1().e(AbstractC18503f.l0.f172889h);
                boolean zE4 = this.f107720b.z1().e(AbstractC18503f.C18527y.f172914h);
                boolean zE5 = this.f107720b.z1().e(AbstractC18503f.C18526x.f172912h);
                boolean zB = this.f107720b.C1().b();
                composer.startReplaceGroup(5004770);
                boolean zD4 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose4 = this.f107720b;
                Object objB4 = composer.B();
                if (zD4 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.fragment.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductsFragmentCompose.c.a.r(productsFragmentCompose4);
                        }
                    };
                    composer.t(objB4);
                }
                Function0 function0 = (Function0) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD5 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose5 = this.f107720b;
                Object objB5 = composer.B();
                if (zD5 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductsFragmentCompose.c.a.s(productsFragmentCompose5, (InterfaceC17146a) obj);
                        }
                    };
                    composer.t(objB5);
                }
                Function1 function1 = (Function1) objB5;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD6 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose6 = this.f107720b;
                Object objB6 = composer.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductsFragmentCompose.c.a.t(productsFragmentCompose6, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB6);
                }
                Function1 function12 = (Function1) objB6;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD7 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose7 = this.f107720b;
                Object objB7 = composer.B();
                if (zD7 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductsFragmentCompose.c.a.v(productsFragmentCompose7, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB7);
                }
                Function1 function13 = (Function1) objB7;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD8 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose8 = this.f107720b;
                Object objB8 = composer.B();
                if (zD8 || objB8 == Composer.INSTANCE.a()) {
                    objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductsFragmentCompose.c.a.x(productsFragmentCompose8, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB8);
                }
                Function1 function14 = (Function1) objB8;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD9 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose9 = this.f107720b;
                Object objB9 = composer.B();
                if (zD9 || objB9 == Composer.INSTANCE.a()) {
                    objB9 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.fragment.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProductsFragmentCompose.c.a.y(productsFragmentCompose9, (ProductListDecorator) obj);
                        }
                    };
                    composer.t(objB9);
                }
                Function1 function15 = (Function1) objB9;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD10 = composer.D(this.f107720b);
                final ProductsFragmentCompose productsFragmentCompose10 = this.f107720b;
                Object objB10 = composer.B();
                if (zD10 || objB10 == Composer.INSTANCE.a()) {
                    objB10 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.fragment.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductsFragmentCompose.c.a.z(productsFragmentCompose10);
                        }
                    };
                    composer.t(objB10);
                }
                composer.P();
                C5747t.G(AdsTheme, listQ, function0, function1, function12, function13, function14, bVar, function15, (Function0) objB10, cartProductListDecorator, z10, null, adManagerAdViewS, adManagerAdViewS2, adManagerAdViewS3, zE, zE2, zE3, zE5, zE4, zB, composer, LocalThemeScope.f17314g | (i11 & 14), CartProductListDecorator.f166190s, 0, RecyclerView.m.FLAG_MOVED);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(ProductsFragmentCompose productsFragmentCompose) {
                productsFragmentCompose.A1().A1(e1.AbstractC12581j.f.f112103a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(ProductsFragmentCompose productsFragmentCompose) {
                productsFragmentCompose.A1().A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(0, 0));
                return Unit.f143329a;
            }
        }

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1680342723, i10, -1, "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose.onCreateView.<anonymous> (ProductsFragmentCompose.kt:183)");
            }
            K.b(null, ComposableLambdaKt.c(-1794032807, true, new a((e1.ViewState) o1.b(ProductsFragmentCompose.this.A1().o1(), null, composer, 0, 1).getValue(), ProductsFragmentCompose.this), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose$onCreateView$3", f = "ProductsFragmentCompose.kt", l = {270}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107721a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragmentCompose.this.new d(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose$onCreateView$3$1", f = "ProductsFragmentCompose.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<e1.ViewState, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107723a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f107724b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductsFragmentCompose f107725c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductsFragmentCompose productsFragmentCompose, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107725c = productsFragmentCompose;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f107725c, continuation);
                aVar.f107724b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                return ((a) create(viewState, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ProductsFragment.b bVar;
                IntrinsicsKt.f();
                if (this.f107723a == 0) {
                    ResultKt.b(obj);
                    e1.ViewState viewState = (e1.ViewState) this.f107724b;
                    List<ProductListDecorator> listQ = viewState.q();
                    ProductsFragmentCompose productsFragmentCompose = this.f107725c;
                    for (ProductListDecorator productListDecorator : listQ) {
                        ProductSponsorship sponsorship = productListDecorator.getSponsorship();
                        if (sponsorship != null && (sponsorship.getSponsorSource() == Ho.b.f13875c || sponsorship.getSponsorSource() == Ho.b.f13876d)) {
                            productsFragmentCompose.Z1(productListDecorator.getProduct().getBeaconInfo().getOnLoadBeacon(), productListDecorator.getProduct().getBeaconInfo().getFormatLevelOnLoadBeacon());
                        }
                    }
                    this.f107725c.X1(viewState.getLoadingState());
                    this.f107725c.V1(viewState.getNoProductResult(), viewState.getShouldShowZeroResults());
                    this.f107725c.h2(viewState.x());
                    this.f107725c.i2(viewState.x(), viewState.getTokenMatch(), viewState.getEmbeddingsMatch());
                    InterfaceC18089i activity = this.f107725c.getActivity();
                    if (activity instanceof ProductsFragment.b) {
                        bVar = (ProductsFragment.b) activity;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        bVar.U(viewState.getItemSelected());
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107721a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                P<e1.ViewState> pO1 = ProductsFragmentCompose.this.A1().o1();
                a aVar = new a(ProductsFragmentCompose.this, null);
                this.f107721a = 1;
                if (C16563h.k(pO1, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose$onCreateView$4", f = "ProductsFragmentCompose.kt", l = {HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107726a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends AdaptedFunctionReference implements Function2<e1.AbstractC12585n, Continuation<? super Unit>, Object>, SuspendFunction {
            a(Object obj) {
                super(2, obj, ProductsFragmentCompose.class, "handleEvent", "handleEvent(Lcom/meijer/mobile/meijer/activity/personalized/modals/ProductsViewModel$Event;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e1.AbstractC12585n abstractC12585n, Continuation<? super Unit> continuation) {
                return e.g((ProductsFragmentCompose) this.f143708a, abstractC12585n, continuation);
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragmentCompose.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object g(ProductsFragmentCompose productsFragmentCompose, e1.AbstractC12585n abstractC12585n, Continuation continuation) throws Resources.NotFoundException {
            productsFragmentCompose.D1(abstractC12585n);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107726a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<e1.AbstractC12585n> events = ProductsFragmentCompose.this.A1().getEvents();
                a aVar = new a(ProductsFragmentCompose.this);
                this.f107726a = 1;
                if (C16563h.k(events, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/find/fragment/ProductsFragmentCompose$f", "Lku/a;", "LNn/Z1;", "viewBinding", "", "position", "", "A", "(LNn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends AbstractC15424a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Pj.a f107728e;

        f(Pj.a aVar) {
            this.f107728e = aVar;
        }

        @Override // ku.AbstractC15424a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f21767z.U(this.f107728e.getMessage(), this.f107728e.getIsLoading());
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
            return V.f100172C0;
        }

        @Override // ju.h
        public long i() {
            return getLayoutId();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose$setSendSearchResultsAnalytics$1", f = "ProductsFragmentCompose.kt", l = {613}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107729a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragmentCompose.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107729a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f107729a = 1;
                if (Z.b(3000L, this) == objF) {
                    return objF;
                }
            }
            ProductsFragmentCompose.this.a2();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/fragment/app/Fragment;", "c", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<Fragment> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f107731f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f107731f = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f107731f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/h0;", "c", "()Landroidx/lifecycle/h0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<h0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107732f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0) {
            super(0);
            this.f107732f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) this.f107732f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Lazy f107733f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Lazy lazy) {
            super(0);
            this.f107733f = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return X.c(this.f107733f).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107734f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f107735g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, Lazy lazy) {
            super(0);
            this.f107734f = function0;
            this.f107735g = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107734f;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            h0 h0VarC = X.c(this.f107735g);
            InterfaceC6162j interfaceC6162j = h0VarC instanceof InterfaceC6162j ? (InterfaceC6162j) h0VarC : null;
            return interfaceC6162j != null ? interfaceC6162j.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f107736f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f107737g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, Lazy lazy) {
            super(0);
            this.f107736f = fragment;
            this.f107737g = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            f0.c defaultViewModelProviderFactory;
            h0 h0VarC = X.c(this.f107737g);
            InterfaceC6162j interfaceC6162j = h0VarC instanceof InterfaceC6162j ? (InterfaceC6162j) h0VarC : null;
            return (interfaceC6162j == null || (defaultViewModelProviderFactory = interfaceC6162j.getDefaultViewModelProviderFactory()) == null) ? this.f107736f.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
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
            return new FunctionReferenceImpl(1, ProductsFragmentCompose.this, ProductsFragmentCompose.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductsFragmentCompose.this.handleSubstitutionResult(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(ProductFullDetails productToAdd, double quantity) {
        this.sendSearchResultsAnalytics = false;
        if (j2(o.f5056d)) {
            A1().A1(new e1.AbstractC12581j.UpdateEntryAction(productToAdd, quantity, new Rect(0, 0, 0, 0)));
            ProductSponsorship productSponsorshipA = B1().a(productToAdd.getCode());
            if (productSponsorshipA != null) {
                if (productSponsorshipA.getSponsorSource() == Ho.b.f13875c || productSponsorshipA.getSponsorSource() == Ho.b.f13876d) {
                    d1(productToAdd.getBeaconInfo().e(), productToAdd.getBeaconInfo().getFormatLevelOnClickBeacon());
                }
            }
        }
    }

    @Override // an.InterfaceC5728a
    public void X(MotionEvent ev2) {
    }

    @Override // an.InterfaceC5728a
    public void e() {
        this.sendSearchResultsAnalytics = true;
        InterfaceC6172s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner), null, null, new g(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 A1() {
        return (e1) this.productsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(final e1.AbstractC12585n event) throws Resources.NotFoundException {
        if (event instanceof e1.AbstractC12585n.UpdateProductsInfoEvent) {
            e1.AbstractC12585n.UpdateProductsInfoEvent updateProductsInfoEvent = (e1.AbstractC12585n.UpdateProductsInfoEvent) event;
            if (updateProductsInfoEvent.getTotalProductCount() > 0) {
                c2(updateProductsInfoEvent.getFirstProductName());
            }
            if (this.sendSearchResultsAnalytics) {
                x1().g(C14756c.h("Product Search Page"), new Function1() { // from class: an.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductsFragmentCompose.G1(event, (TrackingData) obj);
                    }
                });
            }
        } else {
            if (event instanceof e1.AbstractC12585n.UpdateToCartFailedEvent) {
                View root = y1().getRoot();
                String string = getResources().getString(((e1.AbstractC12585n.UpdateToCartFailedEvent) event).getMessageResId());
                Intrinsics.i(string, "getString(...)");
                Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                Intrinsics.i(snackbarR0, "make(...)");
                Wj.b.b(snackbarR0).c0();
                return;
            }
            if (event instanceof e1.AbstractC12585n.ShoppingListUpdateFailedEvent) {
                Context contextRequireContext = requireContext();
                Intrinsics.i(contextRequireContext, "requireContext(...)");
                e1.AbstractC12585n.ShoppingListUpdateFailedEvent shoppingListUpdateFailedEvent = (e1.AbstractC12585n.ShoppingListUpdateFailedEvent) event;
                new Qj.j(contextRequireContext, shoppingListUpdateFailedEvent.getMessageResId(), new Object[0]).r(shoppingListUpdateFailedEvent.getTitleResId(), new Object[0]).g();
                return;
            }
            if (event instanceof e1.AbstractC12585n.AddToShoppingListSuccessEvent) {
                e1.AbstractC12585n.AddToShoppingListSuccessEvent addToShoppingListSuccessEvent = (e1.AbstractC12585n.AddToShoppingListSuccessEvent) event;
                Snackbar.q0(y1().getRoot(), addToShoppingListSuccessEvent.getMessageResId(), 0).t0(addToShoppingListSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: an.q0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductsFragmentCompose.H1(this.f45620a, view);
                    }
                }).c0();
                return;
            }
            if (event instanceof e1.AbstractC12585n.CartUpdateSuccessEvent) {
                e1.AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12585n.CartUpdateSuccessEvent) event;
                Snackbar.q0(y1().getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0).t0(cartUpdateSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: an.r0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductsFragmentCompose.I1(this.f45627a, view);
                    }
                }).c0();
                return;
            }
            if (event instanceof e1.AbstractC12585n.OpenLowStockScreenEvent) {
                Context context = getContext();
                if (context != null) {
                    this.substitutionResultLauncher.a(t.e(t.f3152a, context, ((e1.AbstractC12585n.OpenLowStockScreenEvent) event).getDecorator(), Pp.c.f26248d, null, "product search page", 8, null));
                }
            } else {
                if (event instanceof e1.AbstractC12585n.ShowChokingWarningDialogEvent) {
                    e1.AbstractC12585n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (e1.AbstractC12585n.ShowChokingWarningDialogEvent) event;
                    new C15485b(y1().getRoot().getContext(), Cj.p.f5105d).setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Cj.i.f4711J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody()).setPositiveButton(showChokingWarningDialogEvent.a().getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: an.s0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ProductsFragmentCompose.J1(this.f45629a, event, dialogInterface, i10);
                        }
                    }).setNegativeButton(showChokingWarningDialogEvent.a().getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: an.c0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ProductsFragmentCompose.K1(this.f45524a, event, dialogInterface, i10);
                        }
                    }).show();
                    return;
                }
                if (!(event instanceof e1.AbstractC12585n.BubbleFacetsToFilterAndSort)) {
                    if (event instanceof e1.AbstractC12585n.ShowError) {
                        C15485b cancelable = new C15485b(y1().getRoot().getContext()).setCancelable(false);
                        e1.AbstractC12585n.ShowError showError = (e1.AbstractC12585n.ShowError) event;
                        AbstractC6392a title = showError.getTitle();
                        Context context2 = y1().getRoot().getContext();
                        Intrinsics.i(context2, "getContext(...)");
                        C15485b title2 = cancelable.setTitle(title.b(context2));
                        AbstractC6392a message = showError.getMessage();
                        Context context3 = y1().getRoot().getContext();
                        Intrinsics.i(context3, "getContext(...)");
                        C15485b message2 = title2.setMessage(message.b(context3));
                        AbstractC6392a positiveButtonText = showError.getPositiveButtonText();
                        Context context4 = y1().getRoot().getContext();
                        Intrinsics.i(context4, "getContext(...)");
                        message2.setPositiveButton(positiveButtonText.b(context4), new DialogInterface.OnClickListener() { // from class: an.d0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                ProductsFragmentCompose.E1(dialogInterface, i10);
                            }
                        }).show();
                        return;
                    }
                    if (event instanceof e1.AbstractC12585n.ClipCouponFailedEvent) {
                        e1.AbstractC12585n.ClipCouponFailedEvent clipCouponFailedEvent = (e1.AbstractC12585n.ClipCouponFailedEvent) event;
                        d2(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon());
                        return;
                    }
                    if ((event instanceof e1.AbstractC12585n.LaunchFilterAndSortEvent) || Intrinsics.e(event, e1.AbstractC12585n.g.f112210a) || (event instanceof e1.AbstractC12585n.ProductListErrorEvent) || (event instanceof e1.AbstractC12585n.ProductListSuccess) || (event instanceof e1.AbstractC12585n.ViewItemInShoppingListEvent) || (event instanceof e1.AbstractC12585n.ViewProductDetailsEvent) || Intrinsics.e(event, e1.AbstractC12585n.x.f112237a)) {
                        return;
                    }
                    if ((event instanceof e1.AbstractC12585n.j) || Intrinsics.e(event, e1.AbstractC12585n.m.f112217a)) {
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            activity.setResult(-1);
                        }
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    }
                    if (event instanceof e1.AbstractC12585n.SubstitutionFailureEvent) {
                        e1.AbstractC12585n.SubstitutionFailureEvent substitutionFailureEvent = (e1.AbstractC12585n.SubstitutionFailureEvent) event;
                        new C15485b(y1().getRoot().getContext()).setTitle(substitutionFailureEvent.getTitleResId()).setCancelable(false).setMessage(substitutionFailureEvent.getMessageResId()).setPositiveButton(C17284b.f163305W, new DialogInterface.OnClickListener() { // from class: an.e0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                ProductsFragmentCompose.F1(dialogInterface, i10);
                            }
                        }).show();
                        return;
                    }
                    if (event instanceof e1.AbstractC12585n.ShowFreeItemsSnackbar) {
                        View root2 = y1().getRoot();
                        AbstractC6392a message3 = ((e1.AbstractC12585n.ShowFreeItemsSnackbar) event).getMessage();
                        Context context5 = y1().getRoot().getContext();
                        Intrinsics.i(context5, "getContext(...)");
                        Snackbar snackbarR02 = Snackbar.r0(root2, message3.b(context5), -2);
                        Intrinsics.i(snackbarR02, "make(...)");
                        Snackbar snackbarC = Wj.b.c(snackbarR02);
                        snackbarC.c0();
                        this.currentSnackbar = snackbarC;
                        return;
                    }
                    if (event instanceof e1.AbstractC12585n.e) {
                        Snackbar snackbar = this.currentSnackbar;
                        if (snackbar != null) {
                            snackbar.A();
                            return;
                        }
                        return;
                    }
                    if (event instanceof e1.AbstractC12585n.ShowPlpEvent) {
                        startActivity(Bl.g.t(getFeatureEntryPoint(), ((e1.AbstractC12585n.ShowPlpEvent) event).getProduct(), true, false, null, 12, null));
                        return;
                    } else {
                        if (!(event instanceof e1.AbstractC12585n.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                InterfaceC18089i activity3 = getActivity();
                ProductsFragment.b bVar = activity3 instanceof ProductsFragment.b ? (ProductsFragment.b) activity3 : null;
                if (bVar != null) {
                    bVar.O(((e1.AbstractC12585n.BubbleFacetsToFilterAndSort) event).getQuery());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(e1.AbstractC12585n abstractC12585n, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("outOfStockProductList", ((e1.AbstractC12585n.UpdateProductsInfoEvent) abstractC12585n).getOutOfStockList());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1(ProductsFragmentCompose productsFragmentCompose, l.k it) {
        Intrinsics.j(it, "it");
        productsFragmentCompose.A1().A1(new e1.AbstractC12581j.SetFilterAndSortOptions(it));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchMethod", "Spelling Suggestions");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("pageName", "Meijer:Search Results Page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(final ProductCardDecorator itemClicked, int position) {
        Pp.b bVar = this.searchType;
        if (bVar != Pp.b.f26240c && bVar != Pp.b.f26241d) {
            x1().b(C14756c.a("event: search: product detail"), new Function1() { // from class: an.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragmentCompose.T1((TrackingData) obj);
                }
            });
            Iterator<ProductListDecorator> it = A1().o1().getValue().q().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (Intrinsics.e(it.next().getProduct().getCode(), itemClicked.getProduct().getCode())) {
                    break;
                } else {
                    i10++;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                final int iIntValue = Integer.valueOf(numValueOf.intValue() + 1).intValue();
                x1().g(C14756c.h("Product Details Page"), new Function1() { // from class: an.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductsFragmentCompose.U1(iIntValue, this, itemClicked, (TrackingData) obj);
                    }
                });
                x1().k(C2898u.f1904a.h0(iIntValue));
            }
        }
        A1().A1(new e1.AbstractC12581j.ItemSelectedAction(itemClicked, this.searchType, position));
        ProductSponsorship sponsorship = itemClicked.getSponsorship();
        if (sponsorship != null) {
            if (sponsorship.getSponsorSource() == Ho.b.f13875c || sponsorship.getSponsorSource() == Ho.b.f13876d) {
                A1().A1(new e1.AbstractC12581j.SendCriteoClickBeacon(itemClicked.getProduct().getBeaconInfo().e(), itemClicked.getProduct().getBeaconInfo().getFormatLevelOnClickBeacon(), null, null, 12, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: search");
        track.v("search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(int i10, ProductsFragmentCompose productsFragmentCompose, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        e0.a(productsFragmentCompose.B1().a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(Pj.a loadingState) {
        if (loadingState instanceof a.Paging) {
            W1(loadingState);
            return;
        }
        if (loadingState instanceof a.Loading) {
            y1().f22490F.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
        } else {
            if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
                throw new NoWhenBranchMatchedException();
            }
            W1(loadingState);
            y1().f22490F.U(loadingState.getMessage(), loadingState.getIsLoading());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        if (!this.sendSearchResultsAnalytics || this.searchTerm == null) {
            return;
        }
        this.sendSearchResultsAnalytics = false;
        x1().c(C14756c.h("Product Search Page"), new Function1() { // from class: an.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragmentCompose.b2(this.f45611a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(ProductsFragmentCompose productsFragmentCompose, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("numberOfSearchResults", String.valueOf(productsFragmentCompose.productCount));
        return Unit.f143329a;
    }

    private final void d2(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C15485b(requireContext()).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: an.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProductsFragmentCompose.e2(this.f45556a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: an.g0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProductsFragmentCompose.g2(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("Product Search Results Page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(int count) {
        this.productCount = count;
        InterfaceC18089i activity = getActivity();
        ProductsFragment.b bVar = activity instanceof ProductsFragment.b ? (ProductsFragment.b) activity : null;
        if (bVar != null) {
            bVar.N(count);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        ProductsFragment.b bVar2 = parentFragment instanceof ProductsFragment.b ? (ProductsFragment.b) parentFragment : null;
        if (bVar2 != null) {
            bVar2.N(count);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(ProductFullDetails product) {
        t tVar = t.f3152a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(t.e(tVar, contextRequireContext, null, Pp.c.f26247c, product, "product search page", 2, null));
    }

    private final AbstractC4316z1 y1() {
        AbstractC4316z1 abstractC4316z1 = this._binding;
        Intrinsics.g(abstractC4316z1);
        return abstractC4316z1;
    }

    public final pp.e B1() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("sponsorshipsDataStore");
        return null;
    }

    public final yo.k C1() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    @Override // an.InterfaceC5728a
    public void F() {
        int i10 = b.$EnumSwitchMapping$0[this.searchType.ordinal()];
        if (i10 == 1) {
            A1().A1(e1.AbstractC12581j.a.f112093a);
        } else {
            if (i10 != 2) {
                return;
            }
            A1().A1(e1.AbstractC12581j.p.f112126a);
        }
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    @Override // an.InterfaceC5728a
    public void i(String query, String searchMethod) {
        Intrinsics.j(query, "query");
        if (z1().e(AbstractC18503f.C.f172844h) && !Intrinsics.e(query, this.searchTerm)) {
            e1.v1(A1(), new l.Search(query, null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 524286, null), null, 2, null);
        }
        this.searchTerm = query;
        e1.f2(A1(), query, false, searchMethod, 2, null);
    }

    @Override // Qj.g
    public void onCreateAccount() {
        Bl.f fVar = Bl.f.f3124a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, z1().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ShowToast"})
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = AbstractC4316z1.M0(inflater, container, false);
        if (getContext() == null) {
            View root = y1().getRoot();
            Intrinsics.i(root, "getRoot(...)");
            return root;
        }
        if (getActivity() instanceof SearchProductActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.h(activity, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.find.SearchProductActivity");
            ((SearchProductActivity) activity).w2(new Function1() { // from class: an.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragmentCompose.O1(this.f45576a, (l.k) obj);
                }
            });
        }
        y1().f22488D.setContent(ComposableLambdaKt.composableLambdaInstance(1680342723, true, new c()));
        InterfaceC6172s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner), null, null, new d(null), 3, null);
        InterfaceC6172s viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner2), null, null, new e(null), 3, null);
        y1().f22492H.getRoot().setOnClickListener(new View.OnClickListener() { // from class: an.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductsFragmentCompose.P1(this.f45578a, view);
            }
        });
        x1().g(C14756c.h("Product Search Page"), new Function1() { // from class: an.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragmentCompose.R1((TrackingData) obj);
            }
        });
        View viewJ = Zr.a.j(y1().getRoot(), false, 1, null);
        Intrinsics.g(viewJ);
        return viewJ;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Bundle arguments;
        Object serializable;
        Parcelable parcelable;
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            arguments = getArguments();
            if (arguments == null) {
                arguments = C14923c.a();
            }
        } else {
            arguments = savedInstanceState;
        }
        this.searchTerm = arguments.getString("ARG_SEARCH_QUERY");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializable = arguments.getSerializable("ARG_SEARCH_TYPE", Pp.b.class);
        } else {
            Object serializable2 = arguments.getSerializable("ARG_SEARCH_TYPE");
            if (!(serializable2 instanceof Pp.b)) {
                serializable2 = null;
            }
            serializable = (Pp.b) serializable2;
        }
        Pp.b bVar = (Pp.b) serializable;
        if (bVar != null) {
            this.searchType = bVar;
        }
        e1 e1VarA1 = A1();
        String str = this.searchTerm;
        if (str == null) {
            str = "";
        }
        e1.c2(e1VarA1, new l.Search(str, null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 524286, null), false, 2, null);
        if (i10 >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("ARG_ITEM_TO_SUBSTITUTE", CartProductListDecorator.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("ARG_ITEM_TO_SUBSTITUTE");
            parcelable = (CartProductListDecorator) (parcelable2 instanceof CartProductListDecorator ? parcelable2 : null);
        }
        this.itemToSubstitute = (CartProductListDecorator) parcelable;
        A1().X1(this.itemToSubstitute);
    }

    public final InterfaceC14523a x1() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final zl.k z1() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public ProductsFragmentCompose() {
        Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.f143288c, new i(new h(this)));
        this.productsViewModel = X.b(this, Reflection.b(e1.class), new j(lazyA), new k(null, lazyA), new l(this, lazyA));
        this.productsSection = new ju.l();
        AbstractC14276c<Intent> abstractC14276cRegisterForActivityResult = registerForActivityResult(new h.i(), new m());
        Intrinsics.i(abstractC14276cRegisterForActivityResult, "registerForActivityResult(...)");
        this.substitutionResultLauncher = abstractC14276cRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(ProductsFragmentCompose productsFragmentCompose, View view) {
        Dl.e meijerIntent = productsFragmentCompose.getMeijerIntent();
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        productsFragmentCompose.startActivity(meijerIntent.D(context, productsFragmentCompose.z1().e(AbstractC18503f.O.f172854h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(ProductsFragmentCompose productsFragmentCompose, View view) {
        productsFragmentCompose.startActivity(productsFragmentCompose.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(ProductsFragmentCompose productsFragmentCompose, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragmentCompose.A1().A1(new e1.AbstractC12581j.UserAcceptAddToCartAction(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(ProductsFragmentCompose productsFragmentCompose, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragmentCompose.A1().A1(new e1.AbstractC12581j.ResetActiveStepper(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b().getProductCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(ProductsFragmentCompose productsFragmentCompose, View view) {
        productsFragmentCompose.startActivity(productsFragmentCompose.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(Coupon coupon) {
        startActivity(Dl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    private final void N1(String suggestion, String originalTerm) {
        ProductsFragment.b bVar;
        InterfaceC18089i activity = getActivity();
        ProductsFragment.b bVar2 = null;
        if (activity instanceof ProductsFragment.b) {
            bVar = (ProductsFragment.b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.E(suggestion, originalTerm);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        if (parentFragment instanceof ProductsFragment.b) {
            bVar2 = (ProductsFragment.b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.E(suggestion, originalTerm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(ProductsFragmentCompose productsFragmentCompose, View view) {
        productsFragmentCompose.x1().g(C14756c.h("Product Search Page"), new Function1() { // from class: an.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragmentCompose.Q1((TrackingData) obj);
            }
        });
        productsFragmentCompose.N1(productsFragmentCompose.y1().f22492H.f22377B.getText().toString(), productsFragmentCompose.y1().f22493z.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1(e1.NoResultDecorator noResultDecorator, boolean shouldShowZeroResults) {
        AbstractC6392a abstractC6392aA;
        boolean z10;
        int i10;
        int i11;
        int noResultVisibility;
        int noResultVisibility2;
        int suggestionVisibility;
        AbstractC4316z1 abstractC4316z1Y1 = y1();
        TextView noProductResultForProduct = abstractC4316z1Y1.f22493z;
        Intrinsics.i(noProductResultForProduct, "noProductResultForProduct");
        String spellSuggestionTerm = null;
        if (noResultDecorator != null) {
            abstractC6392aA = noResultDecorator.a();
        } else {
            abstractC6392aA = null;
        }
        ck.d.g(noProductResultForProduct, abstractC6392aA);
        FullWordEllipsisTextView fullWordEllipsisTextView = abstractC4316z1Y1.f22492H.f22377B;
        if (noResultDecorator != null) {
            spellSuggestionTerm = noResultDecorator.getSpellSuggestionTerm();
        }
        if (spellSuggestionTerm == null) {
            spellSuggestionTerm = "";
        }
        fullWordEllipsisTextView.setText(spellSuggestionTerm);
        RecyclerView productsList = abstractC4316z1Y1.f22487C;
        Intrinsics.i(productsList, "productsList");
        boolean z11 = true;
        if (noResultDecorator != null && noResultDecorator.getNoResultVisibility() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        int suggestionVisibility2 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        productsList.setVisibility(i10);
        ComposeView productsListCompose = abstractC4316z1Y1.f22488D;
        Intrinsics.i(productsListCompose, "productsListCompose");
        if (noResultDecorator == null || noResultDecorator.getNoResultVisibility() != 4) {
            z11 = false;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        productsListCompose.setVisibility(i11);
        TextView textView = abstractC4316z1Y1.f22486B;
        if (noResultDecorator != null) {
            noResultVisibility = noResultDecorator.getNoResultVisibility();
        } else {
            noResultVisibility = 8;
        }
        textView.setVisibility(noResultVisibility);
        TextView textView2 = abstractC4316z1Y1.f22493z;
        if (noResultDecorator != null) {
            noResultVisibility2 = noResultDecorator.getNoResultVisibility();
        } else {
            noResultVisibility2 = 8;
        }
        textView2.setVisibility(noResultVisibility2);
        TextView textView3 = abstractC4316z1Y1.f22485A;
        if (noResultDecorator != null) {
            suggestionVisibility = noResultDecorator.getSuggestionVisibility();
        } else {
            suggestionVisibility = 8;
        }
        textView3.setVisibility(suggestionVisibility);
        View root = abstractC4316z1Y1.f22492H.getRoot();
        if (noResultDecorator != null) {
            suggestionVisibility2 = noResultDecorator.getSuggestionVisibility();
        }
        root.setVisibility(suggestionVisibility2);
        if (shouldShowZeroResults) {
            abstractC4316z1Y1.f22488D.setVisibility(0);
            y1().getRoot().setAlpha(0.0f);
        } else {
            y1().getRoot().setAlpha(1.0f);
        }
    }

    private final void W1(Pj.a loadingState) {
        if (!loadingState.getIsLoading()) {
            this.productsSection.L();
        } else {
            this.productsSection.M(new f(loadingState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(String beacon, String formatLevelBeacon) {
        A1().A1(new e1.AbstractC12581j.SendCriteoLoadBeacon(beacon, formatLevelBeacon, Ul.a.f37566b, null, 8, null));
    }

    private final void c2(String productTitle) {
        ProductsFragment.b bVar;
        InterfaceC18089i activity = getActivity();
        ProductsFragment.b bVar2 = null;
        if (activity instanceof ProductsFragment.b) {
            bVar = (ProductsFragment.b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.j0(productTitle);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        if (parentFragment instanceof ProductsFragment.b) {
            bVar2 = (ProductsFragment.b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.j0(productTitle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(List<String> beacon, String formatLevelBeacon) {
        A1().A1(new e1.AbstractC12581j.SendCriteoViewBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(ProductsFragmentCompose productsFragmentCompose, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragmentCompose.A1().onAction(new a.Clip(coupon, C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: an.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragmentCompose.f2((TrackingData) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSubstitutionResult(C14274a result) {
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
            Snackbar.q0(y1().getRoot(), i10, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: an.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductsFragmentCompose.L1(this.f45523a, view);
                }
            }).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(int totalResults, int tokenMatchCount, int embeddingsCount) {
        x0 x0Var;
        InterfaceC18089i activity = getActivity();
        x0 x0Var2 = null;
        if (activity instanceof x0) {
            x0Var = (x0) activity;
        } else {
            x0Var = null;
        }
        if (x0Var != null) {
            x0Var.K0(totalResults, tokenMatchCount, embeddingsCount);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        if (parentFragment instanceof x0) {
            x0Var2 = (x0) parentFragment;
        }
        if (x0Var2 != null) {
            x0Var2.K0(totalResults, tokenMatchCount, embeddingsCount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j2(int errorMessageId) {
        if (!C1().b()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
            new Qj.f(fragmentActivityRequireActivity, errorMessageId, this).g();
            return false;
        }
        return true;
    }

    @Override // an.InterfaceC5728a
    public void B(boolean shouldShowZeroResults) {
        A1().A1(new e1.AbstractC12581j.ZeroResultsVisibilityAction(shouldShowZeroResults));
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12229p0.b
    public void f0() {
        A1().A1(e1.AbstractC12581j.f.f112103a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(A1());
    }

    @Override // Qj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Bl.k.b(contextRequireContext, false, null, 536872912, null, null, null, 118, null).putExtra("unauth_search_term", this.searchTerm));
    }
}
