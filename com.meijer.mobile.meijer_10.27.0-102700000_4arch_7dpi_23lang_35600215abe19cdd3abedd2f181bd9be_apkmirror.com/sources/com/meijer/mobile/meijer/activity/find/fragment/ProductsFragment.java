package com.meijer.mobile.meijer.activity.find.fragment;

import Al.t;
import Ao.C2930u;
import Ao.e0;
import Bj.o;
import Bj.p;
import Co.ProductFullDetails;
import Es.d;
import Ho.ProductSponsorship;
import Mn.AbstractC4311z1;
import Mn.Z1;
import Mn.r3;
import Oj.a;
import Ok.Coupon;
import Pk.a;
import Qo.l;
import V2.CreationExtras;
import Zm.InterfaceC5528a;
import Zm.x0;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.X;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.InterfaceC6020j;
import androidx.view.InterfaceC6030s;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.find.C12104p0;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import com.meijer.mobile.meijer.activity.personalized.modals.C12490t0;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import is.C14759a;
import j2.C14835c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.C14886b;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import nu.C15949d;
import ou.AbstractC16177a;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.Z;
import tr.C17135b;
import ts.ProductCardDecorator;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import tv.P;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import yl.AbstractC18227f;
import yo.C18264a;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003ù\u0001UB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J1\u00102\u001a\u00020\u000b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u00103J7\u0010:\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00132\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000b2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010\u0011J\u0019\u0010A\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ+\u0010H\u001a\u00020G2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010@\u001a\u0004\u0018\u00010?H\u0017¢\u0006\u0004\bH\u0010IJ'\u0010P\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bR\u0010QJ\u001b\u0010U\u001a\u00020\u00152\n\u0010T\u001a\u00060\u001cj\u0002`SH\u0016¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0,2\u0006\u0010X\u001a\u00020\u001cH\u0016¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0,2\u0006\u0010X\u001a\u00020\u001cH\u0016¢\u0006\u0004\b[\u0010ZJ\u0017\u0010]\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020JH\u0016¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020G2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000bH\u0016¢\u0006\u0004\bb\u0010\bJ!\u0010e\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u001c2\b\u0010d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\be\u0010+J\u000f\u0010f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bf\u0010\bJ\u0019\u0010i\u001a\u00020\u000b2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010jJ'\u0010p\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\u0013H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u000bH\u0016¢\u0006\u0004\br\u0010\bJ\u000f\u0010s\u001a\u00020\u000bH\u0016¢\u0006\u0004\bs\u0010\bJ\u000f\u0010t\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010\bJ\u000f\u0010u\u001a\u00020\u000bH\u0016¢\u0006\u0004\bu\u0010\bJ\u0017\u0010v\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u000bH\u0016¢\u0006\u0004\bx\u0010\bR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0097\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\be\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010§\u0001\u001a\u00030 \u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010·\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010Ã\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R!\u0010É\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Ï\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001c\u0010×\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R!\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001a\u0010ä\u0001\u001a\u00030á\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001b\u0010ç\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001b\u0010é\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010æ\u0001R\u0017\u0010ì\u0001\u001a\u00030ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010ë\u0001R\u001c\u0010ð\u0001\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R)\u0010ö\u0001\u001a\u0014\u0012\u000f\u0012\r ó\u0001*\u0005\u0018\u00010ò\u00010ò\u00010ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u0017\u0010n\u001a\u00030Ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010ø\u0001¨\u0006ú\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "LEs/d$c;", "LPj/g;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "LZm/a;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "B1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V", "LOj/a;", "loadingState", "Z1", "(LOj/a;)V", "a2", "", "errorMessageId", "", "j2", "(I)Z", "Lg/a;", "result", "handleSubstitutionResult", "(Lg/a;)V", "", "productTitle", "c2", "(Ljava/lang/String;)V", "count", "h2", "(I)V", "totalResults", "tokenMatchCount", "embeddingsCount", "i2", "(III)V", "suggestion", "originalTerm", "L1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lvs/f;", "products", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "noResultDecorator", "shouldShowZeroResults", "S1", "(Ljava/util/List;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Z)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LOk/a;", "coupon", "d2", "(IIIILOk/a;)V", "K1", "(LOk/a;)V", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "l0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "R", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "U0", "product", "m0", "(LCo/h;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "query", "searchMethod", "i", "e", "Landroid/view/MotionEvent;", "ev", "T", "(Landroid/view/MotionEvent;)V", "Lts/a;", "itemClicked", "Landroidx/databinding/p;", "binding", "position", "a0", "(Lts/a;Landroidx/databinding/p;I)V", "N", "onCreateAccount", "onSignIn", "C", "z", "(Z)V", "d0", "Lwr/f;", "f", "Lwr/f;", "v1", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lyo/k;", "g", "Lyo/k;", "A1", "()Lyo/k;", "setUserManager$Meijer_playstoreRelease", "(Lyo/k;)V", "userManager", "Lyo/a;", "h", "Lyo/a;", "getAppPrefManager$Meijer_playstoreRelease", "()Lyo/a;", "setAppPrefManager$Meijer_playstoreRelease", "(Lyo/a;)V", "appPrefManager", "Lyl/k;", "Lyl/k;", "w1", "()Lyl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lyl/k;)V", "featureManager", "Lgi/a;", "j", "Lgi/a;", "t1", "()Lgi/a;", "setAnalyticsEngine$Meijer_playstoreRelease", "(Lgi/a;)V", "analyticsEngine", "LRo/a;", "k", "LRo/a;", "x1", "()LRo/a;", "setProductAnalytics$Meijer_playstoreRelease", "(LRo/a;)V", "productAnalytics", "LCl/e;", "l", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "LAl/g;", "m", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "Lpp/e;", "n", "Lpp/e;", "z1", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "LPp/b;", "o", "LPp/b;", "searchType", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "p", "Lkotlin/Lazy;", "y1", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "productsViewModel", "q", "Z", "sendSearchResultsAnalytics", "r", "I", "productCount", "Lnu/l;", "s", "Lnu/l;", "productsSection", "Lvs/b;", "t", "Lvs/b;", "itemToSubstitute", "Lnu/d;", "Lnu/g;", "u", "Lnu/d;", "productsAdapter", "LMn/z1;", "v", "LMn/z1;", "_binding", "LEs/d;", "w", "LEs/d;", "animator", "x", "Ljava/lang/String;", "searchTerm", "y", "sponsoredProductSearchTerm", "Lcom/meijer/mobile/meijer/activity/find/p0;", "Lcom/meijer/mobile/meijer/activity/find/p0;", "scrollListener", "Lcom/google/android/material/snackbar/Snackbar;", "A", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "B", "Lg/c;", "substitutionResultLauncher", "u1", "()LMn/z1;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ProductsFragment extends Hilt_ProductsFragment implements C12490t0.a, d.c, Pj.g, C12104p0.b, InterfaceC5528a {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f106796D = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Snackbar currentSnackbar;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public wr.f cartInteractor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public C18264a appPrefManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Ro.a productAnalytics;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public pp.e sponsorshipsDataStore;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f28356a;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy productsViewModel;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean sendSearchResultsAnalytics;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int productCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private nu.l productsSection;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator itemToSubstitute;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> productsAdapter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AbstractC4311z1 _binding;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Es.d animator;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String searchTerm;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String sponsoredProductSearchTerm;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final C12104p0 scrollListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$a;", "", "<init>", "()V", "", "query", "LPp/b;", "searchType", "Lvs/b;", "productToSubstitute", "Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment;", "a", "(Ljava/lang/String;LPp/b;Lvs/b;)Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment;", "ARG_SEARCH_QUERY", "Ljava/lang/String;", "ARG_SEARCH_TYPE", "ARG_ITEM_TO_SUBSTITUTE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ProductsFragment b(Companion companion, String str, Pp.b bVar, CartProductListDecorator cartProductListDecorator, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                bVar = Pp.b.f28356a;
            }
            if ((i10 & 4) != 0) {
                cartProductListDecorator = null;
            }
            return companion.a(str, bVar, cartProductListDecorator);
        }

        @JvmStatic
        public final ProductsFragment a(String query, Pp.b searchType, CartProductListDecorator productToSubstitute) {
            Intrinsics.j(searchType, "searchType");
            ProductsFragment productsFragment = new ProductsFragment();
            productsFragment.setArguments(C14835c.b(TuplesKt.a("ARG_SEARCH_QUERY", query), TuplesKt.a("ARG_SEARCH_TYPE", searchType), TuplesKt.a("ARG_ITEM_TO_SUBSTITUTE", productToSubstitute)));
            return productsFragment;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$b;", "", "", "firstItemDescription", "", "h0", "(Ljava/lang/String;)V", "", "count", "M", "(I)V", "suggestionTerm", "originalTerm", "B", "(Ljava/lang/String;Ljava/lang/String;)V", "LQo/l$k;", "query", "N", "(LQo/l$k;)V", "", "itemSelected", "T", "(Z)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void B(String suggestionTerm, String originalTerm);

        void M(int count);

        void N(l.k query);

        void T(boolean itemSelected);

        void h0(String firstItemDescription);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pp.b.values().length];
            try {
                iArr[Pp.b.f28358c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pp.b.f28359d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$3", f = "ProductsFragment.kt", l = {HttpResponseStatus.SUCCESS_PARTIAL_CONTENT}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106820a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$3$1", f = "ProductsFragment.kt", l = {207}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductsFragment f106823b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$d$a$a, reason: collision with other inner class name */
            static final class C1609a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProductsFragment f106824a;

                C1609a(ProductsFragment productsFragment) {
                    this.f106824a = productsFragment;
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                    this.f106824a.Z1(viewState.getLoadingState());
                    this.f106824a.S1(viewState.q(), viewState.getNoProductResult(), viewState.getShouldShowZeroResults());
                    this.f106824a.h2(viewState.x());
                    this.f106824a.i2(viewState.x(), viewState.getTokenMatch(), viewState.getEmbeddingsMatch());
                    x4.i activity = this.f106824a.getActivity();
                    b bVar = activity instanceof b ? (b) activity : null;
                    if (bVar != null) {
                        bVar.T(viewState.getItemSelected());
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductsFragment productsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f106823b = productsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f106823b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f106822a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    P<e1.ViewState> pM1 = this.f106823b.y1().m1();
                    C1609a c1609a = new C1609a(this.f106823b);
                    this.f106822a = 1;
                    if (pM1.collect(c1609a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragment.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106820a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6030s viewLifecycleOwner = ProductsFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6023l.b bVar = AbstractC6023l.b.f55279e;
                a aVar = new a(ProductsFragment.this, null);
                this.f106820a = 1;
                if (C5994J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$4", f = "ProductsFragment.kt", l = {227}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106825a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$4$1", f = "ProductsFragment.kt", l = {228}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106827a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductsFragment f106828b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$e$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1610a implements InterfaceC17153g, FunctionAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProductsFragment f106829a;

                C1610a(ProductsFragment productsFragment) {
                    this.f106829a = productsFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC17153g) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.f106829a, ProductsFragment.class, "handleEvent", "handleEvent(Lcom/meijer/mobile/meijer/activity/personalized/modals/ProductsViewModel$Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // tv.InterfaceC17153g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(e1.AbstractC12460n abstractC12460n, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                    Object objG = a.g(this.f106829a, abstractC12460n, continuation);
                    return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductsFragment productsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f106828b = productsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f106828b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object g(ProductsFragment productsFragment, e1.AbstractC12460n abstractC12460n, Continuation continuation) throws Resources.NotFoundException {
                productsFragment.B1(abstractC12460n);
                return Unit.f142422a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f106827a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<e1.AbstractC12460n> events = this.f106828b.y1().getEvents();
                    C1610a c1610a = new C1610a(this.f106828b);
                    this.f106827a = 1;
                    if (events.collect(c1610a, this) == objF) {
                        return objF;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragment.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106825a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6030s viewLifecycleOwner = ProductsFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6023l.b bVar = AbstractC6023l.b.f55279e;
                a aVar = new a(ProductsFragment.this, null);
                this.f106825a = 1;
                if (C5994J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$f", "Lou/a;", "LMn/Z1;", "viewBinding", "", "position", "", "A", "(LMn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LMn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends AbstractC16177a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Oj.a f106830e;

        f(Oj.a aVar) {
            this.f106830e = aVar;
        }

        @Override // ou.AbstractC16177a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f20435z.U(this.f106830e.getMessage(), this.f106830e.getIsLoading());
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
            return V.f99316C0;
        }

        @Override // nu.h
        public long i() {
            return getLayoutId();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$setSendSearchResultsAnalytics$1", f = "ProductsFragment.kt", l = {566}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106831a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragment.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106831a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f106831a = 1;
                if (Z.b(3000L, this) == objF) {
                    return objF;
                }
            }
            ProductsFragment.this.a2();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/fragment/app/Fragment;", "c", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<Fragment> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f106833f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f106833f = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f106833f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/h0;", "c", "()Landroidx/lifecycle/h0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<h0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106834f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0) {
            super(0);
            this.f106834f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) this.f106834f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Lazy f106835f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Lazy lazy) {
            super(0);
            this.f106835f = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return X.c(this.f106835f).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106836f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f106837g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, Lazy lazy) {
            super(0);
            this.f106836f = function0;
            this.f106837g = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106836f;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            h0 h0VarC = X.c(this.f106837g);
            InterfaceC6020j interfaceC6020j = h0VarC instanceof InterfaceC6020j ? (InterfaceC6020j) h0VarC : null;
            return interfaceC6020j != null ? interfaceC6020j.getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f106838f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f106839g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, Lazy lazy) {
            super(0);
            this.f106838f = fragment;
            this.f106839g = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            f0.c defaultViewModelProviderFactory;
            h0 h0VarC = X.c(this.f106839g);
            InterfaceC6020j interfaceC6020j = h0VarC instanceof InterfaceC6020j ? (InterfaceC6020j) h0VarC : null;
            return (interfaceC6020j == null || (defaultViewModelProviderFactory = interfaceC6020j.getDefaultViewModelProviderFactory()) == null) ? this.f106838f.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
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
            return new FunctionReferenceImpl(1, ProductsFragment.this, ProductsFragment.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ProductsFragment.this.handleSubstitutionResult(p02);
        }
    }

    @Override // Zm.InterfaceC5528a
    public void e() {
        this.sendSearchResultsAnalytics = true;
        InterfaceC6030s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16648k.d(C6031t.a(viewLifecycleOwner), null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(final e1.AbstractC12460n event) throws Resources.NotFoundException {
        RecyclerView.h adapter;
        if (event instanceof e1.AbstractC12460n.UpdateProductsInfoEvent) {
            e1.AbstractC12460n.UpdateProductsInfoEvent updateProductsInfoEvent = (e1.AbstractC12460n.UpdateProductsInfoEvent) event;
            if (updateProductsInfoEvent.getTotalProductCount() > 0) {
                c2(updateProductsInfoEvent.getFirstProductName());
            }
            if (this.sendSearchResultsAnalytics) {
                t1().i(C14476c.h("Product Search Page"), new Function1() { // from class: Zm.X
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductsFragment.H1(event, (TrackingData) obj);
                    }
                });
            }
        } else {
            if (event instanceof e1.AbstractC12460n.UpdateToCartFailedEvent) {
                View root = u1().getRoot();
                String string = getResources().getString(((e1.AbstractC12460n.UpdateToCartFailedEvent) event).getMessageResId());
                Intrinsics.i(string, "getString(...)");
                Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                Intrinsics.i(snackbarR0, "make(...)");
                Vj.b.b(snackbarR0).c0();
                return;
            }
            if (event instanceof e1.AbstractC12460n.ShoppingListUpdateFailedEvent) {
                Context contextRequireContext = requireContext();
                Intrinsics.i(contextRequireContext, "requireContext(...)");
                e1.AbstractC12460n.ShoppingListUpdateFailedEvent shoppingListUpdateFailedEvent = (e1.AbstractC12460n.ShoppingListUpdateFailedEvent) event;
                new Pj.j(contextRequireContext, shoppingListUpdateFailedEvent.getMessageResId(), new Object[0]).r(shoppingListUpdateFailedEvent.getTitleResId(), new Object[0]).g();
                return;
            }
            if (event instanceof e1.AbstractC12460n.AddToShoppingListSuccessEvent) {
                e1.AbstractC12460n.AddToShoppingListSuccessEvent addToShoppingListSuccessEvent = (e1.AbstractC12460n.AddToShoppingListSuccessEvent) event;
                Snackbar.q0(u1().getRoot(), addToShoppingListSuccessEvent.getMessageResId(), 0).t0(addToShoppingListSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: Zm.Y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductsFragment.I1(this.f42878a, view);
                    }
                }).c0();
                return;
            }
            if (event instanceof e1.AbstractC12460n.CartUpdateSuccessEvent) {
                e1.AbstractC12460n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12460n.CartUpdateSuccessEvent) event;
                Snackbar.q0(u1().getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0).t0(cartUpdateSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: Zm.Z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductsFragment.C1(this.f42879a, view);
                    }
                }).c0();
                return;
            }
            if (event instanceof e1.AbstractC12460n.OpenLowStockScreenEvent) {
                Context context = getContext();
                if (context != null) {
                    this.substitutionResultLauncher.a(t.e(t.f694a, context, ((e1.AbstractC12460n.OpenLowStockScreenEvent) event).getDecorator(), Pp.c.f28366d, null, "product search page", 8, null));
                }
            } else {
                if (event instanceof e1.AbstractC12460n.ShowChokingWarningDialogEvent) {
                    e1.AbstractC12460n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (e1.AbstractC12460n.ShowChokingWarningDialogEvent) event;
                    new C14886b(u1().getRoot().getContext(), p.f3060d).setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Bj.i.f2666J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody()).setPositiveButton(showChokingWarningDialogEvent.a().getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: Zm.a0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ProductsFragment.D1(this.f42880a, event, dialogInterface, i10);
                        }
                    }).setNegativeButton(showChokingWarningDialogEvent.a().getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: Zm.E
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ProductsFragment.E1(this.f42859a, event, dialogInterface, i10);
                        }
                    }).show();
                    return;
                }
                if (!(event instanceof e1.AbstractC12460n.BubbleFacetsToFilterAndSort)) {
                    if (event instanceof e1.AbstractC12460n.ShowError) {
                        if (u1().f21155C.getAdapter() != null && u1().f21155C.getLayoutManager() != null && (u1().f21155C.getLayoutManager() instanceof LinearLayoutManager) && (adapter = u1().f21155C.getAdapter()) != null) {
                            RecyclerView.p layoutManager = u1().f21155C.getLayoutManager();
                            Intrinsics.h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            int iR2 = ((LinearLayoutManager) layoutManager).r2();
                            RecyclerView.p layoutManager2 = u1().f21155C.getLayoutManager();
                            Intrinsics.h(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            adapter.notifyItemRangeChanged(iR2, ((LinearLayoutManager) layoutManager2).u2());
                        }
                        C14886b cancelable = new C14886b(u1().getRoot().getContext()).setCancelable(false);
                        e1.AbstractC12460n.ShowError showError = (e1.AbstractC12460n.ShowError) event;
                        AbstractC5607a title = showError.getTitle();
                        Context context2 = u1().getRoot().getContext();
                        Intrinsics.i(context2, "getContext(...)");
                        C14886b title2 = cancelable.setTitle(title.b(context2));
                        AbstractC5607a message = showError.getMessage();
                        Context context3 = u1().getRoot().getContext();
                        Intrinsics.i(context3, "getContext(...)");
                        C14886b message2 = title2.setMessage(message.b(context3));
                        AbstractC5607a positiveButtonText = showError.getPositiveButtonText();
                        Context context4 = u1().getRoot().getContext();
                        Intrinsics.i(context4, "getContext(...)");
                        message2.setPositiveButton(positiveButtonText.b(context4), new DialogInterface.OnClickListener() { // from class: Zm.F
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                ProductsFragment.F1(dialogInterface, i10);
                            }
                        }).show();
                        return;
                    }
                    if (event instanceof e1.AbstractC12460n.ClipCouponFailedEvent) {
                        e1.AbstractC12460n.ClipCouponFailedEvent clipCouponFailedEvent = (e1.AbstractC12460n.ClipCouponFailedEvent) event;
                        d2(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon());
                        return;
                    }
                    if ((event instanceof e1.AbstractC12460n.LaunchFilterAndSortEvent) || Intrinsics.e(event, e1.AbstractC12460n.g.f111345a) || (event instanceof e1.AbstractC12460n.ProductListErrorEvent) || (event instanceof e1.AbstractC12460n.ProductListSuccess) || (event instanceof e1.AbstractC12460n.ViewItemInShoppingListEvent) || (event instanceof e1.AbstractC12460n.ViewProductDetailsEvent) || Intrinsics.e(event, e1.AbstractC12460n.w.f111371a)) {
                        return;
                    }
                    if ((event instanceof e1.AbstractC12460n.i) || Intrinsics.e(event, e1.AbstractC12460n.l.f111351a)) {
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
                    if (event instanceof e1.AbstractC12460n.SubstitutionFailureEvent) {
                        e1.AbstractC12460n.SubstitutionFailureEvent substitutionFailureEvent = (e1.AbstractC12460n.SubstitutionFailureEvent) event;
                        new C14886b(u1().getRoot().getContext()).setTitle(substitutionFailureEvent.getTitleResId()).setCancelable(false).setMessage(substitutionFailureEvent.getMessageResId()).setPositiveButton(C17135b.f162005W, new DialogInterface.OnClickListener() { // from class: Zm.G
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                ProductsFragment.G1(dialogInterface, i10);
                            }
                        }).show();
                        return;
                    }
                    if (!(event instanceof e1.AbstractC12460n.ShowFreeItemsSnackbar)) {
                        if (!(event instanceof e1.AbstractC12460n.e)) {
                            if (!(event instanceof e1.AbstractC12460n.ShowPlpEvent)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        } else {
                            Snackbar snackbar = this.currentSnackbar;
                            if (snackbar != null) {
                                snackbar.A();
                                return;
                            }
                            return;
                        }
                    }
                    View root2 = u1().getRoot();
                    AbstractC5607a message3 = ((e1.AbstractC12460n.ShowFreeItemsSnackbar) event).getMessage();
                    Context context5 = u1().getRoot().getContext();
                    Intrinsics.i(context5, "getContext(...)");
                    Snackbar snackbarR02 = Snackbar.r0(root2, message3.b(context5), -2);
                    Intrinsics.i(snackbarR02, "make(...)");
                    Snackbar snackbarC = Vj.b.c(snackbarR02);
                    snackbarC.c0();
                    this.currentSnackbar = snackbarC;
                    return;
                }
                x4.i activity3 = getActivity();
                b bVar = activity3 instanceof b ? (b) activity3 : null;
                if (bVar != null) {
                    bVar.N(((e1.AbstractC12460n.BubbleFacetsToFilterAndSort) event).getQuery());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(e1.AbstractC12460n abstractC12460n, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        e1.AbstractC12460n.UpdateProductsInfoEvent updateProductsInfoEvent = (e1.AbstractC12460n.UpdateProductsInfoEvent) abstractC12460n;
        stageEvent.h("outOfStockProductList", updateProductsInfoEvent.getOutOfStockList());
        stageEvent.h("lowStockProducts", updateProductsInfoEvent.getLowStockList());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(ProductsFragment productsFragment, l.k it) {
        Intrinsics.j(it, "it");
        productsFragment.y1().x1(new e1.AbstractC12456j.SetFilterAndSortOptions(it));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchMethod", "Spelling Suggestions");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("pageName", "Meijer:Search Results Page");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: search");
        track.v("search");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(int i10, ProductsFragment productsFragment, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        e0.a(productsFragment.z1().a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(final ProductsFragment productsFragment, List list) {
        if (!Intrinsics.e(productsFragment.searchTerm, productsFragment.sponsoredProductSearchTerm)) {
            productsFragment.u1().f21155C.smoothScrollToPosition(0);
            productsFragment.sponsoredProductSearchTerm = productsFragment.searchTerm;
        }
        List<ProductListDecorator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (final ProductListDecorator productListDecorator : list2) {
            arrayList.add(new C12490t0(productListDecorator, productsFragment, new Function0() { // from class: Zm.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProductsFragment.U1(this.f42862a, productListDecorator);
                }
            }, new Function0() { // from class: Zm.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProductsFragment.W1(this.f42864a, productListDecorator);
                }
            }, productsFragment.w1(), productsFragment.A1().b(), productsFragment.searchType, productsFragment.itemToSubstitute, new Function1() { // from class: Zm.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragment.X1(this.f42866a, productListDecorator, (String) obj);
                }
            }));
        }
        productsFragment.productsSection.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("Product Search Results Page");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductSponsorship X1(ProductsFragment productsFragment, ProductListDecorator productListDecorator, String it) {
        Intrinsics.j(it, "it");
        return productsFragment.z1().a(productListDecorator.getProduct().getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(Oj.a loadingState) {
        if (loadingState instanceof a.Paging) {
            Y1(loadingState);
            return;
        }
        if (loadingState instanceof a.Loading) {
            u1().f21158F.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
        } else {
            if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
                throw new NoWhenBranchMatchedException();
            }
            Y1(loadingState);
            u1().f21158F.U(loadingState.getMessage(), loadingState.getIsLoading());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        if (!this.sendSearchResultsAnalytics || this.searchTerm == null) {
            return;
        }
        this.sendSearchResultsAnalytics = false;
        t1().f(C14476c.h("Product Search Page"), new Function1() { // from class: Zm.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.b2(this.f42861a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(ProductsFragment productsFragment, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("numberOfSearchResults", String.valueOf(productsFragment.productCount));
        return Unit.f142422a;
    }

    private final void d2(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C14886b(requireContext()).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: Zm.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProductsFragment.e2(this.f42871a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: Zm.P
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProductsFragment.g2(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("Product Search Results Page");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(int count) {
        this.productCount = count;
        x4.i activity = getActivity();
        b bVar = activity instanceof b ? (b) activity : null;
        if (bVar != null) {
            bVar.M(count);
        }
        x4.i parentFragment = getParentFragment();
        b bVar2 = parentFragment instanceof b ? (b) parentFragment : null;
        if (bVar2 != null) {
            bVar2.M(count);
        }
    }

    private final AbstractC4311z1 u1() {
        AbstractC4311z1 abstractC4311z1 = this._binding;
        Intrinsics.g(abstractC4311z1);
        return abstractC4311z1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 y1() {
        return (e1) this.productsViewModel.getValue();
    }

    public final yo.k A1() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    @Override // Zm.InterfaceC5528a
    public void C() {
        int i10 = c.$EnumSwitchMapping$0[this.searchType.ordinal()];
        if (i10 == 1) {
            y1().x1(e1.AbstractC12456j.a.f111228a);
        } else {
            if (i10 != 2) {
                return;
            }
            y1().x1(e1.AbstractC12456j.p.f111261a);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void R(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        y1().x1(new e1.AbstractC12456j.StepperStateChangedAction(productToAdd.getCode(), controlState.getValueState().getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void U0(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y1().x1(new e1.AbstractC12456j.SendCriteoClickBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !v1().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void a0(final ProductCardDecorator itemClicked, androidx.databinding.p binding, int position) {
        Intrinsics.j(itemClicked, "itemClicked");
        Intrinsics.j(binding, "binding");
        Pp.b bVar = this.searchType;
        Pp.b bVar2 = Pp.b.f28358c;
        if (bVar == bVar2 || bVar == Pp.b.f28359d) {
            if (bVar == bVar2 || bVar == Pp.b.f28359d) {
                y1().x1(new e1.AbstractC12456j.ItemSelectedAction(itemClicked, this.searchType, position));
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        MaterialCardView listItemContainer = ((r3) binding).f20926G;
        Intrinsics.i(listItemContainer, "listItemContainer");
        arrayList.add(listItemContainer);
        t1().h(C14476c.a("event: search: product detail"), new Function1() { // from class: Zm.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.Q1((TrackingData) obj);
            }
        });
        Iterator<ProductListDecorator> it = y1().m1().getValue().q().iterator();
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
            t1().i(C14476c.h("Product Details Page"), new Function1() { // from class: Zm.M
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragment.R1(iIntValue, this, itemClicked, (TrackingData) obj);
                }
            });
            t1().e(C2930u.f1407a.h0(iIntValue));
        }
        x1().j(itemClicked.getProductQuery(), itemClicked.getProduct(), position);
        Ds.a.d(this, Al.g.t(getFeatureEntryPoint(), itemClicked.getProduct(), true, false, null, 12, null), arrayList);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void d1(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y1().x1(new e1.AbstractC12456j.SendCriteoViewBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    @Override // Zm.InterfaceC5528a
    public void i(String query, String searchMethod) {
        Intrinsics.j(query, "query");
        Es.d dVar = this.animator;
        if (dVar == null) {
            Intrinsics.y("animator");
            dVar = null;
        }
        dVar.g(true);
        this.searchTerm = query;
        e1.b2(y1(), query, false, searchMethod, 2, null);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void l0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        this.sendSearchResultsAnalytics = false;
        if (j2(o.f3011d)) {
            y1().x1(new e1.AbstractC12456j.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
        }
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12490t0.a
    public void m0(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        if (j2(o.f3013e)) {
            t tVar = t.f694a;
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(t.e(tVar, contextRequireContext, null, Pp.c.f28365c, product, "product search page", 2, null));
        }
    }

    @Override // Pj.g
    public void onCreateAccount() {
        Al.f fVar = Al.f.f666a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, w1().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ShowToast"})
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = AbstractC4311z1.K0(inflater, container, false);
        FragmentActivity activity = getActivity();
        SearchProductActivity searchProductActivity = activity instanceof SearchProductActivity ? (SearchProductActivity) activity : null;
        if (searchProductActivity != null) {
            searchProductActivity.w2(new Function1() { // from class: Zm.O
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragment.M1(this.f42873a, (l.k) obj);
                }
            });
        }
        RecyclerView recyclerView = u1().f21155C;
        recyclerView.setAdapter(this.productsAdapter);
        C14759a c14759a = new C14759a(u1().f21155C.getContext(), 1);
        Drawable drawableE = Z1.b.e(recyclerView.getContext(), S.f98754v0);
        Intrinsics.g(drawableE);
        c14759a.h(drawableE);
        recyclerView.addItemDecoration(c14759a);
        recyclerView.addOnScrollListener(this.scrollListener);
        Es.d dVar = new Es.d();
        this.animator = dVar;
        dVar.f(this);
        Es.d dVar2 = this.animator;
        if (dVar2 == null) {
            Intrinsics.y("animator");
            dVar2 = null;
        }
        recyclerView.setItemAnimator(dVar2);
        InterfaceC6030s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16648k.d(C6031t.a(viewLifecycleOwner), null, null, new d(null), 3, null);
        InterfaceC6030s viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C16648k.d(C6031t.a(viewLifecycleOwner2), null, null, new e(null), 3, null);
        u1().f21160H.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Zm.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductsFragment.N1(this.f42874a, view);
            }
        });
        t1().i(C14476c.h("Product Search Page"), new Function1() { // from class: Zm.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.P1((TrackingData) obj);
            }
        });
        View viewJ = Zr.a.j(u1().getRoot(), false, 1, null);
        Intrinsics.g(viewJ);
        return viewJ;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Es.d dVar = this.animator;
        if (dVar == null) {
            Intrinsics.y("animator");
            dVar = null;
        }
        dVar.f(null);
        u1().f21155C.removeOnScrollListener(this.scrollListener);
        this._binding = null;
        super.onDestroyView();
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
                arguments = C14835c.a();
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
        e1 e1VarY1 = y1();
        String str = this.searchTerm;
        if (str == null) {
            str = "";
        }
        e1.Y1(e1VarY1, new l.Search(str, null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 524286, null), false, 2, null);
        if (i10 >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("ARG_ITEM_TO_SUBSTITUTE", CartProductListDecorator.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("ARG_ITEM_TO_SUBSTITUTE");
            parcelable = (CartProductListDecorator) (parcelable2 instanceof CartProductListDecorator ? parcelable2 : null);
        }
        this.itemToSubstitute = (CartProductListDecorator) parcelable;
        y1().U1(this.itemToSubstitute);
    }

    public final InterfaceC14261a t1() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final wr.f v1() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("cartInteractor");
        return null;
    }

    public final yl.k w1() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final Ro.a x1() {
        Ro.a aVar = this.productAnalytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("productAnalytics");
        return null;
    }

    public final pp.e z1() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("sponsorshipsDataStore");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsFragment() {
        Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.f142381c, new i(new h(this)));
        this.productsViewModel = X.b(this, Reflection.b(e1.class), new j(lazyA), new k(null, lazyA), new l(this, lazyA));
        this.productsSection = new nu.l();
        C15949d<nu.g> c15949d = new C15949d<>();
        c15949d.c(this.productsSection);
        this.productsAdapter = c15949d;
        this.sponsoredProductSearchTerm = "";
        this.scrollListener = new C12104p0(this, null, 2, 0 == true ? 1 : 0);
        AbstractC14147c<Intent> abstractC14147cRegisterForActivityResult = registerForActivityResult(new h.i(), new m());
        Intrinsics.i(abstractC14147cRegisterForActivityResult, "registerForActivityResult(...)");
        this.substitutionResultLauncher = abstractC14147cRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C1(ProductsFragment productsFragment, View view) {
        productsFragment.startActivity(productsFragment.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(ProductsFragment productsFragment, e1.AbstractC12460n abstractC12460n, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragment.y1().x1(new e1.AbstractC12456j.UserAcceptAddToCartAction(((e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n).a().b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(ProductsFragment productsFragment, e1.AbstractC12460n abstractC12460n, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragment.y1().x1(new e1.AbstractC12456j.ResetActiveStepper(((e1.AbstractC12460n.ShowChokingWarningDialogEvent) abstractC12460n).a().b().getProductCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(ProductsFragment productsFragment, View view) {
        Cl.e meijerIntent = productsFragment.getMeijerIntent();
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        productsFragment.startActivity(meijerIntent.D(context, productsFragment.w1().e(AbstractC18227f.O.f170554h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(ProductsFragment productsFragment, View view) {
        productsFragment.startActivity(productsFragment.getFeatureEntryPoint().d());
    }

    private final void K1(Coupon coupon) {
        startActivity(Cl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    private final void L1(String suggestion, String originalTerm) {
        b bVar;
        x4.i activity = getActivity();
        b bVar2 = null;
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.B(suggestion, originalTerm);
        }
        x4.i parentFragment = getParentFragment();
        if (parentFragment instanceof b) {
            bVar2 = (b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.B(suggestion, originalTerm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(ProductsFragment productsFragment, View view) {
        productsFragment.t1().i(C14476c.h("Product Search Page"), new Function1() { // from class: Zm.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.O1((TrackingData) obj);
            }
        });
        productsFragment.L1(productsFragment.u1().f21160H.f21045B.getText().toString(), productsFragment.u1().f21161z.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(final List<ProductListDecorator> products, e1.NoResultDecorator noResultDecorator, boolean shouldShowZeroResults) {
        AbstractC5607a abstractC5607aA;
        boolean z10;
        int i10;
        int noResultVisibility;
        int noResultVisibility2;
        int suggestionVisibility;
        AbstractC4311z1 abstractC4311z1U1 = u1();
        if (!products.isEmpty()) {
            abstractC4311z1U1.f21155C.post(new Runnable() { // from class: Zm.W
                @Override // java.lang.Runnable
                public final void run() {
                    ProductsFragment.T1(this.f42875a, products);
                }
            });
        }
        TextView noProductResultForProduct = abstractC4311z1U1.f21161z;
        Intrinsics.i(noProductResultForProduct, "noProductResultForProduct");
        String spellSuggestionTerm = null;
        if (noResultDecorator != null) {
            abstractC5607aA = noResultDecorator.a();
        } else {
            abstractC5607aA = null;
        }
        bk.d.g(noProductResultForProduct, abstractC5607aA);
        FullWordEllipsisTextView fullWordEllipsisTextView = abstractC4311z1U1.f21160H.f21045B;
        if (noResultDecorator != null) {
            spellSuggestionTerm = noResultDecorator.getSpellSuggestionTerm();
        }
        if (spellSuggestionTerm == null) {
            spellSuggestionTerm = "";
        }
        fullWordEllipsisTextView.setText(spellSuggestionTerm);
        RecyclerView productsList = abstractC4311z1U1.f21155C;
        Intrinsics.i(productsList, "productsList");
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
        TextView textView = abstractC4311z1U1.f21154B;
        if (noResultDecorator != null) {
            noResultVisibility = noResultDecorator.getNoResultVisibility();
        } else {
            noResultVisibility = 8;
        }
        textView.setVisibility(noResultVisibility);
        TextView textView2 = abstractC4311z1U1.f21161z;
        if (noResultDecorator != null) {
            noResultVisibility2 = noResultDecorator.getNoResultVisibility();
        } else {
            noResultVisibility2 = 8;
        }
        textView2.setVisibility(noResultVisibility2);
        TextView textView3 = abstractC4311z1U1.f21153A;
        if (noResultDecorator != null) {
            suggestionVisibility = noResultDecorator.getSuggestionVisibility();
        } else {
            suggestionVisibility = 8;
        }
        textView3.setVisibility(suggestionVisibility);
        View root = abstractC4311z1U1.f21160H.getRoot();
        if (noResultDecorator != null) {
            suggestionVisibility2 = noResultDecorator.getSuggestionVisibility();
        }
        root.setVisibility(suggestionVisibility2);
        if (shouldShowZeroResults) {
            abstractC4311z1U1.f21155C.setVisibility(0);
            u1().getRoot().setAlpha(0.0f);
        } else {
            u1().getRoot().setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(ProductsFragment productsFragment, ProductListDecorator productListDecorator) {
        e1 e1VarY1 = productsFragment.y1();
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        e1VarY1.onAction(new a.Clip(Ok.e.a(coupon.getOfferId()), C14480g.a(C14476c.a("coupon clip"), new Function1() { // from class: Zm.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.V1((TrackingData) obj);
            }
        })));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(ProductsFragment productsFragment, ProductListDecorator productListDecorator) {
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        productsFragment.K1(coupon);
        return Unit.f142422a;
    }

    private final void Y1(Oj.a loadingState) {
        if (!loadingState.getIsLoading()) {
            this.productsSection.L();
        } else {
            this.productsSection.M(new f(loadingState));
        }
    }

    private final void c2(String productTitle) {
        b bVar;
        x4.i activity = getActivity();
        b bVar2 = null;
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.h0(productTitle);
        }
        x4.i parentFragment = getParentFragment();
        if (parentFragment instanceof b) {
            bVar2 = (b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.h0(productTitle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(ProductsFragment productsFragment, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragment.y1().onAction(new a.Clip(Ok.e.a(coupon.getOfferId()), C14480g.a(C14476c.a("coupon clip"), new Function1() { // from class: Zm.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.f2((TrackingData) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ShowToast"})
    public final void handleSubstitutionResult(C14145a result) {
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
            Snackbar.q0(u1().getRoot(), i10, 0).t0(C17135b.f162001T0, new View.OnClickListener() { // from class: Zm.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductsFragment.J1(this.f42858a, view);
                }
            }).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(int totalResults, int tokenMatchCount, int embeddingsCount) {
        x0 x0Var;
        x4.i activity = getActivity();
        x0 x0Var2 = null;
        if (activity instanceof x0) {
            x0Var = (x0) activity;
        } else {
            x0Var = null;
        }
        if (x0Var != null) {
            x0Var.J0(totalResults, tokenMatchCount, embeddingsCount);
        }
        x4.i parentFragment = getParentFragment();
        if (parentFragment instanceof x0) {
            x0Var2 = (x0) parentFragment;
        }
        if (x0Var2 != null) {
            x0Var2.J0(totalResults, tokenMatchCount, embeddingsCount);
        }
    }

    private final boolean j2(int errorMessageId) {
        if (!A1().b()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
            new Pj.f(fragmentActivityRequireActivity, errorMessageId, this).g();
            return false;
        }
        return true;
    }

    @Override // Es.d.c
    public void N() {
        u1().f21155C.setAlpha(1.0f);
    }

    @Override // Zm.InterfaceC5528a
    public void T(MotionEvent ev2) {
        int x10;
        e1 e1VarY1 = y1();
        int y10 = 0;
        if (ev2 != null) {
            x10 = (int) ev2.getX();
        } else {
            x10 = 0;
        }
        if (ev2 != null) {
            y10 = (int) ev2.getY();
        }
        e1VarY1.x1(new e1.AbstractC12456j.CollapseQuantityStepperAction(x10, y10));
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12104p0.b
    public void d0() {
        y1().x1(e1.AbstractC12456j.f.f111238a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(y1());
    }

    @Override // Pj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Al.k.b(contextRequireContext, false, null, 536872912, null, null, null, 118, null).putExtra("unauth_search_term", this.searchTerm));
    }

    @Override // Zm.InterfaceC5528a
    public void z(boolean shouldShowZeroResults) {
        y1().x1(new e1.AbstractC12456j.ZeroResultsVisibilityAction(shouldShowZeroResults));
    }
}
