package com.meijer.mobile.meijer.activity.home;

import Co.ProductFullDetails;
import Ji.LocalThemeScope;
import Jk.AppVersion;
import Mn.AbstractC4303x1;
import Oj.a;
import Ok.Coupon;
import Pk.a;
import Sl.MarketingBannersDecorator;
import Ul.HomeDepartment;
import Ul.MarketingBanner;
import Ul.e;
import V2.CreationExtras;
import Vl.HomeMperksClippedReward;
import ae.C5597b;
import ak.AbstractC5607a;
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
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.C6031t;
import androidx.view.InterfaceC6030s;
import androidx.view.f0;
import as.C6149c;
import bo.ClaimReward;
import bo.g;
import bo.h;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import dl.SpecialOffer;
import ds.AbstractC13565b;
import ds.C13569f;
import ds.DepartmentCarouselDecorator;
import ej.Entry;
import em.AbstractC13687a;
import em.AbstractC13689c;
import em.AbstractC13697k;
import es.AbstractC13761f;
import es.OrderStatusCardDecorator;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import fm.HomeEmailBannerDecorator;
import fm.HomeMperksDecorator;
import fm.SpecialOffersCarouselDecorator;
import fs.AbstractC13947a;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import gm.AbstractC14275b;
import hi.AbstractC14481h;
import hi.C14475b;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j0.C14802K;
import j0.C14815g;
import j2.C14835c;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import je.C14886b;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import jk.EnumC14984a;
import jm.C15002N;
import jm.C15024h;
import kotlin.C17917Z;
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
import ol.TipData;
import os.C16154e;
import os.C16156g;
import os.C16161l;
import os.C16165p;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tp.Builder;
import tp.C17129c;
import tp.EnumC17127a;
import tr.C17135b;
import tv.InterfaceC17153g;
import um.C17279b;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;
import vs.CartProductListDecorator;
import vs.ProductCarouselDecorator;
import wk.C17829a;
import xr.InterfaceC18086a;
import yl.AbstractC18227f;
import yo.C18264a;
import yr.C18294u;

