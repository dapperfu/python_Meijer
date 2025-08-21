package com.meijer.mobile.meijer.activity.home;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import Nn.AbstractC4308x1;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Tl.MarketingBannersDecorator;
import V2.CreationExtras;
import Vl.HomeDepartment;
import Vl.MarketingBanner;
import Vl.e;
import Wl.HomeMperksClippedReward;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.C6173t;
import androidx.view.InterfaceC6172s;
import androidx.view.f0;
import as.C6290c;
import bk.AbstractC6392a;
import ce.C6503b;
import co.AbstractC6536h;
import co.AbstractC6537i;
import co.ClaimReward;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import dk.C13698b;
import ds.AbstractC13720b;
import ds.C13724f;
import ds.DepartmentCarouselDecorator;
import el.SpecialOffer;
import es.AbstractC13870f;
import es.OrderStatusCardDecorator;
import fj.Entry;
import fm.AbstractC14019a;
import fm.AbstractC14021c;
import fm.AbstractC14029k;
import fs.AbstractC14072a;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import gm.HomeEmailBannerDecorator;
import gm.HomeMperksDecorator;
import gm.SpecialOffersCarouselDecorator;
import hi.InterfaceC14523a;
import hm.AbstractC14537b;
import ii.AbstractC14761h;
import ii.C14755b;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j0.C14890K;
import j0.C14903g;
import j2.C14923c;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kk.EnumC15218a;
import km.C15236N;
import km.C15258h;
import km.d1;
import kotlin.C17983Z;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import os.C16296e;
import os.C16298g;
import os.C16303l;
import os.C16307p;
import p1.C16338g;
import pl.TipData;
import pv.InterfaceC16562g;
import tp.Builder;
import tp.C17278c;
import tp.EnumC17276a;
import tr.C17284b;
import uo.OrderOutOfStockItem;
import vm.C17693b;
import vo.OrderSubstitutionItem;
import vs.CartProductListDecorator;
import vs.ProductCarouselDecorator;
import xk.C18188a;
import xr.InterfaceC18214a;
import yo.C18335a;
import yr.C18365u;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0090\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u0095\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0095\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0007J3\u0010*\u001a\u00020\n2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$2\n\u0010'\u001a\u00060#j\u0002`&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0007J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\u0007J\u001f\u00102\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0003¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u0010\u0007J\u0010\u00109\u001a\u00020\nH\u0083@¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020;H\u0003¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0003¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bM\u0010HJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\u0006\u0010N\u001a\u00020(H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bQ\u0010DJ3\u0010W\u001a\u00020\n2\u0006\u0010B\u001a\u00020R2\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020(2\b\b\u0002\u0010V\u001a\u00020(H\u0002¢\u0006\u0004\bW\u0010XJ'\u0010^\u001a\u00020\n2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020(H\u0002¢\u0006\u0004\b^\u0010_J+\u0010d\u001a\u00020\n2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\nH\u0083@¢\u0006\u0004\bf\u0010:J\u0013\u0010g\u001a\u00020#*\u00020#H\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bi\u00107J!\u0010l\u001a\u00020\n2\b\u0010j\u001a\u0004\u0018\u00010#2\u0006\u0010k\u001a\u00020#H\u0002¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\n2\b\u0010j\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bn\u0010oJ!\u0010p\u001a\u00020\n2\b\u0010j\u001a\u0004\u0018\u00010#2\u0006\u0010k\u001a\u00020#H\u0002¢\u0006\u0004\bp\u0010mJ)\u0010u\u001a\u00020\n2\u0006\u0010q\u001a\u00020(2\u0006\u0010r\u001a\u00020Y2\b\u0010t\u001a\u0004\u0018\u00010sH\u0002¢\u0006\u0004\bu\u0010vJX\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010w\u001a\u00020#2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020y0x2\u0006\u0010|\u001a\u00020{2\u0006\u0010}\u001a\u00020(2\u0006\u0010~\u001a\u00020#2\u0006\u0010\u007f\u001a\u00020#2\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010xH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JA\u0010\u0087\u0001\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010#2\u0007\u0010\u0085\u0001\u001a\u00020#2\u0007\u0010\u0086\u0001\u001a\u00020(2\u0006\u0010\\\u001a\u00020[2\b\b\u0002\u0010V\u001a\u00020(H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JH\u0010\u008c\u0001\u001a\u00020\n2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0089\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010#2\u0007\u0010\u0086\u0001\u001a\u00020(2\b\b\u0002\u0010V\u001a\u00020(H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J)\u0010\u0091\u0001\u001a\u00020\n2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u000b\b\u0002\u0010\u0090\u0001\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J(\u0010\u0097\u0001\u001a\u00020\n2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001JN\u0010\u009e\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020Y2\u0007\u0010\u009a\u0001\u001a\u00020Y2\u0007\u0010\u009b\u0001\u001a\u00020Y2\u0007\u0010\u009c\u0001\u001a\u00020Y2\b\u0010\u0094\u0001\u001a\u00030\u009d\u00012\f\b\u0002\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¢\u0001\u001a\u00020\n2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J!\u0010¤\u0001\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0005\b¤\u0001\u00103J\u001b\u0010¦\u0001\u001a\u00020\n2\u0007\u0010¥\u0001\u001a\u00020YH\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b¨\u0001\u0010\u0007J\u0011\u0010©\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b©\u0001\u0010\u0007J\u001c\u0010¬\u0001\u001a\u00020\n2\b\u0010«\u0001\u001a\u00030ª\u0001H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¯\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010¶\u0001\u001a\u00030µ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R*\u0010½\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ä\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ë\u0001\u001a\u00030Ê\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R*\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010Ù\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R*\u0010à\u0001\u001a\u00030ß\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R*\u0010ç\u0001\u001a\u00030æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R*\u0010î\u0001\u001a\u00030í\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R\u001c\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R!\u0010ü\u0001\u001a\u00030÷\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001R\u001b\u0010ý\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u001b\u0010ÿ\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010þ\u0001R\u0019\u0010\u0080\u0002\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001c\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0082\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R)\u0010\u0088\u0002\u001a\u0014\u0012\u000f\u0012\r \u0087\u0002*\u0005\u0018\u00010\u0086\u00020\u0086\u00020\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R)\u0010\u008a\u0002\u001a\u0014\u0012\u000f\u0012\r \u0087\u0002*\u0005\u0018\u00010\u0086\u00020\u0086\u00020\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u0089\u0002R\u001c\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u008b\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R!\u0010\u008e\u0002\u001a\n\u0012\u0005\u0012\u00030\u0086\u00020\u0085\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u0089\u0002R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010þ\u0001R\u0018\u0010\u0091\u0002\u001a\u00030ô\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001d\u0010\u0094\u0002\u001a\b\u0012\u0004\u0012\u00020S0x8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002¨\u0006\u0096\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "LQj/g;", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Callback;", "LLr/d;", "Ltp/c$a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onRateAppNow", "onRateAppRemindLater", "onRateAppNoThanksCurrentVersion", "onRateAppNoThanks", "onRateAppSendEmail", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "", "shouldNavigate", "updateRateAndTipNotification", "(Ljava/lang/String;Ljava/lang/String;Z)V", "onCreateAccount", "onSignIn", "Ltp/b;", "builder", "Ltp/a;", "flowType", "onUpdateRateAndTip", "(Ltp/b;Ltp/a;)V", "Lg/a;", "result", "handleSubstitutionResult", "(Lg/a;)V", "pullToRefresh", "observeHomeViewState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVl/i;", "marketingBanner", "MarketingBanner", "(LVl/i;Landroidx/compose/runtime/Composer;I)V", "MarketingBannerPreview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "decorator", "setupOrderStatusComponent", "(Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;)V", "Lds/c;", "carousel", "setUpShopByDepartment", "(Lds/c;)V", "LVl/e$d$a;", "teachersListCard", "setUpTeacherListsCard", "(LVl/e$d$a;)V", "setUpSeasonalCarousel", "isLoggedIn", "setupHomeEmailBanner", "(Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;Z)V", "setupHomeChipSection", "Lvs/d;", "Landroidx/compose/ui/platform/ComposeView;", "carouselSection", "isShowViewAllButton", "isWhiteLabelCarousel", "setupProductCarousels", "(Lvs/d;Landroidx/compose/ui/platform/ComposeView;ZZ)V", "", "position", "Lkk/a;", "carouselType", "isSponsoredCriteo", "onProductClickedPosition", "(ILkk/a;Z)V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "onStepperStateChanged", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Lkk/a;)V", "observeEvents", "appendViewAll", "(Ljava/lang/String;)Ljava/lang/String;", "handleMPerksRewardsActivityResult", "url", "campaignIdValue", "onBannerClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "openBrowser", "(Ljava/lang/String;)V", "launchDeepLinkURL", "showMperksBottomSheet", "expiringPoints", "j$/time/LocalDate", "expiryDate", "showExpiryPointsDialogFragment", "(ZILj$/time/LocalDate;)V", "orderNumber", "", "Lvo/a;", "listSubstitutedItems", "Lvo/b;", "screenType", "isOnMyWayClicked", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "startOrderSubstitutionActivity", "(Ljava/lang/String;Ljava/util/List;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "uri", "carouselTitle", "isFromSeeMoreItems", "viewPersonalizedProductsAction", "(Ljava/lang/String;Ljava/lang/String;ZLkk/a;Z)V", "Landroid/net/Uri;", "Lii/h;", "trackingState", "onViewAllPersonalizedProducts", "(Landroid/net/Uri;Lii/h;Ljava/lang/String;ZZ)V", "Lnk/f;", "productId", "previousTrackAction", "toProductDetailActivity", "(Lnk/f;Ljava/lang/String;)V", "LPk/c;", "coupon", "Lii/f;", "trackingData", "toCouponDetailActivity", "(LPk/c;Lii/f;)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "showClipCouponErrorDialog", "(IIIILPk/a;Lii/f;)V", "Lpl/a;", "tipData", "showRateAndTipDialog", "(Lpl/a;)V", "toRateAndTipActivity", "errorMessageId", "showLoginDialog", "(I)V", "checkRatings", "checkShowRatingsPrompt", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "action", "invokeHomeViewModelAction", "(Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;)V", "LDl/e;", "meijerIntent", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "Lyo/a;", "appPrefManager", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "Lzl/k;", "featureManager", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "LTq/j;", "storeProvider", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "Lyo/k;", "userManager", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "LBl/g;", "featureEntryPoint", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "Lhi/a;", "analyticsEngine", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "Lvm/b;", "appBackgroundManager", "Lvm/b;", "getAppBackgroundManager", "()Lvm/b;", "setAppBackgroundManager", "(Lvm/b;)V", "Ltp/c;", "rateAndTipUpdater", "Ltp/c;", "getRateAndTipUpdater", "()Ltp/c;", "setRateAndTipUpdater", "(Ltp/c;)V", "LKk/a;", "appVersion", "LKk/a;", "getAppVersion", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "LNn/x1;", "_homeFragBinding", "LNn/x1;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "getHomeViewModel", "()Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "homeViewModel", "sendOnLoadBeaconUrl", "Ljava/lang/String;", "sendOnViewBeaconUrl", "isResendEmailSuccess", "Z", "Lcom/meijer/mobile/ui/common/rateapp/a;", "rateAppManager", "Lcom/meijer/mobile/ui/common/rateapp/a;", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "substitutionResultLauncher", "Lg/c;", "mPerksRewardsResultLauncher", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "rateAndTipDialogFragment", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "startForResult", "getHomeFragBinding", "()LNn/x1;", "homeFragBinding", "getBannersPlacements", "()Ljava/util/List;", "bannersPlacements", "Companion", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HomeFragment extends Hilt_HomeFragment implements Qj.g, RateAndTipDialogFragment.Callback, Lr.d, C17278c.a {
    private static final String HOME = "home";
    public static final String MPERKS4_EXPIRING_POINTS = "mperks4_expiring_points";
    public static final String MPERKS4_POINTS_EXPIRING_DATE = "mperks4_points_expiring_date";
    public static final int MPERKS_REWARDS_UPDATED_RESULT_CODE = 223418;
    private static final String OFFER_CODE = "offerCode";
    public static final String ORDER_DETAILS_BACK = "order_details_back";
    private static final String RATE_AND_TIP_UPDATER_KEY = "HomeFragment";
    private static final String SHOW_MPERKS_BARCODE = "showMperksBarcode";
    private static final String SPECIAL_OFFERS_CLICKED = "Special Offers: Offer Clicked";
    private static final String SPECIAL_OFFERS_CLIPPED = "event: special offers: offer clipped";
    private AbstractC4308x1 _homeFragBinding;
    public InterfaceC14523a analyticsEngine;
    public C17693b appBackgroundManager;
    public C18335a appPrefManager;
    public AppVersion appVersion;
    public Bl.g featureEntryPoint;
    public zl.k featureManager;

    /* renamed from: homeViewModel$delegate, reason: from kotlin metadata */
    private final Lazy homeViewModel;
    private boolean isResendEmailSuccess;
    private final AbstractC14276c<Intent> mPerksRewardsResultLauncher;
    public Dl.e meijerIntent;
    private String previousTrackAction;
    private RateAndTipDialogFragment rateAndTipDialogFragment;
    public C17278c rateAndTipUpdater;
    private com.meijer.mobile.ui.common.rateapp.a rateAppManager;
    private String sendOnLoadBeaconUrl;
    private String sendOnViewBeaconUrl;
    private AbstractC14276c<Intent> startForResult;
    public Tq.j storeProvider;
    private final AbstractC14276c<Intent> substitutionResultLauncher;
    public yo.k userManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeFragment$Companion;", "", "<init>", "()V", "ORDER_DETAILS_BACK", "", "MPERKS4_EXPIRING_POINTS", "MPERKS4_POINTS_EXPIRING_DATE", "SHOW_MPERKS_BARCODE", "SPECIAL_OFFERS_CLIPPED", "SPECIAL_OFFERS_CLICKED", "HOME", "OFFER_CODE", "MPERKS_REWARDS_UPDATED_RESULT_CODE", "", "RATE_AND_TIP_UPDATER_KEY", "newInstance", "Lcom/meijer/mobile/meijer/activity/home/HomeFragment;", HomeFragment.SHOW_MPERKS_BARCODE, "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HomeFragment newInstance(boolean showMperksBarcode) {
            HomeFragment homeFragment = new HomeFragment();
            homeFragment.setArguments(C14923c.b(TuplesKt.a(HomeFragment.SHOW_MPERKS_BARCODE, Boolean.valueOf(showMperksBarcode))));
            return homeFragment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15218a.values().length];
            try {
                iArr[EnumC15218a.f142567a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15218a.f142568b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketingBanner f110078a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f110079b;

        a(MarketingBanner marketingBanner, HomeFragment homeFragment) {
            this.f110078a = marketingBanner;
            this.f110079b = homeFragment;
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
                ComposerKt.U(1476527666, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBanner.<anonymous> (HomeFragment.kt:710)");
            }
            String bannerContentDescription = this.f110078a.getBannerContentDescription();
            String bannerImageURL = this.f110078a.getBannerImageURL();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f110079b) | composer.D(this.f110078a);
            final HomeFragment homeFragment = this.f110079b;
            final MarketingBanner marketingBanner = this.f110078a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeFragment.a.c(homeFragment, marketingBanner);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            km.W.d(AdsTheme, bannerImageURL, null, bannerContentDescription, (Function0) objB, composer, LocalThemeScope.f17314g | (i10 & 14), 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(HomeFragment homeFragment, MarketingBanner marketingBanner) {
            homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.MarketBannerClickAction(marketingBanner));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {
        b() {
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1904866040, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBannerPreview.<anonymous> (HomeFragment.kt:728)");
            }
            HomeFragment.this.MarketingBanner(new MarketingBanner(null, "", null, null, 13, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
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
            return new FunctionReferenceImpl(1, HomeFragment.this, HomeFragment.class, "handleMPerksRewardsActivityResult", "handleMPerksRewardsActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            HomeFragment.this.handleMPerksRewardsActivityResult(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment", f = "HomeFragment.kt", l = {1015}, m = "observeEvents")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f110082a;

        /* renamed from: c, reason: collision with root package name */
        int f110084c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110082a = obj;
            this.f110084c |= Integer.MIN_VALUE;
            return HomeFragment.this.observeEvents(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e<T> implements InterfaceC16562g {
        e() {
        }

        @Override // pv.InterfaceC16562g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object emit(final HomeViewModel.HomeEvent homeEvent, Continuation<? super Unit> continuation) throws Resources.NotFoundException, NumberFormatException {
            if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToLearnMore) {
                HomeFragment homeFragment = HomeFragment.this;
                Bl.p pVar = Bl.p.f3148a;
                Context contextRequireContext = homeFragment.requireContext();
                Intrinsics.i(contextRequireContext, "requireContext(...)");
                homeFragment.startActivity(pVar.a(contextRequireContext));
            } else {
                AbstractC14276c abstractC14276c = null;
                AbstractC14276c abstractC14276c2 = null;
                if (homeEvent instanceof HomeViewModel.HomeEvent.HomeChipItemClickedEvent) {
                    InterfaceC18214a homeChip = ((HomeViewModel.HomeEvent.HomeChipItemClickedEvent) homeEvent).getHomeChip();
                    if (homeChip instanceof AbstractC14537b.f) {
                        Dl.e meijerIntent = HomeFragment.this.getMeijerIntent();
                        Context contextRequireContext2 = HomeFragment.this.requireContext();
                        Intrinsics.i(contextRequireContext2, "requireContext(...)");
                        Intent intentT = Dl.e.t(meijerIntent, contextRequireContext2, 1700, null, 4, null);
                        if (intentT != null) {
                            HomeFragment.this.startActivity(intentT);
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14537b.g.f135884g)) {
                        if (HomeFragment.this.getUserManager().b()) {
                            Dl.e meijerIntent2 = HomeFragment.this.getMeijerIntent();
                            Context contextRequireContext3 = HomeFragment.this.requireContext();
                            Intrinsics.i(contextRequireContext3, "requireContext(...)");
                            Intent intentT2 = Dl.e.t(meijerIntent2, contextRequireContext3, 268437756, null, 4, null);
                            if (intentT2 != null) {
                                HomeFragment.this.startActivity(intentT2);
                            }
                        } else {
                            HomeFragment.this.showLoginDialog(com.meijer.mobile.home.ux.r0.f99365x);
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14537b.e.f135880g)) {
                        if (HomeFragment.this.getUserManager().b()) {
                            HomeFragment homeFragment2 = HomeFragment.this;
                            homeFragment2.startActivity(homeFragment2.getFeatureEntryPoint().r());
                        } else {
                            HomeFragment.this.showLoginDialog(com.meijer.mobile.home.ux.r0.f99356o);
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14537b.h.f135886g)) {
                        if (HomeFragment.this.getStoreProvider().d()) {
                            HomeFragment homeFragment3 = HomeFragment.this;
                            homeFragment3.startActivity(Bl.g.G(homeFragment3.getFeatureEntryPoint(), 0, 0, 3, null));
                        } else {
                            FragmentActivity fragmentActivityRequireActivity = HomeFragment.this.requireActivity();
                            Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
                            new Cl.a(fragmentActivityRequireActivity, 536871412).g();
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14537b.c.f135877g)) {
                        HomeFragment homeFragment4 = HomeFragment.this;
                        Bl.i iVar = Bl.i.f3129a;
                        FragmentActivity fragmentActivityRequireActivity2 = homeFragment4.requireActivity();
                        Intrinsics.i(fragmentActivityRequireActivity2, "requireActivity(...)");
                        homeFragment4.startActivity(iVar.a(fragmentActivityRequireActivity2));
                    } else if (homeChip instanceof AbstractC14537b.MPerks) {
                        if (HomeFragment.this.getUserManager().b()) {
                            AbstractC14276c abstractC14276c3 = HomeFragment.this.mPerksRewardsResultLauncher;
                            Bl.p pVar2 = Bl.p.f3148a;
                            Context contextRequireContext4 = HomeFragment.this.requireContext();
                            Intrinsics.i(contextRequireContext4, "requireContext(...)");
                            abstractC14276c3.a(pVar2.d(contextRequireContext4, false));
                        } else {
                            HomeFragment homeFragment5 = HomeFragment.this;
                            Bl.p pVar3 = Bl.p.f3148a;
                            Context contextRequireContext5 = homeFragment5.requireContext();
                            Intrinsics.i(contextRequireContext5, "requireContext(...)");
                            homeFragment5.startActivity(pVar3.a(contextRequireContext5));
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14537b.C2144b.f135875g)) {
                        Dl.e meijerIntent3 = HomeFragment.this.getMeijerIntent();
                        FragmentActivity fragmentActivityRequireActivity3 = HomeFragment.this.requireActivity();
                        Intrinsics.i(fragmentActivityRequireActivity3, "requireActivity(...)");
                        Intent intentT3 = Dl.e.t(meijerIntent3, fragmentActivityRequireActivity3, 536871032, null, 4, null);
                        if (intentT3 != null) {
                            HomeFragment.this.startActivity(intentT3);
                        }
                    }
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToRateAndTip) {
                    HomeFragment homeFragment6 = HomeFragment.this;
                    HomeViewModel.HomeEvent.NavigateToRateAndTip navigateToRateAndTip = (HomeViewModel.HomeEvent.NavigateToRateAndTip) homeEvent;
                    homeFragment6.startActivity(homeFragment6.getFeatureEntryPoint().v(navigateToRateAndTip.getRateAndTipBuilder(), navigateToRateAndTip.getFlowType()));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToOrderDetail) {
                    FragmentActivity activity = HomeFragment.this.getActivity();
                    Intrinsics.h(activity, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.home.HomeActivity");
                    ((HomeActivity) activity).setLeavingHomeScreen(true);
                    AbstractC14276c abstractC14276c4 = HomeFragment.this.startForResult;
                    if (abstractC14276c4 == null) {
                        Intrinsics.x("startForResult");
                    } else {
                        abstractC14276c = abstractC14276c4;
                    }
                    Bl.l lVar = Bl.l.f3131a;
                    Context contextRequireContext6 = HomeFragment.this.requireContext();
                    Intrinsics.i(contextRequireContext6, "requireContext(...)");
                    HomeViewModel.HomeEvent.NavigateToOrderDetail navigateToOrderDetail = (HomeViewModel.HomeEvent.NavigateToOrderDetail) homeEvent;
                    abstractC14276c.a(Bl.l.b(lVar, contextRequireContext6, navigateToOrderDetail.getOrderNumber(), navigateToOrderDetail.getPreviousTrackAction() + ": New home screen", null, 8, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToUpdatePaymentMethod) {
                    FragmentActivity activity2 = HomeFragment.this.getActivity();
                    Intrinsics.h(activity2, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.home.HomeActivity");
                    ((HomeActivity) activity2).setLeavingHomeScreen(true);
                    AbstractC14276c abstractC14276c5 = HomeFragment.this.startForResult;
                    if (abstractC14276c5 == null) {
                        Intrinsics.x("startForResult");
                    } else {
                        abstractC14276c2 = abstractC14276c5;
                    }
                    Bl.l lVar2 = Bl.l.f3131a;
                    Context contextRequireContext7 = HomeFragment.this.requireContext();
                    Intrinsics.i(contextRequireContext7, "requireContext(...)");
                    HomeViewModel.HomeEvent.NavigateToUpdatePaymentMethod navigateToUpdatePaymentMethod = (HomeViewModel.HomeEvent.NavigateToUpdatePaymentMethod) homeEvent;
                    abstractC14276c2.a(Bl.l.b(lVar2, contextRequireContext7, navigateToUpdatePaymentMethod.getOrderNumber(), navigateToUpdatePaymentMethod.getPreviousTrackAction() + ": New home screen", null, 8, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToCarouselDeeplink) {
                    HomeViewModel.HomeEvent.NavigateToCarouselDeeplink navigateToCarouselDeeplink = (HomeViewModel.HomeEvent.NavigateToCarouselDeeplink) homeEvent;
                    int iP = HomeFragment.this.getMeijerIntent().P(navigateToCarouselDeeplink.getDeeplink());
                    if (iP == 4000) {
                        Intent intentA0 = Dl.e.a0(HomeFragment.this.getMeijerIntent(), Uri.parse(navigateToCarouselDeeplink.getDeeplink()), navigateToCarouselDeeplink.getName(), false, 4, null);
                        if (intentA0 != null) {
                            HomeFragment homeFragment7 = HomeFragment.this;
                            String analytics = navigateToCarouselDeeplink.getAnalytics();
                            if (analytics != null) {
                                intentA0.putExtra("broseDepartmentCarouselAnalytics", analytics);
                                intentA0.putExtra("homePageCarouselAnalytics", homeFragment7.appendViewAll(navigateToCarouselDeeplink.getName()));
                            }
                            homeFragment7.startActivity(intentA0);
                        }
                    } else if (iP != 4100) {
                        Dl.e meijerIntent4 = HomeFragment.this.getMeijerIntent();
                        Context contextRequireContext8 = HomeFragment.this.requireContext();
                        Intrinsics.i(contextRequireContext8, "requireContext(...)");
                        Intent intentN = meijerIntent4.n(contextRequireContext8, navigateToCarouselDeeplink.getDeeplink());
                        if (intentN != null) {
                            HomeFragment homeFragment8 = HomeFragment.this;
                            String analytics2 = navigateToCarouselDeeplink.getAnalytics();
                            if (analytics2 != null) {
                                intentN.putExtra("broseDepartmentCarouselAnalytics", analytics2);
                                if (navigateToCarouselDeeplink.getViewAll()) {
                                    intentN.putExtra("homePageCarouselAnalytics", homeFragment8.appendViewAll(navigateToCarouselDeeplink.getName()) + ':');
                                }
                            }
                            homeFragment8.startActivity(intentN);
                        }
                    } else {
                        Dl.e meijerIntent5 = HomeFragment.this.getMeijerIntent();
                        Uri uri = Uri.parse(navigateToCarouselDeeplink.getDeeplink());
                        Context contextRequireContext9 = HomeFragment.this.requireContext();
                        Intrinsics.i(contextRequireContext9, "requireContext(...)");
                        Intent intentY = meijerIntent5.Y(uri, contextRequireContext9, 4100);
                        if (intentY != null) {
                            HomeFragment homeFragment9 = HomeFragment.this;
                            String analytics3 = navigateToCarouselDeeplink.getAnalytics();
                            if (analytics3 != null) {
                                intentY.putExtra("broseDepartmentCarouselAnalytics", analytics3);
                                if (navigateToCarouselDeeplink.getViewAll()) {
                                    intentY.putExtra("homePageCarouselAnalytics", homeFragment9.appendViewAll(navigateToCarouselDeeplink.getName()));
                                }
                            }
                            homeFragment9.startActivity(intentY.putExtra("KEY_CURATED_CAROUSEL", navigateToCarouselDeeplink.getName()));
                        }
                    }
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewProductDetails) {
                    HomeFragment homeFragment10 = HomeFragment.this;
                    HomeViewModel.HomeEvent.ViewProductDetails viewProductDetails = (HomeViewModel.HomeEvent.ViewProductDetails) homeEvent;
                    nk.f productIdentity = viewProductDetails.getProductIdentity();
                    AbstractC14761h trackingState = viewProductDetails.getTrackingState();
                    homeFragment10.toProductDetailActivity(productIdentity, trackingState != null ? trackingState.getValue() : null);
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewPersonalizedProducts) {
                    HomeViewModel.HomeEvent.ViewPersonalizedProducts viewPersonalizedProducts = (HomeViewModel.HomeEvent.ViewPersonalizedProducts) homeEvent;
                    HomeFragment.this.onViewAllPersonalizedProducts(viewPersonalizedProducts.getUri(), viewPersonalizedProducts.getTrackingState(), viewPersonalizedProducts.getCarouselTitle(), viewPersonalizedProducts.isFromSeeMoreItems(), viewPersonalizedProducts.isWhiteLabelCarousel());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewCouponDetails) {
                    HomeViewModel.HomeEvent.ViewCouponDetails viewCouponDetails = (HomeViewModel.HomeEvent.ViewCouponDetails) homeEvent;
                    HomeFragment.this.toCouponDetailActivity(viewCouponDetails.getCoupon(), viewCouponDetails.getTrackingData());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ClipCouponFailedEvent) {
                    HomeViewModel.HomeEvent.ClipCouponFailedEvent clipCouponFailedEvent = (HomeViewModel.HomeEvent.ClipCouponFailedEvent) homeEvent;
                    HomeFragment.this.showClipCouponErrorDialog(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon(), clipCouponFailedEvent.getTrackingData());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewSpecialOffers) {
                    Dl.e meijerIntent6 = HomeFragment.this.getMeijerIntent();
                    FragmentActivity fragmentActivityRequireActivity4 = HomeFragment.this.requireActivity();
                    Intrinsics.i(fragmentActivityRequireActivity4, "requireActivity(...)");
                    HomeFragment.this.startActivity(Dl.e.l(meijerIntent6, fragmentActivityRequireActivity4, null, ((HomeViewModel.HomeEvent.ViewSpecialOffers) homeEvent).getPreviousTrackAction(), HomeFragment.this.getFeatureManager().e(AbstractC18503f.M.f172852h), 2, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.UpdateCartSuccessEvent) {
                    HomeViewModel.HomeEvent.UpdateCartSuccessEvent updateCartSuccessEvent = (HomeViewModel.HomeEvent.UpdateCartSuccessEvent) homeEvent;
                    Snackbar snackbarQ0 = Snackbar.q0(HomeFragment.this.getHomeFragBinding().getRoot(), updateCartSuccessEvent.getMessageResId(), 0);
                    int actionResId = updateCartSuccessEvent.getActionResId();
                    final HomeFragment homeFragment11 = HomeFragment.this;
                    snackbarQ0.t0(actionResId, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.D
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HomeFragment.e.j(homeFragment11, view);
                        }
                    }).c0();
                    Entry entry = updateCartSuccessEvent.getEntry();
                    if (entry != null) {
                        HomeFragment homeFragment12 = HomeFragment.this;
                        CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entry, false, 2, null);
                        if (cartProductListDecoratorB.getStockInfo().c() && homeFragment12.getActivity() != null) {
                            Bl.t tVar = Bl.t.f3152a;
                            Context contextRequireContext10 = homeFragment12.requireContext();
                            Intrinsics.i(contextRequireContext10, "requireContext(...)");
                            homeFragment12.substitutionResultLauncher.a(Bl.t.e(tVar, contextRequireContext10, cartProductListDecoratorB, Pp.c.f26248d, null, "home page", 8, null));
                        }
                    }
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.UpdateCartFailedEvent) {
                    View root = HomeFragment.this.getHomeFragBinding().getRoot();
                    String string = HomeFragment.this.getResources().getString(((HomeViewModel.HomeEvent.UpdateCartFailedEvent) homeEvent).getMessageResId());
                    Intrinsics.i(string, "getString(...)");
                    Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                    Intrinsics.i(snackbarR0, "make(...)");
                    Wj.b.b(snackbarR0).c0();
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowError) {
                    C15485b cancelable = new C15485b(HomeFragment.this.getHomeFragBinding().getRoot().getContext()).setCancelable(false);
                    Context context = HomeFragment.this.getHomeFragBinding().getRoot().getContext();
                    Intrinsics.i(context, "getContext(...)");
                    HomeViewModel.HomeEvent.ShowError showError = (HomeViewModel.HomeEvent.ShowError) homeEvent;
                    C15485b title = cancelable.setTitle(ck.d.a(context, showError.getTitle()));
                    Context context2 = HomeFragment.this.getHomeFragBinding().getRoot().getContext();
                    Intrinsics.i(context2, "getContext(...)");
                    C15485b message = title.setMessage(ck.d.a(context2, showError.getMessage()));
                    Context context3 = HomeFragment.this.getHomeFragBinding().getRoot().getContext();
                    Intrinsics.i(context3, "getContext(...)");
                    message.setPositiveButton(ck.d.a(context3, showError.getPositiveButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.E
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.e.k(dialogInterface, i10);
                        }
                    }).show();
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowRateAndTipNotification) {
                    HomeFragment.this.showRateAndTipDialog(((HomeViewModel.HomeEvent.ShowRateAndTipNotification) homeEvent).getTipData());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewRateAndTipActivity) {
                    HomeViewModel.HomeEvent.ViewRateAndTipActivity viewRateAndTipActivity = (HomeViewModel.HomeEvent.ViewRateAndTipActivity) homeEvent;
                    HomeFragment.this.toRateAndTipActivity(viewRateAndTipActivity.getBuilder(), viewRateAndTipActivity.getFlowType());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowResendEmailFailureEvent) {
                    Snackbar.q0(HomeFragment.this.getHomeFragBinding().getRoot(), ((HomeViewModel.HomeEvent.ShowResendEmailFailureEvent) homeEvent).getMessageResId(), 0).c0();
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewBannerDeepLinkUrl) {
                    HomeViewModel.HomeEvent.ViewBannerDeepLinkUrl viewBannerDeepLinkUrl = (HomeViewModel.HomeEvent.ViewBannerDeepLinkUrl) homeEvent;
                    HomeFragment.this.onBannerClicked(viewBannerDeepLinkUrl.getBannerDeepLinkURL(), viewBannerDeepLinkUrl.getCampaignIdValue());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.LoginRequiredEvent) {
                    HomeFragment.this.showLoginDialog(((HomeViewModel.HomeEvent.LoginRequiredEvent) homeEvent).getErrorMessageId());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.OrderSubstitutionEvent) {
                    HomeFragment homeFragment13 = HomeFragment.this;
                    HomeViewModel.HomeEvent.OrderSubstitutionEvent orderSubstitutionEvent = (HomeViewModel.HomeEvent.OrderSubstitutionEvent) homeEvent;
                    String orderNumber = orderSubstitutionEvent.getOrderNumber();
                    List<OrderSubstitutionItem> listSubstitutedItems = orderSubstitutionEvent.getListSubstitutedItems();
                    vo.b substitutionScreenType = orderSubstitutionEvent.getSubstitutionScreenType();
                    boolean zIsOnMyWayClicked = orderSubstitutionEvent.isOnMyWayClicked();
                    String orderType = orderSubstitutionEvent.getOrderType();
                    String str = orderType == null ? "" : orderType;
                    String pickupPersonName = orderSubstitutionEvent.getPickupPersonName();
                    homeFragment13.startOrderSubstitutionActivity(orderNumber, listSubstitutedItems, substitutionScreenType, zIsOnMyWayClicked, str, pickupPersonName == null ? "" : pickupPersonName, orderSubstitutionEvent.getListOutOfStockItems());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToRedeemMPerksDashboard) {
                    AbstractC14276c abstractC14276c6 = HomeFragment.this.mPerksRewardsResultLauncher;
                    Bl.p pVar4 = Bl.p.f3148a;
                    Context contextRequireContext11 = HomeFragment.this.requireContext();
                    Intrinsics.i(contextRequireContext11, "requireContext(...)");
                    abstractC14276c6.a(Bl.p.f(pVar4, contextRequireContext11, false, true, false, false, 26, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToYourRewardsMPerksDashboard) {
                    HomeFragment homeFragment14 = HomeFragment.this;
                    homeFragment14.startActivity(homeFragment14.getFeatureEntryPoint().J(CollectionsExtensionsKt.toArrayList(((HomeViewModel.HomeEvent.NavigateToYourRewardsMPerksDashboard) homeEvent).getClippedRewards())));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToMPerksRewards) {
                    HomeFragment homeFragment15 = HomeFragment.this;
                    HomeViewModel.HomeEvent.NavigateToMPerksRewards navigateToMPerksRewards = (HomeViewModel.HomeEvent.NavigateToMPerksRewards) homeEvent;
                    homeFragment15.startActivity(Bl.g.I(homeFragment15.getFeatureEntryPoint(), navigateToMPerksRewards.getRewardDescription(), false, navigateToMPerksRewards.isFromAvailableRewards(), 2, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowMperksClaimRewardError) {
                    Snackbar snackbarQ02 = Snackbar.q0(HomeFragment.this.getHomeFragBinding().getRoot(), com.meijer.mobile.home.ux.r0.f99340B, 0);
                    Intrinsics.i(snackbarQ02, "make(...)");
                    Context context4 = HomeFragment.this.getContext();
                    if (context4 != null) {
                        snackbarQ02.v0(Cj.r.b(context4, C6503b.f61548o, null, false, 6, null));
                    }
                    snackbarQ02.x0(PorterDuff.Mode.DARKEN);
                    Context context5 = HomeFragment.this.getContext();
                    if (context5 != null) {
                        snackbarQ02.A0(Cj.r.b(context5, C6503b.f61556s, null, false, 6, null));
                    }
                    ViewGroup.LayoutParams layoutParams = snackbarQ02.K().getLayoutParams();
                    Intrinsics.h(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) layoutParams)).bottomMargin = 16;
                    snackbarQ02.c0();
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent) {
                    HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent) homeEvent;
                    C15485b message2 = new C15485b(HomeFragment.this.requireContext(), Cj.p.f5105d).setTitle(showChokingWarningDialogEvent.getDialogInfo().getTitle()).setIcon(Cj.i.f4711J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.getDialogInfo().getBody());
                    int positiveButtonText = showChokingWarningDialogEvent.getDialogInfo().getPositiveButtonText();
                    final HomeFragment homeFragment16 = HomeFragment.this;
                    C15485b positiveButton = message2.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.F
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.e.l(homeFragment16, homeEvent, dialogInterface, i10);
                        }
                    });
                    int negativeButtonText = showChokingWarningDialogEvent.getDialogInfo().getNegativeButtonText();
                    final HomeFragment homeFragment17 = HomeFragment.this;
                    positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.G
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.e.m(homeFragment17, homeEvent, dialogInterface, i10);
                        }
                    }).show();
                } else {
                    if (!(homeEvent instanceof HomeViewModel.HomeEvent.ShowMperksPointsExpiringBottomSheet)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HomeViewModel.HomeEvent.ShowMperksPointsExpiringBottomSheet showMperksPointsExpiringBottomSheet = (HomeViewModel.HomeEvent.ShowMperksPointsExpiringBottomSheet) homeEvent;
                    HomeFragment.this.showExpiryPointsDialogFragment(showMperksPointsExpiringBottomSheet.getMperksPointsExpData().getShowPointExpiryBanner(), showMperksPointsExpiringBottomSheet.getMperksPointsExpData().getPointsExpiringSoon(), showMperksPointsExpiringBottomSheet.getMperksPointsExpData().getPointsExpiryDate());
                }
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(HomeFragment homeFragment, View view) {
            homeFragment.startActivity(homeFragment.getFeatureEntryPoint().d());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(HomeFragment homeFragment, HomeViewModel.HomeEvent homeEvent, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.UserAcceptAddToCartAction(((HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent) homeEvent).getDialogInfo().b()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(HomeFragment homeFragment, HomeViewModel.HomeEvent homeEvent, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.ResetStepper(((HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent) homeEvent).getDialogInfo().b().getProductCode()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment", f = "HomeFragment.kt", l = {351}, m = "observeHomeViewState")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f110086a;

        /* renamed from: c, reason: collision with root package name */
        int f110088c;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110086a = obj;
            this.f110088c |= Integer.MIN_VALUE;
            return HomeFragment.this.observeHomeViewState(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g<T> implements InterfaceC16562g {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110090a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110091b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$a$a, reason: collision with other inner class name */
            static final class C1668a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f110092a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110093b;

                C1668a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f110092a = homeDecorator;
                    this.f110093b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeFragment homeFragment, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.GoogleAdClicked(googleAdAnalytics));
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
                        ComposerKt.U(-892608235, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:358)");
                    }
                    GoogleAdData googleAdSlot1 = this.f110092a.getGoogleAdSlot1();
                    if (googleAdSlot1 != null) {
                        final HomeFragment homeFragment = this.f110093b;
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeFragment);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.H
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeFragment.g.a.C1668a.c(homeFragment, (GoogleAdAnalytics) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        sr.p.C(AdsTheme, null, googleAdSlot1, (Function1) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | (GoogleAdData.f134248f << 6), 1);
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

            a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f110090a = homeDecorator;
                this.f110091b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(422560516, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:357)");
                }
                Ki.K.b(null, ComposableLambdaKt.c(-892608235, true, new C1668a(this.f110090a, this.f110091b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110094a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MarketingBanner f110095b;

            b(HomeFragment homeFragment, MarketingBanner marketingBanner) {
                this.f110094a = homeFragment;
                this.f110095b = marketingBanner;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1049727865, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:698)");
                }
                this.f110094a.MarketingBanner(this.f110095b, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110096a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110097b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f110098a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110099b;

                a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f110098a = homeDecorator;
                    this.f110099b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeFragment homeFragment, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.GoogleAdClicked(googleAdAnalytics));
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
                        ComposerKt.U(3998078, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:370)");
                    }
                    GoogleAdData googleAdSlot2 = this.f110098a.getGoogleAdSlot2();
                    if (googleAdSlot2 != null) {
                        final HomeFragment homeFragment = this.f110099b;
                        Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(32), 0.0f, 0.0f, 13, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeFragment);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.I
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeFragment.g.c.a.c(homeFragment, (GoogleAdAnalytics) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        sr.p.C(AdsTheme, modifierM, googleAdSlot2, (Function1) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | 48 | (GoogleAdData.f134248f << 6), 0);
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

            c(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f110096a = homeDecorator;
                this.f110097b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1160782765, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:369)");
                }
                Ki.K.b(null, ComposableLambdaKt.c(3998078, true, new a(this.f110096a, this.f110097b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110100a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110101b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f110102a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110103b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$d$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1669a extends FunctionReferenceImpl implements Function1<AbstractC14021c, Unit> {
                    C1669a(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC14021c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC14021c abstractC14021c) {
                        a(abstractC14021c);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC14021c, Unit> {
                    b(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC14021c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC14021c abstractC14021c) {
                        a(abstractC14021c);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* synthetic */ class c extends FunctionReferenceImpl implements Function1<AbstractC14021c, Unit> {
                    c(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC14021c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC14021c abstractC14021c) {
                        a(abstractC14021c);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$d$a$d, reason: collision with other inner class name */
                /* synthetic */ class C1670d extends FunctionReferenceImpl implements Function1<AbstractC14021c, Unit> {
                    C1670d(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC14021c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC14021c abstractC14021c) {
                        a(abstractC14021c);
                        return Unit.f143329a;
                    }
                }

                a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f110102a = homeDecorator;
                    this.f110103b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit A(TrackingData trackWith) {
                    Intrinsics.j(trackWith, "$this$trackWith");
                    trackWith.v("mPerks 4.0");
                    trackWith.o(HomeFragment.HOME);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit C(TrackingData trackWith) {
                    Intrinsics.j(trackWith, "$this$trackWith");
                    trackWith.v("mPerks 4.0");
                    trackWith.o(HomeFragment.HOME);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(HomeDecorator homeDecorator, HomeFragment homeFragment, HomeMperksClippedReward homeMperksClippedReward) {
                    Intrinsics.j(homeMperksClippedReward, "homeMperksClippedReward");
                    C15236N.D(homeMperksClippedReward, homeDecorator.getMperksSection(), new b(homeFragment.getHomeViewModel()));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public static final Unit w(HomeFragment homeFragment, HomeDecorator homeDecorator, AbstractC6536h navigationRequest) {
                    Intrinsics.j(navigationRequest, "navigationRequest");
                    ClaimReward claimReward = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    if (navigationRequest instanceof AbstractC6536h.C1234h) {
                        homeFragment.getHomeViewModel().onAction((AbstractC14021c) C14755b.a(new AbstractC14021c.RedeemMPerksViewAllClicked(homeDecorator.getMperksSection(), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.K
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeFragment.g.d.a.x((TrackingData) obj);
                            }
                        }));
                    } else if (navigationRequest instanceof AbstractC6536h.OnClaimRewardCardClicked) {
                        Iterator<T> it = homeDecorator.getMperksSection().c().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (((ClaimReward) next).getCouponId() == ((AbstractC6536h.OnClaimRewardCardClicked) navigationRequest).getClaimReward().getCouponId()) {
                                claimReward = next;
                                break;
                            }
                        }
                        Intrinsics.g(claimReward);
                        C15236N.E(claimReward, homeDecorator.getMperksSection(), new C1669a(homeFragment.getHomeViewModel()));
                    }
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x(TrackingData trackWith) {
                    Intrinsics.j(trackWith, "$this$trackWith");
                    trackWith.v("mPerks 4.0");
                    trackWith.o("mPerks: Claim");
                    trackWith.p("mPerks redeem carousel: View All Rewards");
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit y(HomeFragment homeFragment, AbstractC6537i mperksResourceAction) {
                    Intrinsics.j(mperksResourceAction, "mperksResourceAction");
                    if (mperksResourceAction instanceof AbstractC6537i.BuyReward) {
                        homeFragment.getHomeViewModel().onAction(new AbstractC14021c.OnClaimRewardClicked(((AbstractC6537i.BuyReward) mperksResourceAction).getClaimReward().getCouponId()));
                    }
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    s(localThemeScope, composer, num.intValue());
                    return Unit.f143329a;
                }

                public final void s(LocalThemeScope AdsTheme, Composer composer, int i10) {
                    int i11;
                    Composer composer2;
                    int i12;
                    boolean z10;
                    Composer composer3;
                    Composer composer4 = composer;
                    Intrinsics.j(AdsTheme, "$this$AdsTheme");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | ((i10 & 8) == 0 ? composer4.V(AdsTheme) : composer4.D(AdsTheme) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer4.j()) {
                        composer4.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(358847248, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:383)");
                    }
                    if (this.f110102a.getMperksSection().getIsErrorVisible()) {
                        composer4.startReplaceGroup(1254825487);
                        if (this.f110103b.getFeatureManager().e(AbstractC18503f.J.f172849h)) {
                            composer4.startReplaceGroup(244933074);
                            composer4.startReplaceGroup(5004770);
                            boolean zD = composer4.D(this.f110103b);
                            final HomeFragment homeFragment = this.f110103b;
                            Object objB = composer4.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.J
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HomeFragment.g.d.a.t(homeFragment);
                                    }
                                };
                                composer4.t(objB);
                            }
                            composer4.P();
                            C16298g.b(AdsTheme, null, (Function0) objB, composer4, (i11 & 14) | LocalThemeScope.f17314g, 1);
                            composer4.P();
                        } else {
                            composer4.startReplaceGroup(245256342);
                            composer4.startReplaceGroup(5004770);
                            boolean zD2 = composer4.D(this.f110103b);
                            final HomeFragment homeFragment2 = this.f110103b;
                            Object objB2 = composer4.B();
                            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.N
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HomeFragment.g.d.a.F(homeFragment2);
                                    }
                                };
                                composer4.t(objB2);
                            }
                            composer4.P();
                            km.Y0.m(AdsTheme, (Function0) objB2, null, composer4, LocalThemeScope.f17314g | (i11 & 14), 2);
                            composer4.P();
                        }
                        composer4.P();
                    } else if (this.f110103b.getUserManager().b()) {
                        composer4.startReplaceGroup(245847047);
                        if (this.f110103b.getFeatureManager().e(AbstractC18503f.J.f172849h)) {
                            composer4.startReplaceGroup(245888029);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(companion), AdsTheme.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                            final HomeDecorator homeDecorator = this.f110102a;
                            final HomeFragment homeFragment3 = this.f110103b;
                            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer4, 0);
                            int iA = C5859f.a(composer4, 0);
                            InterfaceC5884s interfaceC5884sR = composer4.r();
                            Modifier modifierE = androidx.compose.ui.b.e(composer4, modifierD);
                            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                            Function0<InterfaceC5953g> function0A = companion2.a();
                            if (composer4.k() == null) {
                                C5859f.c();
                            }
                            composer4.F();
                            if (composer4.getInserting()) {
                                composer4.I(function0A);
                            } else {
                                composer4.s();
                            }
                            Composer composerA = D1.a(composer4);
                            D1.c(composerA, measurePolicyA, companion2.e());
                            D1.c(composerA, interfaceC5884sR, companion2.g());
                            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                composerA.t(Integer.valueOf(iA));
                                composerA.n(Integer.valueOf(iA), function2B);
                            }
                            D1.c(composerA, modifierE, companion2.f());
                            C14903g c14903g = C14903g.f139698a;
                            composer4.startReplaceGroup(-1251278280);
                            if (homeDecorator.getMperksSection().c().isEmpty()) {
                                i12 = 5;
                                z10 = false;
                                composer3 = composer4;
                            } else {
                                List listB1 = CollectionsKt.b1(homeDecorator.getMperksSection().c(), 5);
                                String strP = homeFragment3.getUserManager().p();
                                int iH = homeDecorator.getMperksSection().getPointBalance();
                                composer4.startReplaceGroup(-1633490746);
                                boolean zD3 = composer4.D(homeFragment3) | composer4.D(homeDecorator);
                                Object objB3 = composer4.B();
                                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.O
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HomeFragment.g.d.a.w(homeFragment3, homeDecorator, (AbstractC6536h) obj);
                                        }
                                    };
                                    composer4.t(objB3);
                                }
                                Function1 function1 = (Function1) objB3;
                                composer4.P();
                                composer4.startReplaceGroup(5004770);
                                boolean zD4 = composer4.D(homeFragment3);
                                Object objB4 = composer4.B();
                                if (zD4 || objB4 == Composer.INSTANCE.a()) {
                                    objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.P
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HomeFragment.g.d.a.y(homeFragment3, (AbstractC6537i) obj);
                                        }
                                    };
                                    composer4.t(objB4);
                                }
                                composer4.P();
                                z10 = false;
                                i12 = 5;
                                C16296e.k(AdsTheme, listB1, strP, iH, null, function1, (Function1) objB4, composer4, LocalThemeScope.f17314g | (i11 & 14), 8);
                                composer3 = composer4;
                            }
                            composer3.P();
                            composer3.startReplaceGroup(-1251153708);
                            Composer composer5 = composer3;
                            if (!homeDecorator.getMperksSection().e().isEmpty()) {
                                List<HomeMperksClippedReward> listE = homeDecorator.getMperksSection().e();
                                boolean z11 = homeDecorator.getMperksSection().e().size() > i12 ? true : z10;
                                composer3.startReplaceGroup(-1633490746);
                                boolean zD5 = composer3.D(homeDecorator) | composer3.D(homeFragment3);
                                Object objB5 = composer3.B();
                                if (zD5 || objB5 == Composer.INSTANCE.a()) {
                                    objB5 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.Q
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HomeFragment.g.d.a.u(homeDecorator, homeFragment3, (HomeMperksClippedReward) obj);
                                        }
                                    };
                                    composer3.t(objB5);
                                }
                                Function1 function12 = (Function1) objB5;
                                composer3.P();
                                composer3.startReplaceGroup(-1633490746);
                                boolean zD6 = composer3.D(homeDecorator) | composer3.D(homeFragment3);
                                Object objB6 = composer3.B();
                                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                                    objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.S
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HomeFragment.g.d.a.v(homeDecorator, homeFragment3);
                                        }
                                    };
                                    composer3.t(objB6);
                                }
                                composer3.P();
                                C16307p.d(AdsTheme, listE, z11, null, function12, (Function0) objB6, composer, LocalThemeScope.f17314g | (i11 & 14), 4);
                                Composer composer6 = composer;
                                C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(24)), composer6, 6);
                                composer5 = composer6;
                            }
                            composer5.P();
                            composer5.v();
                            composer5.P();
                            composer2 = composer5;
                        } else {
                            composer4.startReplaceGroup(251525751);
                            HomeMperksDecorator mperksSection = this.f110102a.getMperksSection();
                            Object homeViewModel = this.f110103b.getHomeViewModel();
                            composer4.startReplaceGroup(5004770);
                            boolean zD7 = composer4.D(homeViewModel);
                            Object objB7 = composer4.B();
                            if (zD7 || objB7 == Composer.INSTANCE.a()) {
                                objB7 = new C1670d(homeViewModel);
                                composer4.t(objB7);
                            }
                            composer4.P();
                            Function1 function13 = (Function1) ((KFunction) objB7);
                            composer4.startReplaceGroup(-1633490746);
                            boolean zD8 = composer4.D(this.f110103b) | composer4.D(this.f110102a);
                            final HomeFragment homeFragment4 = this.f110103b;
                            final HomeDecorator homeDecorator2 = this.f110102a;
                            Object objB8 = composer4.B();
                            if (zD8 || objB8 == Composer.INSTANCE.a()) {
                                objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.T
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HomeFragment.g.d.a.z(homeFragment4, homeDecorator2);
                                    }
                                };
                                composer4.t(objB8);
                            }
                            Function0 function0 = (Function0) objB8;
                            composer4.P();
                            composer4.startReplaceGroup(-1633490746);
                            boolean zD9 = composer4.D(this.f110103b) | composer4.D(this.f110102a);
                            final HomeFragment homeFragment5 = this.f110103b;
                            final HomeDecorator homeDecorator3 = this.f110102a;
                            Object objB9 = composer4.B();
                            if (zD9 || objB9 == Composer.INSTANCE.a()) {
                                objB9 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.U
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HomeFragment.g.d.a.B(homeFragment5, homeDecorator3);
                                    }
                                };
                                composer4.t(objB9);
                            }
                            composer4.P();
                            km.Y0.j(AdsTheme, mperksSection, null, function13, function0, (Function0) objB9, composer4, LocalThemeScope.f17314g | (i11 & 14) | (HomeMperksDecorator.f134306j << 3), 2);
                            Composer composer7 = composer4;
                            composer7.P();
                            composer2 = composer7;
                        }
                        composer2.P();
                    } else {
                        composer4.startReplaceGroup(252995213);
                        if (this.f110103b.getFeatureManager().e(AbstractC18503f.J.f172849h)) {
                            composer4.startReplaceGroup(253069799);
                            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                            composer4.startReplaceGroup(5004770);
                            boolean zD10 = composer4.D(this.f110103b);
                            final HomeFragment homeFragment6 = this.f110103b;
                            Object objB10 = composer4.B();
                            if (zD10 || objB10 == Composer.INSTANCE.a()) {
                                objB10 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.V
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HomeFragment.g.d.a.D(homeFragment6);
                                    }
                                };
                                composer4.t(objB10);
                            }
                            composer4.P();
                            C16303l.c(AdsTheme, modifierFsUnmask, (Function0) objB10, composer4, (i11 & 14) | LocalThemeScope.f17314g, 0);
                            composer4.P();
                        } else {
                            composer4.startReplaceGroup(253467219);
                            composer4.startReplaceGroup(5004770);
                            boolean zD11 = composer4.D(this.f110103b);
                            final HomeFragment homeFragment7 = this.f110103b;
                            Object objB11 = composer4.B();
                            if (zD11 || objB11 == Composer.INSTANCE.a()) {
                                objB11 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.W
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HomeFragment.g.d.a.E(homeFragment7);
                                    }
                                };
                                composer4.t(objB11);
                            }
                            composer4.P();
                            km.Y0.p(AdsTheme, (Function0) objB11, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer4, (i11 & 14) | LocalThemeScope.f17314g, 0);
                            composer.P();
                        }
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public static final Unit B(HomeFragment homeFragment, HomeDecorator homeDecorator) {
                    homeFragment.getHomeViewModel().onAction((AbstractC14021c) C14755b.a(new AbstractC14021c.OnYourRewardsTabClicked(homeDecorator.getMperksSection(), null, 2, 0 == true ? 1 : 0), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.M
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.g.d.a.C((TrackingData) obj);
                        }
                    }));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit D(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC14021c.d.f132030a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit E(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC14021c.d.f132030a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit F(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC14021c.a.f132024a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC14021c.a.f132024a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    C15236N.H(homeDecorator.getMperksSection(), new c(homeFragment.getHomeViewModel()));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public static final Unit z(HomeFragment homeFragment, HomeDecorator homeDecorator) {
                    homeFragment.getHomeViewModel().onAction((AbstractC14021c) C14755b.a(new AbstractC14021c.OnRedeemRewardsTabClicked(homeDecorator.getMperksSection(), null, 2, 0 == true ? 1 : 0), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.L
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.g.d.a.A((TrackingData) obj);
                        }
                    }));
                    return Unit.f143329a;
                }
            }

            d(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f110100a = homeDecorator;
                this.f110101b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1882373185, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:382)");
                }
                Ki.K.b(null, ComposableLambdaKt.c(358847248, true, new a(this.f110100a, this.f110101b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110104a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110105b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f110106a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110107b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$e$a$a, reason: collision with other inner class name */
                static final class C1671a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110108a;

                    C1671a(LocalThemeScope localThemeScope) {
                        this.f110108a = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1500780911, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:546)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f110108a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 56);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                        a(interfaceC15154X, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f110106a = homeDecorator;
                    this.f110107b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeFragment homeFragment) {
                    homeFragment.invokeHomeViewModelAction(HomeViewModel.Action.RefreshScreen.INSTANCE);
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
                        ComposerKt.U(358970041, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:544)");
                    }
                    if (this.f110106a.isLoadingContent()) {
                        composer.startReplaceGroup(-392001889);
                        Ki.Q.e(AdsTheme, Q0.b.f141966a, ComposableLambdaKt.c(1500780911, true, new C1671a(AdsTheme), composer, 54), composer, (i10 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                        composer.P();
                    } else {
                        if (this.f110106a.getErrorStates().size() > 2) {
                            composer.startReplaceGroup(-391433876);
                            List<Pj.a> errorStates = this.f110106a.getErrorStates();
                            ListIterator<Pj.a> listIterator = errorStates.listIterator(errorStates.size());
                            while (listIterator.hasPrevious()) {
                                Pj.a aVarPrevious = listIterator.previous();
                                if (aVarPrevious instanceof a.Failed) {
                                    AbstractC6392a message = aVarPrevious.getMessage();
                                    String strC = C16338g.c(yr.Q.f171739G, composer, 0);
                                    String strA = C13698b.a(message, composer, AbstractC6392a.f60445b);
                                    String strC2 = C16338g.c(yr.Q.f171755W, composer, 0);
                                    composer.startReplaceGroup(5004770);
                                    boolean zD = composer.D(this.f110107b);
                                    final HomeFragment homeFragment = this.f110107b;
                                    Object objB = composer.B();
                                    if (zD || objB == Composer.INSTANCE.a()) {
                                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.X
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return HomeFragment.g.e.a.c(homeFragment);
                                            }
                                        };
                                        composer.t(objB);
                                    }
                                    composer.P();
                                    C18365u.c(AdsTheme, strC, strA, strC2, null, (Function0) objB, composer, LocalThemeScope.f17314g | (i10 & 14), 8);
                                    this.f110107b.getHomeFragBinding().f22429N.setRefreshing(false);
                                    composer.P();
                                }
                            }
                            throw new NoSuchElementException("List contains no element matching the predicate.");
                        }
                        composer.startReplaceGroup(-390760215);
                        composer.P();
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

            e(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f110104a = homeDecorator;
                this.f110105b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1675250776, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:543)");
                }
                Ki.K.b(null, ComposableLambdaKt.c(358970041, true, new a(this.f110104a, this.f110105b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110109a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SpecialOffersCarouselDecorator f110110b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110111c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SpecialOffersCarouselDecorator f110112a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f110113b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f110114c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110115d;

                a(SpecialOffersCarouselDecorator cVar, HomeDecorator homeDecorator, Function0<Unit> function0, HomeFragment homeFragment) {
                    this.f110112a = cVar;
                    this.f110113b = homeDecorator;
                    this.f110114c = function0;
                    this.f110115d = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(HomeFragment homeFragment, Coupon coupon) {
                    Intrinsics.j(coupon, "coupon");
                    homeFragment.getHomeViewModel().onAction(new a.ViewCouponDetails(Pk.e.a(coupon.getOfferId()), new TrackingData(C14756c.a(HomeFragment.SPECIAL_OFFERS_CLICKED), null, 2, null)));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(HomeFragment homeFragment, final Coupon coupon) {
                    Intrinsics.j(coupon, "coupon");
                    homeFragment.getHomeViewModel().onAction(new a.Clip(coupon, C14760g.a(C14756c.a(HomeFragment.SPECIAL_OFFERS_CLIPPED), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.g.f.a.r(coupon, (TrackingData) obj);
                        }
                    })));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(Coupon coupon, TrackingData TrackingData) {
                    Intrinsics.j(TrackingData, "$this$TrackingData");
                    TrackingData.n(HomeFragment.HOME);
                    TrackingData.v(HomeFragment.HOME);
                    TrackingData.h(HomeFragment.OFFER_CODE, String.valueOf(coupon.getOfferId()));
                    return Unit.f143329a;
                }

                public final void g(LocalThemeScope AdsTheme, Composer composer, int i10) {
                    int i11;
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
                        ComposerKt.U(-1175163914, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:651)");
                    }
                    Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, AdsTheme.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null));
                    List<SpecialOffer> listE = this.f110112a.e();
                    String strA = C13698b.a(this.f110112a.getCarouselTitle(), composer, AbstractC6392a.f60445b);
                    int totalSpecialOffersCount = this.f110113b.getTotalSpecialOffersCount();
                    String strD = this.f110112a.getBannerResource();
                    Integer numC = this.f110112a.getBannerErrorImageResource();
                    Pj.a aVarH = this.f110112a.getLoadingState();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f110114c);
                    final Function0<Unit> function0 = this.f110114c;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.Z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeFragment.g.f.a.k(function0);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function02 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f110115d);
                    final HomeFragment homeFragment = this.f110115d;
                    Object objB2 = composer.B();
                    if (zD || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeFragment.g.f.a.o(homeFragment);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function03 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f110115d);
                    final HomeFragment homeFragment2 = this.f110115d;
                    Object objB3 = composer.B();
                    if (zD2 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeFragment.g.f.a.p(homeFragment2, (Coupon) obj);
                            }
                        };
                        composer.t(objB3);
                    }
                    Function1 function1 = (Function1) objB3;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f110115d);
                    final HomeFragment homeFragment3 = this.f110115d;
                    Object objB4 = composer.B();
                    if (zD3 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeFragment.g.f.a.q(homeFragment3, (Coupon) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    Function1 function12 = (Function1) objB4;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(this.f110114c);
                    final Function0<Unit> function04 = this.f110114c;
                    Object objB5 = composer.B();
                    if (zV2 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeFragment.g.f.a.l(function04);
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    d1.b(AdsTheme, listE, strA, aVarH, modifierFsUnmask, strD, numC, totalSpecialOffersCount, function02, function03, function1, function12, (Function0) objB5, composer, LocalThemeScope.f17314g | (i11 & 14) | (Pj.a.f26096c << 9), 0, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    g(localThemeScope, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC14029k.a.f132057a);
                    return Unit.f143329a;
                }
            }

            f(HomeFragment homeFragment, SpecialOffersCarouselDecorator cVar, HomeDecorator homeDecorator) {
                this.f110109a = homeFragment;
                this.f110110b = cVar;
                this.f110111c = homeDecorator;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-97548377, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:643)");
                }
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f110109a);
                final HomeFragment homeFragment = this.f110109a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.Y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.g.f.c(homeFragment);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Ki.K.b(null, ComposableLambdaKt.c(-1175163914, true, new a(this.f110110b, this.f110111c, (Function0) objB, this.f110109a), composer, 54), composer, 48, 1);
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
            public static final Unit c(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(new AbstractC14029k.ViewAll(C14756c.h("Special Offers: View all")));
                return Unit.f143329a;
            }
        }

        g() {
        }

        @Override // pv.InterfaceC16562g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(HomeViewModel.HomeViewState homeViewState, Continuation<? super Unit> continuation) {
            List<MarketingBanner> listA;
            HomeFragment.this.sendOnLoadBeaconUrl = homeViewState.getBeaconsTracker().getLoadBeaconUrl();
            HomeFragment.this.sendOnViewBeaconUrl = homeViewState.getBeaconsTracker().getViewBeaconUrl();
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            if (homeDecorator != null) {
                HomeFragment homeFragment = HomeFragment.this;
                if (homeFragment.getFeatureManager().e(AbstractC18503f.C.f172844h)) {
                    homeFragment.getHomeFragBinding().f22424I.setContent(ComposableLambdaKt.composableLambdaInstance(422560516, true, new a(homeDecorator, homeFragment)));
                    homeFragment.getHomeFragBinding().f22425J.setContent(ComposableLambdaKt.composableLambdaInstance(1160782765, true, new c(homeDecorator, homeFragment)));
                }
                homeFragment.getHomeFragBinding().f22432Q.setContent(ComposableLambdaKt.composableLambdaInstance(-1882373185, true, new d(homeDecorator, homeFragment)));
                homeFragment.isResendEmailSuccess = homeDecorator.isResendEmailSuccess();
                homeFragment.setupHomeEmailBanner(homeDecorator, homeViewState.getAuthenticated());
                homeFragment.setupHomeChipSection(homeDecorator);
                LinearLayout homeCardListContainer = homeFragment.getHomeFragBinding().f22427L;
                Intrinsics.i(homeCardListContainer, "homeCardListContainer");
                int i10 = 0;
                homeCardListContainer.setVisibility(!homeDecorator.isLoadingContent() ? 0 : 8);
                if (homeDecorator.isLoadingContent()) {
                    homeFragment.getHomeFragBinding().f22429N.setRefreshing(false);
                }
                homeFragment.setupOrderStatusComponent(homeDecorator);
                ComposeView errorView = homeFragment.getHomeFragBinding().f22421F;
                Intrinsics.i(errorView, "errorView");
                errorView.setVisibility(homeDecorator.isLoadingContent() || homeDecorator.getErrorStates().size() > 2 ? 0 : 8);
                homeFragment.getHomeFragBinding().f22421F.setContent(ComposableLambdaKt.composableLambdaInstance(-1675250776, true, new e(homeDecorator, homeFragment)));
                if (!homeDecorator.getProductCarouselList().isEmpty() && !homeDecorator.getProductCarouselList().get(0).l()) {
                    ProductCarouselDecorator c17724d = homeDecorator.getProductCarouselList().get(0);
                    ComposeView firstProductCarousel = homeFragment.getHomeFragBinding().f22423H;
                    Intrinsics.i(firstProductCarousel, "firstProductCarousel");
                    HomeFragment.H0(homeFragment, c17724d, firstProductCarousel, false, false, 12, null);
                }
                if (homeDecorator.getProductCarouselList().size() > 1 && !homeDecorator.getProductCarouselList().get(1).l()) {
                    ProductCarouselDecorator c17724d2 = homeDecorator.getProductCarouselList().get(1);
                    ComposeView secondProductCarousel = homeFragment.getHomeFragBinding().f22436U;
                    Intrinsics.i(secondProductCarousel, "secondProductCarousel");
                    HomeFragment.H0(homeFragment, c17724d2, secondProductCarousel, false, false, 12, null);
                }
                if (homeDecorator.getProductCarouselList().size() > 2 && !homeDecorator.getProductCarouselList().get(2).l()) {
                    ProductCarouselDecorator c17724d3 = homeDecorator.getProductCarouselList().get(2);
                    ComposeView thirdProductCarousel = homeFragment.getHomeFragBinding().f22441Z;
                    Intrinsics.i(thirdProductCarousel, "thirdProductCarousel");
                    HomeFragment.H0(homeFragment, c17724d3, thirdProductCarousel, false, false, 12, null);
                }
                if (!homeDecorator.getCuratedCarouselList().isEmpty() && !homeDecorator.getCuratedCarouselList().get(0).l()) {
                    ProductCarouselDecorator c17724d4 = homeDecorator.getCuratedCarouselList().get(0);
                    ComposeView firstCuratedCarousel = homeFragment.getHomeFragBinding().f22422G;
                    Intrinsics.i(firstCuratedCarousel, "firstCuratedCarousel");
                    HomeFragment.H0(homeFragment, c17724d4, firstCuratedCarousel, false, false, 12, null);
                }
                if (homeDecorator.getCuratedCarouselList().size() > 1 && !homeDecorator.getCuratedCarouselList().get(1).l()) {
                    ProductCarouselDecorator c17724d5 = homeDecorator.getCuratedCarouselList().get(1);
                    ComposeView secondCuratedCarousel = homeFragment.getHomeFragBinding().f22435T;
                    Intrinsics.i(secondCuratedCarousel, "secondCuratedCarousel");
                    HomeFragment.H0(homeFragment, c17724d5, secondCuratedCarousel, false, false, 12, null);
                }
                if (homeDecorator.getCuratedCarouselList().size() > 2 && !homeDecorator.getCuratedCarouselList().get(2).l()) {
                    ProductCarouselDecorator c17724d6 = homeDecorator.getCuratedCarouselList().get(2);
                    ComposeView thirdCuratedCarousel = homeFragment.getHomeFragBinding().f22440Y;
                    Intrinsics.i(thirdCuratedCarousel, "thirdCuratedCarousel");
                    HomeFragment.H0(homeFragment, c17724d6, thirdCuratedCarousel, false, false, 12, null);
                }
                if (homeDecorator.getWhiteLabelCarousel() != null) {
                    ProductCarouselDecorator whiteLabel = homeDecorator.getWhiteLabel();
                    ComposeView whiteLabelCarousel = homeFragment.getHomeFragBinding().f22442a0;
                    Intrinsics.i(whiteLabelCarousel, "whiteLabelCarousel");
                    homeFragment.setupProductCarousels(whiteLabel, whiteLabelCarousel, homeFragment.getFeatureManager().e(AbstractC18503f.x0.f172913h), true);
                }
                DepartmentCarouselDecorator shopByDepartmentsCarouselItems = homeDecorator.getShopByDepartmentsCarouselItems();
                if (shopByDepartmentsCarouselItems != null) {
                    homeFragment.setUpShopByDepartment(shopByDepartmentsCarouselItems);
                }
                DepartmentCarouselDecorator seasonalCarouselItems = homeDecorator.getSeasonalCarouselItems();
                if (seasonalCarouselItems != null) {
                    homeFragment.setUpSeasonalCarousel(seasonalCarouselItems);
                }
                e.d.a teacherListsCard = homeDecorator.getTeacherListsCard();
                if (teacherListsCard != null) {
                    homeFragment.setUpTeacherListsCard(teacherListsCard);
                }
                SpecialOffersCarouselDecorator specialOffersCarousel = homeDecorator.getSpecialOffersCarousel();
                if ((specialOffersCarousel.i() || !specialOffersCarousel.e().isEmpty()) && homeViewState.getAuthenticated()) {
                    homeFragment.getHomeFragBinding().f22438W.setContent(ComposableLambdaKt.composableLambdaInstance(-97548377, true, new f(homeFragment, specialOffersCarousel, homeDecorator)));
                }
                MarketingBannersDecorator marketingBannersDecorator = homeDecorator.getMarketingBannersDecorator();
                if (marketingBannersDecorator != null && (listA = marketingBannersDecorator.a()) != null) {
                    for (T t10 : homeFragment.getBannersPlacements()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.w();
                        }
                        ComposeView composeView = (ComposeView) t10;
                        MarketingBanner marketingBanner = (MarketingBanner) CollectionsKt.v0(listA, i10);
                        if (marketingBanner != null) {
                            if (StringsKt.s0(marketingBanner.getBannerImageURL())) {
                                marketingBanner = null;
                            }
                            if (marketingBanner != null) {
                                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1049727865, true, new b(homeFragment, marketingBanner)));
                            }
                        }
                        i10 = i11;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1", f = "HomeFragment.kt", l = {326}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110116a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1", f = "HomeFragment.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110118a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f110119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110120c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1$1", f = "HomeFragment.kt", l = {327}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$h$a$a, reason: collision with other inner class name */
            static final class C1672a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110121a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110122b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1672a(HomeFragment homeFragment, Continuation<? super C1672a> continuation) {
                    super(2, continuation);
                    this.f110122b = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1672a(this.f110122b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1672a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110121a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        HomeFragment homeFragment = this.f110122b;
                        this.f110121a = 1;
                        if (homeFragment.observeHomeViewState(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1$2", f = "HomeFragment.kt", l = {328}, m = "invokeSuspend")
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110123a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110124b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(HomeFragment homeFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f110124b = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f110124b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110123a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        HomeFragment homeFragment = this.f110124b;
                        this.f110123a = 1;
                        if (homeFragment.observeEvents(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1$3", f = "HomeFragment.kt", l = {329}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110125a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f110126b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(HomeFragment homeFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f110126b = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f110126b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110125a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        HomeViewModel homeViewModel = this.f110126b.getHomeViewModel();
                        this.f110125a = 1;
                        if (homeViewModel.observeStoreChanges$Meijer_playstoreRelease(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeFragment homeFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f110120c = homeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f110120c, continuation);
                aVar.f110119b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f110118a == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110119b;
                    C15809k.d(interfaceC15783O, null, null, new C1672a(this.f110120c, null), 3, null);
                    C15809k.d(interfaceC15783O, null, null, new b(this.f110120c, null), 3, null);
                    C15809k.d(interfaceC15783O, null, null, new c(this.f110120c, null), 3, null);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeFragment.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110116a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6172s viewLifecycleOwner = HomeFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6165l.b bVar = AbstractC6165l.b.f55502d;
                a aVar = new a(HomeFragment.this, null);
                this.f110116a = 1;
                if (C6136J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DepartmentCarouselDecorator f110127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f110128b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DepartmentCarouselDecorator f110129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f110130b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110131c;

            a(DepartmentCarouselDecorator departmentCarouselDecorator, String str, HomeFragment homeFragment) {
                this.f110129a = departmentCarouselDecorator;
                this.f110130b = str;
                this.f110131c = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(HomeFragment homeFragment, String str, HomeDepartment department) {
                Intrinsics.j(department, "department");
                homeFragment.getHomeViewModel().onAction(new AbstractC13720b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.a.f39991b));
                return Unit.f143329a;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
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
                    ComposerKt.U(-1707440127, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpSeasonalCarousel.<anonymous>.<anonymous> (HomeFragment.kt:826)");
                }
                Pj.a loadingState = this.f110129a.getLoadingState();
                List<HomeDepartment> listC = this.f110129a.c();
                AbstractC6392a viewAllTitle = this.f110129a.getViewAllTitle();
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, AdsTheme.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null));
                int i12 = i11;
                String str = this.f110130b;
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f110131c) | composer.D(this.f110129a) | composer.V(this.f110130b);
                final HomeFragment homeFragment = this.f110131c;
                final DepartmentCarouselDecorator departmentCarouselDecorator = this.f110129a;
                final String str2 = this.f110130b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.f0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.i.a.e(homeFragment, departmentCarouselDecorator, str2);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f110131c);
                final HomeFragment homeFragment2 = this.f110131c;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.i.a.f(homeFragment2);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD3 = composer.D(this.f110131c) | composer.V(this.f110130b);
                final HomeFragment homeFragment3 = this.f110131c;
                final String str3 = this.f110130b;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.i.a.g(homeFragment3, str3, (HomeDepartment) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13724f.b(AdsTheme, modifierFsUnmask, str, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, (AbstractC6392a.f60445b << 15) | (i12 & 14) | LocalThemeScope.f17314g | (Pj.a.f26096c << 9), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(HomeFragment homeFragment, DepartmentCarouselDecorator departmentCarouselDecorator, String str) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13720b.ViewAll(e.c.a.f39991b, str, departmentCarouselDecorator.getSeeAllDeeplink()));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13720b.Retry(e.c.a.f39991b));
                return Unit.f143329a;
            }
        }

        i(DepartmentCarouselDecorator departmentCarouselDecorator, HomeFragment homeFragment) {
            this.f110127a = departmentCarouselDecorator;
            this.f110128b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(268726002, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpSeasonalCarousel.<anonymous> (HomeFragment.kt:824)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1707440127, true, new a(this.f110127a, C13698b.a(this.f110127a.getCarouselTitle(), composer, AbstractC6392a.f60445b), this.f110128b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DepartmentCarouselDecorator f110132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f110133b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DepartmentCarouselDecorator f110134a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110135b;

            a(DepartmentCarouselDecorator departmentCarouselDecorator, HomeFragment homeFragment) {
                this.f110134a = departmentCarouselDecorator;
                this.f110135b = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(HomeFragment homeFragment, String str, HomeDepartment department) {
                Intrinsics.j(department, "department");
                homeFragment.getHomeViewModel().onAction(new AbstractC13720b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.b.f39992b));
                return Unit.f143329a;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
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
                    ComposerKt.U(839557330, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpShopByDepartment.<anonymous>.<anonymous> (HomeFragment.kt:753)");
                }
                AbstractC6392a carouselTitle = this.f110134a.getCarouselTitle();
                int i12 = AbstractC6392a.f60445b;
                final String strA = C13698b.a(carouselTitle, composer, i12);
                Pj.a loadingState = this.f110134a.getLoadingState();
                List<HomeDepartment> listC = this.f110134a.c();
                AbstractC6392a viewAllTitle = this.f110134a.getViewAllTitle();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, AdsTheme.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f110135b) | composer.V(strA) | composer.D(this.f110134a);
                final HomeFragment homeFragment = this.f110135b;
                final DepartmentCarouselDecorator departmentCarouselDecorator = this.f110134a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.j.a.e(homeFragment, strA, departmentCarouselDecorator);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f110135b);
                final HomeFragment homeFragment2 = this.f110135b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.j.a.f(homeFragment2);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zD3 = composer.D(this.f110135b) | composer.V(strA);
                final HomeFragment homeFragment3 = this.f110135b;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.k0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.j.a.g(homeFragment3, strA, (HomeDepartment) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13724f.b(AdsTheme, modifierM, strA, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, (i11 & 14) | LocalThemeScope.f17314g | (Pj.a.f26096c << 9) | (i12 << 15), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(HomeFragment homeFragment, String str, DepartmentCarouselDecorator departmentCarouselDecorator) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13720b.ViewAll(e.c.b.f39992b, str, departmentCarouselDecorator.getSeeAllDeeplink()));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13720b.Retry(e.c.b.f39992b));
                return Unit.f143329a;
            }
        }

        j(DepartmentCarouselDecorator departmentCarouselDecorator, HomeFragment homeFragment) {
            this.f110132a = departmentCarouselDecorator;
            this.f110133b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1479243837, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpShopByDepartment.<anonymous> (HomeFragment.kt:752)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(839557330, true, new a(this.f110132a, this.f110133b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.d.a f110136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f110137b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.d.a f110138a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110139b;

            a(e.d.a aVar, HomeFragment homeFragment) {
                this.f110138a = aVar;
                this.f110139b = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(final HomeFragment homeFragment, e.d.a aVar) {
                homeFragment.invokeHomeViewModelAction(HomeViewModel.Action.FindYourListTrackAction.INSTANCE);
                if (homeFragment.getUserManager().b()) {
                    Dl.e meijerIntent = homeFragment.getMeijerIntent();
                    Context contextRequireContext = homeFragment.requireContext();
                    Intrinsics.i(contextRequireContext, "requireContext(...)");
                    Intent intentN = meijerIntent.n(contextRequireContext, aVar.getDestinationDeeplink());
                    if (intentN != null) {
                        homeFragment.startActivity(intentN);
                    }
                } else {
                    new C15485b(homeFragment.requireContext()).setMessage(com.meijer.mobile.home.ux.r0.f99367z).setPositiveButton(Cj.o.f5100z, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.m0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.k.a.f(homeFragment, dialogInterface, i10);
                        }
                    }).setNegativeButton(Cj.o.f5090u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.n0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.k.a.g(homeFragment, dialogInterface, i10);
                        }
                    }).show();
                }
                return Unit.f143329a;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1673005387, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpTeacherListsCard.<anonymous>.<anonymous> (HomeFragment.kt:793)");
                }
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                AbstractC6392a abstractC6392aD = companion.d(this.f110138a.getTitle(), new Object[0]);
                AbstractC6392a abstractC6392aD2 = companion.d(this.f110138a.getDescription(), new Object[0]);
                AbstractC6392a abstractC6392aD3 = companion.d(this.f110138a.getActionButtonTitle(), new Object[0]);
                int image = this.f110138a.getImage();
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f110139b) | composer.D(this.f110138a);
                final HomeFragment homeFragment = this.f110139b;
                final e.d.a aVar = this.f110138a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.k.a.e(homeFragment, aVar);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i12 = (i11 & 14) | LocalThemeScope.f17314g;
                int i13 = AbstractC6392a.f60445b;
                C6290c.b(AdsTheme, null, abstractC6392aD, abstractC6392aD2, abstractC6392aD3, image, (Function0) objB, composer, (i13 << 12) | i12 | (i13 << 6) | (i13 << 9), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void f(HomeFragment homeFragment, DialogInterface dialogInterface, int i10) {
                homeFragment.onSignIn();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(HomeFragment homeFragment, DialogInterface dialogInterface, int i10) {
                homeFragment.onCreateAccount();
            }
        }

        k(e.d.a aVar, HomeFragment homeFragment) {
            this.f110136a = aVar;
            this.f110137b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(242133924, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpTeacherListsCard.<anonymous> (HomeFragment.kt:792)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1673005387, true, new a(this.f110136a, this.f110137b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeDecorator f110140a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110141a;

            a(HomeDecorator homeDecorator) {
                this.f110141a = homeDecorator;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(HomeDecorator homeDecorator, InterfaceC18214a chip) {
                Intrinsics.j(chip, "chip");
                HomeDecoratorListener listener = homeDecorator.getListener();
                if (listener != null) {
                    listener.performAction(new HomeViewModel.Action.HomeChipItemClicked(chip));
                }
                return Unit.f143329a;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
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
                    ComposerKt.U(337071014, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeChipSection.<anonymous>.<anonymous> (HomeFragment.kt:891)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                final HomeDecorator homeDecorator = this.f110141a;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, AdsTheme.getAdsSpacing().getSix().getDp()), composer, 0);
                int i12 = i11;
                List<AbstractC14537b> chips = homeDecorator.getChips();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(homeDecorator);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.l.a.c(homeDecorator, (InterfaceC18214a) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xr.g.c(AdsTheme, chips, (Function1) objB, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null)), composer, LocalThemeScope.f17314g | (i12 & 14), 0);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, AdsTheme.getAdsSpacing().getSix().getDp()), composer, 0);
                C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.v();
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

        l(HomeDecorator homeDecorator) {
            this.f110140a = homeDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1755021099, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeChipSection.<anonymous> (HomeFragment.kt:890)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(337071014, true, new a(this.f110140a), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeDecorator f110142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f110143b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110144a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110145b;

            a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f110144a = homeDecorator;
                this.f110145b = homeFragment;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Composer composer2;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(118590385, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeEmailBanner.<anonymous>.<anonymous> (HomeFragment.kt:867)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                HomeDecorator homeDecorator = this.f110144a;
                final HomeFragment homeFragment = this.f110145b;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                HomeEmailBannerDecorator homeEmailBannerDecorator = homeDecorator.getHomeEmailBannerDecorator();
                composer.startReplaceGroup(2113246516);
                if (homeEmailBannerDecorator == null) {
                    composer2 = composer;
                } else {
                    Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(companion);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(homeFragment);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.p0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeFragment.m.a.d(homeFragment);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(homeFragment);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.q0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeFragment.m.a.e(homeFragment);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    composer2 = composer;
                    C15258h.k(AdsTheme, homeEmailBannerDecorator, modifierFsUnmask, function0, (Function0) objB2, composer2, (i10 & 14) | LocalThemeScope.f17314g | (HomeEmailBannerDecorator.f134298g << 3), 0);
                }
                composer2.P();
                composer2.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(AbstractC14019a.C2090a.f132021a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(AbstractC14019a.b.f132022a);
                return Unit.f143329a;
            }
        }

        m(HomeDecorator homeDecorator, HomeFragment homeFragment) {
            this.f110142a = homeDecorator;
            this.f110143b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1357521376, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeEmailBanner.<anonymous> (HomeFragment.kt:866)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(118590385, true, new a(this.f110142a, this.f110143b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeDecorator f110146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f110147b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f110148a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110149b;

            a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f110148a = homeDecorator;
                this.f110149b = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(HomeFragment homeFragment, AbstractC13870f it) {
                Intrinsics.j(it, "it");
                homeFragment.getHomeViewModel().onAction(it);
                return Unit.f143329a;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                List<OrderStatusCardDecorator> orderStatusCards;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-602050616, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupOrderStatusComponent.<anonymous>.<anonymous> (HomeFragment.kt:735)");
                }
                if (this.f110148a.getShowOrderStatus() && this.f110148a.getOrderStatusItemCount() > 0 && (orderStatusCards = this.f110148a.getOrderStatusCards()) != null) {
                    final HomeFragment homeFragment = this.f110149b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(homeFragment);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.r0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeFragment.n.a.c(homeFragment, (AbstractC13870f) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    es.I.i(AdsTheme, null, orderStatusCards, (Function1) objB, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
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

        n(HomeDecorator homeDecorator, HomeFragment homeFragment) {
            this.f110146a = homeDecorator;
            this.f110147b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1681819335, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupOrderStatusComponent.<anonymous> (HomeFragment.kt:734)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-602050616, true, new a(this.f110146a, this.f110147b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class o implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductCarouselDecorator f110151b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110152c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f110153d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeFragment f110154a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductCarouselDecorator f110155b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f110156c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f110157d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$o$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1673a extends FunctionReferenceImpl implements Function3<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, EnumC15218a, Unit> {
                C1673a(Object obj) {
                    super(3, obj, HomeFragment.class, "onStepperStateChanged", "onStepperStateChanged(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;Lcom/meijer/mobile/core/models/home/CarouselType;)V", 0);
                }

                public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12, EnumC15218a enumC15218a) {
                    Intrinsics.j(p02, "p0");
                    Intrinsics.j(p12, "p1");
                    ((HomeFragment) this.receiver).onStepperStateChanged(p02, p12, enumC15218a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar, EnumC15218a enumC15218a) {
                    a(productFullDetails, aVar, enumC15218a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class b extends FunctionReferenceImpl implements Function3<Integer, EnumC15218a, Boolean, Unit> {
                b(Object obj) {
                    super(3, obj, HomeFragment.class, "onProductClickedPosition", "onProductClickedPosition(ILcom/meijer/mobile/core/models/home/CarouselType;Z)V", 0);
                }

                public final void a(int i10, EnumC15218a p12, boolean z10) {
                    Intrinsics.j(p12, "p1");
                    ((HomeFragment) this.receiver).onProductClickedPosition(i10, p12, z10);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, EnumC15218a enumC15218a, Boolean bool) {
                    a(num.intValue(), enumC15218a, bool.booleanValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<AbstractC14072a, Unit> {
                c(Object obj) {
                    super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/ui/homescreen/products/HomeCarouselBeaconsTrackingAction;)V", 0);
                }

                public final void a(AbstractC14072a p02) {
                    Intrinsics.j(p02, "p0");
                    ((HomeViewModel) this.receiver).onAction(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC14072a abstractC14072a) {
                    a(abstractC14072a);
                    return Unit.f143329a;
                }
            }

            a(HomeFragment homeFragment, ProductCarouselDecorator c17724d, boolean z10, Function0<Unit> function0) {
                this.f110154a = homeFragment;
                this.f110155b = c17724d;
                this.f110156c = z10;
                this.f110157d = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(HomeFragment homeFragment, ProductCarouselDecorator c17724d, ProductFullDetails product, String str) {
                Intrinsics.j(product, "product");
                AbstractC14761h abstractC14761hJ = c17724d.j();
                homeFragment.toProductDetailActivity(product, abstractC14761hJ != null ? abstractC14761hJ.getValue() : null);
                if (product.getIsSponsoredCriteo()) {
                    homeFragment.getHomeViewModel().onAction(new AbstractC14072a.OnClickBeacon(product.getBeaconInfo().e(), product, false, c17724d.getCarouselType(), 4, null));
                }
                return Unit.f143329a;
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x01a1  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x020c  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0263  */
            /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void e(Ki.LocalThemeScope r29, androidx.compose.runtime.Composer r30, int r31) {
                /*
                    Method dump skipped, instructions count: 615
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeFragment.o.a.e(Ki.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(ProductCarouselDecorator c17724d, HomeFragment homeFragment) {
                HomeViewModel.Action action;
                Object objH = c17724d.getRetryAction();
                if (objH instanceof HomeViewModel.Action) {
                    action = (HomeViewModel.Action) objH;
                } else {
                    action = null;
                }
                if (action != null) {
                    homeFragment.invokeHomeViewModelAction(action);
                }
                return Unit.f143329a;
            }
        }

        o(ProductCarouselDecorator c17724d, boolean z10, boolean z11) {
            this.f110151b = c17724d;
            this.f110152c = z10;
            this.f110153d = z11;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2039253099, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupProductCarousels.<anonymous> (HomeFragment.kt:918)");
            }
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(HomeFragment.this) | composer.D(this.f110151b) | composer.a(this.f110152c);
            final HomeFragment homeFragment = HomeFragment.this;
            final ProductCarouselDecorator c17724d = this.f110151b;
            final boolean z10 = this.f110152c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeFragment.o.c(homeFragment, c17724d, z10);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Ki.K.b(null, ComposableLambdaKt.c(-4964698, true, new a(HomeFragment.this, this.f110151b, this.f110153d, (Function0) objB), composer, 54), composer, 48, 1);
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
        public static final Unit c(HomeFragment homeFragment, ProductCarouselDecorator c17724d, boolean z10) {
            String str;
            String str2;
            String strK = c17724d.getUri();
            if (strK == null) {
                str = "";
            } else {
                str = strK;
            }
            String strC = c17724d.getCarouselTitle();
            if (strC == null) {
                str2 = "";
            } else {
                str2 = strC;
            }
            homeFragment.viewPersonalizedProductsAction(str, str2, false, c17724d.getCarouselType(), z10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class p implements InterfaceC14275b, FunctionAdapter {
        p() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, HomeFragment.this, HomeFragment.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            HomeFragment.this.handleSubstitutionResult(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingBannerPreview$lambda$6(HomeFragment homeFragment, int i10, Composer composer, int i11) {
        homeFragment.MarketingBannerPreview(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @JvmStatic
    public static final HomeFragment newInstance(boolean z10) {
        return INSTANCE.newInstance(z10);
    }

    @Override // Lr.d
    public void onRateAppNoThanks() {
        this.rateAppManager = null;
        C18335a.B(getAppPrefManager(), 0L, 1, null);
    }

    @Override // Lr.d
    public void onRateAppNoThanksCurrentVersion() {
        this.rateAppManager = null;
        getAppPrefManager().y(getAppVersion().getVersionCode());
    }

    @Override // Lr.d
    public void onRateAppNow() {
        this.rateAppManager = null;
        getAppPrefManager().C(getAppVersion().getVersionCode());
        FragmentActivity activity = getActivity();
        MeijerActivity meijerActivity = activity instanceof MeijerActivity ? (MeijerActivity) activity : null;
        if (meijerActivity != null) {
            meijerActivity.openMeijerPlayStorePage();
        }
    }

    @Override // Lr.d
    public void onRateAppRemindLater() {
        this.rateAppManager = null;
        C18335a.E(getAppPrefManager(), 0L, 1, null);
    }

    static /* synthetic */ void H0(HomeFragment homeFragment, ProductCarouselDecorator c17724d, ComposeView composeView, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        homeFragment.setupProductCarousels(c17724d, composeView, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingBanner$lambda$5(HomeFragment homeFragment, MarketingBanner marketingBanner, int i10, Composer composer, int i11) {
        homeFragment.MarketingBanner(marketingBanner, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String appendViewAll(String str) {
        return str + ":View All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4308x1 getHomeFragBinding() {
        AbstractC4308x1 abstractC4308x1 = this._homeFragBinding;
        Intrinsics.g(abstractC4308x1);
        return abstractC4308x1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeViewModel getHomeViewModel() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @android.annotation.SuppressLint({"ShowToast", "CoroutineCreationDuringComposition"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeEvents(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.meijer.activity.home.HomeFragment.d
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.meijer.activity.home.HomeFragment$d r0 = (com.meijer.mobile.meijer.activity.home.HomeFragment.d) r0
            int r1 = r0.f110084c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110084c = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeFragment$d r0 = new com.meijer.mobile.meijer.activity.home.HomeFragment$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f110082a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f110084c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            kotlin.ResultKt.b(r5)
            goto L4a
        L31:
            kotlin.ResultKt.b(r5)
            com.meijer.mobile.meijer.activity.home.HomeViewModel r5 = r4.getHomeViewModel()
            pv.F r5 = r5.getEvents()
            com.meijer.mobile.meijer.activity.home.HomeFragment$e r2 = new com.meijer.mobile.meijer.activity.home.HomeFragment$e
            r2.<init>()
            r0.f110084c = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeFragment.observeEvents(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeHomeViewState(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.meijer.activity.home.HomeFragment.f
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.meijer.activity.home.HomeFragment$f r0 = (com.meijer.mobile.meijer.activity.home.HomeFragment.f) r0
            int r1 = r0.f110088c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110088c = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeFragment$f r0 = new com.meijer.mobile.meijer.activity.home.HomeFragment$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f110086a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f110088c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            kotlin.ResultKt.b(r5)
            goto L4a
        L31:
            kotlin.ResultKt.b(r5)
            com.meijer.mobile.meijer.activity.home.HomeViewModel r5 = r4.getHomeViewModel()
            pv.P r5 = r5.getHomeViewState()
            com.meijer.mobile.meijer.activity.home.HomeFragment$g r2 = new com.meijer.mobile.meijer.activity.home.HomeFragment$g
            r2.<init>()
            r0.f110088c = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAttach$lambda$1(HomeFragment homeFragment, C14274a result) {
        Intent data;
        Intrinsics.j(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null) {
            return;
        }
        TrackingData trackingData = null;
        Object[] objArr = 0;
        if (data.getStringExtra(ORDER_DETAILS_BACK) != null) {
            FragmentActivity activity = homeFragment.getActivity();
            Intrinsics.h(activity, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.home.HomeActivity");
            ((HomeActivity) activity).setLeavingHomeScreen(false);
            Intent data2 = result.getData();
            homeFragment.previousTrackAction = data2 != null ? data2.getStringExtra(ORDER_DETAILS_BACK) : null;
        }
        if (data.getStringExtra("orderID") != null) {
            String stringExtra = data.getStringExtra("orderID");
            HomeViewModel homeViewModel = homeFragment.getHomeViewModel();
            Intrinsics.g(stringExtra);
            homeViewModel.onAction(new AbstractC13870f.Dismiss(stringExtra, trackingData, 2, objArr == true ? 1 : 0));
            homeFragment.getHomeViewModel().onAction(new AbstractC13870f.OrderRatedAndTipped(stringExtra));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerClicked(String url, String campaignIdValue) {
        if (url == null || StringsKt.s0(url)) {
            return;
        }
        if (getMeijerIntent().c0(url)) {
            launchDeepLinkURL(url, campaignIdValue);
        } else {
            openBrowser(url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStepperStateChanged(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state, EnumC15218a carouselType) {
        invokeHomeViewModelAction(new HomeViewModel.Action.UpdateEntryAction(product, state.getValueState().getQuantity()));
        int i10 = carouselType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[carouselType.ordinal()];
        if ((i10 == 1 || i10 == 2) && product.getIsSponsoredCriteo()) {
            getHomeViewModel().onAction(new AbstractC14072a.OnBasketChangeBeacon(product.getBeaconInfo().getOnBasketChangeBeacon(), null, carouselType, 2, null));
        }
    }

    private final void openBrowser(String url) {
        if (url == null) {
            return;
        }
        Intent intentR = getMeijerIntent().r(url);
        FragmentActivity activity = getActivity();
        if (activity == null || intentR.resolveActivity(activity.getPackageManager()) == null) {
            qw.a.INSTANCE.d("Could not open browser on the HomeFragment", new Object[0]);
        } else {
            startActivity(intentR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupProductCarousels(ProductCarouselDecorator decorator, ComposeView carouselSection, boolean isShowViewAllButton, boolean isWhiteLabelCarousel) {
        carouselSection.setContent(ComposableLambdaKt.composableLambdaInstance(-2039253099, true, new o(decorator, isWhiteLabelCarousel, isShowViewAllButton)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClipCouponErrorDialog(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon, final TrackingData trackingData) {
        new C15485b(requireContext()).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeFragment.showClipCouponErrorDialog$lambda$9(this.f110664a, coupon, trackingData, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showExpiryPointsDialogFragment(boolean showMperksBottomSheet, int expiringPoints, LocalDate expiryDate) {
        if (showMperksBottomSheet) {
            yo.k userManager = getUserManager();
            String string = LocalDateTime.now().toString();
            Intrinsics.i(string, "toString(...)");
            userManager.L(string);
            Bundle bundleB = C14923c.b(TuplesKt.a(MPERKS4_EXPIRING_POINTS, Integer.valueOf(expiringPoints)), TuplesKt.a(MPERKS4_POINTS_EXPIRING_DATE, expiryDate));
            ExpiryPointsDialogFragment expiryPointsDialogFragment = new ExpiryPointsDialogFragment();
            expiryPointsDialogFragment.setArguments(bundleB);
            C18188a.f170828a.a(expiryPointsDialogFragment, requireActivity(), RateAndTipDialogFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoginDialog(int errorMessageId) {
        new C15485b(requireContext()).setMessage(errorMessageId).setPositiveButton(Cj.o.f5016F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.A
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f110013a.onSignIn();
            }
        }).setNegativeButton(Cj.o.f5090u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.B
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f110015a.onCreateAccount();
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRateAndTipDialog(TipData tipData) {
        RateAndTipDialogFragment rateAndTipDialogFragmentNewInstance = RateAndTipDialogFragment.INSTANCE.newInstance(tipData);
        rateAndTipDialogFragmentNewInstance.setListener(this);
        this.rateAndTipDialogFragment = rateAndTipDialogFragmentNewInstance;
        C18188a.f170828a.a(rateAndTipDialogFragmentNewInstance, requireActivity(), RateAndTipDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOrderSubstitutionActivity(String orderNumber, List<OrderSubstitutionItem> listSubstitutedItems, vo.b screenType, boolean isOnMyWayClicked, String orderType, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
        Bl.l lVar = Bl.l.f3131a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(lVar.d(contextRequireContext, listSubstitutedItems, orderNumber, screenType, isOnMyWayClicked, orderType, pickupPersonName, listOutOfStockItems));
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final C17693b getAppBackgroundManager() {
        C17693b c17693b = this.appBackgroundManager;
        if (c17693b != null) {
            return c17693b;
        }
        Intrinsics.x("appBackgroundManager");
        return null;
    }

    public final C18335a getAppPrefManager() {
        C18335a c18335a = this.appPrefManager;
        if (c18335a != null) {
            return c18335a;
        }
        Intrinsics.x("appPrefManager");
        return null;
    }

    public final AppVersion getAppVersion() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
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

    public final C17278c getRateAndTipUpdater() {
        C17278c c17278c = this.rateAndTipUpdater;
        if (c17278c != null) {
            return c17278c;
        }
        Intrinsics.x("rateAndTipUpdater");
        return null;
    }

    public final Tq.j getStoreProvider() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.home.Hilt_HomeFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.j(context, "context");
        super.onAttach(context);
        this.startForResult = registerForActivityResult(new h.i(), new InterfaceC14275b() { // from class: com.meijer.mobile.meijer.activity.home.v
            @Override // g.InterfaceC14275b
            public final void a(Object obj) {
                HomeFragment.onAttach$lambda$1(this.f110661a, (C14274a) obj);
            }
        });
    }

    @Override // Qj.g
    public void onCreateAccount() {
        Bl.f fVar = Bl.f.f3124a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._homeFragBinding = AbstractC4308x1.M0(inflater, container, false);
        View root = getHomeFragBinding().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // Lr.d
    public void onRateAppSendEmail() {
        this.rateAppManager = null;
        getAppPrefManager().z(getAppVersion().getVersionCode());
        try {
            Dl.e meijerIntent = getMeijerIntent();
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(meijerIntent.B(contextRequireContext));
        } catch (ActivityNotFoundException unused) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.i(contextRequireContext2, "requireContext(...)");
            new Qj.j(contextRequireContext2, com.meijer.mobile.meijer.Y.f101135q5, new Object[0]).g();
        }
    }

    @Override // tp.C17278c.a
    public void onUpdateRateAndTip(Builder builder, EnumC17276a flowType) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        getHomeViewModel().updateRatedAndTippedOrder(builder, flowType);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Bundle arguments;
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        pullToRefresh();
        InterfaceC6172s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C15809k.d(C6173t.a(viewLifecycleOwner), null, null, new h(null), 3, null);
        if (getUserManager().b() && (arguments = getArguments()) != null && arguments.getBoolean(SHOW_MPERKS_BARCODE)) {
            startActivity(getFeatureEntryPoint().r());
        }
        if (getFeatureManager().e(AbstractC18503f.C.f172844h)) {
            getHomeViewModel().loadGoogleAd();
        }
    }

    public final void setAnalyticsEngine(InterfaceC14523a interfaceC14523a) {
        Intrinsics.j(interfaceC14523a, "<set-?>");
        this.analyticsEngine = interfaceC14523a;
    }

    public final void setAppBackgroundManager(C17693b c17693b) {
        Intrinsics.j(c17693b, "<set-?>");
        this.appBackgroundManager = c17693b;
    }

    public final void setAppPrefManager(C18335a c18335a) {
        Intrinsics.j(c18335a, "<set-?>");
        this.appPrefManager = c18335a;
    }

    public final void setAppVersion(AppVersion appVersion) {
        Intrinsics.j(appVersion, "<set-?>");
        this.appVersion = appVersion;
    }

    public final void setFeatureEntryPoint(Bl.g gVar) {
        Intrinsics.j(gVar, "<set-?>");
        this.featureEntryPoint = gVar;
    }

    public final void setFeatureManager(zl.k kVar) {
        Intrinsics.j(kVar, "<set-?>");
        this.featureManager = kVar;
    }

    public final void setMeijerIntent(Dl.e eVar) {
        Intrinsics.j(eVar, "<set-?>");
        this.meijerIntent = eVar;
    }

    public final void setRateAndTipUpdater(C17278c c17278c) {
        Intrinsics.j(c17278c, "<set-?>");
        this.rateAndTipUpdater = c17278c;
    }

    public final void setStoreProvider(Tq.j jVar) {
        Intrinsics.j(jVar, "<set-?>");
        this.storeProvider = jVar;
    }

    public final void setUserManager(yo.k kVar) {
        Intrinsics.j(kVar, "<set-?>");
        this.userManager = kVar;
    }

    @Override // com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment.Callback
    public void updateRateAndTipNotification(String orderId, String externalShopperId, boolean shouldNavigate) {
        Intrinsics.j(externalShopperId, "externalShopperId");
        RateAndTipDialogFragment rateAndTipDialogFragment = this.rateAndTipDialogFragment;
        if (rateAndTipDialogFragment != null) {
            rateAndTipDialogFragment.dismiss();
        }
        getHomeViewModel().onAction(new HomeViewModel.Action.UpdateNotification(orderId, externalShopperId, shouldNavigate));
    }

    public HomeFragment() {
        final Function0 function0 = null;
        this.homeViewModel = androidx.fragment.app.X.b(this, Reflection.b(HomeViewModel.class), new Function0<androidx.view.g0>() { // from class: com.meijer.mobile.meijer.activity.home.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.g0 invoke() {
                return this.requireActivity().getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
            }
        }, new Function0<CreationExtras>() { // from class: com.meijer.mobile.meijer.activity.home.HomeFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<f0.c>() { // from class: com.meijer.mobile.meijer.activity.home.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final f0.c invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        AbstractC14276c<Intent> abstractC14276cRegisterForActivityResult = registerForActivityResult(new h.i(), new p());
        Intrinsics.i(abstractC14276cRegisterForActivityResult, "registerForActivityResult(...)");
        this.substitutionResultLauncher = abstractC14276cRegisterForActivityResult;
        AbstractC14276c<Intent> abstractC14276cRegisterForActivityResult2 = registerForActivityResult(new h.i(), new c());
        Intrinsics.i(abstractC14276cRegisterForActivityResult2, "registerForActivityResult(...)");
        this.mPerksRewardsResultLauncher = abstractC14276cRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MarketingBanner(final MarketingBanner marketingBanner, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-831621597);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(marketingBanner)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-831621597, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBanner (HomeFragment.kt:708)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(1476527666, true, new a(marketingBanner, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.home.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeFragment.MarketingBanner$lambda$5(this.f110656a, marketingBanner, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void MarketingBannerPreview(Composer composer, final int i10) {
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1486488071);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1486488071, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBannerPreview (HomeFragment.kt:726)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1904866040, true, new b(), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.home.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeFragment.MarketingBannerPreview$lambda$6(this.f110668a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void checkRatings() {
        checkShowRatingsPrompt();
    }

    private final void checkShowRatingsPrompt() {
        if (!getAppBackgroundManager().getAppWasInBackground() && getUserManager().b() && Ck.a.f5180a.a(getAppPrefManager().p(), getAppPrefManager().k(), getAppPrefManager().i(), getAppPrefManager().g(), getAppPrefManager().l(), getAppPrefManager().j(), getAppPrefManager().h(), getAppVersion().getVersionCode())) {
            com.meijer.mobile.ui.common.rateapp.a aVar = this.rateAppManager;
            if (aVar == null) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
                aVar = new com.meijer.mobile.ui.common.rateapp.a(fragmentActivityRequireActivity, this, getAnalyticsEngine());
            }
            aVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComposeView> getBannersPlacements() {
        return CollectionsKt.r(getHomeFragBinding().f22419D, getHomeFragBinding().f22416A, getHomeFragBinding().f22418C, getHomeFragBinding().f22417B, getHomeFragBinding().f22443z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMPerksRewardsActivityResult(C14274a result) {
        if (result.getResultCode() == 223418) {
            getHomeViewModel().onAction(HomeViewModel.Action.RefreshScreen.INSTANCE);
        }
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
            Snackbar.q0(getHomeFragBinding().getRoot(), i10, 0).t0(C17284b.f163301T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.handleSubstitutionResult$lambda$3(this.f110671a, view);
                }
            }).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSubstitutionResult$lambda$3(HomeFragment homeFragment, View view) {
        homeFragment.startActivity(homeFragment.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeHomeViewModelAction(HomeViewModel.Action action) {
        getHomeViewModel().onAction(action);
    }

    private final void launchDeepLinkURL(String url, String campaignIdValue) {
        Intent intentN;
        Context context = getContext();
        if (context != null && (intentN = getMeijerIntent().n(context, url)) != null) {
            intentN.addFlags(536870912);
            intentN.putExtra("com.meijer.intent.extra.DASHBOARD_LINK", true);
            intentN.putExtra("campaignIdValue", campaignIdValue);
            startActivity(intentN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onProductClickedPosition(int position, EnumC15218a carouselType, boolean isSponsoredCriteo) {
        getHomeViewModel().updateHomeViewState(position, carouselType, isSponsoredCriteo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAllPersonalizedProducts(android.net.Uri r9, ii.AbstractC14761h r10, java.lang.String r11, boolean r12, boolean r13) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            Dl.e r0 = r8.getMeijerIntent()
            if (r9 != 0) goto L9
            android.net.Uri r1 = android.net.Uri.EMPTY
            goto La
        L9:
            r1 = r9
        La:
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r5 = r0.O(r1)
            Dl.e r2 = r8.getMeijerIntent()
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            java.lang.String r0 = "requireActivity(...)"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            if (r9 != 0) goto L22
            android.net.Uri r9 = android.net.Uri.EMPTY
        L22:
            r4 = r9
            kotlin.jvm.internal.Intrinsics.g(r4)
            java.lang.String r9 = ""
            if (r11 != 0) goto L2d
            r6 = r9
        L2b:
            r7 = r13
            goto L2f
        L2d:
            r6 = r11
            goto L2b
        L2f:
            android.content.Intent r13 = r2.R(r3, r4, r5, r6, r7)
            if (r13 == 0) goto Lb0
            r0 = 0
            if (r11 == 0) goto L3d
            java.lang.String r1 = r8.appendViewAll(r11)
            goto L3e
        L3d:
            r1 = r0
        L3e:
            if (r1 != 0) goto L41
            goto L42
        L41:
            r9 = r1
        L42:
            java.lang.String r1 = "homePageCarouselAnalytics"
            r13.putExtra(r1, r9)
            java.lang.String r9 = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT"
            boolean r1 = r13.hasExtra(r9)
            java.lang.String r2 = "com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"
            java.lang.Class<Qo.l> r3 = Qo.l.class
            r4 = 33
            if (r1 == 0) goto L79
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L60
            java.lang.Object r1 = va.d.a(r13, r9, r3)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L6b
        L60:
            android.os.Parcelable r1 = r13.getParcelableExtra(r9)
            boolean r5 = r1 instanceof Qo.l
            if (r5 != 0) goto L69
            r1 = r0
        L69:
            Qo.l r1 = (Qo.l) r1
        L6b:
            boolean r1 = r1 instanceof Qo.l.Department
            if (r1 == 0) goto L79
            if (r10 == 0) goto L75
            java.lang.String r0 = r10.getValue()
        L75:
            r13.putExtra(r2, r0)
            goto Lad
        L79:
            boolean r1 = r13.hasExtra(r9)
            if (r1 == 0) goto La4
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L8a
            java.lang.Object r9 = va.d.a(r13, r9, r3)
            android.os.Parcelable r9 = (android.os.Parcelable) r9
            goto L95
        L8a:
            android.os.Parcelable r9 = r13.getParcelableExtra(r9)
            boolean r1 = r9 instanceof Qo.l
            if (r1 != 0) goto L93
            r9 = r0
        L93:
            Qo.l r9 = (Qo.l) r9
        L95:
            boolean r9 = r9 instanceof Qo.l.BrowseCollection
            if (r9 == 0) goto La4
            java.lang.String r9 = "KEY_CURATED_CAROUSEL"
            r13.putExtra(r9, r11)
            java.lang.String r9 = "SEE_MORE_ITEMS"
            r13.putExtra(r9, r12)
            goto Lad
        La4:
            if (r10 == 0) goto Laa
            java.lang.String r0 = r10.getValue()
        Laa:
            r13.putExtra(r2, r0)
        Lad:
            r8.startActivity(r13)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeFragment.onViewAllPersonalizedProducts(android.net.Uri, ii.h, java.lang.String, boolean, boolean):void");
    }

    private final void pullToRefresh() {
        getHomeFragBinding().f22429N.setOnRefreshListener(getHomeViewModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpSeasonalCarousel(DepartmentCarouselDecorator carousel) {
        ComposeView seasonalCarousel = getHomeFragBinding().f22434S;
        Intrinsics.i(seasonalCarousel, "seasonalCarousel");
        if (!carousel.g() && carousel.c().isEmpty()) {
            return;
        }
        seasonalCarousel.setContent(ComposableLambdaKt.composableLambdaInstance(268726002, true, new i(carousel, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpShopByDepartment(DepartmentCarouselDecorator carousel) {
        ComposeView shopByDepartmentCarousel = getHomeFragBinding().f22437V;
        Intrinsics.i(shopByDepartmentCarousel, "shopByDepartmentCarousel");
        if (!carousel.g() && carousel.c().isEmpty()) {
            return;
        }
        shopByDepartmentCarousel.setContent(ComposableLambdaKt.composableLambdaInstance(-1479243837, true, new j(carousel, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpTeacherListsCard(e.d.a teachersListCard) {
        ComposeView teacherListCard = getHomeFragBinding().f22439X;
        Intrinsics.i(teacherListCard, "teacherListCard");
        teacherListCard.setContent(ComposableLambdaKt.composableLambdaInstance(242133924, true, new k(teachersListCard, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupHomeChipSection(HomeDecorator decorator) {
        ComposeView homeChipSection = getHomeFragBinding().f22428M;
        Intrinsics.i(homeChipSection, "homeChipSection");
        if (!decorator.getChips().isEmpty() && !decorator.isLoadingContent()) {
            homeChipSection.setContent(ComposableLambdaKt.composableLambdaInstance(-1755021099, true, new l(decorator)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupHomeEmailBanner(HomeDecorator decorator, boolean isLoggedIn) {
        if (!decorator.isLoadingContent() && isLoggedIn) {
            getHomeFragBinding().f22426K.setContent(ComposableLambdaKt.composableLambdaInstance(1357521376, true, new m(decorator, this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupOrderStatusComponent(HomeDecorator decorator) {
        getHomeFragBinding().f22431P.setContent(ComposableLambdaKt.composableLambdaInstance(-1681819335, true, new n(decorator, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showClipCouponErrorDialog$lambda$9(HomeFragment homeFragment, Coupon coupon, TrackingData trackingData, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        homeFragment.getHomeViewModel().onAction(new a.Clip(coupon, trackingData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCouponDetailActivity(Pk.c coupon, TrackingData trackingData) {
        String value;
        AbstractC14761h event;
        Dl.e meijerIntent = getMeijerIntent();
        if (trackingData != null && (event = trackingData.getEvent()) != null) {
            value = event.getValue();
        } else {
            value = null;
        }
        startActivity(meijerIntent.f(coupon, true, true, false, value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toProductDetailActivity(nk.f productId, String previousTrackAction) {
        startActivity(getFeatureEntryPoint().s(productId, false, true, previousTrackAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toRateAndTipActivity(Builder builder, EnumC17276a flowType) {
        Intent intentV = getFeatureEntryPoint().v(builder, flowType);
        AbstractC14276c<Intent> abstractC14276c = this.startForResult;
        if (abstractC14276c == null) {
            Intrinsics.x("startForResult");
            abstractC14276c = null;
        }
        abstractC14276c.a(intentV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void viewPersonalizedProductsAction(String uri, String carouselTitle, boolean isFromSeeMoreItems, EnumC15218a carouselType, boolean isWhiteLabelCarousel) {
        getHomeViewModel().onAction(new HomeViewModel.Action.PersonalizedProductListClicked(uri, carouselTitle, isFromSeeMoreItems, carouselType, isWhiteLabelCarousel));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(getHomeViewModel());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getRateAndTipUpdater().c(RATE_AND_TIP_UPDATER_KEY);
        this._homeFragBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getRateAndTipUpdater().a(RATE_AND_TIP_UPDATER_KEY, this);
        checkRatings();
    }

    @Override // Qj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Bl.k.b(contextRequireContext, false, null, null, null, null, null, 126, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        HomeActivity homeActivity;
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity instanceof HomeActivity) {
            homeActivity = (HomeActivity) activity;
        } else {
            homeActivity = null;
        }
        if (homeActivity != null) {
            homeActivity.setLeavingHomeScreen(false);
            homeActivity.trackHomeScreenState(this.previousTrackAction);
            this.previousTrackAction = null;
        }
    }
}
