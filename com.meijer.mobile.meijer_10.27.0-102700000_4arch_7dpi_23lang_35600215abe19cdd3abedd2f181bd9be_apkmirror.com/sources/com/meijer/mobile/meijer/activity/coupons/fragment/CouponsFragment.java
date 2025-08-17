package com.meijer.mobile.meijer.activity.coupons.fragment;

import Fq.ShoppingListItem;
import Km.h;
import Mn.AbstractC4287t1;
import Ok.Coupon;
import Pj.g;
import Rk.CouponOptions;
import Sr.b;
import Tq.j;
import Tr.A;
import Tr.C5283b;
import Tr.CouponsListChange;
import Ur.d;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.view.C6031t;
import ce.C6386a;
import cl.C6412d;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.W;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import com.meijer.mobile.meijer.activity.coupons.o;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity;
import com.meijer.mobile.widget.q;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import h.i;
import hi.C14476c;
import hi.TrackingData;
import hl.m;
import is.C14759a;
import j$.time.Instant;
import j2.C14835c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.AbstractC16618K;
import tr.C17134a;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.P;
import um.C17279b;
import yl.AbstractC18227f;
import yo.C18264a;
import yo.k;

@Deprecated
@Metadata(d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u009b\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u009c\u0002\u009d\u0002\u009e\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u001f\u0010/\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0017¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u000203¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010\u0015J%\u0010D\u001a\u00020\t2\u0006\u0010A\u001a\u00020@2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020 0BH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010I\u001a\u00020\t2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020 H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010MJ!\u0010P\u001a\u00020\t2\u0006\u0010H\u001a\u00020 2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bU\u0010\u0006J!\u0010X\u001a\u00020\t2\u0006\u0010V\u001a\u0002032\b\b\u0001\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bX\u0010YJ\u001d\u0010\\\u001a\u00020\t2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0BH\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\t2\b\b\u0001\u0010^\u001a\u00020\u000eH\u0016¢\u0006\u0004\b_\u0010MJ\u001d\u0010b\u001a\u00020\t2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0BH\u0016¢\u0006\u0004\bb\u0010]J\u001d\u0010d\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020F0BH\u0016¢\u0006\u0004\bd\u0010]J\u0017\u0010e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\be\u0010MJ\u0019\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bi\u0010SJ\u0017\u0010j\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bj\u0010\u0015J#\u0010m\u001a\u00020\t2\b\b\u0001\u0010k\u001a\u00020\u000e2\b\b\u0001\u0010l\u001a\u00020\u000eH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bo\u0010SJ\u000f\u0010p\u001a\u00020\tH\u0016¢\u0006\u0004\bp\u0010\u0006J\u0017\u0010q\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\bq\u0010MJ\u0017\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\tH\u0016¢\u0006\u0004\bv\u0010\u0006R\"\u0010}\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R'\u0010\u0084\u0001\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\bi\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R)\u0010\u009b\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\be\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010¢\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bP\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010º\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R*\u0010Â\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ò\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ú\u0001\u001a\u00030Ó\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R1\u0010ã\u0001\u001a\u00030Û\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÜ\u0001\u0010Ý\u0001\u0012\u0005\bâ\u0001\u0010\u0006\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001a\u0010ç\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001a\u0010ë\u0001\u001a\u00030è\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R \u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020f0ì\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ó\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u001c\u0010÷\u0001\u001a\u0005\u0018\u00010ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001c\u0010û\u0001\u001a\u0005\u0018\u00010ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010ý\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bü\u0001\u0010\\R\u001a\u00106\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001a\u0010\u0081\u0002\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010\u0080\u0002R!\u0010\u0087\u0002\u001a\u00030\u0082\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R)\u0010\u008d\u0002\u001a\u0014\u0012\u000f\u0012\r \u008a\u0002*\u0005\u0018\u00010\u0089\u00020\u0089\u00020\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R)\u0010\u008f\u0002\u001a\u0014\u0012\u000f\u0012\r \u008a\u0002*\u0005\u0018\u00010\u0089\u00020\u0089\u00020\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008c\u0002R\u001e\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020B8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001d\u0010\u0095\u0002\u001a\b\u0012\u0004\u0012\u00020N0B8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0092\u0002R\u0013\u0010\u000f\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0014\u0010\u009a\u0002\u001a\u00020N8F¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002¨\u0006\u009f\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "LUr/d$f;", "LPj/g;", "LKm/h$b;", "<init>", "()V", "Lg/a;", "result", "", "w1", "(Lg/a;)V", "LPk/c;", "couponPage", "", "couponCount", "K1", "(LPk/c;I)V", "LTr/B;", "change", "C1", "(LTr/B;)V", "j1", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onDestroy", "outState", "onSaveInstanceState", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "pageType", "isFirstTrackState", "k1", "(LPk/c;Z)V", "LRk/a;", "options", "J1", "(LRk/a;)V", "couponsListChange", "b0", "LOk/a;", "coupon", "", "transitionViews", "I", "(LOk/a;Ljava/util/List;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAd", "transitionView", "B", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;Landroid/view/View;)V", "messageResourceId", "W", "(I)V", "", "url", "k", "(Landroid/view/View;Ljava/lang/String;)V", "P", "(LOk/a;)V", "onCreateAccount", "onSignIn", "isVisible", "textResourceId", "R0", "(ZI)V", "LUr/d$j;", "coupons", "Z", "(Ljava/util/List;)V", "errorMessageResId", "N0", "LFq/c;", "shoppingList", "d", "ads", "f", "j", "LUr/d$l;", "W0", "(LOk/a;)LUr/d$l;", "g", "c1", "title", "message", "j0", "(II)V", "I0", "V0", "c0", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "LCk/b;", "LCk/b;", "s1", "()LCk/b;", "setRxJavaBus", "(LCk/b;)V", "rxJavaBus", "Lyo/k;", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lgi/a;", "h", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lyo/a;", "i", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "LTr/b;", "LTr/b;", "n1", "()LTr/b;", "setCouponChangeManager", "(LTr/b;)V", "couponChangeManager", "Lum/b;", "Lum/b;", "getAppBackgroundManager", "()Lum/b;", "setAppBackgroundManager", "(Lum/b;)V", "appBackgroundManager", "LEq/b;", "l", "LEq/b;", "t1", "()LEq/b;", "setShoppingListRepository$Meijer_playstoreRelease", "(LEq/b;)V", "shoppingListRepository", "Lcl/d;", "m", "Lcl/d;", "p1", "()Lcl/d;", "setCouponsRepository", "(Lcl/d;)V", "couponsRepository", "LTq/j;", "n", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lyl/k;", "o", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "LAl/g;", "p", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "Lhl/m;", "q", "Lhl/m;", "m1", "()Lhl/m;", "setCartRepository", "(Lhl/m;)V", "cartRepository", "LCl/e;", "r", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lqv/K;", "s", "Lqv/K;", "r1", "()Lqv/K;", "setIoDispatcher$Meijer_playstoreRelease", "(Lqv/K;)V", "getIoDispatcher$Meijer_playstoreRelease$annotations", "ioDispatcher", "LMn/t1;", "t", "LMn/t1;", "binding", "LUr/d;", "u", "LUr/d;", "couponsAdapter", "Lcom/meijer/mobile/widget/q;", "v", "Lcom/meijer/mobile/widget/q;", "snackbar", "LDs/k;", "w", "LDs/k;", "couponFailureThrottle", "Landroid/app/Activity;", "x", "Landroid/app/Activity;", "rootActivity", "LKm/h;", "y", "LKm/h;", "viewModel", "z", "shouldDoTheFirstTrack", "A", "LPk/c;", "Ljava/lang/String;", "previousTrackAction", "Lce/a;", "C", "Lkotlin/Lazy;", "l1", "()Lce/a;", "cartBadge", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "D", "Lg/c;", "couponDetailsResultLauncher", "E", "couponFilterResultLauncher", "Landroidx/fragment/app/Fragment;", "u1", "()Ljava/util/List;", "siblingFragments", "v1", "siblingPageTags", "o1", "()I", "q1", "()Ljava/lang/String;", "fragmentTag", "F", "b", "c", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CouponsFragment extends Hilt_CouponsFragment implements d.f, g, h.b {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f105391G = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Pk.c pageType;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> couponDetailsResultLauncher;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> couponFilterResultLauncher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Ck.b rxJavaBus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k userManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public C18264a appPrefManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public C5283b couponChangeManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C17279b appBackgroundManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Eq.b shoppingListRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public C6412d couponsRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public j storeProvider;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public m cartRepository;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public AbstractC16618K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC4287t1 binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Ur.d couponsAdapter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private q<d.Removal> snackbar;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Activity rootActivity;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private h viewModel;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean shouldDoTheFirstTrack;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Ds.k couponFailureThrottle = new Ds.k(2000);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: Jm.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponsFragment.g1(this.f16022a);
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$a;", "", "<init>", "()V", "", "previousTrackAction", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "d", "(Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "c", "()Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "LPk/c;", "couponPageType", "LRk/a;", "couponOptions", "a", "(LPk/c;LRk/a;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "ARG_COUPON_PAGE_TYPE", "Ljava/lang/String;", "ARG_COUPON_OPTIONS", "ARG_SPECIAL_OFFERS", "ARG_COUPON_FRAGMENT_TAG", "ARG_PREVIOUS_TRACK_ACTION", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CouponsFragment b(Companion companion, Pk.c cVar, CouponOptions aVar, String str, int i10, Object obj) {
            CouponOptions aVar2;
            if ((i10 & 2) != 0) {
                aVar2 = new CouponOptions(null, null, null, false, cVar != Pk.c.f28328d, 0L, null, null, false, null, null, false, false, 8175, null);
            } else {
                aVar2 = aVar;
            }
            return companion.a(cVar, aVar2, (i10 & 4) != 0 ? null : str);
        }

        @JvmStatic
        @JvmOverloads
        public final CouponsFragment a(Pk.c couponPageType, CouponOptions couponOptions, String previousTrackAction) {
            Intrinsics.j(couponPageType, "couponPageType");
            Intrinsics.j(couponOptions, "couponOptions");
            CouponsFragment couponsFragment = new CouponsFragment();
            couponsFragment.setArguments(C14835c.b(TuplesKt.a("ARG_COUPON_PAGE_TYPE", couponPageType), TuplesKt.a("ARG_COUPON_OPTIONS", couponOptions), TuplesKt.a("ARG_PREVIOUS_TRACK_ACTION", previousTrackAction)));
            return couponsFragment;
        }

        @JvmStatic
        public final CouponsFragment c() {
            return b(this, Pk.c.f28337m, new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null), null, 4, null);
        }

        public final CouponsFragment d(String previousTrackAction) {
            return a(Pk.c.f28336l, new CouponOptions(null, null, null, false, false, 0L, null, null, true, null, null, false, false, 7935, null), previousTrackAction);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "", "", "count", "", "K0", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void K0(int count);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$c;", "", "", "X", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void X();
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$e", "Lcom/meijer/mobile/widget/q;", "LUr/d$l;", "removal", "", "l", "(LUr/d$l;)V", "m", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends q<d.Removal> {
        e(RecyclerView recyclerView, int i10) {
            super(recyclerView, i10);
        }

        @Override // com.meijer.mobile.widget.q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(d.Removal removal) {
            Intrinsics.j(removal, "removal");
            h hVar = CouponsFragment.this.viewModel;
            Intrinsics.g(hVar);
            hVar.P0(new CouponsListChange(CouponsListChange.a.f35396c, removal.a()));
        }

        @Override // com.meijer.mobile.widget.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(d.Removal removal) {
            Intrinsics.j(removal, "removal");
            Ur.d dVar = CouponsFragment.this.couponsAdapter;
            AbstractC4287t1 abstractC4287t1 = null;
            if (dVar == null) {
                Intrinsics.y("couponsAdapter");
                dVar = null;
            }
            int iY = dVar.y(removal);
            AbstractC4287t1 abstractC4287t12 = CouponsFragment.this.binding;
            if (abstractC4287t12 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4287t1 = abstractC4287t12;
            }
            abstractC4287t1.f20978D.smoothScrollToPosition(iY);
            h hVar = CouponsFragment.this.viewModel;
            Intrinsics.g(hVar);
            hVar.g1();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$f", "LJm/c;", "Landroidx/recyclerview/widget/RecyclerView$F;", "viewHolder", "", "direction", "", "B", "(Landroidx/recyclerview/widget/RecyclerView$F;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "k", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$F;)I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends Jm.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, int i10) {
            super(context, i10);
            Intrinsics.g(context);
        }

        @Override // androidx.recyclerview.widget.l.e
        public void B(RecyclerView.F viewHolder, int direction) {
            Intrinsics.j(viewHolder, "viewHolder");
            Ur.d dVar = CouponsFragment.this.couponsAdapter;
            if (dVar == null) {
                Intrinsics.y("couponsAdapter");
                dVar = null;
            }
            Object obj = ((d.C0797d) viewHolder).c().value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
            final d.Removal lVarS = dVar.s((Coupon) obj);
            Context contextRequireContext = CouponsFragment.this.requireContext();
            final CouponsFragment couponsFragment = CouponsFragment.this;
            Sr.b.b(contextRequireContext, new b.InterfaceC0768b() { // from class: Jm.s
                @Override // Sr.b.InterfaceC0768b
                public final void a() {
                    CouponsFragment.f.D(couponsFragment, lVarS);
                }
            });
        }

        @Override // androidx.recyclerview.widget.l.e
        public int k(RecyclerView recyclerView, RecyclerView.F viewHolder) {
            Intrinsics.j(recyclerView, "recyclerView");
            Intrinsics.j(viewHolder, "viewHolder");
            if (!(viewHolder instanceof d.k)) {
                return l.e.t(0, 0);
            }
            d.j jVarC = ((d.k) viewHolder).c();
            h hVar = CouponsFragment.this.viewModel;
            Intrinsics.g(hVar);
            return l.e.t(0, hVar.w0(viewHolder.getItemViewType(), jVarC));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(CouponsFragment couponsFragment, d.Removal lVar) {
            q qVar = couponsFragment.snackbar;
            if (qVar == null) {
                Intrinsics.y("snackbar");
                qVar = null;
            }
            qVar.j(lVar);
            h hVar = couponsFragment.viewModel;
            Intrinsics.g(hVar);
            hVar.W0(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(C14145a it) {
        Intrinsics.j(it, "it");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lfi/d;", "googleAds", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment$onCreate$2", f = "CouponsFragment.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<List<? extends GoogleAdData>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105418a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f105419b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = CouponsFragment.this.new d(continuation);
            dVar.f105419b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<GoogleAdData> list, Continuation<? super Unit> continuation) {
            return ((d) create(list, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f105418a == 0) {
                ResultKt.b(obj);
                List<GoogleAdData> list = (List) this.f105419b;
                Ur.d dVar = CouponsFragment.this.couponsAdapter;
                if (dVar == null) {
                    Intrinsics.y("couponsAdapter");
                    dVar = null;
                }
                dVar.v(list);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(CouponsListChange b10, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("pageName", "Meijer:Search Results Page");
        Coupon couponA = b10.getCoupon();
        if (couponA != null) {
            submitEvent.c(Qk.b.f30831a.e(couponA));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(Coupon coupon, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("pageName", "Meijer:Search Results Page: Coupon Details Page");
        Qk.b bVar = Qk.b.f30831a;
        submitEvent.c(bVar.b());
        submitEvent.c(bVar.e(coupon));
        return Unit.f142422a;
    }

    private final void C1(CouponsListChange change) {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.T0(change);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(CouponsFragment couponsFragment, GoogleAdAnalytics googleAnalytics) {
        Intrinsics.j(googleAnalytics, "googleAnalytics");
        h hVar = couponsFragment.viewModel;
        if (hVar != null) {
            hVar.d1(googleAnalytics);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(CouponsFragment couponsFragment, DialogInterface dialogInterface) {
        couponsFragment.couponFailureThrottle.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: coupons: available");
        track.v("dashboard");
        return Unit.f142422a;
    }

    private final void K1(Pk.c couponPage, final int couponCount) {
        final String str = couponPage == Pk.c.f28328d ? "Meijer: Coupons: available" : "Meijer: Coupons: clipped";
        getAnalyticsEngine().h(C14476c.h(str), new Function1() { // from class: Jm.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.L1(str, couponCount, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(String str, int i10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.o("coupons");
        track.n(str);
        track.c(Qk.b.f30831a.k(i10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(CouponsFragment couponsFragment, C14145a result) {
        Intrinsics.j(result, "result");
        couponsFragment.w1(result);
    }

    private final C6386a l1() {
        return (C6386a) this.cartBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(CouponsFragment couponsFragment, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        h hVar = couponsFragment.viewModel;
        Intrinsics.g(hVar);
        track.n(hVar.C0());
        track.v("mperks");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(CouponAd couponAd, CouponsFragment couponsFragment, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: coupons");
        track.v("mperks");
        track.h("Adcampaign", couponAd.getBundleTag());
        Ur.d dVar = couponsFragment.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        track.h("position", String.valueOf(dVar.n(couponAd) + 1));
        return Unit.f142422a;
    }

    @Override // Ur.d.f
    public void B(final CouponAd couponAd, View transitionView) {
        Intrinsics.j(couponAd, "couponAd");
        Intrinsics.j(transitionView, "transitionView");
        getAnalyticsEngine().h(C14476c.a("event: ribbon clicked"), new Function1() { // from class: Jm.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.z1(couponAd, this, (TrackingData) obj);
            }
        });
        Cl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        String bundleTag = couponAd.getBundleTag();
        if (bundleTag == null) {
            bundleTag = "";
        }
        Intent intentE = meijerIntent.e(contextRequireContext, couponAd, new CouponOptions(null, null, null, false, false, 0L, bundleTag, null, false, null, null, false, false, 8127, null), getFeatureManager().e(AbstractC18227f.M.f170552h));
        List listE = CollectionsKt.e(transitionView);
        AbstractC14147c<Intent> abstractC14147c = this.couponDetailsResultLauncher;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        Ds.b.a(abstractC14147c, intentE, fragmentActivityRequireActivity, listE);
    }

    @Override // Ur.d.f
    public void I(final Coupon coupon, List<? extends View> transitionViews) {
        boolean z10;
        Intrinsics.j(coupon, "coupon");
        Intrinsics.j(transitionViews, "transitionViews");
        if (getActivity() instanceof SearchProductActivity) {
            getAnalyticsEngine().f(C14476c.h("Coupon Detail Page Analytics"), new Function1() { // from class: Jm.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CouponsFragment.B1(coupon, (TrackingData) obj);
                }
            });
            z10 = true;
        } else {
            z10 = false;
        }
        Ds.b.b(this.couponDetailsResultLauncher, getMeijerIntent().f(coupon, true, true, z10, this.previousTrackAction), this, transitionViews);
    }

    @Override // Km.h.b
    public void I0(final Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        AbstractC4287t1 abstractC4287t1 = this.binding;
        if (abstractC4287t1 == null) {
            Intrinsics.y("binding");
            abstractC4287t1 = null;
        }
        Snackbar snackbarT0 = Snackbar.q0(abstractC4287t1.getRoot(), Nr.g.f22760u, 0).t0(Nr.g.f22741k0, new View.OnClickListener() { // from class: Jm.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponsFragment.G1(this.f16016a, coupon, view);
            }
        });
        Intrinsics.i(snackbarT0, "setAction(...)");
        if (this.rootActivity instanceof ProductDetailActivity) {
            snackbarT0.W(T.f99090g).c0();
        } else {
            snackbarT0.c0();
        }
    }

    public final void J1(CouponOptions options) {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.s1(options, true);
    }

    @Override // Km.h.b
    public void N0(int errorMessageResId) {
        AbstractC4287t1 abstractC4287t1 = this.binding;
        if (abstractC4287t1 == null) {
            Intrinsics.y("binding");
            abstractC4287t1 = null;
        }
        abstractC4287t1.f20981G.P(errorMessageResId, true);
        j1();
    }

    @Override // Ur.d.f
    public void P(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        startActivity(Cl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    @Override // tm.InterfaceC17123b
    public void R0(boolean isVisible, int textResourceId) {
        AbstractC4287t1 abstractC4287t1 = this.binding;
        if (abstractC4287t1 == null) {
            Intrinsics.y("binding");
            abstractC4287t1 = null;
        }
        abstractC4287t1.f20981G.S(textResourceId, isVisible);
    }

    @Override // Ur.d.f
    public void W(int messageResourceId) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        new Pj.f(fragmentActivityRequireActivity, messageResourceId, this).g();
    }

    @Override // Km.h.b
    public d.Removal W0(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        return dVar.s(coupon);
    }

    @Override // Km.h.b
    public void Z(List<d.j> coupons) {
        Intrinsics.j(coupons, "coupons");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        dVar.x(coupons);
    }

    @Override // Ur.d.f
    public void b0(final CouponsListChange couponsListChange) {
        Intrinsics.j(couponsListChange, "couponsListChange");
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.P0(couponsListChange);
        if (couponsListChange.getType() == CouponsListChange.a.f35394a) {
            if (getActivity() instanceof SearchProductActivity) {
                getAnalyticsEngine().f(C14476c.a("Coupons Clipping From Search Results Analytics"), new Function1() { // from class: Jm.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CouponsFragment.A1(couponsListChange, (TrackingData) obj);
                    }
                });
            } else if (StringsKt.c0(String.valueOf(this.rootActivity), "weeklyad", false, 2, null)) {
                couponsListChange.getCoupon();
            }
        }
    }

    @Override // Km.h.b
    public void c0(int couponCount) {
        if (this.shouldDoTheFirstTrack) {
            K1(this.pageType, couponCount);
            this.shouldDoTheFirstTrack = false;
        }
    }

    @Override // Km.h.b
    public void c1(CouponsListChange change) {
        Intrinsics.j(change, "change");
        for (Fragment fragment : u1()) {
            if (fragment != this && (fragment instanceof CouponsFragment)) {
                ((CouponsFragment) fragment).C1(change);
            }
        }
    }

    @Override // Km.h.b
    public void d(List<ShoppingListItem> shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        dVar.r(shoppingList);
    }

    @Override // Km.h.b
    public void f(List<CouponAd> ads) {
        Intrinsics.j(ads, "ads");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        dVar.u(ads);
    }

    @Override // Km.h.b
    public void g(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        dVar.z(coupon);
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

    public final j getStoreProvider() {
        j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.y("storeProvider");
        return null;
    }

    public final k getUserManager() {
        k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    @Override // Km.h.b
    public void j0(int title, int message) {
        if (this.couponFailureThrottle.d()) {
            this.couponFailureThrottle.c();
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            new Pj.j(contextRequireContext, getString(message)).r(title, new Object[0]).q(new DialogInterface.OnDismissListener() { // from class: Jm.r
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CouponsFragment.H1(this.f16029a, dialogInterface);
                }
            }).g();
        }
    }

    @Override // Ur.d.f
    public void k(View transitionView, String url) {
        Intrinsics.j(transitionView, "transitionView");
        getAnalyticsEngine().h(C14476c.a("event: coupon page special offers banner"), new Function1() { // from class: Jm.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.I1((TrackingData) obj);
            }
        });
        List listE = CollectionsKt.e(transitionView);
        Cl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        Ds.b.b(this.couponDetailsResultLauncher, meijerIntent.k(contextRequireContext, url, "Coupons: View Offers List Page: Offer Clicked", getFeatureManager().e(AbstractC18227f.M.f170552h)), this, listE);
    }

    public final void k1(Pk.c pageType, boolean isFirstTrackState) {
        Intrinsics.j(pageType, "pageType");
        h hVar = this.viewModel;
        if (hVar != null) {
            hVar.Q();
        }
        h hVar2 = this.viewModel;
        if (hVar2 != null && hVar2.u1()) {
            j1();
        }
        if (!isFirstTrackState) {
            K1(pageType, o1());
        } else {
            this.shouldDoTheFirstTrack = true;
            this.pageType = pageType;
        }
    }

    public final m m1() {
        m mVar = this.cartRepository;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.y("cartRepository");
        return null;
    }

    public final C5283b n1() {
        C5283b c5283b = this.couponChangeManager;
        if (c5283b != null) {
            return c5283b;
        }
        Intrinsics.y("couponChangeManager");
        return null;
    }

    public final int o1() {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        return hVar.getTotalCouponCount();
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.Hilt_CouponsFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.j(context, "context");
        super.onAttach(context);
        this.rootActivity = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object serializable;
        Object obj;
        CouponOptions aVar;
        String string;
        h hVar;
        P<List<GoogleAdData>> pO0;
        InterfaceC17152f interfaceC17152fO;
        Object obj2;
        super.onCreate(savedInstanceState);
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializable = bundleRequireArguments.getSerializable("ARG_COUPON_PAGE_TYPE", Pk.c.class);
        } else {
            Serializable serializable2 = bundleRequireArguments.getSerializable("ARG_COUPON_PAGE_TYPE");
            if (!(serializable2 instanceof Pk.c)) {
                serializable2 = null;
            }
            serializable = (Pk.c) serializable2;
        }
        Intrinsics.g(serializable);
        Pk.c cVar = (Pk.c) serializable;
        if (savedInstanceState != null) {
            if (i10 >= 33) {
                obj2 = (Parcelable) savedInstanceState.getParcelable("ARG_COUPON_OPTIONS", CouponOptions.class);
            } else {
                Parcelable parcelable = savedInstanceState.getParcelable("ARG_COUPON_OPTIONS");
                if (!(parcelable instanceof CouponOptions)) {
                    parcelable = null;
                }
                obj2 = (CouponOptions) parcelable;
            }
            Intrinsics.g(obj2);
            aVar = (CouponOptions) obj2;
            string = savedInstanceState.getString("ARG_COUPON_FRAGMENT_TAG");
            Intrinsics.g(string);
            this.previousTrackAction = savedInstanceState.getString("ARG_PREVIOUS_TRACK_ACTION");
        } else {
            Bundle bundleRequireArguments2 = requireArguments();
            Intrinsics.i(bundleRequireArguments2, "requireArguments(...)");
            if (i10 >= 33) {
                obj = (Parcelable) bundleRequireArguments2.getParcelable("ARG_COUPON_OPTIONS", CouponOptions.class);
            } else {
                Parcelable parcelable2 = bundleRequireArguments2.getParcelable("ARG_COUPON_OPTIONS");
                if (!(parcelable2 instanceof CouponOptions)) {
                    parcelable2 = null;
                }
                obj = (CouponOptions) parcelable2;
            }
            Intrinsics.g(obj);
            aVar = (CouponOptions) obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVar);
            sb2.append(Instant.now().toEpochMilli());
            string = sb2.toString();
            this.previousTrackAction = requireArguments().getString("ARG_PREVIOUS_TRACK_ACTION");
        }
        CouponOptions aVar2 = aVar;
        String str = string;
        h.Companion aVar3 = h.INSTANCE;
        C17279b appBackgroundManager = getAppBackgroundManager();
        k userManager = getUserManager();
        m mVarM1 = m1();
        C6412d c6412dP1 = p1();
        InterfaceC14261a analyticsEngine = getAnalyticsEngine();
        C18264a appPrefManager = getAppPrefManager();
        j storeProvider = getStoreProvider();
        C5283b c5283bN1 = n1();
        Ck.b bVarS1 = s1();
        boolean z10 = cVar == Pk.c.f28328d || cVar == Pk.c.f28336l || cVar == Pk.c.f28330f;
        Eq.b bVarT1 = t1();
        C6412d c6412dP12 = p1();
        Cl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        A a10 = new A(bVarS1, z10, bVarT1, c6412dP12, Cl.e.j(meijerIntent, contextRequireContext, null, getFeatureManager().e(AbstractC18227f.M.f170552h), false, 0, 26, null), r1());
        Bundle bundleRequireArguments3 = requireArguments();
        Intrinsics.i(bundleRequireArguments3, "requireArguments(...)");
        this.viewModel = aVar3.a(cVar, appBackgroundManager, userManager, mVarM1, c6412dP1, analyticsEngine, appPrefManager, storeProvider, c5283bN1, a10, aVar2, i10 >= 33 ? bundleRequireArguments3.getParcelableArrayList("ARG_SPECIAL_OFFERS", Coupon.class) : bundleRequireArguments3.getParcelableArrayList("ARG_SPECIAL_OFFERS"), str);
        Ur.d dVar = new Ur.d(cVar, this, getUserManager().b(), p1(), new Function1() { // from class: Jm.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return CouponsFragment.D1(this.f16021a, (GoogleAdAnalytics) obj3);
            }
        });
        this.couponsAdapter = dVar;
        if (cVar == Pk.c.f28338n) {
            dVar.w(d.j.INSTANCE.a());
        }
        if (!getFeatureManager().e(AbstractC18227f.C.f170544h) || (hVar = this.viewModel) == null || (pO0 = hVar.o0()) == null || (interfaceC17152fO = C17154h.O(pO0, new d(null))) == null) {
            return;
        }
        C17154h.J(interfaceC17152fO, C6031t.a(this));
    }

    @Override // Pj.g
    public void onCreateAccount() {
        Al.f fVar = Al.f.f666a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, getFeatureManager().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.j(menu, "menu");
        Intrinsics.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        if (getUserManager().b()) {
            inflater.inflate(W.f99440b, menu);
            C6386a c6386aL1 = l1();
            h hVar = this.viewModel;
            Intrinsics.g(hVar);
            c6386aL1.R(hVar.getCartItemCount().M());
            l1().setVisible(l1().z() && l1().o() > 0, true);
            View viewFindViewById = requireActivity().findViewById(T.f98874L);
            Intrinsics.i(viewFindViewById, "findViewById(...)");
            Qj.a.a((Toolbar) viewFindViewById, T.f99101h, l1());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        AbstractC4287t1 abstractC4287t1K0 = AbstractC4287t1.K0(inflater, container, false);
        this.binding = abstractC4287t1K0;
        AbstractC4287t1 abstractC4287t1 = null;
        if (abstractC4287t1K0 == null) {
            Intrinsics.y("binding");
            abstractC4287t1K0 = null;
        }
        abstractC4287t1K0.O0(this.viewModel);
        AbstractC4287t1 abstractC4287t12 = this.binding;
        if (abstractC4287t12 == null) {
            Intrinsics.y("binding");
            abstractC4287t12 = null;
        }
        Button button = abstractC4287t12.f20987z;
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        button.setVisibility(hVar.getSearchNoCouponsViewVisibility().M());
        AbstractC4287t1 abstractC4287t13 = this.binding;
        if (abstractC4287t13 == null) {
            Intrinsics.y("binding");
            abstractC4287t13 = null;
        }
        View root = abstractC4287t13.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        AbstractC4287t1 abstractC4287t14 = this.binding;
        if (abstractC4287t14 == null) {
            Intrinsics.y("binding");
            abstractC4287t14 = null;
        }
        C14759a c14759a = new C14759a(abstractC4287t14.f20978D.getContext(), 1);
        AbstractC4287t1 abstractC4287t15 = this.binding;
        if (abstractC4287t15 == null) {
            Intrinsics.y("binding");
            abstractC4287t15 = null;
        }
        Drawable drawableE = Z1.b.e(abstractC4287t15.f20978D.getContext(), S.f98754v0);
        Intrinsics.g(drawableE);
        c14759a.h(drawableE);
        AbstractC4287t1 abstractC4287t16 = this.binding;
        if (abstractC4287t16 == null) {
            Intrinsics.y("binding");
            abstractC4287t16 = null;
        }
        abstractC4287t16.f20978D.addItemDecoration(c14759a);
        AbstractC4287t1 abstractC4287t17 = this.binding;
        if (abstractC4287t17 == null) {
            Intrinsics.y("binding");
            abstractC4287t17 = null;
        }
        abstractC4287t17.f20978D.addItemDecoration(new Jm.b());
        Es.b bVar = new Es.b();
        bVar.setSupportsChangeAnimations(false);
        AbstractC4287t1 abstractC4287t18 = this.binding;
        if (abstractC4287t18 == null) {
            Intrinsics.y("binding");
            abstractC4287t18 = null;
        }
        abstractC4287t18.f20978D.setItemAnimator(bVar);
        AbstractC4287t1 abstractC4287t19 = this.binding;
        if (abstractC4287t19 == null) {
            Intrinsics.y("binding");
            abstractC4287t19 = null;
        }
        abstractC4287t19.f20985K.setListener(this);
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        if (hVar2.t1()) {
            AbstractC4287t1 abstractC4287t110 = this.binding;
            if (abstractC4287t110 == null) {
                Intrinsics.y("binding");
                abstractC4287t110 = null;
            }
            abstractC4287t110.f20978D.setNestedScrollingEnabled(false);
        }
        l lVar = new l(new f(requireContext(), com.meijer.mobile.meijer.P.f98649b));
        AbstractC4287t1 abstractC4287t111 = this.binding;
        if (abstractC4287t111 == null) {
            Intrinsics.y("binding");
            abstractC4287t111 = null;
        }
        lVar.g(abstractC4287t111.f20978D);
        AbstractC4287t1 abstractC4287t112 = this.binding;
        if (abstractC4287t112 == null) {
            Intrinsics.y("binding");
            abstractC4287t112 = null;
        }
        RecyclerView recyclerView = abstractC4287t112.f20978D;
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.y("couponsAdapter");
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        AbstractC4287t1 abstractC4287t113 = this.binding;
        if (abstractC4287t113 == null) {
            Intrinsics.y("binding");
            abstractC4287t113 = null;
        }
        this.snackbar = new e(abstractC4287t113.f20978D, Nr.g.f22770z);
        AbstractC4287t1 abstractC4287t114 = this.binding;
        if (abstractC4287t114 == null) {
            Intrinsics.y("binding");
            abstractC4287t114 = null;
        }
        abstractC4287t114.f20987z.setOnClickListener(new View.OnClickListener() { // from class: Jm.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponsFragment.E1(this.f16024a, view);
            }
        });
        if (getUserManager().b()) {
            AbstractC4287t1 abstractC4287t115 = this.binding;
            if (abstractC4287t115 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4287t1 = abstractC4287t115;
            }
            abstractC4287t1.f20975A.setOnClickListener(new View.OnClickListener() { // from class: Jm.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CouponsFragment.F1(this.f16025a, view);
                }
            });
            return root;
        }
        AbstractC4287t1 abstractC4287t116 = this.binding;
        if (abstractC4287t116 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4287t1 = abstractC4287t116;
        }
        abstractC4287t1.f20975A.setEnabled(false);
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC4287t1 abstractC4287t1 = this.binding;
        if (abstractC4287t1 == null) {
            Intrinsics.y("binding");
            abstractC4287t1 = null;
        }
        abstractC4287t1.f20981G.setProgressBarListener(null);
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.P();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        if (item.getItemId() != T.f99101h) {
            return super.onOptionsItemSelected(item);
        }
        startActivity(getFeatureEntryPoint().d());
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.j(outState, "outState");
        super.onSaveInstanceState(outState);
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        outState.putParcelable("ARG_COUPON_OPTIONS", hVar.getCouponOptions());
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        outState.putString("ARG_COUPON_FRAGMENT_TAG", hVar2.getTag());
        outState.putString("ARG_PREVIOUS_TRACK_ACTION", this.previousTrackAction);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        setHasOptionsMenu(hVar.M0());
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        hVar2.h1(v1());
        h hVar3 = this.viewModel;
        Intrinsics.g(hVar3);
        if (hVar3.getPageType() == Pk.c.f28330f) {
            h hVar4 = this.viewModel;
            Intrinsics.g(hVar4);
            hVar4.j1();
        }
    }

    public final C6412d p1() {
        C6412d c6412d = this.couponsRepository;
        if (c6412d != null) {
            return c6412d;
        }
        Intrinsics.y("couponsRepository");
        return null;
    }

    public final String q1() {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        return hVar.getTag();
    }

    public final AbstractC16618K r1() {
        AbstractC16618K abstractC16618K = this.ioDispatcher;
        if (abstractC16618K != null) {
            return abstractC16618K;
        }
        Intrinsics.y("ioDispatcher");
        return null;
    }

    public final Ck.b s1() {
        Ck.b bVar = this.rxJavaBus;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("rxJavaBus");
        return null;
    }

    public final Eq.b t1() {
        Eq.b bVar = this.shoppingListRepository;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("shoppingListRepository");
        return null;
    }

    public CouponsFragment() {
        AbstractC14147c<Intent> abstractC14147cRegisterForActivityResult = registerForActivityResult(new i(), new InterfaceC14146b() { // from class: Jm.l
            @Override // g.InterfaceC14146b
            public final void a(Object obj) {
                CouponsFragment.h1((C14145a) obj);
            }
        });
        Intrinsics.i(abstractC14147cRegisterForActivityResult, "registerForActivityResult(...)");
        this.couponDetailsResultLauncher = abstractC14147cRegisterForActivityResult;
        AbstractC14147c<Intent> abstractC14147cRegisterForActivityResult2 = registerForActivityResult(new i(), new InterfaceC14146b() { // from class: Jm.m
            @Override // g.InterfaceC14146b
            public final void a(Object obj) {
                CouponsFragment.i1(this.f16023a, (C14145a) obj);
            }
        });
        Intrinsics.i(abstractC14147cRegisterForActivityResult2, "registerForActivityResult(...)");
        this.couponFilterResultLauncher = abstractC14147cRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(CouponsFragment couponsFragment, View view) {
        Cl.e meijerIntent = couponsFragment.getMeijerIntent();
        Context contextRequireContext = couponsFragment.requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        couponsFragment.startActivity(Cl.e.j(meijerIntent, contextRequireContext, Pk.c.f28328d, couponsFragment.getFeatureManager().e(AbstractC18227f.M.f170552h), false, 0, 24, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(CouponsFragment couponsFragment, View view) {
        couponsFragment.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(CouponsFragment couponsFragment, Coupon coupon, View view) {
        couponsFragment.P(coupon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6386a g1(CouponsFragment couponsFragment) {
        C6386a c6386aE = C6386a.e(couponsFragment.requireContext());
        c6386aE.V(false);
        c6386aE.N(C17134a.f161960c);
        Intrinsics.i(c6386aE, "apply(...)");
        return c6386aE;
    }

    private final void j1() {
        AppBarLayout appBarLayout;
        FragmentActivity activity = getActivity();
        if (activity != null && (appBarLayout = (AppBarLayout) activity.findViewById(T.f98894N)) != null) {
            appBarLayout.x(true, true);
        }
    }

    private final List<Fragment> u1() {
        o oVar;
        x4.i activity = getActivity();
        List<Fragment> listG = null;
        if (activity instanceof o) {
            oVar = (o) activity;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            listG = oVar.G();
        }
        if (listG == null) {
            return CollectionsKt.m();
        }
        return listG;
    }

    private final List<String> v1() {
        List<Fragment> listU1 = u1();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU1) {
            if (obj instanceof CouponsFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((CouponsFragment) obj2) != this) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((CouponsFragment) it.next()).q1());
        }
        return arrayList3;
    }

    private final void w1(C14145a result) {
        Object obj;
        Intent data = result.getData();
        if (result.getResultCode() == -1 && data != null) {
            h hVar = this.viewModel;
            Intrinsics.g(hVar);
            AbstractC4287t1 abstractC4287t1 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Parcelable) data.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", CouponOptions.class);
            } else {
                Parcelable parcelableExtra = data.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS");
                if (!(parcelableExtra instanceof CouponOptions)) {
                    parcelableExtra = null;
                }
                obj = (CouponOptions) parcelableExtra;
            }
            Intrinsics.g(obj);
            ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra("com.meijer.intent.extra.EXTRA_COUPON_FILTER_CATEGORIES");
            Intrinsics.g(stringArrayListExtra);
            if (hVar.Y0((CouponOptions) obj, stringArrayListExtra)) {
                AbstractC4287t1 abstractC4287t12 = this.binding;
                if (abstractC4287t12 == null) {
                    Intrinsics.y("binding");
                } else {
                    abstractC4287t1 = abstractC4287t12;
                }
                abstractC4287t1.f20978D.scrollToPosition(0);
            }
        }
    }

    private final void x1() {
        getAnalyticsEngine().h(C14476c.a("event: coupon refine"), new Function1() { // from class: Jm.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.y1(this.f16028a, (TrackingData) obj);
            }
        });
        AbstractC14147c<Intent> abstractC14147c = this.couponFilterResultLauncher;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        Pk.c cVarS0 = hVar.getPageType();
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        abstractC14147c.a(Al.c.a(contextRequireContext, cVarS0, hVar2.getCouponOptions()));
    }

    @Override // Km.h.b
    public void V0() {
        x4.i activity = getActivity();
        if (activity instanceof ProductDetailActivity) {
            ((c) activity).X();
        }
    }

    @Override // Km.h.b
    public void j(int couponCount) {
        b bVar;
        x4.i activity = getActivity();
        b bVar2 = null;
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.K0(couponCount);
        }
        x4.i parentFragment = getParentFragment();
        if (parentFragment instanceof b) {
            bVar2 = (b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.K0(couponCount);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.rootActivity = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.i1();
        q<d.Removal> qVar = this.snackbar;
        if (qVar == null) {
            Intrinsics.y("snackbar");
            qVar = null;
        }
        qVar.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.Q();
    }

    @Override // Pj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Al.k.b(contextRequireContext, false, null, 536871032, null, null, null, 118, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.O(this);
        AbstractC4287t1 abstractC4287t1 = this.binding;
        if (abstractC4287t1 == null) {
            Intrinsics.y("binding");
            abstractC4287t1 = null;
        }
        abstractC4287t1.f20981G.setProgressBarListener(this.viewModel);
    }
}