@Metadata(d1 = {"\u0000\u0090\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u0094\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0094\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0007J3\u0010*\u001a\u00020\n2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$2\n\u0010'\u001a\u00060#j\u0002`&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0007J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\u0007J\u001f\u00102\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0003¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u0010\u0007J\u0010\u00109\u001a\u00020\nH\u0083@¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020;H\u0003¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0003¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bM\u0010HJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\u0006\u0010N\u001a\u00020(H\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bQ\u0010DJ)\u0010V\u001a\u00020\n2\u0006\u0010B\u001a\u00020R2\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020(H\u0002¢\u0006\u0004\bV\u0010WJ'\u0010]\u001a\u00020\n2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020(H\u0002¢\u0006\u0004\b]\u0010^J+\u0010c\u001a\u00020\n2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020a2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\nH\u0083@¢\u0006\u0004\be\u0010:J\u0013\u0010f\u001a\u00020#*\u00020#H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bh\u00107J!\u0010k\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010#2\u0006\u0010j\u001a\u00020#H\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010m\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bm\u0010nJ!\u0010o\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010#2\u0006\u0010j\u001a\u00020#H\u0002¢\u0006\u0004\bo\u0010lJ)\u0010t\u001a\u00020\n2\u0006\u0010p\u001a\u00020(2\u0006\u0010q\u001a\u00020X2\b\u0010s\u001a\u0004\u0018\u00010rH\u0002¢\u0006\u0004\bt\u0010uJW\u0010\u0081\u0001\u001a\u00020\n2\u0006\u0010v\u001a\u00020#2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0w2\u0006\u0010{\u001a\u00020z2\u0006\u0010|\u001a\u00020(2\u0006\u0010}\u001a\u00020#2\u0006\u0010~\u001a\u00020#2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0wH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J7\u0010\u0086\u0001\u001a\u00020\n2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010#2\u0007\u0010\u0084\u0001\u001a\u00020#2\u0007\u0010\u0085\u0001\u001a\u00020(2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J>\u0010\u008b\u0001\u001a\u00020\n2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0088\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010#2\u0007\u0010\u0085\u0001\u001a\u00020(H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J)\u0010\u0090\u0001\u001a\u00020\n2\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u000b\b\u0002\u0010\u008f\u0001\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J(\u0010\u0096\u0001\u001a\u00020\n2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JN\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020X2\u0007\u0010\u0099\u0001\u001a\u00020X2\u0007\u0010\u009a\u0001\u001a\u00020X2\u0007\u0010\u009b\u0001\u001a\u00020X2\b\u0010\u0093\u0001\u001a\u00030\u009c\u00012\f\b\u0002\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001c\u0010¡\u0001\u001a\u00020\n2\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J!\u0010£\u0001\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0005\b£\u0001\u00103J\u001b\u0010¥\u0001\u001a\u00020\n2\u0007\u0010¤\u0001\u001a\u00020XH\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b§\u0001\u0010\u0007J\u0011\u0010¨\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b¨\u0001\u0010\u0007J\u001c\u0010«\u0001\u001a\u00020\n2\b\u0010ª\u0001\u001a\u00030©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001R*\u0010®\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010µ\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010¼\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ã\u0001\u001a\u00030Â\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R*\u0010Ê\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010Ø\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010ß\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010æ\u0001\u001a\u00030å\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R*\u0010í\u0001\u001a\u00030ì\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R!\u0010û\u0001\u001a\u00030ö\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R\u001b\u0010ü\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001b\u0010þ\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ý\u0001R\u0019\u0010ÿ\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001c\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R)\u0010\u0087\u0002\u001a\u0014\u0012\u000f\u0012\r \u0086\u0002*\u0005\u0018\u00010\u0085\u00020\u0085\u00020\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R)\u0010\u0089\u0002\u001a\u0014\u0012\u000f\u0012\r \u0086\u0002*\u0005\u0018\u00010\u0085\u00020\u0085\u00020\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u0088\u0002R\u001c\u0010\u008b\u0002\u001a\u0005\u0018\u00010\u008a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R!\u0010\u008d\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u0088\u0002R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010ý\u0001R\u0018\u0010\u0090\u0002\u001a\u00030ó\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001d\u0010\u0093\u0002\u001a\b\u0012\u0004\u0012\u00020S0w8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002¨\u0006\u0095\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "LPj/g;", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Callback;", "LLr/d;", "Ltp/c$a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onRateAppNow", "onRateAppRemindLater", "onRateAppNoThanksCurrentVersion", "onRateAppNoThanks", "onRateAppSendEmail", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "", "shouldNavigate", "updateRateAndTipNotification", "(Ljava/lang/String;Ljava/lang/String;Z)V", "onCreateAccount", "onSignIn", "Ltp/b;", "builder", "Ltp/a;", "flowType", "onUpdateRateAndTip", "(Ltp/b;Ltp/a;)V", "Lg/a;", "result", "handleSubstitutionResult", "(Lg/a;)V", "pullToRefresh", "observeHomeViewState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUl/i;", "marketingBanner", "MarketingBanner", "(LUl/i;Landroidx/compose/runtime/Composer;I)V", "MarketingBannerPreview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "decorator", "setupOrderStatusComponent", "(Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;)V", "Lds/c;", "carousel", "setUpShopByDepartment", "(Lds/c;)V", "LUl/e$d$a;", "teachersListCard", "setUpTeacherListsCard", "(LUl/e$d$a;)V", "setUpSeasonalCarousel", "isLoggedIn", "setupHomeEmailBanner", "(Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;Z)V", "setupHomeChipSection", "Lvs/d;", "Landroidx/compose/ui/platform/ComposeView;", "carouselSection", "isShowViewAllButton", "setupProductCarousels", "(Lvs/d;Landroidx/compose/ui/platform/ComposeView;Z)V", "", "position", "Ljk/a;", "carouselType", "isSponsoredCriteo", "onProductClickedPosition", "(ILjk/a;Z)V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "onStepperStateChanged", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;Ljk/a;)V", "observeEvents", "appendViewAll", "(Ljava/lang/String;)Ljava/lang/String;", "handleMPerksRewardsActivityResult", "url", "campaignIdValue", "onBannerClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "openBrowser", "(Ljava/lang/String;)V", "launchDeepLinkURL", "showMperksBottomSheet", "expiringPoints", "j$/time/LocalDate", "expiryDate", "showExpiryPointsDialogFragment", "(ZILj$/time/LocalDate;)V", "orderNumber", "", "Lvo/a;", "listSubstitutedItems", "Lvo/b;", "screenType", "isOnMyWayClicked", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "startOrderSubstitutionActivity", "(Ljava/lang/String;Ljava/util/List;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "uri", "carouselTitle", "isFromSeeMoreItems", "viewPersonalizedProductsAction", "(Ljava/lang/String;Ljava/lang/String;ZLjk/a;)V", "Landroid/net/Uri;", "Lhi/h;", "trackingState", "onViewAllPersonalizedProducts", "(Landroid/net/Uri;Lhi/h;Ljava/lang/String;Z)V", "Lmk/f;", "productId", "previousTrackAction", "toProductDetailActivity", "(Lmk/f;Ljava/lang/String;)V", "LOk/c;", "coupon", "Lhi/f;", "trackingData", "toCouponDetailActivity", "(LOk/c;Lhi/f;)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LOk/a;", "showClipCouponErrorDialog", "(IIIILOk/a;Lhi/f;)V", "Lol/a;", "tipData", "showRateAndTipDialog", "(Lol/a;)V", "toRateAndTipActivity", "errorMessageId", "showLoginDialog", "(I)V", "checkRatings", "checkShowRatingsPrompt", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "action", "invokeHomeViewModelAction", "(Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;)V", "LCl/e;", "meijerIntent", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "Lyo/a;", "appPrefManager", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "Lyl/k;", "featureManager", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "LTq/j;", "storeProvider", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "Lyo/k;", "userManager", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "LAl/g;", "featureEntryPoint", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "Lgi/a;", "analyticsEngine", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "Lum/b;", "appBackgroundManager", "Lum/b;", "getAppBackgroundManager", "()Lum/b;", "setAppBackgroundManager", "(Lum/b;)V", "Ltp/c;", "rateAndTipUpdater", "Ltp/c;", "getRateAndTipUpdater", "()Ltp/c;", "setRateAndTipUpdater", "(Ltp/c;)V", "LJk/a;", "appVersion", "LJk/a;", "getAppVersion", "()LJk/a;", "setAppVersion", "(LJk/a;)V", "LMn/x1;", "_homeFragBinding", "LMn/x1;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "getHomeViewModel", "()Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "homeViewModel", "sendOnLoadBeaconUrl", "Ljava/lang/String;", "sendOnViewBeaconUrl", "isResendEmailSuccess", "Z", "Lcom/meijer/mobile/ui/common/rateapp/a;", "rateAppManager", "Lcom/meijer/mobile/ui/common/rateapp/a;", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "substitutionResultLauncher", "Lg/c;", "mPerksRewardsResultLauncher", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "rateAndTipDialogFragment", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "startForResult", "getHomeFragBinding", "()LMn/x1;", "homeFragBinding", "getBannersPlacements", "()Ljava/util/List;", "bannersPlacements", "Companion", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class HomeFragment extends Hilt_HomeFragment implements Pj.g, RateAndTipDialogFragment.Callback, Lr.d, C17129c.a {
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
    private AbstractC4303x1 _homeFragBinding;
    public InterfaceC14261a analyticsEngine;
    public C17279b appBackgroundManager;
    public C18264a appPrefManager;
    public AppVersion appVersion;
    public Al.g featureEntryPoint;
    public yl.k featureManager;

    /* renamed from: homeViewModel$delegate, reason: from kotlin metadata */
    private final Lazy homeViewModel;
    private boolean isResendEmailSuccess;
    private final AbstractC14147c<Intent> mPerksRewardsResultLauncher;
    public Cl.e meijerIntent;
    private String previousTrackAction;
    private RateAndTipDialogFragment rateAndTipDialogFragment;
    public C17129c rateAndTipUpdater;
    private com.meijer.mobile.ui.common.rateapp.a rateAppManager;
    private String sendOnLoadBeaconUrl;
    private String sendOnViewBeaconUrl;
    private AbstractC14147c<Intent> startForResult;
    public Tq.j storeProvider;
    private final AbstractC14147c<Intent> substitutionResultLauncher;
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
            homeFragment.setArguments(C14835c.b(TuplesKt.a(HomeFragment.SHOW_MPERKS_BARCODE, Boolean.valueOf(showMperksBarcode))));
            return homeFragment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC14984a.values().length];
            try {
                iArr[EnumC14984a.f140312a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14984a.f140313b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketingBanner f109218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f109219b;

        a(MarketingBanner marketingBanner, HomeFragment homeFragment) {
            this.f109218a = marketingBanner;
            this.f109219b = homeFragment;
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
                ComposerKt.U(1476527666, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBanner.<anonymous> (HomeFragment.kt:709)");
            }
            String bannerContentDescription = this.f109218a.getBannerContentDescription();
            String bannerImageURL = this.f109218a.getBannerImageURL();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f109219b) | composer.D(this.f109218a);
            final HomeFragment homeFragment = this.f109219b;
            final MarketingBanner marketingBanner = this.f109218a;
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
            jm.W.d(AdsTheme, bannerImageURL, null, bannerContentDescription, (Function0) objB, composer, LocalThemeScope.f15770g | (i10 & 14), 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(HomeFragment homeFragment, MarketingBanner marketingBanner) {
            homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.MarketBannerClickAction(marketingBanner));
            return Unit.f142422a;
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
                ComposerKt.U(-1904866040, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBannerPreview.<anonymous> (HomeFragment.kt:727)");
            }
            HomeFragment.this.MarketingBanner(new MarketingBanner(null, "", null, null, 13, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
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
            return new FunctionReferenceImpl(1, HomeFragment.this, HomeFragment.class, "handleMPerksRewardsActivityResult", "handleMPerksRewardsActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            HomeFragment.this.handleMPerksRewardsActivityResult(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment", f = "HomeFragment.kt", l = {1010}, m = "observeEvents")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f109222a;

        /* renamed from: c, reason: collision with root package name */
        int f109224c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109222a = obj;
            this.f109224c |= Integer.MIN_VALUE;
            return HomeFragment.this.observeEvents(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e<T> implements InterfaceC17153g {
        e() {
        }

        @Override // tv.InterfaceC17153g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object emit(final HomeViewModel.HomeEvent homeEvent, Continuation<? super Unit> continuation) throws Resources.NotFoundException, NumberFormatException {
            if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToLearnMore) {
                HomeFragment homeFragment = HomeFragment.this;
                Al.p pVar = Al.p.f690a;
                Context contextRequireContext = homeFragment.requireContext();
                Intrinsics.i(contextRequireContext, "requireContext(...)");
                homeFragment.startActivity(pVar.a(contextRequireContext));
            } else {
                AbstractC14147c abstractC14147c = null;
                AbstractC14147c abstractC14147c2 = null;
                if (homeEvent instanceof HomeViewModel.HomeEvent.HomeChipItemClickedEvent) {
                    InterfaceC18086a homeChip = ((HomeViewModel.HomeEvent.HomeChipItemClickedEvent) homeEvent).getHomeChip();
                    if (homeChip instanceof AbstractC14275b.e) {
                        Cl.e meijerIntent = HomeFragment.this.getMeijerIntent();
                        Context contextRequireContext2 = HomeFragment.this.requireContext();
                        Intrinsics.i(contextRequireContext2, "requireContext(...)");
                        Intent intentT = Cl.e.t(meijerIntent, contextRequireContext2, 1700, null, 4, null);
                        if (intentT != null) {
                            HomeFragment.this.startActivity(intentT);
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14275b.f.f133816e)) {
                        if (HomeFragment.this.getUserManager().b()) {
                            Cl.e meijerIntent2 = HomeFragment.this.getMeijerIntent();
                            Context contextRequireContext3 = HomeFragment.this.requireContext();
                            Intrinsics.i(contextRequireContext3, "requireContext(...)");
                            Intent intentT2 = Cl.e.t(meijerIntent2, contextRequireContext3, 268437756, null, 4, null);
                            if (intentT2 != null) {
                                HomeFragment.this.startActivity(intentT2);
                            }
                        } else {
                            HomeFragment.this.showLoginDialog(com.meijer.mobile.home.ux.r0.f98507x);
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14275b.d.f133812e)) {
                        if (HomeFragment.this.getUserManager().b()) {
                            HomeFragment homeFragment2 = HomeFragment.this;
                            homeFragment2.startActivity(homeFragment2.getFeatureEntryPoint().r());
                        } else {
                            HomeFragment.this.showLoginDialog(com.meijer.mobile.home.ux.r0.f98498o);
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14275b.g.f133818e)) {
                        if (HomeFragment.this.getStoreProvider().d()) {
                            HomeFragment homeFragment3 = HomeFragment.this;
                            homeFragment3.startActivity(Al.g.G(homeFragment3.getFeatureEntryPoint(), 0, 0, 3, null));
                        } else {
                            FragmentActivity fragmentActivityRequireActivity = HomeFragment.this.requireActivity();
                            Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
                            new Bl.a(fragmentActivityRequireActivity, 536871412).g();
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14275b.C2103b.f133809e)) {
                        HomeFragment homeFragment4 = HomeFragment.this;
                        Al.i iVar = Al.i.f671a;
                        FragmentActivity fragmentActivityRequireActivity2 = homeFragment4.requireActivity();
                        Intrinsics.i(fragmentActivityRequireActivity2, "requireActivity(...)");
                        homeFragment4.startActivity(iVar.a(fragmentActivityRequireActivity2));
                    } else if (homeChip instanceof AbstractC14275b.MPerks) {
                        if (HomeFragment.this.getUserManager().b()) {
                            AbstractC14147c abstractC14147c3 = HomeFragment.this.mPerksRewardsResultLauncher;
                            Al.p pVar2 = Al.p.f690a;
                            Context contextRequireContext4 = HomeFragment.this.requireContext();
                            Intrinsics.i(contextRequireContext4, "requireContext(...)");
                            abstractC14147c3.a(pVar2.d(contextRequireContext4, false));
                        } else {
                            HomeFragment homeFragment5 = HomeFragment.this;
                            Al.p pVar3 = Al.p.f690a;
                            Context contextRequireContext5 = homeFragment5.requireContext();
                            Intrinsics.i(contextRequireContext5, "requireContext(...)");
                            homeFragment5.startActivity(pVar3.a(contextRequireContext5));
                        }
                    } else if (Intrinsics.e(homeChip, AbstractC14275b.a.f133807e)) {
                        Cl.e meijerIntent3 = HomeFragment.this.getMeijerIntent();
                        FragmentActivity fragmentActivityRequireActivity3 = HomeFragment.this.requireActivity();
                        Intrinsics.i(fragmentActivityRequireActivity3, "requireActivity(...)");
                        Intent intentT3 = Cl.e.t(meijerIntent3, fragmentActivityRequireActivity3, 536871032, null, 4, null);
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
                    AbstractC14147c abstractC14147c4 = HomeFragment.this.startForResult;
                    if (abstractC14147c4 == null) {
                        Intrinsics.y("startForResult");
                    } else {
                        abstractC14147c = abstractC14147c4;
                    }
                    Al.l lVar = Al.l.f673a;
                    Context contextRequireContext6 = HomeFragment.this.requireContext();
                    Intrinsics.i(contextRequireContext6, "requireContext(...)");
                    HomeViewModel.HomeEvent.NavigateToOrderDetail navigateToOrderDetail = (HomeViewModel.HomeEvent.NavigateToOrderDetail) homeEvent;
                    abstractC14147c.a(Al.l.b(lVar, contextRequireContext6, navigateToOrderDetail.getOrderNumber(), navigateToOrderDetail.getPreviousTrackAction() + ": New home screen", null, 8, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToUpdatePaymentMethod) {
                    FragmentActivity activity2 = HomeFragment.this.getActivity();
                    Intrinsics.h(activity2, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.home.HomeActivity");
                    ((HomeActivity) activity2).setLeavingHomeScreen(true);
                    AbstractC14147c abstractC14147c5 = HomeFragment.this.startForResult;
                    if (abstractC14147c5 == null) {
                        Intrinsics.y("startForResult");
                    } else {
                        abstractC14147c2 = abstractC14147c5;
                    }
                    Al.l lVar2 = Al.l.f673a;
                    Context contextRequireContext7 = HomeFragment.this.requireContext();
                    Intrinsics.i(contextRequireContext7, "requireContext(...)");
                    HomeViewModel.HomeEvent.NavigateToUpdatePaymentMethod navigateToUpdatePaymentMethod = (HomeViewModel.HomeEvent.NavigateToUpdatePaymentMethod) homeEvent;
                    abstractC14147c2.a(Al.l.b(lVar2, contextRequireContext7, navigateToUpdatePaymentMethod.getOrderNumber(), navigateToUpdatePaymentMethod.getPreviousTrackAction() + ": New home screen", null, 8, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToCarouselDeeplink) {
                    HomeViewModel.HomeEvent.NavigateToCarouselDeeplink navigateToCarouselDeeplink = (HomeViewModel.HomeEvent.NavigateToCarouselDeeplink) homeEvent;
                    int iP = HomeFragment.this.getMeijerIntent().P(navigateToCarouselDeeplink.getDeeplink());
                    if (iP == 4000) {
                        Intent intentZ = HomeFragment.this.getMeijerIntent().Z(Uri.parse(navigateToCarouselDeeplink.getDeeplink()), navigateToCarouselDeeplink.getName());
                        if (intentZ != null) {
                            HomeFragment homeFragment7 = HomeFragment.this;
                            String analytics = navigateToCarouselDeeplink.getAnalytics();
                            if (analytics != null) {
                                intentZ.putExtra("broseDepartmentCarouselAnalytics", analytics);
                                intentZ.putExtra("homePageCarouselAnalytics", homeFragment7.appendViewAll(navigateToCarouselDeeplink.getName()));
                            }
                            homeFragment7.startActivity(intentZ);
                        }
                    } else if (iP != 4100) {
                        Cl.e meijerIntent4 = HomeFragment.this.getMeijerIntent();
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
                        Cl.e meijerIntent5 = HomeFragment.this.getMeijerIntent();
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
                    mk.f productIdentity = viewProductDetails.getProductIdentity();
                    AbstractC14481h trackingState = viewProductDetails.getTrackingState();
                    homeFragment10.toProductDetailActivity(productIdentity, trackingState != null ? trackingState.getValue() : null);
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewPersonalizedProducts) {
                    HomeViewModel.HomeEvent.ViewPersonalizedProducts viewPersonalizedProducts = (HomeViewModel.HomeEvent.ViewPersonalizedProducts) homeEvent;
                    HomeFragment.this.onViewAllPersonalizedProducts(viewPersonalizedProducts.getUri(), viewPersonalizedProducts.getTrackingState(), viewPersonalizedProducts.getCarouselTitle(), viewPersonalizedProducts.isFromSeeMoreItems());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewCouponDetails) {
                    HomeViewModel.HomeEvent.ViewCouponDetails viewCouponDetails = (HomeViewModel.HomeEvent.ViewCouponDetails) homeEvent;
                    HomeFragment.this.toCouponDetailActivity(viewCouponDetails.getCoupon(), viewCouponDetails.getTrackingData());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ClipCouponFailedEvent) {
                    HomeViewModel.HomeEvent.ClipCouponFailedEvent clipCouponFailedEvent = (HomeViewModel.HomeEvent.ClipCouponFailedEvent) homeEvent;
                    HomeFragment.this.showClipCouponErrorDialog(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon(), clipCouponFailedEvent.getTrackingData());
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ViewSpecialOffers) {
                    Cl.e meijerIntent6 = HomeFragment.this.getMeijerIntent();
                    FragmentActivity fragmentActivityRequireActivity4 = HomeFragment.this.requireActivity();
                    Intrinsics.i(fragmentActivityRequireActivity4, "requireActivity(...)");
                    HomeFragment.this.startActivity(Cl.e.l(meijerIntent6, fragmentActivityRequireActivity4, null, ((HomeViewModel.HomeEvent.ViewSpecialOffers) homeEvent).getPreviousTrackAction(), HomeFragment.this.getFeatureManager().e(AbstractC18227f.M.f170552h), 2, null));
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
                            Al.t tVar = Al.t.f694a;
                            Context contextRequireContext10 = homeFragment12.requireContext();
                            Intrinsics.i(contextRequireContext10, "requireContext(...)");
                            homeFragment12.substitutionResultLauncher.a(Al.t.e(tVar, contextRequireContext10, cartProductListDecoratorB, Pp.c.f28366d, null, "home page", 8, null));
                        }
                    }
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.UpdateCartFailedEvent) {
                    View root = HomeFragment.this.getHomeFragBinding().getRoot();
                    String string = HomeFragment.this.getResources().getString(((HomeViewModel.HomeEvent.UpdateCartFailedEvent) homeEvent).getMessageResId());
                    Intrinsics.i(string, "getString(...)");
                    Snackbar snackbarR0 = Snackbar.r0(root, m2.b.a(string, 0, null, null), 0);
                    Intrinsics.i(snackbarR0, "make(...)");
                    Vj.b.b(snackbarR0).c0();
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowError) {
                    C14886b cancelable = new C14886b(HomeFragment.this.getHomeFragBinding().getRoot().getContext()).setCancelable(false);
                    Context context = HomeFragment.this.getHomeFragBinding().getRoot().getContext();
                    Intrinsics.i(context, "getContext(...)");
                    HomeViewModel.HomeEvent.ShowError showError = (HomeViewModel.HomeEvent.ShowError) homeEvent;
                    C14886b title = cancelable.setTitle(bk.d.a(context, showError.getTitle()));
                    Context context2 = HomeFragment.this.getHomeFragBinding().getRoot().getContext();
                    Intrinsics.i(context2, "getContext(...)");
                    C14886b message = title.setMessage(bk.d.a(context2, showError.getMessage()));
                    Context context3 = HomeFragment.this.getHomeFragBinding().getRoot().getContext();
                    Intrinsics.i(context3, "getContext(...)");
                    message.setPositiveButton(bk.d.a(context3, showError.getPositiveButtonText()), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.E
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
                    AbstractC14147c abstractC14147c6 = HomeFragment.this.mPerksRewardsResultLauncher;
                    Al.p pVar4 = Al.p.f690a;
                    Context contextRequireContext11 = HomeFragment.this.requireContext();
                    Intrinsics.i(contextRequireContext11, "requireContext(...)");
                    abstractC14147c6.a(Al.p.f(pVar4, contextRequireContext11, false, true, false, false, 26, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToYourRewardsMPerksDashboard) {
                    HomeFragment homeFragment14 = HomeFragment.this;
                    homeFragment14.startActivity(homeFragment14.getFeatureEntryPoint().J(CollectionsExtensionsKt.toArrayList(((HomeViewModel.HomeEvent.NavigateToYourRewardsMPerksDashboard) homeEvent).getClippedRewards())));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.NavigateToMPerksRewards) {
                    HomeFragment homeFragment15 = HomeFragment.this;
                    HomeViewModel.HomeEvent.NavigateToMPerksRewards navigateToMPerksRewards = (HomeViewModel.HomeEvent.NavigateToMPerksRewards) homeEvent;
                    homeFragment15.startActivity(Al.g.I(homeFragment15.getFeatureEntryPoint(), navigateToMPerksRewards.getRewardDescription(), false, navigateToMPerksRewards.isFromAvailableRewards(), 2, null));
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowMperksClaimRewardError) {
                    Snackbar snackbarQ02 = Snackbar.q0(HomeFragment.this.getHomeFragBinding().getRoot(), com.meijer.mobile.home.ux.r0.f98482B, 0);
                    Intrinsics.i(snackbarQ02, "make(...)");
                    Context context4 = HomeFragment.this.getContext();
                    if (context4 != null) {
                        snackbarQ02.v0(Bj.r.b(context4, C5597b.f44533o, null, false, 6, null));
                    }
                    snackbarQ02.x0(PorterDuff.Mode.DARKEN);
                    Context context5 = HomeFragment.this.getContext();
                    if (context5 != null) {
                        snackbarQ02.A0(Bj.r.b(context5, C5597b.f44541s, null, false, 6, null));
                    }
                    ViewGroup.LayoutParams layoutParams = snackbarQ02.K().getLayoutParams();
                    Intrinsics.h(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) layoutParams)).bottomMargin = 16;
                    snackbarQ02.c0();
                } else if (homeEvent instanceof HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent) {
                    HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (HomeViewModel.HomeEvent.ShowChokingWarningDialogEvent) homeEvent;
                    C14886b message2 = new C14886b(HomeFragment.this.requireContext(), Bj.p.f3060d).setTitle(showChokingWarningDialogEvent.getDialogInfo().getTitle()).setIcon(Bj.i.f2666J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.getDialogInfo().getBody());
                    int positiveButtonText = showChokingWarningDialogEvent.getDialogInfo().getPositiveButtonText();
                    final HomeFragment homeFragment16 = HomeFragment.this;
                    C14886b positiveButton = message2.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.F
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
            return Unit.f142422a;
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
        /* synthetic */ Object f109226a;

        /* renamed from: c, reason: collision with root package name */
        int f109228c;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109226a = obj;
            this.f109228c |= Integer.MIN_VALUE;
            return HomeFragment.this.observeHomeViewState(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g<T> implements InterfaceC17153g {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109231b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$a$a, reason: collision with other inner class name */
            static final class C1659a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f109232a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109233b;

                C1659a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f109232a = homeDecorator;
                    this.f109233b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeFragment homeFragment, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.GoogleAdClicked(googleAdAnalytics));
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
                        ComposerKt.U(-892608235, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:358)");
                    }
                    GoogleAdData googleAdSlot1 = this.f109232a.getGoogleAdSlot1();
                    if (googleAdSlot1 != null) {
                        final HomeFragment homeFragment = this.f109233b;
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeFragment);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.H
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeFragment.g.a.C1659a.c(homeFragment, (GoogleAdAnalytics) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        sr.p.C(AdsTheme, null, googleAdSlot1, (Function1) objB, composer, (i10 & 14) | LocalThemeScope.f15770g | (GoogleAdData.f131149f << 6), 1);
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

            a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f109230a = homeDecorator;
                this.f109231b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(422560516, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:357)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(-892608235, true, new C1659a(this.f109230a, this.f109231b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109234a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MarketingBanner f109235b;

            b(HomeFragment homeFragment, MarketingBanner marketingBanner) {
                this.f109234a = homeFragment;
                this.f109235b = marketingBanner;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1049727865, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:697)");
                }
                this.f109234a.MarketingBanner(this.f109235b, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109236a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109237b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f109238a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109239b;

                a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f109238a = homeDecorator;
                    this.f109239b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeFragment homeFragment, GoogleAdAnalytics googleAdAnalytics) {
                    Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
                    homeFragment.getHomeViewModel().onAction(new HomeViewModel.Action.GoogleAdClicked(googleAdAnalytics));
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
                        ComposerKt.U(3998078, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:370)");
                    }
                    GoogleAdData googleAdSlot2 = this.f109238a.getGoogleAdSlot2();
                    if (googleAdSlot2 != null) {
                        final HomeFragment homeFragment = this.f109239b;
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
                        sr.p.C(AdsTheme, modifierM, googleAdSlot2, (Function1) objB, composer, (i10 & 14) | LocalThemeScope.f15770g | 48 | (GoogleAdData.f131149f << 6), 0);
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

            c(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f109236a = homeDecorator;
                this.f109237b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1160782765, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:369)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(3998078, true, new a(this.f109236a, this.f109237b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109240a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109241b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f109242a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109243b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$d$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1660a extends FunctionReferenceImpl implements Function1<AbstractC13689c, Unit> {
                    C1660a(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC13689c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC13689c abstractC13689c) {
                        a(abstractC13689c);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AbstractC13689c, Unit> {
                    b(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC13689c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC13689c abstractC13689c) {
                        a(abstractC13689c);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* synthetic */ class c extends FunctionReferenceImpl implements Function1<AbstractC13689c, Unit> {
                    c(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC13689c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC13689c abstractC13689c) {
                        a(abstractC13689c);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$d$a$d, reason: collision with other inner class name */
                /* synthetic */ class C1661d extends FunctionReferenceImpl implements Function1<AbstractC13689c, Unit> {
                    C1661d(Object obj) {
                        super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/home/ux/actions/HomeMperksAction;)V", 0);
                    }

                    public final void a(AbstractC13689c p02) {
                        Intrinsics.j(p02, "p0");
                        ((HomeViewModel) this.receiver).onAction(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC13689c abstractC13689c) {
                        a(abstractC13689c);
                        return Unit.f142422a;
                    }
                }

                a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f109242a = homeDecorator;
                    this.f109243b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit A(TrackingData trackWith) {
                    Intrinsics.j(trackWith, "$this$trackWith");
                    trackWith.v("mPerks 4.0");
                    trackWith.o(HomeFragment.HOME);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit C(TrackingData trackWith) {
                    Intrinsics.j(trackWith, "$this$trackWith");
                    trackWith.v("mPerks 4.0");
                    trackWith.o(HomeFragment.HOME);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(HomeDecorator homeDecorator, HomeFragment homeFragment, HomeMperksClippedReward homeMperksClippedReward) {
                    Intrinsics.j(homeMperksClippedReward, "homeMperksClippedReward");
                    C15002N.D(homeMperksClippedReward, homeDecorator.getMperksSection(), new b(homeFragment.getHomeViewModel()));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public static final Unit w(HomeFragment homeFragment, HomeDecorator homeDecorator, bo.g navigationRequest) {
                    Intrinsics.j(navigationRequest, "navigationRequest");
                    ClaimReward claimReward = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    if (navigationRequest instanceof g.h) {
                        homeFragment.getHomeViewModel().onAction((AbstractC13689c) C14475b.a(new AbstractC13689c.RedeemMPerksViewAllClicked(homeDecorator.getMperksSection(), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.K
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeFragment.g.d.a.x((TrackingData) obj);
                            }
                        }));
                    } else if (navigationRequest instanceof g.OnClaimRewardCardClicked) {
                        Iterator<T> it = homeDecorator.getMperksSection().c().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (((ClaimReward) next).getCouponId() == ((g.OnClaimRewardCardClicked) navigationRequest).getClaimReward().getCouponId()) {
                                claimReward = next;
                                break;
                            }
                        }
                        Intrinsics.g(claimReward);
                        C15002N.E(claimReward, homeDecorator.getMperksSection(), new C1660a(homeFragment.getHomeViewModel()));
                    }
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x(TrackingData trackWith) {
                    Intrinsics.j(trackWith, "$this$trackWith");
                    trackWith.v("mPerks 4.0");
                    trackWith.o("mPerks: Claim");
                    trackWith.p("mPerks redeem carousel: View All Rewards");
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit y(HomeFragment homeFragment, bo.h mperksResourceAction) {
                    Intrinsics.j(mperksResourceAction, "mperksResourceAction");
                    if (mperksResourceAction instanceof h.BuyReward) {
                        homeFragment.getHomeViewModel().onAction(new AbstractC13689c.OnClaimRewardClicked(((h.BuyReward) mperksResourceAction).getClaimReward().getCouponId()));
                    }
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    s(localThemeScope, composer, num.intValue());
                    return Unit.f142422a;
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
                    if (this.f109242a.getMperksSection().getIsErrorVisible()) {
                        composer4.startReplaceGroup(1254825487);
                        if (this.f109243b.getFeatureManager().e(AbstractC18227f.J.f170549h)) {
                            composer4.startReplaceGroup(244933074);
                            composer4.startReplaceGroup(5004770);
                            boolean zD = composer4.D(this.f109243b);
                            final HomeFragment homeFragment = this.f109243b;
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
                            C16156g.b(AdsTheme, null, (Function0) objB, composer4, (i11 & 14) | LocalThemeScope.f15770g, 1);
                            composer4.P();
                        } else {
                            composer4.startReplaceGroup(245256342);
                            composer4.startReplaceGroup(5004770);
                            boolean zD2 = composer4.D(this.f109243b);
                            final HomeFragment homeFragment2 = this.f109243b;
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
                            jm.Y0.m(AdsTheme, (Function0) objB2, null, composer4, LocalThemeScope.f15770g | (i11 & 14), 2);
                            composer4.P();
                        }
                        composer4.P();
                    } else if (this.f109243b.getUserManager().b()) {
                        composer4.startReplaceGroup(245847047);
                        if (this.f109243b.getFeatureManager().e(AbstractC18227f.J.f170549h)) {
                            composer4.startReplaceGroup(245888029);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(companion), AdsTheme.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                            final HomeDecorator homeDecorator = this.f109242a;
                            final HomeFragment homeFragment3 = this.f109243b;
                            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer4, 0);
                            int iA = C5717f.a(composer4, 0);
                            InterfaceC5742s interfaceC5742sR = composer4.r();
                            Modifier modifierE = androidx.compose.ui.b.e(composer4, modifierD);
                            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                            Function0<InterfaceC5811g> function0A = companion2.a();
                            if (composer4.k() == null) {
                                C5717f.c();
                            }
                            composer4.F();
                            if (composer4.getInserting()) {
                                composer4.I(function0A);
                            } else {
                                composer4.s();
                            }
                            Composer composerA = D1.a(composer4);
                            D1.c(composerA, measurePolicyA, companion2.e());
                            D1.c(composerA, interfaceC5742sR, companion2.g());
                            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                composerA.t(Integer.valueOf(iA));
                                composerA.n(Integer.valueOf(iA), function2B);
                            }
                            D1.c(composerA, modifierE, companion2.f());
                            C14815g c14815g = C14815g.f139108a;
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
                                            return HomeFragment.g.d.a.w(homeFragment3, homeDecorator, (bo.g) obj);
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
                                            return HomeFragment.g.d.a.y(homeFragment3, (bo.h) obj);
                                        }
                                    };
                                    composer4.t(objB4);
                                }
                                composer4.P();
                                z10 = false;
                                i12 = 5;
                                C16154e.k(AdsTheme, listB1, strP, iH, null, function1, (Function1) objB4, composer4, LocalThemeScope.f15770g | (i11 & 14), 8);
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
                                C16165p.d(AdsTheme, listE, z11, null, function12, (Function0) objB6, composer, LocalThemeScope.f15770g | (i11 & 14), 4);
                                Composer composer6 = composer;
                                C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(24)), composer6, 6);
                                composer5 = composer6;
                            }
                            composer5.P();
                            composer5.v();
                            composer5.P();
                            composer2 = composer5;
                        } else {
                            composer4.startReplaceGroup(251525751);
                            HomeMperksDecorator mperksSection = this.f109242a.getMperksSection();
                            Object homeViewModel = this.f109243b.getHomeViewModel();
                            composer4.startReplaceGroup(5004770);
                            boolean zD7 = composer4.D(homeViewModel);
                            Object objB7 = composer4.B();
                            if (zD7 || objB7 == Composer.INSTANCE.a()) {
                                objB7 = new C1661d(homeViewModel);
                                composer4.t(objB7);
                            }
                            composer4.P();
                            Function1 function13 = (Function1) ((KFunction) objB7);
                            composer4.startReplaceGroup(-1633490746);
                            boolean zD8 = composer4.D(this.f109243b) | composer4.D(this.f109242a);
                            final HomeFragment homeFragment4 = this.f109243b;
                            final HomeDecorator homeDecorator2 = this.f109242a;
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
                            boolean zD9 = composer4.D(this.f109243b) | composer4.D(this.f109242a);
                            final HomeFragment homeFragment5 = this.f109243b;
                            final HomeDecorator homeDecorator3 = this.f109242a;
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
                            jm.Y0.j(AdsTheme, mperksSection, null, function13, function0, (Function0) objB9, composer4, LocalThemeScope.f15770g | (i11 & 14) | (HomeMperksDecorator.f131207j << 3), 2);
                            Composer composer7 = composer4;
                            composer7.P();
                            composer2 = composer7;
                        }
                        composer2.P();
                    } else {
                        composer4.startReplaceGroup(252995213);
                        if (this.f109243b.getFeatureManager().e(AbstractC18227f.J.f170549h)) {
                            composer4.startReplaceGroup(253069799);
                            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                            composer4.startReplaceGroup(5004770);
                            boolean zD10 = composer4.D(this.f109243b);
                            final HomeFragment homeFragment6 = this.f109243b;
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
                            C16161l.c(AdsTheme, modifierFsUnmask, (Function0) objB10, composer4, (i11 & 14) | LocalThemeScope.f15770g, 0);
                            composer4.P();
                        } else {
                            composer4.startReplaceGroup(253467219);
                            composer4.startReplaceGroup(5004770);
                            boolean zD11 = composer4.D(this.f109243b);
                            final HomeFragment homeFragment7 = this.f109243b;
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
                            jm.Y0.p(AdsTheme, (Function0) objB11, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), composer4, (i11 & 14) | LocalThemeScope.f15770g, 0);
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
                    homeFragment.getHomeViewModel().onAction((AbstractC13689c) C14475b.a(new AbstractC13689c.OnYourRewardsTabClicked(homeDecorator.getMperksSection(), null, 2, 0 == true ? 1 : 0), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.M
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.g.d.a.C((TrackingData) obj);
                        }
                    }));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit D(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC13689c.d.f129041a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit E(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC13689c.d.f129041a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit F(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC13689c.a.f129035a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC13689c.a.f129035a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    C15002N.H(homeDecorator.getMperksSection(), new c(homeFragment.getHomeViewModel()));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public static final Unit z(HomeFragment homeFragment, HomeDecorator homeDecorator) {
                    homeFragment.getHomeViewModel().onAction((AbstractC13689c) C14475b.a(new AbstractC13689c.OnRedeemRewardsTabClicked(homeDecorator.getMperksSection(), null, 2, 0 == true ? 1 : 0), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.L
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.g.d.a.A((TrackingData) obj);
                        }
                    }));
                    return Unit.f142422a;
                }
            }

            d(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f109240a = homeDecorator;
                this.f109241b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1882373185, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:382)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(358847248, true, new a(this.f109240a, this.f109241b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109244a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109245b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f109246a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109247b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$g$e$a$a, reason: collision with other inner class name */
                static final class C1662a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f109248a;

                    C1662a(LocalThemeScope localThemeScope) {
                        this.f109248a = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1500780911, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:546)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        Bi.m.d(this.f109248a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                        a(interfaceC14920X, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                    this.f109246a = homeDecorator;
                    this.f109247b = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeFragment homeFragment) {
                    homeFragment.invokeHomeViewModelAction(HomeViewModel.Action.RefreshScreen.INSTANCE);
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
                        ComposerKt.U(358970041, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:544)");
                    }
                    if (this.f109246a.isLoadingContent()) {
                        composer.startReplaceGroup(-392001889);
                        Ji.Q.e(AdsTheme, Q0.b.f139711a, ComposableLambdaKt.c(1500780911, true, new C1662a(AdsTheme), composer, 54), composer, (i10 & 14) | LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                        composer.P();
                    } else {
                        if (this.f109246a.getErrorStates().size() > 2) {
                            composer.startReplaceGroup(-391433876);
                            List<Oj.a> errorStates = this.f109246a.getErrorStates();
                            ListIterator<Oj.a> listIterator = errorStates.listIterator(errorStates.size());
                            while (listIterator.hasPrevious()) {
                                Oj.a aVarPrevious = listIterator.previous();
                                if (aVarPrevious instanceof a.Failed) {
                                    AbstractC5607a message = aVarPrevious.getMessage();
                                    String strC = C16193g.c(yr.Q.f170964G, composer, 0);
                                    String strA = C6408b.a(message, composer, AbstractC5607a.f45514b);
                                    String strC2 = C16193g.c(yr.Q.f170980W, composer, 0);
                                    composer.startReplaceGroup(5004770);
                                    boolean zD = composer.D(this.f109247b);
                                    final HomeFragment homeFragment = this.f109247b;
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
                                    C18294u.c(AdsTheme, strC, strA, strC2, null, (Function0) objB, composer, LocalThemeScope.f15770g | (i10 & 14), 8);
                                    this.f109247b.getHomeFragBinding().f21097N.setRefreshing(false);
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
                    return Unit.f142422a;
                }
            }

            e(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f109244a = homeDecorator;
                this.f109245b = homeFragment;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1675250776, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:543)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(358970041, true, new a(this.f109244a, this.f109245b), composer, 54), composer, 48, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109249a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SpecialOffersCarouselDecorator f109250b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109251c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SpecialOffersCarouselDecorator f109252a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeDecorator f109253b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f109254c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109255d;

                a(SpecialOffersCarouselDecorator cVar, HomeDecorator homeDecorator, Function0<Unit> function0, HomeFragment homeFragment) {
                    this.f109252a = cVar;
                    this.f109253b = homeDecorator;
                    this.f109254c = function0;
                    this.f109255d = homeFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(HomeFragment homeFragment, Coupon coupon) {
                    Intrinsics.j(coupon, "coupon");
                    homeFragment.getHomeViewModel().onAction(new a.ViewCouponDetails(Ok.e.a(coupon.getOfferId()), new TrackingData(C14476c.a(HomeFragment.SPECIAL_OFFERS_CLICKED), null, 2, null)));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(HomeFragment homeFragment, final Coupon coupon) {
                    Intrinsics.j(coupon, "coupon");
                    homeFragment.getHomeViewModel().onAction(new a.Clip(coupon, C14480g.a(C14476c.a(HomeFragment.SPECIAL_OFFERS_CLIPPED), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.e0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.g.f.a.r(coupon, (TrackingData) obj);
                        }
                    })));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(Coupon coupon, TrackingData TrackingData) {
                    Intrinsics.j(TrackingData, "$this$TrackingData");
                    TrackingData.n(HomeFragment.HOME);
                    TrackingData.v(HomeFragment.HOME);
                    TrackingData.h(HomeFragment.OFFER_CODE, String.valueOf(coupon.getOfferId()));
                    return Unit.f142422a;
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
                        ComposerKt.U(-1175163914, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:650)");
                    }
                    Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, AdsTheme.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null));
                    List<SpecialOffer> listE = this.f109252a.e();
                    String strA = C6408b.a(this.f109252a.getCarouselTitle(), composer, AbstractC5607a.f45514b);
                    int totalSpecialOffersCount = this.f109253b.getTotalSpecialOffersCount();
                    String strD = this.f109252a.getBannerResource();
                    Integer numC = this.f109252a.getBannerErrorImageResource();
                    Oj.a aVarH = this.f109252a.getLoadingState();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f109254c);
                    final Function0<Unit> function0 = this.f109254c;
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
                    boolean zD = composer.D(this.f109255d);
                    final HomeFragment homeFragment = this.f109255d;
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
                    boolean zD2 = composer.D(this.f109255d);
                    final HomeFragment homeFragment2 = this.f109255d;
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
                    boolean zD3 = composer.D(this.f109255d);
                    final HomeFragment homeFragment3 = this.f109255d;
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
                    boolean zV2 = composer.V(this.f109254c);
                    final Function0<Unit> function04 = this.f109254c;
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
                    jm.d1.b(AdsTheme, listE, strA, aVarH, modifierFsUnmask, strD, numC, totalSpecialOffersCount, function02, function03, function1, function12, (Function0) objB5, composer, LocalThemeScope.f15770g | (i11 & 14) | (Oj.a.f23966c << 9), 0, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    g(localThemeScope, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(Function0 function0) {
                    function0.invoke();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(Function0 function0) {
                    function0.invoke();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(HomeFragment homeFragment) {
                    homeFragment.getHomeViewModel().onAction(AbstractC13697k.a.f129068a);
                    return Unit.f142422a;
                }
            }

            f(HomeFragment homeFragment, SpecialOffersCarouselDecorator cVar, HomeDecorator homeDecorator) {
                this.f109249a = homeFragment;
                this.f109250b = cVar;
                this.f109251c = homeDecorator;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-97548377, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.observeHomeViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:642)");
                }
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f109249a);
                final HomeFragment homeFragment = this.f109249a;
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
                Ji.K.b(null, ComposableLambdaKt.c(-1175163914, true, new a(this.f109250b, this.f109251c, (Function0) objB, this.f109249a), composer, 54), composer, 48, 1);
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
            public static final Unit c(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13697k.ViewAll(C14476c.h("Special Offers: View all")));
                return Unit.f142422a;
            }
        }

        g() {
        }

        @Override // tv.InterfaceC17153g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(HomeViewModel.HomeViewState homeViewState, Continuation<? super Unit> continuation) {
            List<MarketingBanner> listA;
            HomeFragment.this.sendOnLoadBeaconUrl = homeViewState.getBeaconsTracker().getLoadBeaconUrl();
            HomeFragment.this.sendOnViewBeaconUrl = homeViewState.getBeaconsTracker().getViewBeaconUrl();
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            if (homeDecorator != null) {
                HomeFragment homeFragment = HomeFragment.this;
                if (homeFragment.getFeatureManager().e(AbstractC18227f.C.f170544h)) {
                    homeFragment.getHomeFragBinding().f21092I.setContent(ComposableLambdaKt.composableLambdaInstance(422560516, true, new a(homeDecorator, homeFragment)));
                    homeFragment.getHomeFragBinding().f21093J.setContent(ComposableLambdaKt.composableLambdaInstance(1160782765, true, new c(homeDecorator, homeFragment)));
                }
                homeFragment.getHomeFragBinding().f21100Q.setContent(ComposableLambdaKt.composableLambdaInstance(-1882373185, true, new d(homeDecorator, homeFragment)));
                homeFragment.isResendEmailSuccess = homeDecorator.isResendEmailSuccess();
                homeFragment.setupHomeEmailBanner(homeDecorator, homeViewState.getAuthenticated());
                homeFragment.setupHomeChipSection(homeDecorator);
                LinearLayout homeCardListContainer = homeFragment.getHomeFragBinding().f21095L;
                Intrinsics.i(homeCardListContainer, "homeCardListContainer");
                int i10 = 0;
                homeCardListContainer.setVisibility(!homeDecorator.isLoadingContent() ? 0 : 8);
                if (homeDecorator.isLoadingContent()) {
                    homeFragment.getHomeFragBinding().f21097N.setRefreshing(false);
                }
                homeFragment.setupOrderStatusComponent(homeDecorator);
                ComposeView errorView = homeFragment.getHomeFragBinding().f21089F;
                Intrinsics.i(errorView, "errorView");
                errorView.setVisibility(homeDecorator.isLoadingContent() || homeDecorator.getErrorStates().size() > 2 ? 0 : 8);
                homeFragment.getHomeFragBinding().f21089F.setContent(ComposableLambdaKt.composableLambdaInstance(-1675250776, true, new e(homeDecorator, homeFragment)));
                if (!homeDecorator.getProductCarouselList().isEmpty() && !homeDecorator.getProductCarouselList().get(0).l()) {
                    ProductCarouselDecorator c17608d = homeDecorator.getProductCarouselList().get(0);
                    ComposeView firstProductCarousel = homeFragment.getHomeFragBinding().f21091H;
                    Intrinsics.i(firstProductCarousel, "firstProductCarousel");
                    HomeFragment.F0(homeFragment, c17608d, firstProductCarousel, false, 4, null);
                }
                if (homeDecorator.getProductCarouselList().size() > 1 && !homeDecorator.getProductCarouselList().get(1).l()) {
                    ProductCarouselDecorator c17608d2 = homeDecorator.getProductCarouselList().get(1);
                    ComposeView secondProductCarousel = homeFragment.getHomeFragBinding().f21104U;
                    Intrinsics.i(secondProductCarousel, "secondProductCarousel");
                    HomeFragment.F0(homeFragment, c17608d2, secondProductCarousel, false, 4, null);
                }
                if (homeDecorator.getProductCarouselList().size() > 2 && !homeDecorator.getProductCarouselList().get(2).l()) {
                    ProductCarouselDecorator c17608d3 = homeDecorator.getProductCarouselList().get(2);
                    ComposeView thirdProductCarousel = homeFragment.getHomeFragBinding().f21109Z;
                    Intrinsics.i(thirdProductCarousel, "thirdProductCarousel");
                    HomeFragment.F0(homeFragment, c17608d3, thirdProductCarousel, false, 4, null);
                }
                if (!homeDecorator.getCuratedCarouselList().isEmpty() && !homeDecorator.getCuratedCarouselList().get(0).l()) {
                    ProductCarouselDecorator c17608d4 = homeDecorator.getCuratedCarouselList().get(0);
                    ComposeView firstCuratedCarousel = homeFragment.getHomeFragBinding().f21090G;
                    Intrinsics.i(firstCuratedCarousel, "firstCuratedCarousel");
                    HomeFragment.F0(homeFragment, c17608d4, firstCuratedCarousel, false, 4, null);
                }
                if (homeDecorator.getCuratedCarouselList().size() > 1 && !homeDecorator.getCuratedCarouselList().get(1).l()) {
                    ProductCarouselDecorator c17608d5 = homeDecorator.getCuratedCarouselList().get(1);
                    ComposeView secondCuratedCarousel = homeFragment.getHomeFragBinding().f21103T;
                    Intrinsics.i(secondCuratedCarousel, "secondCuratedCarousel");
                    HomeFragment.F0(homeFragment, c17608d5, secondCuratedCarousel, false, 4, null);
                }
                if (homeDecorator.getCuratedCarouselList().size() > 2 && !homeDecorator.getCuratedCarouselList().get(2).l()) {
                    ProductCarouselDecorator c17608d6 = homeDecorator.getCuratedCarouselList().get(2);
                    ComposeView thirdCuratedCarousel = homeFragment.getHomeFragBinding().f21108Y;
                    Intrinsics.i(thirdCuratedCarousel, "thirdCuratedCarousel");
                    HomeFragment.F0(homeFragment, c17608d6, thirdCuratedCarousel, false, 4, null);
                }
                if (homeDecorator.getWhiteLabelCarousel() != null) {
                    ProductCarouselDecorator whiteLabel = homeDecorator.getWhiteLabel();
                    ComposeView whiteLabelCarousel = homeFragment.getHomeFragBinding().f21110a0;
                    Intrinsics.i(whiteLabelCarousel, "whiteLabelCarousel");
                    homeFragment.setupProductCarousels(whiteLabel, whiteLabelCarousel, homeFragment.getFeatureManager().e(AbstractC18227f.x0.f170613h));
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
                    homeFragment.getHomeFragBinding().f21106W.setContent(ComposableLambdaKt.composableLambdaInstance(-97548377, true, new f(homeFragment, specialOffersCarousel, homeDecorator)));
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
                            if (StringsKt.r0(marketingBanner.getBannerImageURL())) {
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
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1", f = "HomeFragment.kt", l = {326}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109256a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1", f = "HomeFragment.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109258a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f109259b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109260c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1$1", f = "HomeFragment.kt", l = {327}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$h$a$a, reason: collision with other inner class name */
            static final class C1663a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f109261a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109262b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1663a(HomeFragment homeFragment, Continuation<? super C1663a> continuation) {
                    super(2, continuation);
                    this.f109262b = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1663a(this.f109262b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1663a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109261a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        HomeFragment homeFragment = this.f109262b;
                        this.f109261a = 1;
                        if (homeFragment.observeHomeViewState(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1$2", f = "HomeFragment.kt", l = {328}, m = "invokeSuspend")
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f109263a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109264b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(HomeFragment homeFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f109264b = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f109264b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109263a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        HomeFragment homeFragment = this.f109264b;
                        this.f109263a = 1;
                        if (homeFragment.observeEvents(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeFragment$onViewCreated$1$1$3", f = "HomeFragment.kt", l = {329}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f109265a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeFragment f109266b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(HomeFragment homeFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f109266b = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f109266b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109265a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        HomeViewModel homeViewModel = this.f109266b.getHomeViewModel();
                        this.f109265a = 1;
                        if (homeViewModel.observeStoreChanges$Meijer_playstoreRelease(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeFragment homeFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109260c = homeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f109260c, continuation);
                aVar.f109259b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109258a == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f109259b;
                    C16648k.d(interfaceC16622O, null, null, new C1663a(this.f109260c, null), 3, null);
                    C16648k.d(interfaceC16622O, null, null, new b(this.f109260c, null), 3, null);
                    C16648k.d(interfaceC16622O, null, null, new c(this.f109260c, null), 3, null);
                    return Unit.f142422a;
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
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109256a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6030s viewLifecycleOwner = HomeFragment.this.getViewLifecycleOwner();
                Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC6023l.b bVar = AbstractC6023l.b.f55278d;
                a aVar = new a(HomeFragment.this, null);
                this.f109256a = 1;
                if (C5994J.b(viewLifecycleOwner, bVar, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DepartmentCarouselDecorator f109267a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f109268b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DepartmentCarouselDecorator f109269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f109270b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109271c;

            a(DepartmentCarouselDecorator departmentCarouselDecorator, String str, HomeFragment homeFragment) {
                this.f109269a = departmentCarouselDecorator;
                this.f109270b = str;
                this.f109271c = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(HomeFragment homeFragment, String str, HomeDepartment department) {
                Intrinsics.j(department, "department");
                homeFragment.getHomeViewModel().onAction(new AbstractC13565b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.a.f36110b));
                return Unit.f142422a;
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
                    ComposerKt.U(-1707440127, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpSeasonalCarousel.<anonymous>.<anonymous> (HomeFragment.kt:825)");
                }
                Oj.a loadingState = this.f109269a.getLoadingState();
                List<HomeDepartment> listC = this.f109269a.c();
                AbstractC5607a viewAllTitle = this.f109269a.getViewAllTitle();
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, AdsTheme.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null));
                int i12 = i11;
                String str = this.f109270b;
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f109271c) | composer.D(this.f109269a) | composer.V(this.f109270b);
                final HomeFragment homeFragment = this.f109271c;
                final DepartmentCarouselDecorator departmentCarouselDecorator = this.f109269a;
                final String str2 = this.f109270b;
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
                boolean zD2 = composer.D(this.f109271c);
                final HomeFragment homeFragment2 = this.f109271c;
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
                boolean zD3 = composer.D(this.f109271c) | composer.V(this.f109270b);
                final HomeFragment homeFragment3 = this.f109271c;
                final String str3 = this.f109270b;
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
                C13569f.b(AdsTheme, modifierFsUnmask, str, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, (AbstractC5607a.f45514b << 15) | (i12 & 14) | LocalThemeScope.f15770g | (Oj.a.f23966c << 9), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(HomeFragment homeFragment, DepartmentCarouselDecorator departmentCarouselDecorator, String str) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13565b.ViewAll(e.c.a.f36110b, str, departmentCarouselDecorator.getSeeAllDeeplink()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13565b.Retry(e.c.a.f36110b));
                return Unit.f142422a;
            }
        }

        i(DepartmentCarouselDecorator departmentCarouselDecorator, HomeFragment homeFragment) {
            this.f109267a = departmentCarouselDecorator;
            this.f109268b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(268726002, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpSeasonalCarousel.<anonymous> (HomeFragment.kt:823)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1707440127, true, new a(this.f109267a, C6408b.a(this.f109267a.getCarouselTitle(), composer, AbstractC5607a.f45514b), this.f109268b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DepartmentCarouselDecorator f109272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f109273b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DepartmentCarouselDecorator f109274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109275b;

            a(DepartmentCarouselDecorator departmentCarouselDecorator, HomeFragment homeFragment) {
                this.f109274a = departmentCarouselDecorator;
                this.f109275b = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(HomeFragment homeFragment, String str, HomeDepartment department) {
                Intrinsics.j(department, "department");
                homeFragment.getHomeViewModel().onAction(new AbstractC13565b.DepartmentClicked(department.getDeeplink(), department.getName(), str, e.c.b.f36111b));
                return Unit.f142422a;
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
                    ComposerKt.U(839557330, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpShopByDepartment.<anonymous>.<anonymous> (HomeFragment.kt:752)");
                }
                AbstractC5607a carouselTitle = this.f109274a.getCarouselTitle();
                int i12 = AbstractC5607a.f45514b;
                final String strA = C6408b.a(carouselTitle, composer, i12);
                Oj.a loadingState = this.f109274a.getLoadingState();
                List<HomeDepartment> listC = this.f109274a.c();
                AbstractC5607a viewAllTitle = this.f109274a.getViewAllTitle();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, AdsTheme.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null);
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(this.f109275b) | composer.V(strA) | composer.D(this.f109274a);
                final HomeFragment homeFragment = this.f109275b;
                final DepartmentCarouselDecorator departmentCarouselDecorator = this.f109274a;
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
                boolean zD2 = composer.D(this.f109275b);
                final HomeFragment homeFragment2 = this.f109275b;
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
                boolean zD3 = composer.D(this.f109275b) | composer.V(strA);
                final HomeFragment homeFragment3 = this.f109275b;
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
                C13569f.b(AdsTheme, modifierM, strA, loadingState, listC, viewAllTitle, function0, function02, (Function1) objB3, composer, (i11 & 14) | LocalThemeScope.f15770g | (Oj.a.f23966c << 9) | (i12 << 15), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(HomeFragment homeFragment, String str, DepartmentCarouselDecorator departmentCarouselDecorator) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13565b.ViewAll(e.c.b.f36111b, str, departmentCarouselDecorator.getSeeAllDeeplink()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(new AbstractC13565b.Retry(e.c.b.f36111b));
                return Unit.f142422a;
            }
        }

        j(DepartmentCarouselDecorator departmentCarouselDecorator, HomeFragment homeFragment) {
            this.f109272a = departmentCarouselDecorator;
            this.f109273b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1479243837, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpShopByDepartment.<anonymous> (HomeFragment.kt:751)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(839557330, true, new a(this.f109272a, this.f109273b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.d.a f109276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f109277b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.d.a f109278a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109279b;

            a(e.d.a aVar, HomeFragment homeFragment) {
                this.f109278a = aVar;
                this.f109279b = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(final HomeFragment homeFragment, e.d.a aVar) {
                homeFragment.invokeHomeViewModelAction(HomeViewModel.Action.FindYourListTrackAction.INSTANCE);
                if (homeFragment.getUserManager().b()) {
                    Cl.e meijerIntent = homeFragment.getMeijerIntent();
                    Context contextRequireContext = homeFragment.requireContext();
                    Intrinsics.i(contextRequireContext, "requireContext(...)");
                    Intent intentN = meijerIntent.n(contextRequireContext, aVar.getDestinationDeeplink());
                    if (intentN != null) {
                        homeFragment.startActivity(intentN);
                    }
                } else {
                    new C14886b(homeFragment.requireContext()).setMessage(com.meijer.mobile.home.ux.r0.f98509z).setPositiveButton(Bj.o.f3055z, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.m0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.k.a.f(homeFragment, dialogInterface, i10);
                        }
                    }).setNegativeButton(Bj.o.f3045u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.n0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            HomeFragment.k.a.g(homeFragment, dialogInterface, i10);
                        }
                    }).show();
                }
                return Unit.f142422a;
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
                    ComposerKt.U(-1673005387, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpTeacherListsCard.<anonymous>.<anonymous> (HomeFragment.kt:792)");
                }
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                AbstractC5607a abstractC5607aD = companion.d(this.f109278a.getTitle(), new Object[0]);
                AbstractC5607a abstractC5607aD2 = companion.d(this.f109278a.getDescription(), new Object[0]);
                AbstractC5607a abstractC5607aD3 = companion.d(this.f109278a.getActionButtonTitle(), new Object[0]);
                int image = this.f109278a.getImage();
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f109279b) | composer.D(this.f109278a);
                final HomeFragment homeFragment = this.f109279b;
                final e.d.a aVar = this.f109278a;
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
                int i12 = (i11 & 14) | LocalThemeScope.f15770g;
                int i13 = AbstractC5607a.f45514b;
                C6149c.b(AdsTheme, null, abstractC5607aD, abstractC5607aD2, abstractC5607aD3, image, (Function0) objB, composer, (i13 << 12) | i12 | (i13 << 6) | (i13 << 9), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
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
            this.f109276a = aVar;
            this.f109277b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(242133924, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setUpTeacherListsCard.<anonymous> (HomeFragment.kt:791)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1673005387, true, new a(this.f109276a, this.f109277b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeDecorator f109280a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109281a;

            a(HomeDecorator homeDecorator) {
                this.f109281a = homeDecorator;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(HomeDecorator homeDecorator, InterfaceC18086a chip) {
                Intrinsics.j(chip, "chip");
                HomeDecoratorListener listener = homeDecorator.getListener();
                if (listener != null) {
                    listener.performAction(new HomeViewModel.Action.HomeChipItemClicked(chip));
                }
                return Unit.f142422a;
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
                    ComposerKt.U(337071014, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeChipSection.<anonymous>.<anonymous> (HomeFragment.kt:890)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                final HomeDecorator homeDecorator = this.f109281a;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, AdsTheme.getAdsSpacing().getSix().getDp()), composer, 0);
                int i12 = i11;
                List<AbstractC14275b> chips = homeDecorator.getChips();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(homeDecorator);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.l.a.c(homeDecorator, (InterfaceC18086a) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                xr.g.c(AdsTheme, chips, (Function1) objB, androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), composer, LocalThemeScope.f15770g | 3072 | (i12 & 14), 0);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, AdsTheme.getAdsSpacing().getSix().getDp()), composer, 0);
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.v();
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

        l(HomeDecorator homeDecorator) {
            this.f109280a = homeDecorator;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1755021099, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeChipSection.<anonymous> (HomeFragment.kt:889)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(337071014, true, new a(this.f109280a), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeDecorator f109282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f109283b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109284a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109285b;

            a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f109284a = homeDecorator;
                this.f109285b = homeFragment;
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
                    ComposerKt.U(118590385, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeEmailBanner.<anonymous>.<anonymous> (HomeFragment.kt:866)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                HomeDecorator homeDecorator = this.f109284a;
                final HomeFragment homeFragment = this.f109285b;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
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
                    C15024h.k(AdsTheme, homeEmailBannerDecorator, modifierFsUnmask, function0, (Function0) objB2, composer2, (i10 & 14) | LocalThemeScope.f15770g | (HomeEmailBannerDecorator.f131199g << 3), 0);
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
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(AbstractC13687a.C2026a.f129032a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(HomeFragment homeFragment) {
                homeFragment.getHomeViewModel().onAction(AbstractC13687a.b.f129033a);
                return Unit.f142422a;
            }
        }

        m(HomeDecorator homeDecorator, HomeFragment homeFragment) {
            this.f109282a = homeDecorator;
            this.f109283b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1357521376, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupHomeEmailBanner.<anonymous> (HomeFragment.kt:865)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(118590385, true, new a(this.f109282a, this.f109283b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HomeDecorator f109286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeFragment f109287b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeDecorator f109288a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109289b;

            a(HomeDecorator homeDecorator, HomeFragment homeFragment) {
                this.f109288a = homeDecorator;
                this.f109289b = homeFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(HomeFragment homeFragment, AbstractC13761f it) {
                Intrinsics.j(it, "it");
                homeFragment.getHomeViewModel().onAction(it);
                return Unit.f142422a;
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
                    ComposerKt.U(-602050616, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupOrderStatusComponent.<anonymous>.<anonymous> (HomeFragment.kt:734)");
                }
                if (this.f109288a.getShowOrderStatus() && this.f109288a.getOrderStatusItemCount() > 0 && (orderStatusCards = this.f109288a.getOrderStatusCards()) != null) {
                    final HomeFragment homeFragment = this.f109289b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(homeFragment);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.r0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeFragment.n.a.c(homeFragment, (AbstractC13761f) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    es.I.i(AdsTheme, null, orderStatusCards, (Function1) objB, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
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

        n(HomeDecorator homeDecorator, HomeFragment homeFragment) {
            this.f109286a = homeDecorator;
            this.f109287b = homeFragment;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1681819335, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupOrderStatusComponent.<anonymous> (HomeFragment.kt:733)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-602050616, true, new a(this.f109286a, this.f109287b), composer, 54), composer, 48, 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class o implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductCarouselDecorator f109291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f109292c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeFragment f109293a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductCarouselDecorator f109294b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f109295c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f109296d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeFragment$o$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1664a extends FunctionReferenceImpl implements Function3<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, EnumC14984a, Unit> {
                C1664a(Object obj) {
                    super(3, obj, HomeFragment.class, "onStepperStateChanged", "onStepperStateChanged(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;Lcom/meijer/mobile/core/models/home/CarouselType;)V", 0);
                }

                public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12, EnumC14984a enumC14984a) {
                    Intrinsics.j(p02, "p0");
                    Intrinsics.j(p12, "p1");
                    ((HomeFragment) this.receiver).onStepperStateChanged(p02, p12, enumC14984a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar, EnumC14984a enumC14984a) {
                    a(productFullDetails, aVar, enumC14984a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class b extends FunctionReferenceImpl implements Function3<Integer, EnumC14984a, Boolean, Unit> {
                b(Object obj) {
                    super(3, obj, HomeFragment.class, "onProductClickedPosition", "onProductClickedPosition(ILcom/meijer/mobile/core/models/home/CarouselType;Z)V", 0);
                }

                public final void a(int i10, EnumC14984a p12, boolean z10) {
                    Intrinsics.j(p12, "p1");
                    ((HomeFragment) this.receiver).onProductClickedPosition(i10, p12, z10);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, EnumC14984a enumC14984a, Boolean bool) {
                    a(num.intValue(), enumC14984a, bool.booleanValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<AbstractC13947a, Unit> {
                c(Object obj) {
                    super(1, obj, HomeViewModel.class, "onAction", "onAction(Lcom/meijer/mobile/ui/homescreen/products/HomeCarouselBeaconsTrackingAction;)V", 0);
                }

                public final void a(AbstractC13947a p02) {
                    Intrinsics.j(p02, "p0");
                    ((HomeViewModel) this.receiver).onAction(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC13947a abstractC13947a) {
                    a(abstractC13947a);
                    return Unit.f142422a;
                }
            }

            a(HomeFragment homeFragment, ProductCarouselDecorator c17608d, boolean z10, Function0<Unit> function0) {
                this.f109293a = homeFragment;
                this.f109294b = c17608d;
                this.f109295c = z10;
                this.f109296d = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(HomeFragment homeFragment, ProductCarouselDecorator c17608d, ProductFullDetails product, String str) {
                Intrinsics.j(product, "product");
                AbstractC14481h abstractC14481hJ = c17608d.j();
                homeFragment.toProductDetailActivity(product, abstractC14481hJ != null ? abstractC14481hJ.getValue() : null);
                if (product.getIsSponsoredCriteo()) {
                    homeFragment.getHomeViewModel().onAction(new AbstractC13947a.OnClickBeacon(product.getBeaconInfo().e(), product, false, c17608d.getCarouselType(), 4, null));
                }
                return Unit.f142422a;
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
            public final void e(Ji.LocalThemeScope r29, androidx.compose.runtime.Composer r30, int r31) {
                /*
                    Method dump skipped, instructions count: 615
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeFragment.o.a.e(Ji.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(ProductCarouselDecorator c17608d, HomeFragment homeFragment) {
                HomeViewModel.Action action;
                Object objH = c17608d.getRetryAction();
                if (objH instanceof HomeViewModel.Action) {
                    action = (HomeViewModel.Action) objH;
                } else {
                    action = null;
                }
                if (action != null) {
                    homeFragment.invokeHomeViewModelAction(action);
                }
                return Unit.f142422a;
            }
        }

        o(ProductCarouselDecorator c17608d, boolean z10) {
            this.f109291b = c17608d;
            this.f109292c = z10;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(961180985, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.setupProductCarousels.<anonymous> (HomeFragment.kt:914)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(HomeFragment.this) | composer.D(this.f109291b);
            final HomeFragment homeFragment = HomeFragment.this;
            final ProductCarouselDecorator c17608d = this.f109291b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeFragment.o.c(homeFragment, c17608d);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Ji.K.b(null, ComposableLambdaKt.c(-102245046, true, new a(HomeFragment.this, this.f109291b, this.f109292c, (Function0) objB), composer, 54), composer, 48, 1);
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
        public static final Unit c(HomeFragment homeFragment, ProductCarouselDecorator c17608d) {
            String strK = c17608d.getUri();
            String str = "";
            if (strK == null) {
                strK = "";
            }
            String strC = c17608d.getCarouselTitle();
            if (strC != null) {
                str = strC;
            }
            homeFragment.viewPersonalizedProductsAction(strK, str, false, c17608d.getCarouselType());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class p implements InterfaceC14146b, FunctionAdapter {
        p() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            HomeFragment.this.handleSubstitutionResult(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingBannerPreview$lambda$6(HomeFragment homeFragment, int i10, Composer composer, int i11) {
        homeFragment.MarketingBannerPreview(composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @JvmStatic
    public static final HomeFragment newInstance(boolean z10) {
        return INSTANCE.newInstance(z10);
    }

    @Override // Lr.d
    public void onRateAppNoThanks() {
        this.rateAppManager = null;
        C18264a.B(getAppPrefManager(), 0L, 1, null);
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
        C18264a.E(getAppPrefManager(), 0L, 1, null);
    }

    static /* synthetic */ void F0(HomeFragment homeFragment, ProductCarouselDecorator c17608d, ComposeView composeView, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        homeFragment.setupProductCarousels(c17608d, composeView, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketingBanner$lambda$5(HomeFragment homeFragment, MarketingBanner marketingBanner, int i10, Composer composer, int i11) {
        homeFragment.MarketingBanner(marketingBanner, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String appendViewAll(String str) {
        return str + ":View All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4303x1 getHomeFragBinding() {
        AbstractC4303x1 abstractC4303x1 = this._homeFragBinding;
        Intrinsics.g(abstractC4303x1);
        return abstractC4303x1;
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
            int r1 = r0.f109224c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109224c = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeFragment$d r0 = new com.meijer.mobile.meijer.activity.home.HomeFragment$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f109222a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109224c
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
            tv.F r5 = r5.getEvents()
            com.meijer.mobile.meijer.activity.home.HomeFragment$e r2 = new com.meijer.mobile.meijer.activity.home.HomeFragment$e
            r2.<init>()
            r0.f109224c = r3
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
            int r1 = r0.f109228c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109228c = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeFragment$f r0 = new com.meijer.mobile.meijer.activity.home.HomeFragment$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f109226a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109228c
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
            tv.P r5 = r5.getHomeViewState()
            com.meijer.mobile.meijer.activity.home.HomeFragment$g r2 = new com.meijer.mobile.meijer.activity.home.HomeFragment$g
            r2.<init>()
            r0.f109228c = r3
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
    public static final void onAttach$lambda$1(HomeFragment homeFragment, C14145a result) {
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
            homeViewModel.onAction(new AbstractC13761f.Dismiss(stringExtra, trackingData, 2, objArr == true ? 1 : 0));
            homeFragment.getHomeViewModel().onAction(new AbstractC13761f.OrderRatedAndTipped(stringExtra));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerClicked(String url, String campaignIdValue) {
        if (url == null || StringsKt.r0(url)) {
            return;
        }
        if (getMeijerIntent().b0(url)) {
            launchDeepLinkURL(url, campaignIdValue);
        } else {
            openBrowser(url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStepperStateChanged(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state, EnumC14984a carouselType) {
        invokeHomeViewModelAction(new HomeViewModel.Action.UpdateEntryAction(product, state.getValueState().getQuantity()));
        int i10 = carouselType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[carouselType.ordinal()];
        if ((i10 == 1 || i10 == 2) && product.getIsSponsoredCriteo()) {
            getHomeViewModel().onAction(new AbstractC13947a.OnBasketChangeBeacon(product.getBeaconInfo().getOnBasketChangeBeacon(), null, carouselType, 2, null));
        }
    }

    private final void openBrowser(String url) {
        if (url == null) {
            return;
        }
        Intent intentR = getMeijerIntent().r(url);
        FragmentActivity activity = getActivity();
        if (activity == null || intentR.resolveActivity(activity.getPackageManager()) == null) {
            uw.a.INSTANCE.d("Could not open browser on the HomeFragment", new Object[0]);
        } else {
            startActivity(intentR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupProductCarousels(ProductCarouselDecorator decorator, ComposeView carouselSection, boolean isShowViewAllButton) {
        carouselSection.setContent(ComposableLambdaKt.composableLambdaInstance(961180985, true, new o(decorator, isShowViewAllButton)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClipCouponErrorDialog(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon, final TrackingData trackingData) {
        new C14886b(requireContext()).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeFragment.showClipCouponErrorDialog$lambda$9(this.f109804a, coupon, trackingData, dialogInterface, i10);
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
            Bundle bundleB = C14835c.b(TuplesKt.a(MPERKS4_EXPIRING_POINTS, Integer.valueOf(expiringPoints)), TuplesKt.a(MPERKS4_POINTS_EXPIRING_DATE, expiryDate));
            ExpiryPointsDialogFragment expiryPointsDialogFragment = new ExpiryPointsDialogFragment();
            expiryPointsDialogFragment.setArguments(bundleB);
            C17829a.f166179a.a(expiryPointsDialogFragment, requireActivity(), RateAndTipDialogFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoginDialog(int errorMessageId) {
        new C14886b(requireContext()).setMessage(errorMessageId).setPositiveButton(Bj.o.f2971F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.A
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f109152a.onSignIn();
            }
        }).setNegativeButton(Bj.o.f3045u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.B
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f109155a.onCreateAccount();
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRateAndTipDialog(TipData tipData) {
        RateAndTipDialogFragment rateAndTipDialogFragmentNewInstance = RateAndTipDialogFragment.INSTANCE.newInstance(tipData);
        rateAndTipDialogFragmentNewInstance.setListener(this);
        this.rateAndTipDialogFragment = rateAndTipDialogFragmentNewInstance;
        C17829a.f166179a.a(rateAndTipDialogFragmentNewInstance, requireActivity(), RateAndTipDialogFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOrderSubstitutionActivity(String orderNumber, List<OrderSubstitutionItem> listSubstitutedItems, vo.b screenType, boolean isOnMyWayClicked, String orderType, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
        Al.l lVar = Al.l.f673a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(lVar.d(contextRequireContext, listSubstitutedItems, orderNumber, screenType, isOnMyWayClicked, orderType, pickupPersonName, listOutOfStockItems));
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final C17279b getAppBackgroundManager() {
        C17279b c17279b = this.appBackgroundManager;
        if (c17279b != null) {
            return c17279b;
        }
        Intrinsics.y("appBackgroundManager");
        return null;
    }

    public final C18264a getAppPrefManager() {
        C18264a c18264a = this.appPrefManager;
        if (c18264a != null) {
            return c18264a;
        }
        Intrinsics.y("appPrefManager");
        return null;
    }

    public final AppVersion getAppVersion() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.y("appVersion");
        return null;
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
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

    public final C17129c getRateAndTipUpdater() {
        C17129c c17129c = this.rateAndTipUpdater;
        if (c17129c != null) {
            return c17129c;
        }
        Intrinsics.y("rateAndTipUpdater");
        return null;
    }

    public final Tq.j getStoreProvider() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.y("storeProvider");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.home.Hilt_HomeFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.j(context, "context");
        super.onAttach(context);
        this.startForResult = registerForActivityResult(new h.i(), new InterfaceC14146b() { // from class: com.meijer.mobile.meijer.activity.home.v
            @Override // g.InterfaceC14146b
            public final void a(Object obj) {
                HomeFragment.onAttach$lambda$1(this.f109801a, (C14145a) obj);
            }
        });
    }

    @Override // Pj.g
    public void onCreateAccount() {
        Al.f fVar = Al.f.f666a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, getFeatureManager().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._homeFragBinding = AbstractC4303x1.K0(inflater, container, false);
        View root = getHomeFragBinding().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // Lr.d
    public void onRateAppSendEmail() {
        this.rateAppManager = null;
        getAppPrefManager().z(getAppVersion().getVersionCode());
        try {
            Cl.e meijerIntent = getMeijerIntent();
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(meijerIntent.B(contextRequireContext));
        } catch (ActivityNotFoundException unused) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.i(contextRequireContext2, "requireContext(...)");
            new Pj.j(contextRequireContext2, com.meijer.mobile.meijer.Y.f100273q5, new Object[0]).g();
        }
    }

    @Override // tp.C17129c.a
    public void onUpdateRateAndTip(Builder builder, EnumC17127a flowType) {
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
        InterfaceC6030s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16648k.d(C6031t.a(viewLifecycleOwner), null, null, new h(null), 3, null);
        if (getUserManager().b() && (arguments = getArguments()) != null && arguments.getBoolean(SHOW_MPERKS_BARCODE)) {
            startActivity(getFeatureEntryPoint().r());
        }
        if (getFeatureManager().e(AbstractC18227f.C.f170544h)) {
            getHomeViewModel().loadGoogleAd();
        }
    }

    public final void setAnalyticsEngine(InterfaceC14261a interfaceC14261a) {
        Intrinsics.j(interfaceC14261a, "<set-?>");
        this.analyticsEngine = interfaceC14261a;
    }

    public final void setAppBackgroundManager(C17279b c17279b) {
        Intrinsics.j(c17279b, "<set-?>");
        this.appBackgroundManager = c17279b;
    }

    public final void setAppPrefManager(C18264a c18264a) {
        Intrinsics.j(c18264a, "<set-?>");
        this.appPrefManager = c18264a;
    }

    public final void setAppVersion(AppVersion appVersion) {
        Intrinsics.j(appVersion, "<set-?>");
        this.appVersion = appVersion;
    }

    public final void setFeatureEntryPoint(Al.g gVar) {
        Intrinsics.j(gVar, "<set-?>");
        this.featureEntryPoint = gVar;
    }

    public final void setFeatureManager(yl.k kVar) {
        Intrinsics.j(kVar, "<set-?>");
        this.featureManager = kVar;
    }

    public final void setMeijerIntent(Cl.e eVar) {
        Intrinsics.j(eVar, "<set-?>");
        this.meijerIntent = eVar;
    }

    public final void setRateAndTipUpdater(C17129c c17129c) {
        Intrinsics.j(c17129c, "<set-?>");
        this.rateAndTipUpdater = c17129c;
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
        AbstractC14147c<Intent> abstractC14147cRegisterForActivityResult = registerForActivityResult(new h.i(), new p());
        Intrinsics.i(abstractC14147cRegisterForActivityResult, "registerForActivityResult(...)");
        this.substitutionResultLauncher = abstractC14147cRegisterForActivityResult;
        AbstractC14147c<Intent> abstractC14147cRegisterForActivityResult2 = registerForActivityResult(new h.i(), new c());
        Intrinsics.i(abstractC14147cRegisterForActivityResult2, "registerForActivityResult(...)");
        this.mPerksRewardsResultLauncher = abstractC14147cRegisterForActivityResult2;
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
                ComposerKt.U(-831621597, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBanner (HomeFragment.kt:707)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(1476527666, true, new a(marketingBanner, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.home.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeFragment.MarketingBanner$lambda$5(this.f109796a, marketingBanner, i10, (Composer) obj, ((Integer) obj2).intValue());
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
                ComposerKt.U(-1486488071, i11, -1, "com.meijer.mobile.meijer.activity.home.HomeFragment.MarketingBannerPreview (HomeFragment.kt:725)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1904866040, true, new b(), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.home.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeFragment.MarketingBannerPreview$lambda$6(this.f109808a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void checkRatings() {
        checkShowRatingsPrompt();
    }

    private final void checkShowRatingsPrompt() {
        if (!getAppBackgroundManager().getAppWasInBackground() && getUserManager().b() && Bk.a.f3135a.a(getAppPrefManager().p(), getAppPrefManager().k(), getAppPrefManager().i(), getAppPrefManager().g(), getAppPrefManager().l(), getAppPrefManager().j(), getAppPrefManager().h(), getAppVersion().getVersionCode())) {
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
        return CollectionsKt.r(getHomeFragBinding().f21087D, getHomeFragBinding().f21084A, getHomeFragBinding().f21086C, getHomeFragBinding().f21085B, getHomeFragBinding().f21111z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMPerksRewardsActivityResult(C14145a result) {
        if (result.getResultCode() == 223418) {
            getHomeViewModel().onAction(HomeViewModel.Action.RefreshScreen.INSTANCE);
        }
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
            Snackbar.q0(getHomeFragBinding().getRoot(), i10, 0).t0(C17135b.f162001T0, new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeFragment.handleSubstitutionResult$lambda$3(this.f109811a, view);
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
    public final void onProductClickedPosition(int position, EnumC14984a carouselType, boolean isSponsoredCriteo) {
        getHomeViewModel().updateHomeViewState(position, carouselType, isSponsoredCriteo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAllPersonalizedProducts(android.net.Uri r8, hi.AbstractC14481h r9, java.lang.String r10, boolean r11) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            Cl.e r0 = r7.getMeijerIntent()
            if (r8 != 0) goto L9
            android.net.Uri r1 = android.net.Uri.EMPTY
            goto La
        L9:
            r1 = r8
        La:
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r0 = r0.O(r1)
            Cl.e r1 = r7.getMeijerIntent()
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            java.lang.String r3 = "requireActivity(...)"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            if (r8 != 0) goto L22
            android.net.Uri r8 = android.net.Uri.EMPTY
        L22:
            kotlin.jvm.internal.Intrinsics.g(r8)
            java.lang.String r3 = ""
            if (r10 != 0) goto L2b
            r4 = r3
            goto L2c
        L2b:
            r4 = r10
        L2c:
            android.content.Intent r8 = r1.R(r2, r8, r0, r4)
            if (r8 == 0) goto Lad
            r0 = 0
            if (r10 == 0) goto L3a
            java.lang.String r1 = r7.appendViewAll(r10)
            goto L3b
        L3a:
            r1 = r0
        L3b:
            if (r1 != 0) goto L3e
            goto L3f
        L3e:
            r3 = r1
        L3f:
            java.lang.String r1 = "homePageCarouselAnalytics"
            r8.putExtra(r1, r3)
            java.lang.String r1 = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT"
            boolean r2 = r8.hasExtra(r1)
            java.lang.String r3 = "com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"
            java.lang.Class<Qo.l> r4 = Qo.l.class
            r5 = 33
            if (r2 == 0) goto L76
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L5d
            java.lang.Object r2 = ta.d.a(r8, r1, r4)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            goto L68
        L5d:
            android.os.Parcelable r2 = r8.getParcelableExtra(r1)
            boolean r6 = r2 instanceof Qo.l
            if (r6 != 0) goto L66
            r2 = r0
        L66:
            Qo.l r2 = (Qo.l) r2
        L68:
            boolean r2 = r2 instanceof Qo.l.Department
            if (r2 == 0) goto L76
            if (r9 == 0) goto L72
            java.lang.String r0 = r9.getValue()
        L72:
            r8.putExtra(r3, r0)
            goto Laa
        L76:
            boolean r2 = r8.hasExtra(r1)
            if (r2 == 0) goto La1
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L87
            java.lang.Object r1 = ta.d.a(r8, r1, r4)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L92
        L87:
            android.os.Parcelable r1 = r8.getParcelableExtra(r1)
            boolean r2 = r1 instanceof Qo.l
            if (r2 != 0) goto L90
            r1 = r0
        L90:
            Qo.l r1 = (Qo.l) r1
        L92:
            boolean r1 = r1 instanceof Qo.l.BrowseCollection
            if (r1 == 0) goto La1
            java.lang.String r9 = "KEY_CURATED_CAROUSEL"
            r8.putExtra(r9, r10)
            java.lang.String r9 = "SEE_MORE_ITEMS"
            r8.putExtra(r9, r11)
            goto Laa
        La1:
            if (r9 == 0) goto La7
            java.lang.String r0 = r9.getValue()
        La7:
            r8.putExtra(r3, r0)
        Laa:
            r7.startActivity(r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeFragment.onViewAllPersonalizedProducts(android.net.Uri, hi.h, java.lang.String, boolean):void");
    }

    private final void pullToRefresh() {
        getHomeFragBinding().f21097N.setOnRefreshListener(getHomeViewModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpSeasonalCarousel(DepartmentCarouselDecorator carousel) {
        ComposeView seasonalCarousel = getHomeFragBinding().f21102S;
        Intrinsics.i(seasonalCarousel, "seasonalCarousel");
        if (!carousel.g() && carousel.c().isEmpty()) {
            return;
        }
        seasonalCarousel.setContent(ComposableLambdaKt.composableLambdaInstance(268726002, true, new i(carousel, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpShopByDepartment(DepartmentCarouselDecorator carousel) {
        ComposeView shopByDepartmentCarousel = getHomeFragBinding().f21105V;
        Intrinsics.i(shopByDepartmentCarousel, "shopByDepartmentCarousel");
        if (!carousel.g() && carousel.c().isEmpty()) {
            return;
        }
        shopByDepartmentCarousel.setContent(ComposableLambdaKt.composableLambdaInstance(-1479243837, true, new j(carousel, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpTeacherListsCard(e.d.a teachersListCard) {
        ComposeView teacherListCard = getHomeFragBinding().f21107X;
        Intrinsics.i(teacherListCard, "teacherListCard");
        teacherListCard.setContent(ComposableLambdaKt.composableLambdaInstance(242133924, true, new k(teachersListCard, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupHomeChipSection(HomeDecorator decorator) {
        ComposeView homeChipSection = getHomeFragBinding().f21096M;
        Intrinsics.i(homeChipSection, "homeChipSection");
        if (!decorator.getChips().isEmpty() && !decorator.isLoadingContent()) {
            homeChipSection.setContent(ComposableLambdaKt.composableLambdaInstance(-1755021099, true, new l(decorator)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupHomeEmailBanner(HomeDecorator decorator, boolean isLoggedIn) {
        if (!decorator.isLoadingContent() && isLoggedIn) {
            getHomeFragBinding().f21094K.setContent(ComposableLambdaKt.composableLambdaInstance(1357521376, true, new m(decorator, this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupOrderStatusComponent(HomeDecorator decorator) {
        getHomeFragBinding().f21099P.setContent(ComposableLambdaKt.composableLambdaInstance(-1681819335, true, new n(decorator, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showClipCouponErrorDialog$lambda$9(HomeFragment homeFragment, Coupon coupon, TrackingData trackingData, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        homeFragment.getHomeViewModel().onAction(new a.Clip(coupon, trackingData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toCouponDetailActivity(Ok.c coupon, TrackingData trackingData) {
        String value;
        AbstractC14481h event;
        Cl.e meijerIntent = getMeijerIntent();
        if (trackingData != null && (event = trackingData.getEvent()) != null) {
            value = event.getValue();
        } else {
            value = null;
        }
        startActivity(meijerIntent.f(coupon, true, true, false, value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toProductDetailActivity(mk.f productId, String previousTrackAction) {
        startActivity(getFeatureEntryPoint().s(productId, false, true, previousTrackAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toRateAndTipActivity(Builder builder, EnumC17127a flowType) {
        Intent intentV = getFeatureEntryPoint().v(builder, flowType);
        AbstractC14147c<Intent> abstractC14147c = this.startForResult;
        if (abstractC14147c == null) {
            Intrinsics.y("startForResult");
            abstractC14147c = null;
        }
        abstractC14147c.a(intentV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void viewPersonalizedProductsAction(String uri, String carouselTitle, boolean isFromSeeMoreItems, EnumC14984a carouselType) {
        getHomeViewModel().onAction(new HomeViewModel.Action.PersonalizedProductListClicked(uri, carouselTitle, isFromSeeMoreItems, carouselType));
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

    @Override // Pj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Al.k.b(contextRequireContext, false, null, null, null, null, null, 126, null));
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
