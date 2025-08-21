package com.meijer.mobile.meijer.activity.find.fragment;

import Ao.C2898u;
import Ao.e0;
import Bl.t;
import Cj.o;
import Cj.p;
import Co.ProductFullDetails;
import Es.d;
import Ho.ProductSponsorship;
import Nn.AbstractC4316z1;
import Nn.Z1;
import Nn.r3;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Qo.l;
import V2.CreationExtras;
import an.InterfaceC5728a;
import an.x0;
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
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.InterfaceC6162j;
import androidx.view.InterfaceC6172s;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import bk.AbstractC6392a;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.find.C12229p0;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import com.meijer.mobile.meijer.activity.personalized.modals.C12616t0;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import is.C14847a;
import j2.C14923c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.C15069d;
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
import ku.AbstractC15424a;
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import pv.P;
import tr.C17284b;
import ts.ProductCardDecorator;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import x4.InterfaceC18089i;
import yo.C18335a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 ù\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003ú\u0001UB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J1\u00102\u001a\u00020\u000b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u00103J7\u0010:\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00132\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000b2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010\u0011J\u0019\u0010A\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ+\u0010H\u001a\u00020G2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010@\u001a\u0004\u0018\u00010?H\u0017¢\u0006\u0004\bH\u0010IJ'\u0010P\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bR\u0010QJ\u001b\u0010U\u001a\u00020\u00152\n\u0010T\u001a\u00060\u001cj\u0002`SH\u0016¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0,2\u0006\u0010X\u001a\u00020\u001cH\u0016¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u000b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0,2\u0006\u0010X\u001a\u00020\u001cH\u0016¢\u0006\u0004\b[\u0010ZJ\u0017\u0010]\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020JH\u0016¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020G2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000bH\u0016¢\u0006\u0004\bb\u0010\bJ!\u0010e\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u001c2\b\u0010d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\be\u0010+J\u000f\u0010f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bf\u0010\bJ\u0019\u0010i\u001a\u00020\u000b2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010jJ'\u0010p\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020\u0013H\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u000bH\u0016¢\u0006\u0004\br\u0010\bJ\u000f\u0010s\u001a\u00020\u000bH\u0016¢\u0006\u0004\bs\u0010\bJ\u000f\u0010t\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010\bJ\u000f\u0010u\u001a\u00020\u000bH\u0016¢\u0006\u0004\bu\u0010\bJ\u0017\u0010v\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u000bH\u0016¢\u0006\u0004\bx\u0010\bR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0097\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\be\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010§\u0001\u001a\u00030 \u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010·\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010¿\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010Ã\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R!\u0010É\u0001\u001a\u00030Ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Ï\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001c\u0010×\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R!\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001a\u0010ä\u0001\u001a\u00030á\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001b\u0010ç\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001b\u0010é\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010æ\u0001R\u0018\u0010í\u0001\u001a\u00030ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R(\u0010ö\u0001\u001a\u0014\u0012\u000f\u0012\r ô\u0001*\u0005\u0018\u00010ó\u00010ó\u00010ò\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010õ\u0001R\u0017\u0010n\u001a\u00030Ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010ø\u0001¨\u0006û\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/t0$a;", "LEs/d$c;", "LQj/g;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "Lan/a;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "event", "", "B1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;)V", "LPj/a;", "loadingState", "Z1", "(LPj/a;)V", "a2", "", "errorMessageId", "", "j2", "(I)Z", "Lg/a;", "result", "handleSubstitutionResult", "(Lg/a;)V", "", "productTitle", "c2", "(Ljava/lang/String;)V", "count", "h2", "(I)V", "totalResults", "tokenMatchCount", "embeddingsCount", "i2", "(III)V", "suggestion", "originalTerm", "L1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lvs/f;", "products", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "noResultDecorator", "shouldShowZeroResults", "S1", "(Ljava/util/List;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Z)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "d2", "(IIIILPk/a;)V", "K1", "(LPk/a;)V", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LCo/h;", "productToAdd", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "stepperHitRect", "o0", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "S", "Lcom/meijer/mobile/core/model/common/ResourceId;", "forProduct", "a", "(Ljava/lang/String;)Z", "beacon", "formatLevelBeacon", "d1", "(Ljava/util/List;Ljava/lang/String;)V", "W0", "product", "p0", "(LCo/h;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "query", "searchMethod", "i", "e", "Landroid/view/MotionEvent;", "ev", "X", "(Landroid/view/MotionEvent;)V", "Lts/a;", "itemClicked", "Landroidx/databinding/p;", "binding", "position", "c0", "(Lts/a;Landroidx/databinding/p;I)V", "Q", "onCreateAccount", "onSignIn", "F", "B", "(Z)V", "f0", "Lwr/f;", "f", "Lwr/f;", "v1", "()Lwr/f;", "setCartInteractor", "(Lwr/f;)V", "cartInteractor", "Lyo/k;", "g", "Lyo/k;", "A1", "()Lyo/k;", "setUserManager$Meijer_playstoreRelease", "(Lyo/k;)V", "userManager", "Lyo/a;", "h", "Lyo/a;", "getAppPrefManager$Meijer_playstoreRelease", "()Lyo/a;", "setAppPrefManager$Meijer_playstoreRelease", "(Lyo/a;)V", "appPrefManager", "Lzl/k;", "Lzl/k;", "w1", "()Lzl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lzl/k;)V", "featureManager", "Lhi/a;", "j", "Lhi/a;", "t1", "()Lhi/a;", "setAnalyticsEngine$Meijer_playstoreRelease", "(Lhi/a;)V", "analyticsEngine", "LRo/a;", "k", "LRo/a;", "x1", "()LRo/a;", "setProductAnalytics$Meijer_playstoreRelease", "(LRo/a;)V", "productAnalytics", "LDl/e;", "l", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "LBl/g;", "m", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "Lpp/e;", "n", "Lpp/e;", "z1", "()Lpp/e;", "setSponsorshipsDataStore", "(Lpp/e;)V", "sponsorshipsDataStore", "LPp/b;", "o", "LPp/b;", "searchType", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "p", "Lkotlin/Lazy;", "y1", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "productsViewModel", "q", "Z", "sendSearchResultsAnalytics", "r", "I", "productCount", "Lju/l;", "s", "Lju/l;", "productsSection", "Lvs/b;", "t", "Lvs/b;", "itemToSubstitute", "Lju/d;", "Lju/g;", "u", "Lju/d;", "productsAdapter", "LNn/z1;", "v", "LNn/z1;", "_binding", "LEs/d;", "w", "LEs/d;", "animator", "x", "Ljava/lang/String;", "searchTerm", "y", "sponsoredProductSearchTerm", "Lcom/meijer/mobile/meijer/activity/find/p0;", "z", "Lcom/meijer/mobile/meijer/activity/find/p0;", "scrollListener", "Lcom/google/android/material/snackbar/Snackbar;", "A", "Lcom/google/android/material/snackbar/Snackbar;", "currentSnackbar", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lg/c;", "substitutionResultLauncher", "u1", "()LNn/z1;", "C", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ProductsFragment extends Hilt_ProductsFragment implements C12616t0.a, d.c, Qj.g, C12229p0.b, InterfaceC5728a {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f107652D = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Snackbar currentSnackbar;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher;

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
    private ju.l productsSection;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator itemToSubstitute;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> productsAdapter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AbstractC4316z1 _binding;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Es.d animator;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String searchTerm;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String sponsoredProductSearchTerm;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final C12229p0 scrollListener;

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
                bVar = Pp.b.f26238a;
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
            productsFragment.setArguments(C14923c.b(TuplesKt.a("ARG_SEARCH_QUERY", query), TuplesKt.a("ARG_SEARCH_TYPE", searchType), TuplesKt.a("ARG_ITEM_TO_SUBSTITUTE", productToSubstitute)));
            return productsFragment;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$b;", "", "", "firstItemDescription", "", "j0", "(Ljava/lang/String;)V", "", "count", "N", "(I)V", "suggestionTerm", "originalTerm", "E", "(Ljava/lang/String;Ljava/lang/String;)V", "LQo/l$k;", "query", "O", "(LQo/l$k;)V", "", "itemSelected", "U", "(Z)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void E(String suggestionTerm, String originalTerm);

        void N(int count);

        void O(l.k query);

        void U(boolean itemSelected);

        void j0(String firstItemDescription);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$3", f = "ProductsFragment.kt", l = {HttpResponseStatus.SUCCESS_PARTIAL_CONTENT}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107676a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$3$1", f = "ProductsFragment.kt", l = {207}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107678a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductsFragment f107679b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$d$a$a, reason: collision with other inner class name */
            static final class C1618a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProductsFragment f107680a;

                C1618a(ProductsFragment productsFragment) {
                    this.f107680a = productsFragment;
                }

                @Override // pv.InterfaceC16562g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(e1.ViewState viewState, Continuation<? super Unit> continuation) {
                    this.f107680a.Z1(viewState.getLoadingState());
                    this.f107680a.S1(viewState.q(), viewState.getNoProductResult(), viewState.getShouldShowZeroResults());
                    this.f107680a.h2(viewState.x());
                    this.f107680a.i2(viewState.x(), viewState.getTokenMatch(), viewState.getEmbeddingsMatch());
                    InterfaceC18089i activity = this.f107680a.getActivity();
                    b bVar = activity instanceof b ? (b) activity : null;
                    if (bVar != null) {
                        bVar.U(viewState.getItemSelected());
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductsFragment productsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107679b = productsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f107679b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107678a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    P<e1.ViewState> pO1 = this.f107679b.y1().o1();
                    C1618a c1618a = new C1618a(this.f107679b);
                    this.f107678a = 1;
                    if (pO1.collect(c1618a, this) == objF) {
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107676a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6172s viewLifecycleOwner = ProductsFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6165l.b bVar = AbstractC6165l.b.f55503e;
                a aVar = new a(ProductsFragment.this, null);
                this.f107676a = 1;
                if (C6136J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$4", f = "ProductsFragment.kt", l = {227}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107681a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$onCreateView$4$1", f = "ProductsFragment.kt", l = {228}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f107683a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductsFragment f107684b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$e$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1619a implements InterfaceC16562g, FunctionAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProductsFragment f107685a;

                C1619a(ProductsFragment productsFragment) {
                    this.f107685a = productsFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC16562g) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.f107685a, ProductsFragment.class, "handleEvent", "handleEvent(Lcom/meijer/mobile/meijer/activity/personalized/modals/ProductsViewModel$Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // pv.InterfaceC16562g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(e1.AbstractC12585n abstractC12585n, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                    Object objG = a.g(this.f107685a, abstractC12585n, continuation);
                    return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductsFragment productsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f107684b = productsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f107684b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object g(ProductsFragment productsFragment, e1.AbstractC12585n abstractC12585n, Continuation continuation) throws Resources.NotFoundException {
                productsFragment.B1(abstractC12585n);
                return Unit.f143329a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f107683a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<e1.AbstractC12585n> events = this.f107684b.y1().getEvents();
                    C1619a c1619a = new C1619a(this.f107684b);
                    this.f107683a = 1;
                    if (events.collect(c1619a, this) == objF) {
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107681a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6172s viewLifecycleOwner = ProductsFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6165l.b bVar = AbstractC6165l.b.f55503e;
                a aVar = new a(ProductsFragment.this, null);
                this.f107681a = 1;
                if (C6136J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$f", "Lku/a;", "LNn/Z1;", "viewBinding", "", "position", "", "A", "(LNn/Z1;I)V", "", "i", "()J", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNn/Z1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends AbstractC15424a<Z1> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Pj.a f107686e;

        f(Pj.a aVar) {
            this.f107686e = aVar;
        }

        @Override // ku.AbstractC15424a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void u(Z1 viewBinding, int position) {
            Intrinsics.j(viewBinding, "viewBinding");
            viewBinding.f21767z.U(this.f107686e.getMessage(), this.f107686e.getIsLoading());
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment$setSendSearchResultsAnalytics$1", f = "ProductsFragment.kt", l = {567}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107687a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductsFragment.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107687a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f107687a = 1;
                if (Z.b(3000L, this) == objF) {
                    return objF;
                }
            }
            ProductsFragment.this.a2();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/fragment/app/Fragment;", "c", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<Fragment> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f107689f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f107689f = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f107689f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/h0;", "c", "()Landroidx/lifecycle/h0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<h0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107690f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0) {
            super(0);
            this.f107690f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) this.f107690f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Lazy f107691f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Lazy lazy) {
            super(0);
            this.f107691f = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return X.c(this.f107691f).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107692f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f107693g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, Lazy lazy) {
            super(0);
            this.f107692f = function0;
            this.f107693g = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107692f;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            h0 h0VarC = X.c(this.f107693g);
            InterfaceC6162j interfaceC6162j = h0VarC instanceof InterfaceC6162j ? (InterfaceC6162j) h0VarC : null;
            return interfaceC6162j != null ? interfaceC6162j.getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f107694f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f107695g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, Lazy lazy) {
            super(0);
            this.f107694f = fragment;
            this.f107695g = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            f0.c defaultViewModelProviderFactory;
            h0 h0VarC = X.c(this.f107695g);
            InterfaceC6162j interfaceC6162j = h0VarC instanceof InterfaceC6162j ? (InterfaceC6162j) h0VarC : null;
            return (interfaceC6162j == null || (defaultViewModelProviderFactory = interfaceC6162j.getDefaultViewModelProviderFactory()) == null) ? this.f107694f.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
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
            return new FunctionReferenceImpl(1, ProductsFragment.this, ProductsFragment.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            ProductsFragment.this.handleSubstitutionResult(p02);
        }
    }

    @Override // an.InterfaceC5728a
    public void e() {
        this.sendSearchResultsAnalytics = true;
        InterfaceC6172s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner), null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(final e1.AbstractC12585n event) throws Resources.NotFoundException {
        RecyclerView.h adapter;
        if (event instanceof e1.AbstractC12585n.UpdateProductsInfoEvent) {
            e1.AbstractC12585n.UpdateProductsInfoEvent updateProductsInfoEvent = (e1.AbstractC12585n.UpdateProductsInfoEvent) event;
            if (updateProductsInfoEvent.getTotalProductCount() > 0) {
                c2(updateProductsInfoEvent.getFirstProductName());
            }
            if (this.sendSearchResultsAnalytics) {
                t1().g(C14756c.h("Product Search Page"), new Function1() { // from class: an.X
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductsFragment.H1(event, (TrackingData) obj);
                    }
                });
            }
        } else {
            if (event instanceof e1.AbstractC12585n.UpdateToCartFailedEvent) {
                View root = u1().getRoot();
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
                Snackbar.q0(u1().getRoot(), addToShoppingListSuccessEvent.getMessageResId(), 0).t0(addToShoppingListSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: an.Y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductsFragment.I1(this.f45518a, view);
                    }
                }).c0();
                return;
            }
            if (event instanceof e1.AbstractC12585n.CartUpdateSuccessEvent) {
                e1.AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (e1.AbstractC12585n.CartUpdateSuccessEvent) event;
                Snackbar.q0(u1().getRoot(), cartUpdateSuccessEvent.getMessageResId(), 0).t0(cartUpdateSuccessEvent.getActionResId(), new View.OnClickListener() { // from class: an.Z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductsFragment.C1(this.f45519a, view);
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
                    new C15485b(u1().getRoot().getContext(), p.f5105d).setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Cj.i.f4711J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody()).setPositiveButton(showChokingWarningDialogEvent.a().getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: an.a0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ProductsFragment.D1(this.f45520a, event, dialogInterface, i10);
                        }
                    }).setNegativeButton(showChokingWarningDialogEvent.a().getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: an.E
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ProductsFragment.E1(this.f45499a, event, dialogInterface, i10);
                        }
                    }).show();
                    return;
                }
                if (!(event instanceof e1.AbstractC12585n.BubbleFacetsToFilterAndSort)) {
                    if (event instanceof e1.AbstractC12585n.ShowError) {
                        if (u1().f22487C.getAdapter() != null && u1().f22487C.getLayoutManager() != null && (u1().f22487C.getLayoutManager() instanceof LinearLayoutManager) && (adapter = u1().f22487C.getAdapter()) != null) {
                            RecyclerView.p layoutManager = u1().f22487C.getLayoutManager();
                            Intrinsics.h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            int iR2 = ((LinearLayoutManager) layoutManager).r2();
                            RecyclerView.p layoutManager2 = u1().f22487C.getLayoutManager();
                            Intrinsics.h(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            adapter.notifyItemRangeChanged(iR2, ((LinearLayoutManager) layoutManager2).u2());
                        }
                        C15485b cancelable = new C15485b(u1().getRoot().getContext()).setCancelable(false);
                        e1.AbstractC12585n.ShowError showError = (e1.AbstractC12585n.ShowError) event;
                        AbstractC6392a title = showError.getTitle();
                        Context context2 = u1().getRoot().getContext();
                        Intrinsics.i(context2, "getContext(...)");
                        C15485b title2 = cancelable.setTitle(title.b(context2));
                        AbstractC6392a message = showError.getMessage();
                        Context context3 = u1().getRoot().getContext();
                        Intrinsics.i(context3, "getContext(...)");
                        C15485b message2 = title2.setMessage(message.b(context3));
                        AbstractC6392a positiveButtonText = showError.getPositiveButtonText();
                        Context context4 = u1().getRoot().getContext();
                        Intrinsics.i(context4, "getContext(...)");
                        message2.setPositiveButton(positiveButtonText.b(context4), new DialogInterface.OnClickListener() { // from class: an.F
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                ProductsFragment.F1(dialogInterface, i10);
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
                        new C15485b(u1().getRoot().getContext()).setTitle(substitutionFailureEvent.getTitleResId()).setCancelable(false).setMessage(substitutionFailureEvent.getMessageResId()).setPositiveButton(C17284b.f163305W, new DialogInterface.OnClickListener() { // from class: an.G
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                ProductsFragment.G1(dialogInterface, i10);
                            }
                        }).show();
                        return;
                    }
                    if (event instanceof e1.AbstractC12585n.ShowFreeItemsSnackbar) {
                        View root2 = u1().getRoot();
                        AbstractC6392a message3 = ((e1.AbstractC12585n.ShowFreeItemsSnackbar) event).getMessage();
                        Context context5 = u1().getRoot().getContext();
                        Intrinsics.i(context5, "getContext(...)");
                        Snackbar snackbarR02 = Snackbar.r0(root2, message3.b(context5), -2);
                        Intrinsics.i(snackbarR02, "make(...)");
                        Snackbar snackbarC = Wj.b.c(snackbarR02);
                        snackbarC.c0();
                        this.currentSnackbar = snackbarC;
                        return;
                    }
                    if (!(event instanceof e1.AbstractC12585n.e)) {
                        if (!(event instanceof e1.AbstractC12585n.ShowPlpEvent) && !(event instanceof e1.AbstractC12585n.i)) {
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
                InterfaceC18089i activity3 = getActivity();
                b bVar = activity3 instanceof b ? (b) activity3 : null;
                if (bVar != null) {
                    bVar.O(((e1.AbstractC12585n.BubbleFacetsToFilterAndSort) event).getQuery());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(e1.AbstractC12585n abstractC12585n, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        e1.AbstractC12585n.UpdateProductsInfoEvent updateProductsInfoEvent = (e1.AbstractC12585n.UpdateProductsInfoEvent) abstractC12585n;
        stageEvent.h("outOfStockProductList", updateProductsInfoEvent.getOutOfStockList());
        stageEvent.h("lowStockProducts", updateProductsInfoEvent.getLowStockList());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(ProductsFragment productsFragment, l.k it) {
        Intrinsics.j(it, "it");
        productsFragment.y1().A1(new e1.AbstractC12581j.SetFilterAndSortOptions(it));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchMethod", "Spelling Suggestions");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("pageName", "Meijer:Search Results Page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: search");
        track.v("search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(int i10, ProductsFragment productsFragment, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        e0.a(productsFragment.z1().a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(final ProductsFragment productsFragment, List list) {
        if (!Intrinsics.e(productsFragment.searchTerm, productsFragment.sponsoredProductSearchTerm)) {
            productsFragment.u1().f22487C.smoothScrollToPosition(0);
            productsFragment.sponsoredProductSearchTerm = productsFragment.searchTerm;
        }
        List<ProductListDecorator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (final ProductListDecorator productListDecorator : list2) {
            arrayList.add(new C12616t0(productListDecorator, productsFragment, new Function0() { // from class: an.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProductsFragment.U1(this.f45502a, productListDecorator);
                }
            }, new Function0() { // from class: an.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProductsFragment.W1(this.f45504a, productListDecorator);
                }
            }, productsFragment.w1(), productsFragment.A1().b(), productsFragment.searchType, productsFragment.itemToSubstitute, new Function1() { // from class: an.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragment.X1(this.f45506a, productListDecorator, (String) obj);
                }
            }));
        }
        productsFragment.productsSection.R(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("Product Search Results Page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductSponsorship X1(ProductsFragment productsFragment, ProductListDecorator productListDecorator, String it) {
        Intrinsics.j(it, "it");
        return productsFragment.z1().a(productListDecorator.getProduct().getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(Pj.a loadingState) {
        if (loadingState instanceof a.Paging) {
            Y1(loadingState);
            return;
        }
        if (loadingState instanceof a.Loading) {
            u1().f22490F.U(((a.Loading) loadingState).getMessage(), loadingState.getIsLoading());
        } else {
            if (!(loadingState instanceof a.Failed) && !(loadingState instanceof a.NotLoading)) {
                throw new NoWhenBranchMatchedException();
            }
            Y1(loadingState);
            u1().f22490F.U(loadingState.getMessage(), loadingState.getIsLoading());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        if (!this.sendSearchResultsAnalytics || this.searchTerm == null) {
            return;
        }
        this.sendSearchResultsAnalytics = false;
        t1().c(C14756c.h("Product Search Page"), new Function1() { // from class: an.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.b2(this.f45501a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(ProductsFragment productsFragment, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("numberOfSearchResults", String.valueOf(productsFragment.productCount));
        return Unit.f143329a;
    }

    private final void d2(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon) {
        new C15485b(requireContext()).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: an.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ProductsFragment.e2(this.f45511a, coupon, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: an.P
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(int count) {
        this.productCount = count;
        InterfaceC18089i activity = getActivity();
        b bVar = activity instanceof b ? (b) activity : null;
        if (bVar != null) {
            bVar.N(count);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        b bVar2 = parentFragment instanceof b ? (b) parentFragment : null;
        if (bVar2 != null) {
            bVar2.N(count);
        }
    }

    private final AbstractC4316z1 u1() {
        AbstractC4316z1 abstractC4316z1 = this._binding;
        Intrinsics.g(abstractC4316z1);
        return abstractC4316z1;
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
        Intrinsics.x("userManager");
        return null;
    }

    @Override // an.InterfaceC5728a
    public void F() {
        int i10 = c.$EnumSwitchMapping$0[this.searchType.ordinal()];
        if (i10 == 1) {
            y1().A1(e1.AbstractC12581j.a.f112093a);
        } else {
            if (i10 != 2) {
                return;
            }
            y1().A1(e1.AbstractC12581j.p.f112126a);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void S(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        y1().A1(new e1.AbstractC12581j.StepperStateChangedAction(productToAdd.getCode(), controlState.getValueState().getQuantity(), stepperHitRect));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void W0(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y1().A1(new e1.AbstractC12581j.SendCriteoClickBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public boolean a(String forProduct) {
        Intrinsics.j(forProduct, "forProduct");
        return !v1().x(forProduct);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void c0(final ProductCardDecorator itemClicked, androidx.databinding.p binding, int position) {
        Intrinsics.j(itemClicked, "itemClicked");
        Intrinsics.j(binding, "binding");
        Pp.b bVar = this.searchType;
        Pp.b bVar2 = Pp.b.f26240c;
        if (bVar == bVar2 || bVar == Pp.b.f26241d) {
            if (bVar == bVar2 || bVar == Pp.b.f26241d) {
                y1().A1(new e1.AbstractC12581j.ItemSelectedAction(itemClicked, this.searchType, position));
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        MaterialCardView listItemContainer = ((r3) binding).f22258G;
        Intrinsics.i(listItemContainer, "listItemContainer");
        arrayList.add(listItemContainer);
        t1().b(C14756c.a("event: search: product detail"), new Function1() { // from class: an.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.Q1((TrackingData) obj);
            }
        });
        Iterator<ProductListDecorator> it = y1().o1().getValue().q().iterator();
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
            t1().g(C14756c.h("Product Details Page"), new Function1() { // from class: an.M
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragment.R1(iIntValue, this, itemClicked, (TrackingData) obj);
                }
            });
            t1().k(C2898u.f1904a.h0(iIntValue));
        }
        x1().j(itemClicked.getProductQuery(), itemClicked.getProduct(), position);
        Ds.a.d(this, Bl.g.t(getFeatureEntryPoint(), itemClicked.getProduct(), true, false, null, 12, null), arrayList);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void d1(List<String> beacon, String formatLevelBeacon) {
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        y1().A1(new e1.AbstractC12581j.SendCriteoViewBeacon(beacon, formatLevelBeacon, null, null, 12, null));
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
        Es.d dVar = this.animator;
        if (dVar == null) {
            Intrinsics.x("animator");
            dVar = null;
        }
        dVar.g(true);
        this.searchTerm = query;
        e1.f2(y1(), query, false, searchMethod, 2, null);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void o0(ProductFullDetails productToAdd, com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect stepperHitRect) {
        Intrinsics.j(productToAdd, "productToAdd");
        Intrinsics.j(controlState, "controlState");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        this.sendSearchResultsAnalytics = false;
        if (j2(o.f5056d)) {
            y1().A1(new e1.AbstractC12581j.UpdateEntryAction(productToAdd, controlState.getValueState().getQuantity(), stepperHitRect));
        }
    }

    @Override // Qj.g
    public void onCreateAccount() {
        Bl.f fVar = Bl.f.f3124a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, w1().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ShowToast"})
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = AbstractC4316z1.M0(inflater, container, false);
        FragmentActivity activity = getActivity();
        SearchProductActivity searchProductActivity = activity instanceof SearchProductActivity ? (SearchProductActivity) activity : null;
        if (searchProductActivity != null) {
            searchProductActivity.w2(new Function1() { // from class: an.O
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProductsFragment.M1(this.f45513a, (l.k) obj);
                }
            });
        }
        RecyclerView recyclerView = u1().f22487C;
        recyclerView.setAdapter(this.productsAdapter);
        C14847a c14847a = new C14847a(u1().f22487C.getContext(), 1);
        Drawable drawableE = Z1.b.e(recyclerView.getContext(), S.f99611v0);
        Intrinsics.g(drawableE);
        c14847a.h(drawableE);
        recyclerView.addItemDecoration(c14847a);
        recyclerView.addOnScrollListener(this.scrollListener);
        Es.d dVar = new Es.d();
        this.animator = dVar;
        dVar.f(this);
        Es.d dVar2 = this.animator;
        if (dVar2 == null) {
            Intrinsics.x("animator");
            dVar2 = null;
        }
        recyclerView.setItemAnimator(dVar2);
        InterfaceC6172s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner), null, null, new d(null), 3, null);
        InterfaceC6172s viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner2), null, null, new e(null), 3, null);
        u1().f22492H.getRoot().setOnClickListener(new View.OnClickListener() { // from class: an.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductsFragment.N1(this.f45514a, view);
            }
        });
        t1().g(C14756c.h("Product Search Page"), new Function1() { // from class: an.U
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
            Intrinsics.x("animator");
            dVar = null;
        }
        dVar.f(null);
        u1().f22487C.removeOnScrollListener(this.scrollListener);
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
        e1 e1VarY1 = y1();
        String str = this.searchTerm;
        if (str == null) {
            str = "";
        }
        e1.c2(e1VarY1, new l.Search(str, null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 524286, null), false, 2, null);
        if (i10 >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("ARG_ITEM_TO_SUBSTITUTE", CartProductListDecorator.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("ARG_ITEM_TO_SUBSTITUTE");
            parcelable = (CartProductListDecorator) (parcelable2 instanceof CartProductListDecorator ? parcelable2 : null);
        }
        this.itemToSubstitute = (CartProductListDecorator) parcelable;
        y1().X1(this.itemToSubstitute);
    }

    @Override // com.meijer.mobile.meijer.activity.personalized.modals.C12616t0.a
    public void p0(ProductFullDetails product) {
        Intrinsics.j(product, "product");
        if (j2(o.f5058e)) {
            t tVar = t.f3152a;
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(t.e(tVar, contextRequireContext, null, Pp.c.f26247c, product, "product search page", 2, null));
        }
    }

    public final InterfaceC14523a t1() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final wr.f v1() {
        wr.f fVar = this.cartInteractor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("cartInteractor");
        return null;
    }

    public final zl.k w1() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Ro.a x1() {
        Ro.a aVar = this.productAnalytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("productAnalytics");
        return null;
    }

    public final pp.e z1() {
        pp.e eVar = this.sponsorshipsDataStore;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("sponsorshipsDataStore");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsFragment() {
        Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.f143288c, new i(new h(this)));
        this.productsViewModel = X.b(this, Reflection.b(e1.class), new j(lazyA), new k(null, lazyA), new l(this, lazyA));
        this.productsSection = new ju.l();
        C15069d<ju.g> c15069d = new C15069d<>();
        c15069d.c(this.productsSection);
        this.productsAdapter = c15069d;
        this.sponsoredProductSearchTerm = "";
        this.scrollListener = new C12229p0(this, null, 2, 0 == true ? 1 : 0);
        AbstractC14276c<Intent> abstractC14276cRegisterForActivityResult = registerForActivityResult(new h.i(), new m());
        Intrinsics.i(abstractC14276cRegisterForActivityResult, "registerForActivityResult(...)");
        this.substitutionResultLauncher = abstractC14276cRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C1(ProductsFragment productsFragment, View view) {
        productsFragment.startActivity(productsFragment.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(ProductsFragment productsFragment, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragment.y1().A1(new e1.AbstractC12581j.UserAcceptAddToCartAction(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(ProductsFragment productsFragment, e1.AbstractC12585n abstractC12585n, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragment.y1().A1(new e1.AbstractC12581j.ResetActiveStepper(((e1.AbstractC12585n.ShowChokingWarningDialogEvent) abstractC12585n).a().b().getProductCode()));
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
        Dl.e meijerIntent = productsFragment.getMeijerIntent();
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        productsFragment.startActivity(meijerIntent.D(context, productsFragment.w1().e(AbstractC18503f.O.f172854h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(ProductsFragment productsFragment, View view) {
        productsFragment.startActivity(productsFragment.getFeatureEntryPoint().d());
    }

    private final void K1(Coupon coupon) {
        startActivity(Dl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    private final void L1(String suggestion, String originalTerm) {
        b bVar;
        InterfaceC18089i activity = getActivity();
        b bVar2 = null;
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.E(suggestion, originalTerm);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        if (parentFragment instanceof b) {
            bVar2 = (b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.E(suggestion, originalTerm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(ProductsFragment productsFragment, View view) {
        productsFragment.t1().g(C14756c.h("Product Search Page"), new Function1() { // from class: an.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.O1((TrackingData) obj);
            }
        });
        productsFragment.L1(productsFragment.u1().f22492H.f22377B.getText().toString(), productsFragment.u1().f22493z.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(final List<ProductListDecorator> products, e1.NoResultDecorator noResultDecorator, boolean shouldShowZeroResults) {
        AbstractC6392a abstractC6392aA;
        boolean z10;
        int i10;
        int noResultVisibility;
        int noResultVisibility2;
        int suggestionVisibility;
        AbstractC4316z1 abstractC4316z1U1 = u1();
        if (!products.isEmpty()) {
            abstractC4316z1U1.f22487C.post(new Runnable() { // from class: an.W
                @Override // java.lang.Runnable
                public final void run() {
                    ProductsFragment.T1(this.f45515a, products);
                }
            });
        }
        TextView noProductResultForProduct = abstractC4316z1U1.f22493z;
        Intrinsics.i(noProductResultForProduct, "noProductResultForProduct");
        String spellSuggestionTerm = null;
        if (noResultDecorator != null) {
            abstractC6392aA = noResultDecorator.a();
        } else {
            abstractC6392aA = null;
        }
        ck.d.g(noProductResultForProduct, abstractC6392aA);
        FullWordEllipsisTextView fullWordEllipsisTextView = abstractC4316z1U1.f22492H.f22377B;
        if (noResultDecorator != null) {
            spellSuggestionTerm = noResultDecorator.getSpellSuggestionTerm();
        }
        if (spellSuggestionTerm == null) {
            spellSuggestionTerm = "";
        }
        fullWordEllipsisTextView.setText(spellSuggestionTerm);
        RecyclerView productsList = abstractC4316z1U1.f22487C;
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
        TextView textView = abstractC4316z1U1.f22486B;
        if (noResultDecorator != null) {
            noResultVisibility = noResultDecorator.getNoResultVisibility();
        } else {
            noResultVisibility = 8;
        }
        textView.setVisibility(noResultVisibility);
        TextView textView2 = abstractC4316z1U1.f22493z;
        if (noResultDecorator != null) {
            noResultVisibility2 = noResultDecorator.getNoResultVisibility();
        } else {
            noResultVisibility2 = 8;
        }
        textView2.setVisibility(noResultVisibility2);
        TextView textView3 = abstractC4316z1U1.f22485A;
        if (noResultDecorator != null) {
            suggestionVisibility = noResultDecorator.getSuggestionVisibility();
        } else {
            suggestionVisibility = 8;
        }
        textView3.setVisibility(suggestionVisibility);
        View root = abstractC4316z1U1.f22492H.getRoot();
        if (noResultDecorator != null) {
            suggestionVisibility2 = noResultDecorator.getSuggestionVisibility();
        }
        root.setVisibility(suggestionVisibility2);
        if (shouldShowZeroResults) {
            abstractC4316z1U1.f22487C.setVisibility(0);
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
        e1VarY1.onAction(new a.Clip(Pk.e.a(coupon.getOfferId()), C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: an.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProductsFragment.V1((TrackingData) obj);
            }
        })));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(ProductsFragment productsFragment, ProductListDecorator productListDecorator) {
        Coupon coupon = productListDecorator.getCoupon();
        Intrinsics.g(coupon);
        productsFragment.K1(coupon);
        return Unit.f143329a;
    }

    private final void Y1(Pj.a loadingState) {
        if (!loadingState.getIsLoading()) {
            this.productsSection.L();
        } else {
            this.productsSection.M(new f(loadingState));
        }
    }

    private final void c2(String productTitle) {
        b bVar;
        InterfaceC18089i activity = getActivity();
        b bVar2 = null;
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.j0(productTitle);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        if (parentFragment instanceof b) {
            bVar2 = (b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.j0(productTitle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(ProductsFragment productsFragment, Coupon coupon, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        productsFragment.y1().onAction(new a.Clip(Pk.e.a(coupon.getOfferId()), C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: an.Q
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
            Snackbar.q0(u1().getRoot(), i10, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: an.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductsFragment.J1(this.f45498a, view);
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

    private final boolean j2(int errorMessageId) {
        if (!A1().b()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
            new Qj.f(fragmentActivityRequireActivity, errorMessageId, this).g();
            return false;
        }
        return true;
    }

    @Override // an.InterfaceC5728a
    public void B(boolean shouldShowZeroResults) {
        y1().A1(new e1.AbstractC12581j.ZeroResultsVisibilityAction(shouldShowZeroResults));
    }

    @Override // Es.d.c
    public void Q() {
        u1().f22487C.setAlpha(1.0f);
    }

    @Override // an.InterfaceC5728a
    public void X(MotionEvent ev2) {
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
        e1VarY1.A1(new e1.AbstractC12581j.CollapseQuantityStepperAction(x10, y10));
    }

    @Override // com.meijer.mobile.meijer.activity.find.C12229p0.b
    public void f0() {
        y1().A1(e1.AbstractC12581j.f.f112103a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(y1());
    }

    @Override // Qj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Bl.k.b(contextRequireContext, false, null, 536872912, null, null, null, 118, null).putExtra("unauth_search_term", this.searchTerm));
    }
}
