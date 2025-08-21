package com.meijer.mobile.meijer.activity.coupons.fragment;

import Fq.ShoppingListItem;
import Lm.h;
import Nn.AbstractC4292t1;
import Pk.Coupon;
import Qj.g;
import Sk.CouponOptions;
import Sr.b;
import Tq.j;
import Tr.A;
import Tr.C5371b;
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
import androidx.view.C6173t;
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
import dl.C13702d;
import ee.C13790a;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import h.i;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import il.m;
import is.C14847a;
import j$.time.Instant;
import j2.C14923c;
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
import mv.AbstractC15779K;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.P;
import tr.C17283a;
import vm.C17693b;
import x4.InterfaceC18089i;
import yo.C18335a;
import yo.k;
import zl.AbstractC18503f;

@Deprecated
@Metadata(d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u009a\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u009b\u0002\u009c\u0002\u009d\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u001f\u0010/\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0017¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u000203¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010\u0015J%\u0010D\u001a\u00020\t2\u0006\u0010A\u001a\u00020@2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020 0BH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010I\u001a\u00020\t2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020 H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010MJ!\u0010P\u001a\u00020\t2\u0006\u0010H\u001a\u00020 2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bU\u0010\u0006J!\u0010X\u001a\u00020\t2\u0006\u0010V\u001a\u0002032\b\b\u0001\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bX\u0010YJ\u001d\u0010\\\u001a\u00020\t2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0BH\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\t2\b\b\u0001\u0010^\u001a\u00020\u000eH\u0016¢\u0006\u0004\b_\u0010MJ\u001d\u0010b\u001a\u00020\t2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0BH\u0016¢\u0006\u0004\bb\u0010]J\u001d\u0010d\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020F0BH\u0016¢\u0006\u0004\bd\u0010]J\u0017\u0010e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\be\u0010MJ\u0019\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bi\u0010SJ\u0017\u0010j\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bj\u0010\u0015J#\u0010m\u001a\u00020\t2\b\b\u0001\u0010k\u001a\u00020\u000e2\b\b\u0001\u0010l\u001a\u00020\u000eH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bo\u0010SJ\u000f\u0010p\u001a\u00020\tH\u0016¢\u0006\u0004\bp\u0010\u0006J\u0017\u0010q\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\bq\u0010MJ\u0017\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\tH\u0016¢\u0006\u0004\bv\u0010\u0006R\"\u0010}\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R)\u0010\u009c\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\be\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R)\u0010£\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bP\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010»\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R)\u0010Ê\u0001\u001a\u00030Ä\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bo\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ò\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ú\u0001\u001a\u00030Ó\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R1\u0010ã\u0001\u001a\u00030Û\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÜ\u0001\u0010Ý\u0001\u0012\u0005\bâ\u0001\u0010\u0006\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001a\u0010ç\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001a\u0010ë\u0001\u001a\u00030è\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R \u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020f0ì\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ó\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u001c\u0010÷\u0001\u001a\u0005\u0018\u00010ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001b\u0010ú\u0001\u001a\u0005\u0018\u00010ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010ù\u0001R\u0019\u0010ý\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u001a\u00106\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001b\u0010\u0082\u0002\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R!\u0010\u0088\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R(\u0010\u008d\u0002\u001a\u0014\u0012\u000f\u0012\r \u008b\u0002*\u0005\u0018\u00010\u008a\u00020\u008a\u00020\u0089\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u008c\u0002R(\u0010\u008e\u0002\u001a\u0014\u0012\u000f\u0012\r \u008b\u0002*\u0005\u0018\u00010\u008a\u00020\u008a\u00020\u0089\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010\u008c\u0002R\u001e\u0010\u0092\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00020B8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001d\u0010\u0094\u0002\u001a\b\u0012\u0004\u0012\u00020N0B8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0091\u0002R\u0013\u0010\u000f\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u0014\u0010\u0099\u0002\u001a\u00020N8F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002¨\u0006\u009e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "Lcom/meijer/mobile/meijer/activity/fragment/MeijerFragment;", "LUr/d$f;", "LQj/g;", "LLm/h$b;", "<init>", "()V", "Lg/a;", "result", "", "w1", "(Lg/a;)V", "LQk/c;", "couponPage", "", "couponCount", "K1", "(LQk/c;I)V", "LTr/B;", "change", "C1", "(LTr/B;)V", "j1", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onDestroy", "outState", "onSaveInstanceState", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "pageType", "isFirstTrackState", "k1", "(LQk/c;Z)V", "LSk/a;", "options", "J1", "(LSk/a;)V", "couponsListChange", "d0", "LPk/a;", "coupon", "", "transitionViews", "U", "(LPk/a;Ljava/util/List;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAd", "transitionView", "E", "(Lcom/meijer/mobile/core/models/coupon/CouponAd;Landroid/view/View;)V", "messageResourceId", "Y", "(I)V", "", "url", "k", "(Landroid/view/View;Ljava/lang/String;)V", "y", "(LPk/a;)V", "onCreateAccount", "onSignIn", "isVisible", "textResourceId", "S0", "(ZI)V", "LUr/d$j;", "coupons", "a0", "(Ljava/util/List;)V", "errorMessageResId", "P0", "LFq/c;", "shoppingList", "d", "ads", "f", "j", "LUr/d$l;", "D", "(LPk/a;)LUr/d$l;", "m0", "c1", "title", "message", "k0", "(II)V", "p", "X0", "e0", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "LDk/b;", "LDk/b;", "s1", "()LDk/b;", "setRxJavaBus", "(LDk/b;)V", "rxJavaBus", "Lyo/k;", "g", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lhi/a;", "h", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "Lyo/a;", "i", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "LTr/b;", "LTr/b;", "n1", "()LTr/b;", "setCouponChangeManager", "(LTr/b;)V", "couponChangeManager", "Lvm/b;", "Lvm/b;", "getAppBackgroundManager", "()Lvm/b;", "setAppBackgroundManager", "(Lvm/b;)V", "appBackgroundManager", "LEq/b;", "l", "LEq/b;", "t1", "()LEq/b;", "setShoppingListRepository$Meijer_playstoreRelease", "(LEq/b;)V", "shoppingListRepository", "Ldl/d;", "m", "Ldl/d;", "p1", "()Ldl/d;", "setCouponsRepository", "(Ldl/d;)V", "couponsRepository", "LTq/j;", "n", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lzl/k;", "o", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "LBl/g;", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "Lil/m;", "q", "Lil/m;", "m1", "()Lil/m;", "setCartRepository", "(Lil/m;)V", "cartRepository", "LDl/e;", "r", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lmv/K;", "s", "Lmv/K;", "r1", "()Lmv/K;", "setIoDispatcher$Meijer_playstoreRelease", "(Lmv/K;)V", "getIoDispatcher$Meijer_playstoreRelease$annotations", "ioDispatcher", "LNn/t1;", "t", "LNn/t1;", "binding", "LUr/d;", "u", "LUr/d;", "couponsAdapter", "Lcom/meijer/mobile/widget/q;", "v", "Lcom/meijer/mobile/widget/q;", "snackbar", "LDs/k;", "w", "LDs/k;", "couponFailureThrottle", "Landroid/app/Activity;", "x", "Landroid/app/Activity;", "rootActivity", "LLm/h;", "LLm/h;", "viewModel", "z", "Z", "shouldDoTheFirstTrack", "A", "LQk/c;", "B", "Ljava/lang/String;", "previousTrackAction", "Lee/a;", "C", "Lkotlin/Lazy;", "l1", "()Lee/a;", "cartBadge", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lg/c;", "couponDetailsResultLauncher", "couponFilterResultLauncher", "Landroidx/fragment/app/Fragment;", "u1", "()Ljava/util/List;", "siblingFragments", "v1", "siblingPageTags", "o1", "()I", "q1", "()Ljava/lang/String;", "fragmentTag", "F", "b", "c", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CouponsFragment extends Hilt_CouponsFragment implements d.f, g, h.b {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f106246G = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Qk.c pageType;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> couponDetailsResultLauncher;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> couponFilterResultLauncher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Dk.b rxJavaBus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k userManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public C5371b couponChangeManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C17693b appBackgroundManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Eq.b shoppingListRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public C13702d couponsRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public j storeProvider;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public m cartRepository;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public AbstractC15779K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC4292t1 binding;

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
    private final Lazy cartBadge = LazyKt.b(new Function0() { // from class: Km.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponsFragment.g1(this.f17566a);
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$a;", "", "<init>", "()V", "", "previousTrackAction", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "d", "(Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "c", "()Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "LQk/c;", "couponPageType", "LSk/a;", "couponOptions", "a", "(LQk/c;LSk/a;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "ARG_COUPON_PAGE_TYPE", "Ljava/lang/String;", "ARG_COUPON_OPTIONS", "ARG_SPECIAL_OFFERS", "ARG_COUPON_FRAGMENT_TAG", "ARG_PREVIOUS_TRACK_ACTION", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CouponsFragment b(Companion companion, Qk.c cVar, CouponOptions aVar, String str, int i10, Object obj) {
            CouponOptions aVar2;
            if ((i10 & 2) != 0) {
                aVar2 = new CouponOptions(null, null, null, false, cVar != Qk.c.f31040d, 0L, null, null, false, null, null, false, false, 8175, null);
            } else {
                aVar2 = aVar;
            }
            return companion.a(cVar, aVar2, (i10 & 4) != 0 ? null : str);
        }

        @JvmStatic
        @JvmOverloads
        public final CouponsFragment a(Qk.c couponPageType, CouponOptions couponOptions, String previousTrackAction) {
            Intrinsics.j(couponPageType, "couponPageType");
            Intrinsics.j(couponOptions, "couponOptions");
            CouponsFragment couponsFragment = new CouponsFragment();
            couponsFragment.setArguments(C14923c.b(TuplesKt.a("ARG_COUPON_PAGE_TYPE", couponPageType), TuplesKt.a("ARG_COUPON_OPTIONS", couponOptions), TuplesKt.a("ARG_PREVIOUS_TRACK_ACTION", previousTrackAction)));
            return couponsFragment;
        }

        @JvmStatic
        public final CouponsFragment c() {
            return b(this, Qk.c.f31049m, new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null), null, 4, null);
        }

        public final CouponsFragment d(String previousTrackAction) {
            return a(Qk.c.f31048l, new CouponOptions(null, null, null, false, false, 0L, null, null, true, null, null, false, false, 7935, null), previousTrackAction);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "", "", "count", "", "L0", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void L0(int count);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$c;", "", "", "Y", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void Y();
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
            hVar.R0(new CouponsListChange(CouponsListChange.a.f36746c, removal.a()));
        }

        @Override // com.meijer.mobile.widget.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(d.Removal removal) {
            Intrinsics.j(removal, "removal");
            Ur.d dVar = CouponsFragment.this.couponsAdapter;
            AbstractC4292t1 abstractC4292t1 = null;
            if (dVar == null) {
                Intrinsics.x("couponsAdapter");
                dVar = null;
            }
            int iY = dVar.y(removal);
            AbstractC4292t1 abstractC4292t12 = CouponsFragment.this.binding;
            if (abstractC4292t12 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4292t1 = abstractC4292t12;
            }
            abstractC4292t1.f22310D.smoothScrollToPosition(iY);
            h hVar = CouponsFragment.this.viewModel;
            Intrinsics.g(hVar);
            hVar.g1();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$f", "LKm/c;", "Landroidx/recyclerview/widget/RecyclerView$F;", "viewHolder", "", "direction", "", "B", "(Landroidx/recyclerview/widget/RecyclerView$F;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "k", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$F;)I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends Km.c {
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
                Intrinsics.x("couponsAdapter");
                dVar = null;
            }
            Object obj = ((d.C0826d) viewHolder).c().value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
            final d.Removal lVarS = dVar.s((Coupon) obj);
            Context contextRequireContext = CouponsFragment.this.requireContext();
            final CouponsFragment couponsFragment = CouponsFragment.this;
            Sr.b.b(contextRequireContext, new b.InterfaceC0789b() { // from class: Km.s
                @Override // Sr.b.InterfaceC0789b
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
                Intrinsics.x("snackbar");
                qVar = null;
            }
            qVar.j(lVar);
            h hVar = couponsFragment.viewModel;
            Intrinsics.g(hVar);
            hVar.X0(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(C14274a it) {
        Intrinsics.j(it, "it");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lgi/d;", "googleAds", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment$onCreate$2", f = "CouponsFragment.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<List<? extends GoogleAdData>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106273a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106274b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = CouponsFragment.this.new d(continuation);
            dVar.f106274b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<GoogleAdData> list, Continuation<? super Unit> continuation) {
            return ((d) create(list, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f106273a == 0) {
                ResultKt.b(obj);
                List<GoogleAdData> list = (List) this.f106274b;
                Ur.d dVar = CouponsFragment.this.couponsAdapter;
                if (dVar == null) {
                    Intrinsics.x("couponsAdapter");
                    dVar = null;
                }
                dVar.v(list);
                return Unit.f143329a;
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
            submitEvent.c(Rk.b.f33418a.e(couponA));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(Coupon coupon, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("pageName", "Meijer:Search Results Page: Coupon Details Page");
        Rk.b bVar = Rk.b.f33418a;
        submitEvent.c(bVar.b());
        submitEvent.c(bVar.e(coupon));
        return Unit.f143329a;
    }

    private final void C1(CouponsListChange change) {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.V0(change);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(CouponsFragment couponsFragment, GoogleAdAnalytics googleAnalytics) {
        Intrinsics.j(googleAnalytics, "googleAnalytics");
        h hVar = couponsFragment.viewModel;
        if (hVar != null) {
            hVar.d1(googleAnalytics);
        }
        return Unit.f143329a;
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
        return Unit.f143329a;
    }

    private final void K1(Qk.c couponPage, final int couponCount) {
        final String str = couponPage == Qk.c.f31040d ? "Meijer: Coupons: available" : "Meijer: Coupons: clipped";
        getAnalyticsEngine().b(C14756c.h(str), new Function1() { // from class: Km.p
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
        track.c(Rk.b.f33418a.k(i10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(CouponsFragment couponsFragment, C14274a result) {
        Intrinsics.j(result, "result");
        couponsFragment.w1(result);
    }

    private final C13790a l1() {
        return (C13790a) this.cartBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(CouponsFragment couponsFragment, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        h hVar = couponsFragment.viewModel;
        Intrinsics.g(hVar);
        track.n(hVar.A0());
        track.v("mperks");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(CouponAd couponAd, CouponsFragment couponsFragment, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: coupons");
        track.v("mperks");
        track.h("Adcampaign", couponAd.getBundleTag());
        Ur.d dVar = couponsFragment.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        track.h("position", String.valueOf(dVar.n(couponAd) + 1));
        return Unit.f143329a;
    }

    @Override // Lm.h.b
    public d.Removal D(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        return dVar.s(coupon);
    }

    @Override // Ur.d.f
    public void E(final CouponAd couponAd, View transitionView) {
        Intrinsics.j(couponAd, "couponAd");
        Intrinsics.j(transitionView, "transitionView");
        getAnalyticsEngine().b(C14756c.a("event: ribbon clicked"), new Function1() { // from class: Km.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.z1(couponAd, this, (TrackingData) obj);
            }
        });
        Dl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        String bundleTag = couponAd.getBundleTag();
        if (bundleTag == null) {
            bundleTag = "";
        }
        Intent intentE = meijerIntent.e(contextRequireContext, couponAd, new CouponOptions(null, null, null, false, false, 0L, bundleTag, null, false, null, null, false, false, 8127, null), getFeatureManager().e(AbstractC18503f.M.f172852h));
        List listE = CollectionsKt.e(transitionView);
        AbstractC14276c<Intent> abstractC14276c = this.couponDetailsResultLauncher;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        Ds.b.a(abstractC14276c, intentE, fragmentActivityRequireActivity, listE);
    }

    public final void J1(CouponOptions options) {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.s1(options, true);
    }

    @Override // Lm.h.b
    public void P0(int errorMessageResId) {
        AbstractC4292t1 abstractC4292t1 = this.binding;
        if (abstractC4292t1 == null) {
            Intrinsics.x("binding");
            abstractC4292t1 = null;
        }
        abstractC4292t1.f22313G.P(errorMessageResId, true);
        j1();
    }

    @Override // um.InterfaceC17447b
    public void S0(boolean isVisible, int textResourceId) {
        AbstractC4292t1 abstractC4292t1 = this.binding;
        if (abstractC4292t1 == null) {
            Intrinsics.x("binding");
            abstractC4292t1 = null;
        }
        abstractC4292t1.f22313G.S(textResourceId, isVisible);
    }

    @Override // Ur.d.f
    public void U(final Coupon coupon, List<? extends View> transitionViews) {
        boolean z10;
        Intrinsics.j(coupon, "coupon");
        Intrinsics.j(transitionViews, "transitionViews");
        if (getActivity() instanceof SearchProductActivity) {
            getAnalyticsEngine().c(C14756c.h("Coupon Detail Page Analytics"), new Function1() { // from class: Km.h
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

    @Override // Ur.d.f
    public void Y(int messageResourceId) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        new Qj.f(fragmentActivityRequireActivity, messageResourceId, this).g();
    }

    @Override // Lm.h.b
    public void a0(List<d.j> coupons) {
        Intrinsics.j(coupons, "coupons");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        dVar.x(coupons);
    }

    @Override // Lm.h.b
    public void c1(CouponsListChange change) {
        Intrinsics.j(change, "change");
        for (Fragment fragment : u1()) {
            if (fragment != this && (fragment instanceof CouponsFragment)) {
                ((CouponsFragment) fragment).C1(change);
            }
        }
    }

    @Override // Lm.h.b
    public void d(List<ShoppingListItem> shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        dVar.r(shoppingList);
    }

    @Override // Ur.d.f
    public void d0(final CouponsListChange couponsListChange) {
        Intrinsics.j(couponsListChange, "couponsListChange");
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.R0(couponsListChange);
        if (couponsListChange.getType() == CouponsListChange.a.f36744a) {
            if (getActivity() instanceof SearchProductActivity) {
                getAnalyticsEngine().c(C14756c.a("Coupons Clipping From Search Results Analytics"), new Function1() { // from class: Km.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CouponsFragment.A1(couponsListChange, (TrackingData) obj);
                    }
                });
            } else if (StringsKt.d0(String.valueOf(this.rootActivity), "weeklyad", false, 2, null)) {
                couponsListChange.getCoupon();
            }
        }
    }

    @Override // Lm.h.b
    public void e0(int couponCount) {
        if (this.shouldDoTheFirstTrack) {
            K1(this.pageType, couponCount);
            this.shouldDoTheFirstTrack = false;
        }
    }

    @Override // Lm.h.b
    public void f(List<CouponAd> ads) {
        Intrinsics.j(ads, "ads");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        dVar.u(ads);
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

    public final j getStoreProvider() {
        j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    public final k getUserManager() {
        k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    @Override // Ur.d.f
    public void k(View transitionView, String url) {
        Intrinsics.j(transitionView, "transitionView");
        getAnalyticsEngine().b(C14756c.a("event: coupon page special offers banner"), new Function1() { // from class: Km.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.I1((TrackingData) obj);
            }
        });
        List listE = CollectionsKt.e(transitionView);
        Dl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        Ds.b.b(this.couponDetailsResultLauncher, meijerIntent.k(contextRequireContext, url, "Coupons: View Offers List Page: Offer Clicked", getFeatureManager().e(AbstractC18503f.M.f172852h)), this, listE);
    }

    @Override // Lm.h.b
    public void k0(int title, int message) {
        if (this.couponFailureThrottle.d()) {
            this.couponFailureThrottle.c();
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            new Qj.j(contextRequireContext, getString(message)).r(title, new Object[0]).q(new DialogInterface.OnDismissListener() { // from class: Km.r
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CouponsFragment.H1(this.f17573a, dialogInterface);
                }
            }).g();
        }
    }

    public final void k1(Qk.c pageType, boolean isFirstTrackState) {
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

    @Override // Lm.h.b
    public void m0(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        dVar.z(coupon);
    }

    public final m m1() {
        m mVar = this.cartRepository;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.x("cartRepository");
        return null;
    }

    public final C5371b n1() {
        C5371b c5371b = this.couponChangeManager;
        if (c5371b != null) {
            return c5371b;
        }
        Intrinsics.x("couponChangeManager");
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
        P<List<GoogleAdData>> pL0;
        InterfaceC16561f interfaceC16561fO;
        Object obj2;
        super.onCreate(savedInstanceState);
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializable = bundleRequireArguments.getSerializable("ARG_COUPON_PAGE_TYPE", Qk.c.class);
        } else {
            Serializable serializable2 = bundleRequireArguments.getSerializable("ARG_COUPON_PAGE_TYPE");
            if (!(serializable2 instanceof Qk.c)) {
                serializable2 = null;
            }
            serializable = (Qk.c) serializable2;
        }
        Intrinsics.g(serializable);
        Qk.c cVar = (Qk.c) serializable;
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
        C17693b appBackgroundManager = getAppBackgroundManager();
        k userManager = getUserManager();
        m mVarM1 = m1();
        C13702d c13702dP1 = p1();
        InterfaceC14523a analyticsEngine = getAnalyticsEngine();
        C18335a appPrefManager = getAppPrefManager();
        j storeProvider = getStoreProvider();
        C5371b c5371bN1 = n1();
        Dk.b bVarS1 = s1();
        boolean z10 = cVar == Qk.c.f31040d || cVar == Qk.c.f31048l || cVar == Qk.c.f31042f;
        Eq.b bVarT1 = t1();
        C13702d c13702dP12 = p1();
        Dl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        A a10 = new A(bVarS1, z10, bVarT1, c13702dP12, Dl.e.j(meijerIntent, contextRequireContext, null, getFeatureManager().e(AbstractC18503f.M.f172852h), false, 0, 26, null), r1());
        Bundle bundleRequireArguments3 = requireArguments();
        Intrinsics.i(bundleRequireArguments3, "requireArguments(...)");
        this.viewModel = aVar3.a(cVar, appBackgroundManager, userManager, mVarM1, c13702dP1, analyticsEngine, appPrefManager, storeProvider, c5371bN1, a10, aVar2, i10 >= 33 ? bundleRequireArguments3.getParcelableArrayList("ARG_SPECIAL_OFFERS", Coupon.class) : bundleRequireArguments3.getParcelableArrayList("ARG_SPECIAL_OFFERS"), str);
        Ur.d dVar = new Ur.d(cVar, this, getUserManager().b(), p1(), new Function1() { // from class: Km.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return CouponsFragment.D1(this.f17565a, (GoogleAdAnalytics) obj3);
            }
        });
        this.couponsAdapter = dVar;
        if (cVar == Qk.c.f31050n) {
            dVar.w(d.j.INSTANCE.a());
        }
        if (!getFeatureManager().e(AbstractC18503f.C.f172844h) || (hVar = this.viewModel) == null || (pL0 = hVar.l0()) == null || (interfaceC16561fO = C16563h.O(pL0, new d(null))) == null) {
            return;
        }
        C16563h.J(interfaceC16561fO, C6173t.a(this));
    }

    @Override // Qj.g
    public void onCreateAccount() {
        Bl.f fVar = Bl.f.f3124a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.j(menu, "menu");
        Intrinsics.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        if (getUserManager().b()) {
            inflater.inflate(W.f100296b, menu);
            C13790a c13790aL1 = l1();
            h hVar = this.viewModel;
            Intrinsics.g(hVar);
            c13790aL1.R(hVar.getCartItemCount().M());
            l1().setVisible(l1().z() && l1().o() > 0, true);
            View viewFindViewById = requireActivity().findViewById(T.f99730L);
            Intrinsics.i(viewFindViewById, "findViewById(...)");
            Rj.a.a((Toolbar) viewFindViewById, T.f99957h, l1());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        AbstractC4292t1 abstractC4292t1M0 = AbstractC4292t1.M0(inflater, container, false);
        this.binding = abstractC4292t1M0;
        AbstractC4292t1 abstractC4292t1 = null;
        if (abstractC4292t1M0 == null) {
            Intrinsics.x("binding");
            abstractC4292t1M0 = null;
        }
        abstractC4292t1M0.O0(this.viewModel);
        AbstractC4292t1 abstractC4292t12 = this.binding;
        if (abstractC4292t12 == null) {
            Intrinsics.x("binding");
            abstractC4292t12 = null;
        }
        Button button = abstractC4292t12.f22319z;
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        button.setVisibility(hVar.getSearchNoCouponsViewVisibility().M());
        AbstractC4292t1 abstractC4292t13 = this.binding;
        if (abstractC4292t13 == null) {
            Intrinsics.x("binding");
            abstractC4292t13 = null;
        }
        View root = abstractC4292t13.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        AbstractC4292t1 abstractC4292t14 = this.binding;
        if (abstractC4292t14 == null) {
            Intrinsics.x("binding");
            abstractC4292t14 = null;
        }
        C14847a c14847a = new C14847a(abstractC4292t14.f22310D.getContext(), 1);
        AbstractC4292t1 abstractC4292t15 = this.binding;
        if (abstractC4292t15 == null) {
            Intrinsics.x("binding");
            abstractC4292t15 = null;
        }
        Drawable drawableE = Z1.b.e(abstractC4292t15.f22310D.getContext(), S.f99611v0);
        Intrinsics.g(drawableE);
        c14847a.h(drawableE);
        AbstractC4292t1 abstractC4292t16 = this.binding;
        if (abstractC4292t16 == null) {
            Intrinsics.x("binding");
            abstractC4292t16 = null;
        }
        abstractC4292t16.f22310D.addItemDecoration(c14847a);
        AbstractC4292t1 abstractC4292t17 = this.binding;
        if (abstractC4292t17 == null) {
            Intrinsics.x("binding");
            abstractC4292t17 = null;
        }
        abstractC4292t17.f22310D.addItemDecoration(new Km.b());
        Es.b bVar = new Es.b();
        bVar.setSupportsChangeAnimations(false);
        AbstractC4292t1 abstractC4292t18 = this.binding;
        if (abstractC4292t18 == null) {
            Intrinsics.x("binding");
            abstractC4292t18 = null;
        }
        abstractC4292t18.f22310D.setItemAnimator(bVar);
        AbstractC4292t1 abstractC4292t19 = this.binding;
        if (abstractC4292t19 == null) {
            Intrinsics.x("binding");
            abstractC4292t19 = null;
        }
        abstractC4292t19.f22317K.setListener(this);
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        if (hVar2.t1()) {
            AbstractC4292t1 abstractC4292t110 = this.binding;
            if (abstractC4292t110 == null) {
                Intrinsics.x("binding");
                abstractC4292t110 = null;
            }
            abstractC4292t110.f22310D.setNestedScrollingEnabled(false);
        }
        l lVar = new l(new f(requireContext(), com.meijer.mobile.meijer.P.f99506b));
        AbstractC4292t1 abstractC4292t111 = this.binding;
        if (abstractC4292t111 == null) {
            Intrinsics.x("binding");
            abstractC4292t111 = null;
        }
        lVar.g(abstractC4292t111.f22310D);
        AbstractC4292t1 abstractC4292t112 = this.binding;
        if (abstractC4292t112 == null) {
            Intrinsics.x("binding");
            abstractC4292t112 = null;
        }
        RecyclerView recyclerView = abstractC4292t112.f22310D;
        Ur.d dVar = this.couponsAdapter;
        if (dVar == null) {
            Intrinsics.x("couponsAdapter");
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        AbstractC4292t1 abstractC4292t113 = this.binding;
        if (abstractC4292t113 == null) {
            Intrinsics.x("binding");
            abstractC4292t113 = null;
        }
        this.snackbar = new e(abstractC4292t113.f22310D, Nr.g.f22726z);
        AbstractC4292t1 abstractC4292t114 = this.binding;
        if (abstractC4292t114 == null) {
            Intrinsics.x("binding");
            abstractC4292t114 = null;
        }
        abstractC4292t114.f22319z.setOnClickListener(new View.OnClickListener() { // from class: Km.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponsFragment.E1(this.f17568a, view);
            }
        });
        if (getUserManager().b()) {
            AbstractC4292t1 abstractC4292t115 = this.binding;
            if (abstractC4292t115 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4292t1 = abstractC4292t115;
            }
            abstractC4292t1.f22307A.setOnClickListener(new View.OnClickListener() { // from class: Km.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CouponsFragment.F1(this.f17569a, view);
                }
            });
            return root;
        }
        AbstractC4292t1 abstractC4292t116 = this.binding;
        if (abstractC4292t116 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4292t1 = abstractC4292t116;
        }
        abstractC4292t1.f22307A.setEnabled(false);
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC4292t1 abstractC4292t1 = this.binding;
        if (abstractC4292t1 == null) {
            Intrinsics.x("binding");
            abstractC4292t1 = null;
        }
        abstractC4292t1.f22313G.setProgressBarListener(null);
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.P();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        if (item.getItemId() != T.f99957h) {
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
        setHasOptionsMenu(hVar.N0());
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        hVar2.h1(v1());
        h hVar3 = this.viewModel;
        Intrinsics.g(hVar3);
        if (hVar3.getPageType() == Qk.c.f31042f) {
            h hVar4 = this.viewModel;
            Intrinsics.g(hVar4);
            hVar4.j1();
        }
    }

    @Override // Lm.h.b
    public void p(final Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        AbstractC4292t1 abstractC4292t1 = this.binding;
        if (abstractC4292t1 == null) {
            Intrinsics.x("binding");
            abstractC4292t1 = null;
        }
        Snackbar snackbarT0 = Snackbar.q0(abstractC4292t1.getRoot(), Nr.g.f22716u, 0).t0(Nr.g.f22697k0, new View.OnClickListener() { // from class: Km.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponsFragment.G1(this.f17560a, coupon, view);
            }
        });
        Intrinsics.i(snackbarT0, "setAction(...)");
        if (this.rootActivity instanceof ProductDetailActivity) {
            snackbarT0.W(T.f99946g).c0();
        } else {
            snackbarT0.c0();
        }
    }

    public final C13702d p1() {
        C13702d c13702d = this.couponsRepository;
        if (c13702d != null) {
            return c13702d;
        }
        Intrinsics.x("couponsRepository");
        return null;
    }

    public final String q1() {
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        return hVar.getTag();
    }

    public final AbstractC15779K r1() {
        AbstractC15779K abstractC15779K = this.ioDispatcher;
        if (abstractC15779K != null) {
            return abstractC15779K;
        }
        Intrinsics.x("ioDispatcher");
        return null;
    }

    public final Dk.b s1() {
        Dk.b bVar = this.rxJavaBus;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("rxJavaBus");
        return null;
    }

    public final Eq.b t1() {
        Eq.b bVar = this.shoppingListRepository;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("shoppingListRepository");
        return null;
    }

    @Override // Ur.d.f
    public void y(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        startActivity(Dl.e.g(getMeijerIntent(), coupon, true, true, false, null, 16, null));
    }

    public CouponsFragment() {
        AbstractC14276c<Intent> abstractC14276cRegisterForActivityResult = registerForActivityResult(new i(), new InterfaceC14275b() { // from class: Km.l
            @Override // g.InterfaceC14275b
            public final void a(Object obj) {
                CouponsFragment.h1((C14274a) obj);
            }
        });
        Intrinsics.i(abstractC14276cRegisterForActivityResult, "registerForActivityResult(...)");
        this.couponDetailsResultLauncher = abstractC14276cRegisterForActivityResult;
        AbstractC14276c<Intent> abstractC14276cRegisterForActivityResult2 = registerForActivityResult(new i(), new InterfaceC14275b() { // from class: Km.m
            @Override // g.InterfaceC14275b
            public final void a(Object obj) {
                CouponsFragment.i1(this.f17567a, (C14274a) obj);
            }
        });
        Intrinsics.i(abstractC14276cRegisterForActivityResult2, "registerForActivityResult(...)");
        this.couponFilterResultLauncher = abstractC14276cRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(CouponsFragment couponsFragment, View view) {
        Dl.e meijerIntent = couponsFragment.getMeijerIntent();
        Context contextRequireContext = couponsFragment.requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        couponsFragment.startActivity(Dl.e.j(meijerIntent, contextRequireContext, Qk.c.f31040d, couponsFragment.getFeatureManager().e(AbstractC18503f.M.f172852h), false, 0, 24, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(CouponsFragment couponsFragment, View view) {
        couponsFragment.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(CouponsFragment couponsFragment, Coupon coupon, View view) {
        couponsFragment.y(coupon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13790a g1(CouponsFragment couponsFragment) {
        C13790a c13790aE = C13790a.e(couponsFragment.requireContext());
        c13790aE.V(false);
        c13790aE.N(C17283a.f163260c);
        Intrinsics.i(c13790aE, "apply(...)");
        return c13790aE;
    }

    private final void j1() {
        AppBarLayout appBarLayout;
        FragmentActivity activity = getActivity();
        if (activity != null && (appBarLayout = (AppBarLayout) activity.findViewById(T.f99750N)) != null) {
            appBarLayout.x(true, true);
        }
    }

    private final List<Fragment> u1() {
        o oVar;
        InterfaceC18089i activity = getActivity();
        List<Fragment> listI = null;
        if (activity instanceof o) {
            oVar = (o) activity;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            listI = oVar.I();
        }
        if (listI == null) {
            return CollectionsKt.m();
        }
        return listI;
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

    private final void w1(C14274a result) {
        Object obj;
        Intent data = result.getData();
        if (result.getResultCode() == -1 && data != null) {
            h hVar = this.viewModel;
            Intrinsics.g(hVar);
            AbstractC4292t1 abstractC4292t1 = null;
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
            if (hVar.b1((CouponOptions) obj, stringArrayListExtra)) {
                AbstractC4292t1 abstractC4292t12 = this.binding;
                if (abstractC4292t12 == null) {
                    Intrinsics.x("binding");
                } else {
                    abstractC4292t1 = abstractC4292t12;
                }
                abstractC4292t1.f22310D.scrollToPosition(0);
            }
        }
    }

    private final void x1() {
        getAnalyticsEngine().b(C14756c.a("event: coupon refine"), new Function1() { // from class: Km.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsFragment.y1(this.f17572a, (TrackingData) obj);
            }
        });
        AbstractC14276c<Intent> abstractC14276c = this.couponFilterResultLauncher;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        Qk.c cVarR0 = hVar.getPageType();
        h hVar2 = this.viewModel;
        Intrinsics.g(hVar2);
        abstractC14276c.a(Bl.c.a(contextRequireContext, cVarR0, hVar2.getCouponOptions()));
    }

    @Override // Lm.h.b
    public void X0() {
        InterfaceC18089i activity = getActivity();
        if (activity instanceof ProductDetailActivity) {
            ((c) activity).Y();
        }
    }

    @Override // Lm.h.b
    public void j(int couponCount) {
        b bVar;
        InterfaceC18089i activity = getActivity();
        b bVar2 = null;
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.L0(couponCount);
        }
        InterfaceC18089i parentFragment = getParentFragment();
        if (parentFragment instanceof b) {
            bVar2 = (b) parentFragment;
        }
        if (bVar2 != null) {
            bVar2.L0(couponCount);
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
            Intrinsics.x("snackbar");
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

    @Override // Qj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Bl.k.b(contextRequireContext, false, null, 536871032, null, null, null, 118, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        h hVar = this.viewModel;
        Intrinsics.g(hVar);
        hVar.O(this);
        AbstractC4292t1 abstractC4292t1 = this.binding;
        if (abstractC4292t1 == null) {
            Intrinsics.x("binding");
            abstractC4292t1 = null;
        }
        abstractC4292t1.f22313G.setProgressBarListener(this.viewModel);
    }
}
