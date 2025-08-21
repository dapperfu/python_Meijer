package com.meijer.mobile.shoppinglist.teacherlists.ux;

import Ao.W;
import As.ClassItem;
import As.SchoolCard;
import As.SchoolItem;
import As.UnavailableItem;
import Co.ProductFullDetails;
import Kq.Classroom;
import Kq.School;
import Kq.Supplies;
import Kq.TLProduct;
import M0.SnapshotStateList;
import Mq.TeacherListsClassroomsRequest;
import Mq.TeacherListsSchoolsRequest;
import Mq.TeacherListsSuppliesRequest;
import Pk.Coupon;
import Qk.a;
import Yk.CouponState;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import dl.C13702d;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import hi.InterfaceC14523a;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import qw.a;
import sp.C17115a;
import sp.ProductState;
import uk.AbstractC17440a;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import vs.ProductListDecorator;
import wk.C17898a;
import wr.InterfaceC17909a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0007zvr|x~tBY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J+\u0010*\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0(0'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00192\u0006\u0010-\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u0010\u001bJ\u000f\u00108\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u0010\u001bJ\u000f\u00109\u001a\u00020\u0019H\u0002¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010<\u001a\u00020\u00192\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00192\u0006\u0010-\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00192\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bE\u0010\u001fJ\u0017\u0010G\u001a\u00020\u00192\u0006\u0010;\u001a\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0019H\u0002¢\u0006\u0004\bI\u0010\u001bJ\u0017\u0010L\u001a\u00020\u00192\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00192\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00192\u0006\u0010-\u001a\u00020RH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00192\u0006\u0010-\u001a\u00020UH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0019H\u0002¢\u0006\u0004\bX\u0010\u001bJ\u000f\u0010Y\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010\u001bJ\u000f\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\bZ\u0010\u001bJ\u000f\u0010[\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010\u001bJ\u000f\u0010\\\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\\\u0010\u001bJ!\u0010a\u001a\u00020\u00192\u0006\u0010^\u001a\u00020]2\b\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\ba\u0010bJ!\u0010f\u001a\u00020\u00192\u0006\u0010d\u001a\u00020c2\b\u0010e\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bf\u0010gJ)\u0010j\u001a\u00020\u00192\u0006\u0010i\u001a\u00020h2\u0006\u0010d\u001a\u00020c2\b\u0010e\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u00192\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00192\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bp\u0010oJ\u0017\u0010q\u001a\u00020\u00192\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bq\u0010oR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020F8\u0002X\u0082D¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0090\u0001\u001a\u00070\u008d\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R9\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001RD\u0010\u009f\u0001\u001a\u000b\u0018\u00010Fj\u0005\u0018\u0001`\u009a\u00012\u0010\u0010\u0092\u0001\u001a\u000b\u0018\u00010Fj\u0005\u0018\u0001`\u009a\u00018@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u0094\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0005\b\u009e\u0001\u0010HR\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001d\u0010©\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LLq/a;", "repository", "LTq/j;", "storeProvider", "Lil/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lzl/k;", "featureManager", "Lsp/a;", "multiChannelProductsStateRepository", "Lpp/d;", "productMetadataStore", "Ldl/d;", "couponsRepository", "Lyo/k;", "userManager", "Lhi/a;", "analyticsEngine", "<init>", "(LLq/a;LTq/j;Lil/m;Lwr/f;Lzl/k;Lsp/a;Lpp/d;Ldl/d;Lyo/k;Lhi/a;)V", "", "V0", "()V", "LCo/h;", "product", "s0", "(LCo/h;)V", "Luk/c;", "Lfj/C;", "resource", "U0", "(Luk/c;)V", "", "key", "", "Lsp/b;", "productStates", "onProductsState", "(Ljava/lang/Object;Ljava/util/List;)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$a;", "action", "G0", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$a;)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/q1;", "e1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/q1;)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/u1;", "event", "n0", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/u1;)V", "B0", "C0", "E0", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$c;", "new", "e0", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$c;)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/s1;", "f1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/s1;)V", "", "fromToast", "z0", "(Z)V", "W0", "", "g1", "(Ljava/lang/String;)V", "w0", "LAs/e;", "schoolItem", "t0", "(LAs/e;)V", "LAs/a;", "classItem", "x0", "(LAs/a;)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/h1;", "m0", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/h1;)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/e1;", "k0", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/e1;)V", "X0", "a1", "c1", "c0", "b0", "LPk/c;", "couponIdentity", "Lii/f;", "trackingData", "o0", "(LPk/c;Lii/f;)V", "LPk/a;", "coupon", "couponLocation", "f0", "(LPk/a;Ljava/lang/String;)V", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "T0", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "onDestroy", "a", "LLq/a;", "b", "LTq/j;", "c", "Lil/m;", "d", "Lwr/f;", "e", "Lzl/k;", "f", "Lsp/a;", "g", "Lpp/d;", "h", "Ldl/d;", "i", "Lyo/k;", "j", "Lhi/a;", "LJu/a;", "k", "LJu/a;", "disposables", "l", "Ljava/lang/String;", "teacherListRepoKey", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$b;", "m", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$b;", "cartInteractorListener", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/b;", "<set-?>", "n", "Lkotlin/properties/ReadWriteProperty;", "u0", "()Lcom/meijer/mobile/shoppinglist/teacherlists/ux/b;", "Y0", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/b;)V", "productInQtyStepperInteraction", "Lcom/meijer/mobile/core/model/common/ResourceId;", "o", "v0", "()Ljava/lang/String;", "Z0", "resetStepperState", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$g;", "p", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$g;", "_viewState", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "q", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "y0", "()Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class v1 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f118442r = {Reflection.f(new MutablePropertyReference1Impl(v1.class, "productInQtyStepperInteraction", "getProductInQtyStepperInteraction()Lcom/meijer/mobile/shoppinglist/teacherlists/ux/EntryInQtyStepperInteraction;", 0)), Reflection.f(new MutablePropertyReference1Impl(v1.class, "resetStepperState", "getResetStepperState$ux_release()Ljava/lang/String;", 0))};

    /* renamed from: s, reason: collision with root package name */
    public static final int f118443s = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lq.a repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17115a multiChannelProductsStateRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String teacherListRepoKey;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b cartInteractorListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty productInQtyStepperInteraction;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty resetStepperState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final g _viewState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final d viewState;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bp\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$a;", "", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ)\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$b;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1;)V", "Lur/a;", "processedRequest", "Luk/c;", "Lfj/j;", "entryChange", "", "c", "(Lur/a;Luk/c;)V", "f", "b", "d", "(Luk/c;)V", "Lfj/C;", "cartResource", "observeCart", "LJu/a;", "getDisposable", "()LJu/a;", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    final class b implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f131920b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f131922d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f131924f.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // wr.InterfaceC17909a
        public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
        }

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(W.Details details, double d10, EntryChange entryChange, v1 v1Var, TrackingData track) {
            ProductFullDetails productFullDetailsM;
            Intrinsics.j(track, "$this$track");
            track.e(Ao.W.j(CollectionsKt.e(details)));
            track.h("componentName", "Quantity Stepper");
            track.h("quantity", String.valueOf(d10));
            track.v("Teacher's List");
            Entry entry = entryChange.getEntry();
            String code = (entry == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode();
            if (code == null) {
                code = "";
            }
            track.h("productID", code);
            track.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
            track.h("classSelected", v1Var._viewState.p().getValue().getClassName());
            return Unit.f143329a;
        }

        @Override // wr.InterfaceC17909a
        /* renamed from: getDisposable */
        public Ju.a getDisposables() {
            return v1.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            if (v1.this.userManager.b() && cartResource != null) {
                v1 v1Var = v1.this;
                ShoppingCart shoppingCartA = cartResource.a();
                Integer num = null;
                String code = shoppingCartA != null ? shoppingCartA.getCode() : null;
                ShoppingCart shoppingCartA2 = cartResource.a();
                if (shoppingCartA2 != null) {
                    Integer numValueOf = Integer.valueOf(shoppingCartA2.getTotalItems());
                    if (numValueOf.intValue() > 0) {
                        num = numValueOf;
                    }
                }
                v1Var._viewState.f().setValue(num);
                qw.a.INSTANCE.a("Setting CartID for TeacherLists view state: " + code, new Object[0]);
                FS.setUserVars(MapsKt.g(TuplesKt.a("CartID", code)));
            }
        }

        @Override // wr.InterfaceC17909a
        public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (processedRequest instanceof AbstractC17454a.Add) {
                b(processedRequest, entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17454a.Update) {
                f(processedRequest, entryChange);
            } else if (processedRequest instanceof AbstractC17454a.Remove) {
                c(processedRequest, entryChange);
            } else if (!Intrinsics.e(processedRequest, AbstractC17454a.b.f164334b)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        private final void b(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            d(entryChange);
        }

        private final void c(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            d(entryChange);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void d(uk.c<fj.EntryChange> r68) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.teacherlists.ux.v1.b.d(uk.c):void");
        }

        private final void f(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            d(entryChange);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f118462a = new c("ALL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f118463b = new c("AVAILABLE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f118464c = new c("UNAVAILABLE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f118465d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f118466e;

        private static final /* synthetic */ c[] a() {
            return new c[]{f118462a, f118463b, f118464c};
        }

        static {
            c[] cVarArrA = a();
            f118465d = cVarArrA;
            f118466e = EnumEntriesKt.a(cVarArrA);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f118465d.clone();
        }

        private c(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0005R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0005R \u00104\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "", "Landroidx/compose/runtime/z1;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$e;", "e", "()Landroidx/compose/runtime/z1;", "stage", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$c;", "l", "filterMode", "", "a", "isLoading", "q", "isAddingToCart", "", "b", "selectedIndex", "Lbk/a;", "g", "headerTitle", "", "i", "searchText", "f", "cartCount", "LM0/m;", "LAs/e;", "j", "()LM0/m;", "schoolItems", "LAs/a;", "d", "classItems", "LAs/d;", "p", "schoolCard", "Lvs/f;", "n", "availableProducts", "LAs/t;", "h", "unavailableItems", "c", "isSponsoredProductBuyAgainEnabled", "k", "shouldEnableRatings", "Lkotlin/Function1;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$a;", "", "m", "()Lkotlin/jvm/functions/Function1;", "onAction", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "o", "eventsInMotion", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
        androidx.compose.runtime.z1<Boolean> a();

        androidx.compose.runtime.z1<Integer> b();

        androidx.compose.runtime.z1<Boolean> c();

        SnapshotStateList<ClassItem> d();

        androidx.compose.runtime.z1<e> e();

        androidx.compose.runtime.z1<Integer> f();

        androidx.compose.runtime.z1<AbstractC6392a> g();

        SnapshotStateList<UnavailableItem> h();

        androidx.compose.runtime.z1<String> i();

        SnapshotStateList<SchoolItem> j();

        androidx.compose.runtime.z1<Boolean> k();

        androidx.compose.runtime.z1<c> l();

        Function1<a, Unit> m();

        SnapshotStateList<ProductListDecorator> n();

        SnapshotStateList<f> o();

        androidx.compose.runtime.z1<SchoolCard> p();

        androidx.compose.runtime.z1<Boolean> q();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f118467a = new e("OUT_OF_SEASON", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f118468b = new e("LANDING_PAGE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f118469c = new e("EMPTY_STATE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f118470d = new e("ERROR_STATE", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final e f118471e = new e("SCHOOLS", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final e f118472f = new e("CLASSES", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final e f118473g = new e("SUPPLIES", 6);

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ e[] f118474h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f118475i;

        private static final /* synthetic */ e[] a() {
            return new e[]{f118467a, f118468b, f118469c, f118470d, f118471e, f118472f, f118473g};
        }

        static {
            e[] eVarArrA = a();
            f118474h = eVarArrA;
            f118475i = EnumEntriesKt.a(eVarArrA);
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f118474h.clone();
        }

        private e(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "", "i", "a", "b", "c", "d", "e", "h", "g", "f", "j", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$a;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$b;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$c;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$d;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$e;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$f;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$g;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$h;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$i;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$j;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$a;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "", "bodyLabel", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$a, reason: from toString */
        public static final /* data */ class AddAllToCartFailure implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int bodyLabel;

            public AddAllToCartFailure() {
                this(0, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddAllToCartFailure) && this.bodyLabel == ((AddAllToCartFailure) other).bodyLabel;
            }

            public int hashCode() {
                return Integer.hashCode(this.bodyLabel);
            }

            public String toString() {
                return "AddAllToCartFailure(bodyLabel=" + this.bodyLabel + ')';
            }

            public AddAllToCartFailure(int i10) {
                this.bodyLabel = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getBodyLabel() {
                return this.bodyLabel;
            }

            public /* synthetic */ AddAllToCartFailure(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? C12947d.f118263b : i10);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$b;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "", "bodyLabel", "actual", "expected", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$b, reason: from toString */
        public static final /* data */ class AddAllToCartPartialSuccess implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int bodyLabel;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actual;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int expected;

            public AddAllToCartPartialSuccess(int i10, int i11, int i12) {
                this.bodyLabel = i10;
                this.actual = i11;
                this.expected = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddAllToCartPartialSuccess)) {
                    return false;
                }
                AddAllToCartPartialSuccess addAllToCartPartialSuccess = (AddAllToCartPartialSuccess) other;
                return this.bodyLabel == addAllToCartPartialSuccess.bodyLabel && this.actual == addAllToCartPartialSuccess.actual && this.expected == addAllToCartPartialSuccess.expected;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.bodyLabel) * 31) + Integer.hashCode(this.actual)) * 31) + Integer.hashCode(this.expected);
            }

            public String toString() {
                return "AddAllToCartPartialSuccess(bodyLabel=" + this.bodyLabel + ", actual=" + this.actual + ", expected=" + this.expected + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getActual() {
                return this.actual;
            }

            /* renamed from: b, reason: from getter */
            public final int getBodyLabel() {
                return this.bodyLabel;
            }

            /* renamed from: c, reason: from getter */
            public final int getExpected() {
                return this.expected;
            }

            public /* synthetic */ AddAllToCartPartialSuccess(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? C12947d.f118264c : i10, i11, i12);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$c;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "Lbk/a;", "bodyLabel", "actionLabel", "<init>", "(Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$c, reason: from toString */
        public static final /* data */ class AddAllToCartSuccess implements f {

            /* renamed from: c, reason: collision with root package name */
            public static final int f118480c = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a bodyLabel;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a actionLabel;

            /* JADX WARN: Multi-variable type inference failed */
            public AddAllToCartSuccess() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddAllToCartSuccess)) {
                    return false;
                }
                AddAllToCartSuccess addAllToCartSuccess = (AddAllToCartSuccess) other;
                return Intrinsics.e(this.bodyLabel, addAllToCartSuccess.bodyLabel) && Intrinsics.e(this.actionLabel, addAllToCartSuccess.actionLabel);
            }

            public int hashCode() {
                return (this.bodyLabel.hashCode() * 31) + this.actionLabel.hashCode();
            }

            public String toString() {
                return "AddAllToCartSuccess(bodyLabel=" + this.bodyLabel + ", actionLabel=" + this.actionLabel + ')';
            }

            public AddAllToCartSuccess(AbstractC6392a bodyLabel, AbstractC6392a actionLabel) {
                Intrinsics.j(bodyLabel, "bodyLabel");
                Intrinsics.j(actionLabel, "actionLabel");
                this.bodyLabel = bodyLabel;
                this.actionLabel = actionLabel;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getActionLabel() {
                return this.actionLabel;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC6392a getBodyLabel() {
                return this.bodyLabel;
            }

            public /* synthetic */ AddAllToCartSuccess(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? AbstractC6392a.INSTANCE.d(C12947d.f118265d, new Object[0]) : abstractC6392a, (i10 & 2) != 0 ? AbstractC6392a.INSTANCE.d(C12947d.f118266e, new Object[0]) : abstractC6392a2);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$f;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "LPk/a;", "coupon", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoToCouponDetailsScreen implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToCouponDetailsScreen) && Intrinsics.e(this.coupon, ((GoToCouponDetailsScreen) other).coupon);
            }

            public int hashCode() {
                return this.coupon.hashCode();
            }

            public String toString() {
                return "GoToCouponDetailsScreen(coupon=" + this.coupon + ')';
            }

            public GoToCouponDetailsScreen(Coupon coupon) {
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
            }

            /* renamed from: a, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$g;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "", "substitutionMode", "schoolName", "classroomName", "LCo/h;", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCo/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "LCo/h;", "()LCo/h;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$g, reason: from toString */
        public static final /* data */ class GoToFindSubstitutionScreen implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String substitutionMode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String schoolName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String classroomName;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GoToFindSubstitutionScreen)) {
                    return false;
                }
                GoToFindSubstitutionScreen goToFindSubstitutionScreen = (GoToFindSubstitutionScreen) other;
                return Intrinsics.e(this.substitutionMode, goToFindSubstitutionScreen.substitutionMode) && Intrinsics.e(this.schoolName, goToFindSubstitutionScreen.schoolName) && Intrinsics.e(this.classroomName, goToFindSubstitutionScreen.classroomName) && Intrinsics.e(this.product, goToFindSubstitutionScreen.product);
            }

            public int hashCode() {
                return (((((this.substitutionMode.hashCode() * 31) + this.schoolName.hashCode()) * 31) + this.classroomName.hashCode()) * 31) + this.product.hashCode();
            }

            public String toString() {
                return "GoToFindSubstitutionScreen(substitutionMode=" + this.substitutionMode + ", schoolName=" + this.schoolName + ", classroomName=" + this.classroomName + ", product=" + this.product + ')';
            }

            public GoToFindSubstitutionScreen(String substitutionMode, String schoolName, String classroomName, ProductFullDetails product) {
                Intrinsics.j(substitutionMode, "substitutionMode");
                Intrinsics.j(schoolName, "schoolName");
                Intrinsics.j(classroomName, "classroomName");
                Intrinsics.j(product, "product");
                this.substitutionMode = substitutionMode;
                this.schoolName = schoolName;
                this.classroomName = classroomName;
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final String getClassroomName() {
                return this.classroomName;
            }

            /* renamed from: b, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            /* renamed from: c, reason: from getter */
            public final String getSchoolName() {
                return this.schoolName;
            }

            /* renamed from: d, reason: from getter */
            public final String getSubstitutionMode() {
                return this.substitutionMode;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$h;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$h, reason: from toString */
        public static final /* data */ class GoToPDP implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToPDP) && Intrinsics.e(this.product, ((GoToPDP) other).product);
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "GoToPDP(product=" + this.product + ')';
            }

            public GoToPDP(ProductFullDetails product) {
                Intrinsics.j(product, "product");
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$j;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f$j, reason: from toString */
        public static final /* data */ class ShopBackToSchool implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String deeplink;

            /* JADX WARN: Multi-variable type inference failed */
            public ShopBackToSchool() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShopBackToSchool) && Intrinsics.e(this.deeplink, ((ShopBackToSchool) other).deeplink);
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            public String toString() {
                return "ShopBackToSchool(deeplink=" + this.deeplink + ')';
            }

            public ShopBackToSchool(String deeplink) {
                Intrinsics.j(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            /* renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public /* synthetic */ ShopBackToSchool(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "meijerapp://products/collections?collectionId=back-to-school" : str);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$d;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d implements f {

            /* renamed from: a, reason: collision with root package name */
            public static final d f118483a = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 429726196;
            }

            public String toString() {
                return "FinishActivity";
            }

            private d() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$e;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e implements f {

            /* renamed from: a, reason: collision with root package name */
            public static final e f118484a = new e();

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1728619839;
            }

            public String toString() {
                return "GoToCartScreen";
            }

            private e() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$i;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i implements f {

            /* renamed from: a, reason: collision with root package name */
            public static final i f118491a = new i();

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 970783658;
            }

            public String toString() {
                return "NavigateBack";
            }

            private i() {
            }
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b'\b\u0001\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0004\b&\u0010'R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b0\u0010>R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010>R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\bC\u0010+R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bD\u0010>R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\b8\u0010>R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b.\u0010GR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\b?\u0010GR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\bB\u0010J¨\u0006K"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$g;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$d;", "Landroidx/compose/runtime/l0;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$e;", "stage", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$c;", "filterMode", "", "isLoading", "isAddingToCart", "", "selectedIndex", "showBackButton", "Lbk/a;", "headerTitle", "", "searchText", "cartCount", "LM0/m;", "LAs/e;", "schoolItems", "LAs/a;", "classItems", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "eventsInMotion", "LAs/d;", "schoolCard", "Lvs/f;", "availableProducts", "LAs/t;", "unavailableItems", "Landroidx/compose/runtime/z1;", "isSponsoredProductBuyAgainEnabled", "shouldEnableRatings", "Lkotlin/Function1;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$a;", "", "onAction", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;LM0/m;LM0/m;LM0/m;Landroidx/compose/runtime/l0;LM0/m;LM0/m;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;Lkotlin/jvm/functions/Function1;)V", "a", "Landroidx/compose/runtime/l0;", "y", "()Landroidx/compose/runtime/l0;", "b", "s", "c", "A", "d", "z", "e", "w", "f", "x", "g", "t", "h", "v", "i", "r", "j", "LM0/m;", "()LM0/m;", "k", "l", "o", "m", "u", "n", "p", "Landroidx/compose/runtime/z1;", "()Landroidx/compose/runtime/z1;", "q", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<e> stage;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<c> filterMode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isLoading;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isAddingToCart;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Integer> selectedIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> showBackButton;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<AbstractC6392a> headerTitle;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<String> searchText;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Integer> cartCount;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<SchoolItem> schoolItems;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<ClassItem> classItems;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<f> eventsInMotion;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<SchoolCard> schoolCard;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<ProductListDecorator> availableProducts;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<UnavailableItem> unavailableItems;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Boolean> isSponsoredProductBuyAgainEnabled;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.runtime.z1<Boolean> shouldEnableRatings;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final Function1<a, Unit> onAction;

        /* JADX WARN: Multi-variable type inference failed */
        public g(InterfaceC5872l0<e> stage, InterfaceC5872l0<c> filterMode, InterfaceC5872l0<Boolean> isLoading, InterfaceC5872l0<Boolean> isAddingToCart, InterfaceC5872l0<Integer> selectedIndex, InterfaceC5872l0<Boolean> showBackButton, InterfaceC5872l0<AbstractC6392a> headerTitle, InterfaceC5872l0<String> searchText, InterfaceC5872l0<Integer> cartCount, SnapshotStateList<SchoolItem> schoolItems, SnapshotStateList<ClassItem> classItems, SnapshotStateList<f> eventsInMotion, InterfaceC5872l0<SchoolCard> schoolCard, SnapshotStateList<ProductListDecorator> availableProducts, SnapshotStateList<UnavailableItem> unavailableItems, androidx.compose.runtime.z1<Boolean> isSponsoredProductBuyAgainEnabled, androidx.compose.runtime.z1<Boolean> shouldEnableRatings, Function1<? super a, Unit> onAction) {
            Intrinsics.j(stage, "stage");
            Intrinsics.j(filterMode, "filterMode");
            Intrinsics.j(isLoading, "isLoading");
            Intrinsics.j(isAddingToCart, "isAddingToCart");
            Intrinsics.j(selectedIndex, "selectedIndex");
            Intrinsics.j(showBackButton, "showBackButton");
            Intrinsics.j(headerTitle, "headerTitle");
            Intrinsics.j(searchText, "searchText");
            Intrinsics.j(cartCount, "cartCount");
            Intrinsics.j(schoolItems, "schoolItems");
            Intrinsics.j(classItems, "classItems");
            Intrinsics.j(eventsInMotion, "eventsInMotion");
            Intrinsics.j(schoolCard, "schoolCard");
            Intrinsics.j(availableProducts, "availableProducts");
            Intrinsics.j(unavailableItems, "unavailableItems");
            Intrinsics.j(isSponsoredProductBuyAgainEnabled, "isSponsoredProductBuyAgainEnabled");
            Intrinsics.j(shouldEnableRatings, "shouldEnableRatings");
            Intrinsics.j(onAction, "onAction");
            this.stage = stage;
            this.filterMode = filterMode;
            this.isLoading = isLoading;
            this.isAddingToCart = isAddingToCart;
            this.selectedIndex = selectedIndex;
            this.showBackButton = showBackButton;
            this.headerTitle = headerTitle;
            this.searchText = searchText;
            this.cartCount = cartCount;
            this.schoolItems = schoolItems;
            this.classItems = classItems;
            this.eventsInMotion = eventsInMotion;
            this.schoolCard = schoolCard;
            this.availableProducts = availableProducts;
            this.unavailableItems = unavailableItems;
            this.isSponsoredProductBuyAgainEnabled = isSponsoredProductBuyAgainEnabled;
            this.shouldEnableRatings = shouldEnableRatings;
            this.onAction = onAction;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> a() {
            return this.isLoading;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public androidx.compose.runtime.z1<Boolean> c() {
            return this.isSponsoredProductBuyAgainEnabled;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public SnapshotStateList<ClassItem> d() {
            return this.classItems;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public SnapshotStateList<UnavailableItem> h() {
            return this.unavailableItems;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public SnapshotStateList<SchoolItem> j() {
            return this.schoolItems;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public androidx.compose.runtime.z1<Boolean> k() {
            return this.shouldEnableRatings;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public Function1<a, Unit> m() {
            return this.onAction;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public SnapshotStateList<ProductListDecorator> n() {
            return this.availableProducts;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        public SnapshotStateList<f> o() {
            return this.eventsInMotion;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Integer> f() {
            return this.cartCount;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<c> l() {
            return this.filterMode;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<AbstractC6392a> g() {
            return this.headerTitle;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<SchoolCard> p() {
            return this.schoolCard;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<String> i() {
            return this.searchText;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Integer> b() {
            return this.selectedIndex;
        }

        public InterfaceC5872l0<Boolean> x() {
            return this.showBackButton;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<e> e() {
            return this.stage;
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.v1.d
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> q() {
            return this.isAddingToCart;
        }

        public /* synthetic */ g(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04, InterfaceC5872l0 interfaceC5872l05, InterfaceC5872l0 interfaceC5872l06, InterfaceC5872l0 interfaceC5872l07, InterfaceC5872l0 interfaceC5872l08, InterfaceC5872l0 interfaceC5872l09, SnapshotStateList snapshotStateList, SnapshotStateList snapshotStateList2, SnapshotStateList snapshotStateList3, InterfaceC5872l0 interfaceC5872l010, SnapshotStateList snapshotStateList4, SnapshotStateList snapshotStateList5, androidx.compose.runtime.z1 z1Var, androidx.compose.runtime.z1 z1Var2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? androidx.compose.runtime.t1.e(e.f118468b, null, 2, null) : interfaceC5872l0, (i10 & 2) != 0 ? androidx.compose.runtime.t1.e(c.f118462a, null, 2, null) : interfaceC5872l02, (i10 & 4) != 0 ? androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null) : interfaceC5872l03, (i10 & 8) != 0 ? androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null) : interfaceC5872l04, (i10 & 16) != 0 ? C5844c1.a(0) : interfaceC5872l05, (i10 & 32) != 0 ? androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null) : interfaceC5872l06, (i10 & 64) != 0 ? androidx.compose.runtime.t1.e(AbstractC6392a.INSTANCE.d(C12947d.f118273l, new Object[0]), null, 2, null) : interfaceC5872l07, (i10 & 128) != 0 ? androidx.compose.runtime.t1.e("", null, 2, null) : interfaceC5872l08, (i10 & 256) != 0 ? androidx.compose.runtime.t1.e(null, null, 2, null) : interfaceC5872l09, (i10 & 512) != 0 ? androidx.compose.runtime.o1.f() : snapshotStateList, (i10 & 1024) != 0 ? androidx.compose.runtime.o1.f() : snapshotStateList2, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? androidx.compose.runtime.o1.f() : snapshotStateList3, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? androidx.compose.runtime.t1.e(new SchoolCard(null, null, null, null, null, 31, null), null, 2, null) : interfaceC5872l010, (i10 & 8192) != 0 ? androidx.compose.runtime.o1.f() : snapshotStateList4, (i10 & 16384) != 0 ? androidx.compose.runtime.o1.f() : snapshotStateList5, (32768 & i10) != 0 ? androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null) : z1Var, (i10 & 65536) != 0 ? androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null) : z1Var2, function1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f118467a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f118468b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f118470d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f118469c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f118471e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.f118472f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.f118473g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsViewModel$addAllToCart$1", f = "TeacherListsViewModel.kt", l = {1321, 1341, 1344}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f118511a;

        /* renamed from: b, reason: collision with root package name */
        Object f118512b;

        /* renamed from: c, reason: collision with root package name */
        Object f118513c;

        /* renamed from: d, reason: collision with root package name */
        Object f118514d;

        /* renamed from: e, reason: collision with root package name */
        int f118515e;

        /* renamed from: f, reason: collision with root package name */
        int f118516f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f118517g;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = v1.this.new i(continuation);
            iVar.f118517g = obj;
            return iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Ref.DoubleRef doubleRef, v1 v1Var, List list, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("quantity", String.valueOf(doubleRef.f143738a));
            trackingData.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
            trackingData.h("classSelected", v1Var._viewState.p().getValue().getClassName());
            trackingData.e(Ao.W.j(list));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(v1 v1Var, Throwable th2, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
            trackingData.h("classSelected", v1Var._viewState.p().getValue().getClassName());
            trackingData.h("errorMessage", th2.getMessage());
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:140:0x03aa  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x046a  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0473  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x016f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x0028, B:49:0x0150, B:51:0x0166, B:135:0x0378, B:54:0x016f, B:55:0x0174, B:57:0x017a, B:58:0x018a, B:60:0x0190, B:64:0x01ab, B:66:0x01af, B:68:0x01b9, B:69:0x01c3, B:71:0x01c9, B:75:0x01e4, B:77:0x01e8, B:79:0x01f2, B:80:0x01f9, B:82:0x01ff, B:86:0x021a, B:88:0x021e, B:90:0x0228, B:91:0x0234, B:93:0x023a, B:98:0x0260, B:100:0x0264, B:102:0x026a, B:104:0x0270, B:107:0x0279, B:110:0x0282, B:112:0x0289, B:113:0x02a8, B:115:0x02ae, B:120:0x02d0, B:122:0x02d4, B:126:0x0360, B:128:0x0366, B:130:0x036a, B:15:0x0050, B:45:0x0135, B:18:0x0067, B:25:0x00a2, B:26:0x00bb, B:28:0x00c1, B:29:0x00d1, B:31:0x00d7, B:36:0x00f7, B:38:0x00fb, B:40:0x0102, B:41:0x0118, B:21:0x0078), top: B:159:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x017a A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x0028, B:49:0x0150, B:51:0x0166, B:135:0x0378, B:54:0x016f, B:55:0x0174, B:57:0x017a, B:58:0x018a, B:60:0x0190, B:64:0x01ab, B:66:0x01af, B:68:0x01b9, B:69:0x01c3, B:71:0x01c9, B:75:0x01e4, B:77:0x01e8, B:79:0x01f2, B:80:0x01f9, B:82:0x01ff, B:86:0x021a, B:88:0x021e, B:90:0x0228, B:91:0x0234, B:93:0x023a, B:98:0x0260, B:100:0x0264, B:102:0x026a, B:104:0x0270, B:107:0x0279, B:110:0x0282, B:112:0x0289, B:113:0x02a8, B:115:0x02ae, B:120:0x02d0, B:122:0x02d4, B:126:0x0360, B:128:0x0366, B:130:0x036a, B:15:0x0050, B:45:0x0135, B:18:0x0067, B:25:0x00a2, B:26:0x00bb, B:28:0x00c1, B:29:0x00d1, B:31:0x00d7, B:36:0x00f7, B:38:0x00fb, B:40:0x0102, B:41:0x0118, B:21:0x0078), top: B:159:0x000c }] */
        /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r15v22 */
        /* JADX WARN: Type inference failed for: r15v23 */
        /* JADX WARN: Type inference failed for: r15v24 */
        /* JADX WARN: Type inference failed for: r15v25 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r73) {
            /*
                Method dump skipped, instructions count: 1193
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.teacherlists.ux.v1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        j(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsViewModel$getClassesForSchool$1", f = "TeacherListsViewModel.kt", l = {1001}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f118519a;

        /* renamed from: b, reason: collision with root package name */
        int f118520b;

        /* renamed from: c, reason: collision with root package name */
        int f118521c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f118522d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SchoolItem f118524f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = v1.this.new k(this.f118524f, continuation);
            kVar.f118522d = obj;
            return kVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(SchoolItem schoolItem, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f118524f = schoolItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(SchoolItem schoolItem, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("schoolSelected", schoolItem.getName());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(SchoolItem schoolItem, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.o("Teacher's List:Select Your Class");
            trackingData.h("schoolSelected", schoolItem.getName());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(SchoolItem schoolItem, Throwable th2, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("schoolSelected", schoolItem.getName());
            trackingData.h("errorMessage", th2.getMessage());
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118521c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f118522d;
                    v1.this._viewState.a().setValue(Boxing.a(true));
                    v1.this._viewState.p().setValue(SchoolCard.b(v1.this._viewState.p().getValue(), null, this.f118524f.getName(), null, null, null, 29, null));
                    v1 v1Var = v1.this;
                    SchoolItem schoolItem = this.f118524f;
                    Result.Companion companion = Result.INSTANCE;
                    Lq.a aVar = v1Var.repository;
                    TeacherListsClassroomsRequest teacherListsClassroomsRequest = new TeacherListsClassroomsRequest(schoolItem.getId());
                    this.f118522d = interfaceC15783O;
                    this.f118519a = interfaceC15783O;
                    this.f118520b = 0;
                    this.f118521c = 1;
                    obj = aVar.b(teacherListsClassroomsRequest, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((List) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            v1 v1Var2 = v1.this;
            final SchoolItem schoolItem2 = this.f118524f;
            if (Result.h(objB)) {
                List list = (List) objB;
                List<Classroom> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                for (Classroom classroom : list2) {
                    arrayList.add(new ClassItem(classroom.getId(), classroom.getClassroomName(), classroom.getGradeLevels()));
                }
                v1Var2._viewState.d().clear();
                v1Var2._viewState.d().addAll(arrayList);
                v1Var2._viewState.g().setValue(AbstractC6392a.INSTANCE.d(C12947d.f118283v, new Object[0]));
                v1Var2._viewState.b().setValue(Boxing.d(1));
                v1Var2._viewState.a().setValue(Boxing.a(false));
                if (!list.isEmpty()) {
                    v1Var2._viewState.e().setValue(e.f118472f);
                    v1Var2.analyticsEngine.b(C14756c.h("Teacher's List:Select Your Class"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.z1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.k.l(schoolItem2, (TrackingData) obj2);
                        }
                    });
                } else {
                    v1Var2._viewState.e().setValue(e.f118469c);
                    v1Var2.analyticsEngine.b(C14756c.h("Teacher's List:Select Your Class:Empty State"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.A1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.k.o(schoolItem2, (TrackingData) obj2);
                        }
                    });
                }
            }
            v1 v1Var3 = v1.this;
            final SchoolItem schoolItem3 = this.f118524f;
            final Throwable thE = Result.e(objB);
            if (thE != null) {
                v1Var3._viewState.a().setValue(Boxing.a(false));
                v1Var3._viewState.e().setValue(e.f118470d);
                v1Var3.analyticsEngine.b(C14756c.h("Teacher's List:Error Page"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.B1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v1.k.p(schoolItem3, thE, (TrackingData) obj2);
                    }
                });
                qw.a.INSTANCE.z("TeacherLists").c(thE, "Failure getting list of classes.", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsViewModel$getSchoolsByZipCode$1", f = "TeacherListsViewModel.kt", l = {932}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f118525a;

        /* renamed from: b, reason: collision with root package name */
        Object f118526b;

        /* renamed from: c, reason: collision with root package name */
        int f118527c;

        /* renamed from: d, reason: collision with root package name */
        int f118528d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f118529e;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = v1.this.new l(continuation);
            lVar.f118529e = obj;
            return lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(v1 v1Var, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("zipUsed", v1Var._viewState.i().getValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(v1 v1Var, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("zipUsed", v1Var._viewState.i().getValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.o("Teacher's List:Find Your School");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Throwable th2, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("errorMessage", th2.getMessage());
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            int iIntValue;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118528d;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f118529e;
                    Integer numV = StringsKt.v(v1.this._viewState.i().getValue());
                    if (numV != null) {
                        iIntValue = numV.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    TeacherListsSchoolsRequest teacherListsSchoolsRequest = new TeacherListsSchoolsRequest(iIntValue);
                    v1.this._viewState.a().setValue(Boxing.a(true));
                    InterfaceC14523a interfaceC14523a = v1.this.analyticsEngine;
                    AbstractC14761h.Action actionA = C14756c.a("Search School");
                    final v1 v1Var = v1.this;
                    interfaceC14523a.b(actionA, new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.C1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.l.o(v1Var, (TrackingData) obj2);
                        }
                    });
                    v1 v1Var2 = v1.this;
                    Result.Companion companion = Result.INSTANCE;
                    Lq.a aVar = v1Var2.repository;
                    this.f118529e = interfaceC15783O;
                    this.f118525a = teacherListsSchoolsRequest;
                    this.f118526b = interfaceC15783O;
                    this.f118527c = 0;
                    this.f118528d = 1;
                    obj = aVar.c(teacherListsSchoolsRequest, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((List) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            final v1 v1Var3 = v1.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                List<School> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                for (School school : list2) {
                    arrayList.add(new SchoolItem(school.getId(), school.getSchoolName(), school.getAddress(), school.getCity(), school.getState(), school.getZip()));
                }
                v1Var3._viewState.j().clear();
                v1Var3._viewState.j().addAll(arrayList);
                v1Var3._viewState.g().setValue(AbstractC6392a.INSTANCE.d(C12947d.f118273l, new Object[0]));
                v1Var3._viewState.b().setValue(Boxing.d(0));
                v1Var3._viewState.x().setValue(Boxing.a(true));
                v1Var3._viewState.a().setValue(Boxing.a(false));
                if (!list.isEmpty()) {
                    v1Var3._viewState.e().setValue(e.f118471e);
                    v1Var3.analyticsEngine.b(C14756c.h("Teacher's List:Find Your School"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.D1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.l.p(v1Var3, (TrackingData) obj2);
                        }
                    });
                } else {
                    v1Var3._viewState.e().setValue(e.f118469c);
                    v1Var3.analyticsEngine.b(C14756c.h("Teacher's List:Find Your School:Empty State"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.E1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.l.q((TrackingData) obj2);
                        }
                    });
                }
            }
            v1 v1Var4 = v1.this;
            final Throwable thE = Result.e(objB);
            if (thE != null) {
                v1Var4._viewState.a().setValue(Boxing.a(false));
                v1Var4._viewState.e().setValue(e.f118470d);
                v1Var4.analyticsEngine.b(C14756c.h("Teacher's List:Error Page"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.F1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v1.l.r(thE, (TrackingData) obj2);
                    }
                });
                qw.a.INSTANCE.z("TeacherLists").c(thE, "Failure getting list of schools.", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsViewModel$getSuppliesForClassroom$1", f = "TeacherListsViewModel.kt", l = {1064}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f118531a;

        /* renamed from: b, reason: collision with root package name */
        int f118532b;

        /* renamed from: c, reason: collision with root package name */
        int f118533c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f118534d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ClassItem f118536f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = v1.this.new m(this.f118536f, continuation);
            mVar.f118534d = obj;
            return mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ClassItem classItem, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f118536f = classItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(v1 v1Var, Throwable th2, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
            trackingData.h("classSelected", v1Var._viewState.p().getValue().getClassName());
            trackingData.h("errorMessage", th2.getMessage());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence p(UnavailableItem unavailableItem) {
            return StringsKt.P(StringsKt.P(unavailableItem.getItemName(), '|', ' ', false, 4, null), ';', ' ', false, 4, null) + ';' + unavailableItem.getQuantityRequested();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Supplies supplies, List list, String str, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.h("schoolSelected", supplies.getSchoolName());
            trackingData.h("classSelected", supplies.getClassroomName());
            trackingData.e(Ao.W.j(list));
            trackingData.h("unavailableProducts", str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Supplies supplies, TrackingData trackingData) {
            trackingData.v("Teacher's List");
            trackingData.o("Teacher's List:Shop Your List");
            trackingData.h("schoolSelected", supplies.getSchoolName());
            trackingData.h("classSelected", supplies.getClassroomName());
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            W.Details detailsH;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118533c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f118534d;
                    v1.this._viewState.a().setValue(Boxing.a(true));
                    v1.this._viewState.p().setValue(SchoolCard.b(v1.this._viewState.p().getValue(), this.f118536f.getClassroomName(), null, null, null, null, 30, null));
                    v1 v1Var = v1.this;
                    ClassItem classItem = this.f118536f;
                    Result.Companion companion = Result.INSTANCE;
                    Lq.a aVar = v1Var.repository;
                    TeacherListsSuppliesRequest teacherListsSuppliesRequest = new TeacherListsSuppliesRequest(classItem.getId(), v1Var.storeProvider.g());
                    this.f118534d = interfaceC15783O;
                    this.f118531a = interfaceC15783O;
                    this.f118532b = 0;
                    this.f118533c = 1;
                    objA = aVar.a(teacherListsSuppliesRequest, this);
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objA = obj;
                }
                objB = Result.b((Supplies) objA);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            v1 v1Var2 = v1.this;
            if (Result.h(objB)) {
                final Supplies supplies = (Supplies) objB;
                List<TLProduct> listA = supplies.a();
                ArrayList<ProductListDecorator> arrayList = new ArrayList(CollectionsKt.x(listA, 10));
                for (TLProduct tLProduct : listA) {
                    arrayList.add(ProductListDecorator.Companion.b(ProductListDecorator.INSTANCE, tLProduct.getProduct(), null, null, null, false, null, null, false, null, null, null, false, null, null, true, tLProduct.getQuantityRequested(), 16382, null));
                }
                v1Var2._viewState.n().clear();
                v1Var2._viewState.n().addAll(arrayList);
                C17115a c17115a = v1Var2.multiChannelProductsStateRepository;
                String str = v1Var2.teacherListRepoKey;
                List<TLProduct> listA2 = supplies.a();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA2, 10));
                Iterator<T> it = listA2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TLProduct) it.next()).getProduct());
                }
                c17115a.c(str, arrayList2);
                List<Kq.UnavailableItem> listF = supplies.f();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listF, 10));
                for (Kq.UnavailableItem unavailableItem : listF) {
                    arrayList3.add(new UnavailableItem(unavailableItem.getQuantity(), unavailableItem.getName()));
                }
                v1Var2._viewState.h().clear();
                v1Var2._viewState.h().addAll(arrayList3);
                OffsetDateTime offsetDateTime = (OffsetDateTime) wk.d.b(supplies.getUpdatedTimestamp(), C17898a.f167225a.s(), new kj.r());
                String str2 = offsetDateTime != null ? "Updated " + StringsKt.C0(String.valueOf(offsetDateTime.getMonthValue()), 2, '0') + '/' + StringsKt.C0(String.valueOf(offsetDateTime.getDayOfMonth()), 2, '0') + '/' + offsetDateTime.getYear() : null;
                InterfaceC5872l0<SchoolCard> interfaceC5872l0P = v1Var2._viewState.p();
                String classroomName = supplies.getClassroomName();
                String schoolName = supplies.getSchoolName();
                String str3 = "School Year " + supplies.getSchoolYear();
                String gradeLevel = supplies.getGradeLevel();
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC5872l0P.setValue(new SchoolCard(classroomName, schoolName, str3, gradeLevel, str2));
                v1Var2._viewState.g().setValue(AbstractC6392a.INSTANCE.d(C12947d.f118284w, new Object[0]));
                v1Var2._viewState.b().setValue(Boxing.d(2));
                v1Var2._viewState.a().setValue(Boxing.a(false));
                if (supplies.a().isEmpty()) {
                    v1Var2._viewState.e().setValue(e.f118469c);
                    v1Var2.analyticsEngine.b(C14756c.h("Teacher's List:Shop Your List:Empty State"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.I1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.m.r(supplies, (TrackingData) obj2);
                        }
                    });
                } else {
                    v1Var2._viewState.e().setValue(e.f118473g);
                    boolean z10 = !arrayList3.isEmpty();
                    final ArrayList arrayList4 = new ArrayList(CollectionsKt.x(arrayList, 10));
                    for (ProductListDecorator productListDecorator : arrayList) {
                        if (productListDecorator.getIsOutOfStock()) {
                            W.Details detailsD = W.Details.Companion.d(W.Details.INSTANCE, productListDecorator.getProduct(), null, 2, null);
                            detailsH = detailsD.h(((-65626) & 1) != 0 ? detailsD.upc : productListDecorator.getProduct().getCode(), ((-65626) & 2) != 0 ? detailsD.productSubstitutedUpc : null, ((-65626) & 4) != 0 ? detailsD.backupProductUpc : null, ((-65626) & 8) != 0 ? detailsD.quantity : null, ((-65626) & 16) != 0 ? detailsD.price : null, ((-65626) & 32) != 0 ? detailsD.sumTotal : null, ((-65626) & 64) != 0 ? detailsD.department : null, ((-65626) & 128) != 0 ? detailsD.isAlcohol : null, ((-65626) & 256) != 0 ? detailsD.isSuccess : null, ((-65626) & 512) != 0 ? detailsD.isBuyAgain : null, ((-65626) & 1024) != 0 ? detailsD.isOutOfStock : null, ((-65626) & RecyclerView.m.FLAG_MOVED) != 0 ? detailsD.isBackup : null, ((-65626) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsD.itemSelectedFromRecommendation : null, ((-65626) & 8192) != 0 ? detailsD.isLowStock : null, ((-65626) & 16384) != 0 ? detailsD.doNotSubstitute : null, ((-65626) & 32768) != 0 ? detailsD.providedByRecommendations : null, ((-65626) & 65536) != 0 ? detailsD.pageType : null, ((-65626) & 131072) != 0 ? detailsD.isOutOfStockItemRemoved : null, ((-65626) & 262144) != 0 ? detailsD.discountDetails : null, ((-65626) & 524288) != 0 ? detailsD.isSubstitution : null, ((-65626) & 1048576) != 0 ? detailsD.isSubstitutionComplete : null, ((-65626) & 2097152) != 0 ? detailsD.isSubstitutionFindSimilar : null, ((-65626) & 4194304) != 0 ? detailsD.addingFindSimilarSubToCart : null, ((-65626) & 8388608) != 0 ? detailsD.isBopasPlacedOrder : null, ((-65626) & 16777216) != 0 ? detailsD.isBopasEligibleCart : null, ((-65626) & 33554432) != 0 ? detailsD.isSponsoredCriteo : null, ((-65626) & 67108864) != 0 ? detailsD.isAddedFromPlp : null, ((-65626) & 134217728) != 0 ? detailsD.isTrackCartRemoval : null, ((-65626) & 268435456) != 0 ? detailsD.coupons : null, ((-65626) & 536870912) != 0 ? detailsD.isCouponApplied : null, ((-65626) & 1073741824) != 0 ? detailsD.complexPromo : null, ((-65626) & Integer.MIN_VALUE) != 0 ? detailsD.isLowStockItemAdded : null, (16383 & 1) != 0 ? detailsD.isLowStockItemRemoved : null, (16383 & 2) != 0 ? detailsD.sponsorship : null, (16383 & 4) != 0 ? detailsD.isCarouselSponsoredAdded : null, (16383 & 8) != 0 ? detailsD.isCarouselSponsored : null, (16383 & 16) != 0 ? detailsD.isPreOrderEBTOrder : null, (16383 & 32) != 0 ? detailsD.isPostOrderEBTOrder : null, (16383 & 64) != 0 ? detailsD.orderEbtEligibleTotal : null, (16383 & 128) != 0 ? detailsD.ebtCapturedAmount : null, (16383 & 256) != 0 ? detailsD.isEZCDOrder : null, (16383 & 512) != 0 ? detailsD.qtyRequestedAvailableItemTL : null, (16383 & 1024) != 0 ? detailsD.returnedUnavailableItems : Boxing.a(z10), (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? detailsD.qtyRequestedOOSItemTL : Boxing.d(productListDecorator.getQuantityRequested()), (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsD.qtyAddedFromAddAllButtonTL : null, (16383 & 8192) != 0 ? detailsD.variantsInteracted : null);
                        } else {
                            W.Details detailsD2 = W.Details.Companion.d(W.Details.INSTANCE, productListDecorator.getProduct(), null, 2, null);
                            detailsH = detailsD2.h(((-65626) & 1) != 0 ? detailsD2.upc : productListDecorator.getProduct().getCode(), ((-65626) & 2) != 0 ? detailsD2.productSubstitutedUpc : null, ((-65626) & 4) != 0 ? detailsD2.backupProductUpc : null, ((-65626) & 8) != 0 ? detailsD2.quantity : null, ((-65626) & 16) != 0 ? detailsD2.price : null, ((-65626) & 32) != 0 ? detailsD2.sumTotal : null, ((-65626) & 64) != 0 ? detailsD2.department : null, ((-65626) & 128) != 0 ? detailsD2.isAlcohol : null, ((-65626) & 256) != 0 ? detailsD2.isSuccess : null, ((-65626) & 512) != 0 ? detailsD2.isBuyAgain : null, ((-65626) & 1024) != 0 ? detailsD2.isOutOfStock : null, ((-65626) & RecyclerView.m.FLAG_MOVED) != 0 ? detailsD2.isBackup : null, ((-65626) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsD2.itemSelectedFromRecommendation : null, ((-65626) & 8192) != 0 ? detailsD2.isLowStock : null, ((-65626) & 16384) != 0 ? detailsD2.doNotSubstitute : null, ((-65626) & 32768) != 0 ? detailsD2.providedByRecommendations : null, ((-65626) & 65536) != 0 ? detailsD2.pageType : null, ((-65626) & 131072) != 0 ? detailsD2.isOutOfStockItemRemoved : null, ((-65626) & 262144) != 0 ? detailsD2.discountDetails : null, ((-65626) & 524288) != 0 ? detailsD2.isSubstitution : null, ((-65626) & 1048576) != 0 ? detailsD2.isSubstitutionComplete : null, ((-65626) & 2097152) != 0 ? detailsD2.isSubstitutionFindSimilar : null, ((-65626) & 4194304) != 0 ? detailsD2.addingFindSimilarSubToCart : null, ((-65626) & 8388608) != 0 ? detailsD2.isBopasPlacedOrder : null, ((-65626) & 16777216) != 0 ? detailsD2.isBopasEligibleCart : null, ((-65626) & 33554432) != 0 ? detailsD2.isSponsoredCriteo : null, ((-65626) & 67108864) != 0 ? detailsD2.isAddedFromPlp : null, ((-65626) & 134217728) != 0 ? detailsD2.isTrackCartRemoval : null, ((-65626) & 268435456) != 0 ? detailsD2.coupons : null, ((-65626) & 536870912) != 0 ? detailsD2.isCouponApplied : null, ((-65626) & 1073741824) != 0 ? detailsD2.complexPromo : null, ((-65626) & Integer.MIN_VALUE) != 0 ? detailsD2.isLowStockItemAdded : null, (16383 & 1) != 0 ? detailsD2.isLowStockItemRemoved : null, (16383 & 2) != 0 ? detailsD2.sponsorship : null, (16383 & 4) != 0 ? detailsD2.isCarouselSponsoredAdded : null, (16383 & 8) != 0 ? detailsD2.isCarouselSponsored : null, (16383 & 16) != 0 ? detailsD2.isPreOrderEBTOrder : null, (16383 & 32) != 0 ? detailsD2.isPostOrderEBTOrder : null, (16383 & 64) != 0 ? detailsD2.orderEbtEligibleTotal : null, (16383 & 128) != 0 ? detailsD2.ebtCapturedAmount : null, (16383 & 256) != 0 ? detailsD2.isEZCDOrder : null, (16383 & 512) != 0 ? detailsD2.qtyRequestedAvailableItemTL : Boxing.d(productListDecorator.getQuantityRequested()), (16383 & 1024) != 0 ? detailsD2.returnedUnavailableItems : Boxing.a(z10), (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? detailsD2.qtyRequestedOOSItemTL : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsD2.qtyAddedFromAddAllButtonTL : null, (16383 & 8192) != 0 ? detailsD2.variantsInteracted : null);
                        }
                        arrayList4.add(detailsH);
                    }
                    final String strB0 = CollectionsKt.B0(arrayList3, "|", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.G1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.m.p((UnavailableItem) obj2);
                        }
                    }, 30, null);
                    v1Var2.analyticsEngine.b(C14756c.h("Teacher's List:Shop Your List"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.H1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v1.m.q(supplies, arrayList4, strB0, (TrackingData) obj2);
                        }
                    });
                }
            }
            final v1 v1Var3 = v1.this;
            final Throwable thE = Result.e(objB);
            if (thE != null) {
                v1Var3._viewState.a().setValue(Boxing.a(false));
                v1Var3._viewState.e().setValue(e.f118470d);
                v1Var3.analyticsEngine.b(C14756c.h("Teacher's List:Error Page"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.J1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return v1.m.o(v1Var3, thE, (TrackingData) obj2);
                    }
                });
                qw.a.INSTANCE.z("TeacherLists").c(thE, "Failure getting list of products", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsViewModel$onCreate$6$1", f = "TeacherListsViewModel.kt", l = {637}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ sp.Y f118538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1 f118539c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new n(this.f118538b, this.f118539c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(sp.Y y10, v1 v1Var, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f118538b = y10;
            this.f118539c = v1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118537a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Dk.a.a(this.f118538b.q0(), this.f118539c.disposables);
                if (this.f118539c.featureManager.e(AbstractC18503f.C18509g.f172878h)) {
                    sp.Y y10 = this.f118538b;
                    this.f118537a = 1;
                    obj = y10.F0(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
            Dk.a.a((Ju.b) obj, this.f118539c.disposables);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        o(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class p extends ObservableProperty<EntryInQtyStepperInteraction> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1 f118540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, v1 v1Var) {
            super(obj);
            this.f118540b = v1Var;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, EntryInQtyStepperInteraction oldValue, EntryInQtyStepperInteraction newValue) {
            Intrinsics.j(property, "property");
            this.f118540b.V0();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class q extends ObservableProperty<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v1 f118541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, v1 v1Var) {
            super(obj);
            this.f118541b = v1Var;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
            Intrinsics.j(property, "property");
            this.f118541b.V0();
        }
    }

    public v1(Lq.a repository, Tq.j storeProvider, il.m cartRepository, wr.f cartInteractor, zl.k featureManager, C17115a multiChannelProductsStateRepository, pp.d productMetadataStore, C13702d couponsRepository, yo.k userManager, InterfaceC14523a analyticsEngine) {
        e eVar;
        Intrinsics.j(repository, "repository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.repository = repository;
        this.storeProvider = storeProvider;
        this.cartRepository = cartRepository;
        this.cartInteractor = cartInteractor;
        this.featureManager = featureManager;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.productMetadataStore = productMetadataStore;
        this.couponsRepository = couponsRepository;
        this.userManager = userManager;
        this.analyticsEngine = analyticsEngine;
        this.disposables = new Ju.a();
        this.teacherListRepoKey = "Teacher_List_Repo_Key";
        this.cartInteractorListener = new b();
        Delegates delegates = Delegates.f143781a;
        this.productInQtyStepperInteraction = new p(null, this);
        this.resetStepperState = new q(null, this);
        if (featureManager.e(AbstractC18503f.p0.f172895h)) {
            eVar = e.f118468b;
        } else {
            analyticsEngine.b(C14756c.h("Teacher's List:Shop Your List:Out Of Season"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.C0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v1.O((TrackingData) obj);
                }
            });
            eVar = e.f118467a;
        }
        g gVar = new g(androidx.compose.runtime.t1.e(eVar, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, androidx.compose.runtime.t1.e(Boolean.valueOf(featureManager.e(AbstractC18503f.k0.f172887h)), null, 2, null), androidx.compose.runtime.t1.e(Boolean.valueOf(featureManager.e(AbstractC18503f.C18509g.f172878h)), null, 2, null), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.D0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.P(this.f118124a, (v1.a) obj);
            }
        }, 32766, null);
        this._viewState = gVar;
        this.viewState = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(v1 v1Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
        track.h("classSelected", v1Var._viewState.p().getValue().getClassName());
        return Unit.f143329a;
    }

    private final void B0() {
        switch (h.$EnumSwitchMapping$0[this._viewState.e().getValue().ordinal()]) {
            case 1:
            case 2:
                this._viewState.o().add(f.i.f118491a);
                return;
            case 3:
            case 4:
                X0();
                return;
            case 5:
                this._viewState.e().setValue(e.f118468b);
                this._viewState.x().setValue(Boolean.FALSE);
                return;
            case 6:
                this._viewState.e().setValue(e.f118471e);
                this._viewState.g().setValue(AbstractC6392a.INSTANCE.d(C12947d.f118273l, new Object[0]));
                this._viewState.b().setValue(0);
                return;
            case 7:
                this._viewState.e().setValue(e.f118472f);
                this._viewState.g().setValue(AbstractC6392a.INSTANCE.d(C12947d.f118283v, new Object[0]));
                this._viewState.b().setValue(1);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void C0() {
        this._viewState.o().add(f.d.f118483a);
    }

    private final void E0() {
        this._viewState.o().add(f.d.f118483a);
        this.analyticsEngine.b(C14756c.a("Continue Shopping"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.J0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.F0(this.f118148a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(v1 v1Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
        track.h("classSelected", v1Var._viewState.p().getValue().getClassName());
        track.h("zipUsed", v1Var._viewState.i().getValue());
        return Unit.f143329a;
    }

    private final void G0(a action) {
        if (action instanceof C12943b1) {
            B0();
            return;
        }
        if (action instanceof C12955f1) {
            C0();
            return;
        }
        if (action instanceof C12958g1) {
            E0();
            return;
        }
        if (action instanceof ChangeFilter) {
            e0(((ChangeFilter) action).getFilterMode());
            return;
        }
        if (action instanceof ProductCardTapped) {
            W0(((ProductCardTapped) action).getProduct());
            return;
        }
        if (action instanceof FindSimilarTapped) {
            s0(((FindSimilarTapped) action).getProduct());
            return;
        }
        if (action instanceof UpdateSearchTerm) {
            g1(((UpdateSearchTerm) action).getNewTerm());
            return;
        }
        if (action instanceof C12970k1) {
            w0();
            return;
        }
        if (action instanceof GetClasses) {
            t0(((GetClasses) action).getSchoolItem());
            return;
        }
        if (action instanceof GetSupplies) {
            x0(((GetSupplies) action).getClassItem());
            return;
        }
        if (action instanceof n1) {
            a1();
            return;
        }
        if (action instanceof p1) {
            c1();
            return;
        }
        if (action instanceof ClipCouponAction) {
            k0((ClipCouponAction) action);
            return;
        }
        if (action instanceof CouponDetailsAction) {
            m0((CouponDetailsAction) action);
            return;
        }
        if (action instanceof o1) {
            c0();
            return;
        }
        if (action instanceof C12940a1) {
            b0();
            return;
        }
        if (action instanceof UpdateEntryAction) {
            f1((UpdateEntryAction) action);
            return;
        }
        if (action instanceof DisposeEvent) {
            n0((DisposeEvent) action);
            return;
        }
        if (action instanceof StepperStateChangedAction) {
            e1((StepperStateChangedAction) action);
        } else if (action instanceof r1) {
            z0(true);
        } else {
            if (!(action instanceof C12946c1)) {
                throw new NoWhenBranchMatchedException();
            }
            z0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error loading cart stream for TeacherLists", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(final v1 v1Var, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        C15809k.d(androidx.view.d0.a(v1Var), null, null, new n(repo, v1Var, null), 3, null);
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.K0(this.f118240a, key, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.A0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.L0(function1, obj);
            }
        };
        final o oVar = new o(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.B0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.M0(oVar, obj);
            }
        }), v1Var.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        if (str != null) {
            track.h("cmpid", str);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.o("Teacher's List:Find Your School");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0() {
        qw.a.INSTANCE.a("TeacherLists is no longer observing cart state.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(v1 v1Var, a it) {
        Intrinsics.j(it, "it");
        v1Var.G0(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(Ju.b bVar) {
        qw.a.INSTANCE.a("TeacherLists is now observing cart state.", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0() {
        SnapshotStateList<ProductListDecorator> snapshotStateListN = this._viewState.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(snapshotStateListN, 10));
        for (ProductListDecorator productListDecorator : snapshotStateListN) {
            String upc = productListDecorator.getUpc();
            EntryInQtyStepperInteraction entryInQtyStepperInteractionU0 = u0();
            arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : Intrinsics.e(upc, entryInQtyStepperInteractionU0 != null ? entryInQtyStepperInteractionU0.getResourceId() : null), ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : Intrinsics.e(v0(), productListDecorator.getUpc()), ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
        }
        this._viewState.n().clear();
        this._viewState.n().addAll(arrayList);
    }

    private final void W0(ProductFullDetails product) {
        this._viewState.o().add(new f.GoToPDP(product));
    }

    private final void X0() {
        g gVar = this._viewState;
        gVar.e().setValue(e.f118468b);
        gVar.l().setValue(c.f118462a);
        InterfaceC5872l0<Boolean> interfaceC5872l0A = gVar.a();
        Boolean bool = Boolean.FALSE;
        interfaceC5872l0A.setValue(bool);
        gVar.b().setValue(0);
        gVar.x().setValue(bool);
        gVar.i().setValue("");
        gVar.g().setValue(AbstractC6392a.INSTANCE.d(C12947d.f118273l, new Object[0]));
        gVar.j().clear();
        gVar.d().clear();
        gVar.o().clear();
        gVar.p().setValue(new SchoolCard(null, null, null, null, null, 31, null));
        gVar.n().clear();
        gVar.h().clear();
    }

    private final void Y0(EntryInQtyStepperInteraction entryInQtyStepperInteraction) {
        this.productInQtyStepperInteraction.setValue(this, f118442r[0], entryInQtyStepperInteraction);
    }

    private final void a1() {
        this.analyticsEngine.b(C14756c.a("Shop Another List"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.F0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.b1(this.f118127a, (TrackingData) obj);
            }
        });
        X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(v1 v1Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
        track.h("classSelected", v1Var._viewState.p().getValue().getClassName());
        track.h("zipUsed", v1Var._viewState.i().getValue());
        return Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c0() {
        this._viewState.o().add(new f.ShopBackToSchool(null, 1, 0 == true ? 1 : 0));
        this.analyticsEngine.b(C14756c.a("Shop Back To School"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.E0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.d0(this.f118126a, (TrackingData) obj);
            }
        });
    }

    private final void c1() {
        this.analyticsEngine.b(C14756c.a("Start over"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.G0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.d1(this.f118134a, (TrackingData) obj);
            }
        });
        X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(v1 v1Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
        track.h("classSelected", v1Var._viewState.p().getValue().getClassName());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(v1 v1Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.h("schoolSelected", v1Var._viewState.p().getValue().getSchoolName());
        track.h("classSelected", v1Var._viewState.p().getValue().getClassName());
        track.h("zipUsed", v1Var._viewState.i().getValue());
        return Unit.f143329a;
    }

    private final void e0(c cVar) {
        this._viewState.l().setValue(cVar);
    }

    private final void e1(StepperStateChangedAction action) {
        String strA = action.getProductCode();
        if (strA == null) {
            strA = "";
        }
        Y0(new EntryInQtyStepperInteraction(strA, action.getStepperHitRect(), false));
        Z0(null);
    }

    private final void f0(final Coupon coupon, final String couponLocation) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.O0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.g0(this.f118169a, coupon, couponLocation, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.P0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.h0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.i0((Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.R0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.j0(function12, obj);
            }
        }), this.disposables);
    }

    private final void f1(UpdateEntryAction action) {
        wr.f.M(this.cartInteractor, action.getProduct(), action.getQuantityToUpdate(), false, null, 12, null);
    }

    private final void g1(String str) {
        this._viewState.i().setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Failed to clip coupon", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        return Unit.f143329a;
    }

    private final void m0(CouponDetailsAction action) {
        this._viewState.o().add(new f.GoToCouponDetailsScreen(action.getCoupon()));
    }

    private final void n0(DisposeEvent event) {
        f next;
        Iterator<f> it = this._viewState.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next == event.getEvent()) {
                    break;
                }
            }
        }
        f fVar = next;
        if (fVar != null) {
            this._viewState.o().remove(fVar);
        }
    }

    private final void o0(Pk.c couponIdentity, final TrackingData trackingData) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).observeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.L0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.p0(this.f118155a, trackingData, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.M0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.q0(function1, obj);
            }
        };
        final j jVar = new j(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.N0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.r0(jVar, obj);
            }
        }), this.disposables);
    }

    private final void onProductsState(Object key, List<ProductState<ProductFullDetails>> productStates) {
        Object next;
        ProductListDecorator productListDecoratorU;
        if (Intrinsics.e(key, this.teacherListRepoKey)) {
            SnapshotStateList<ProductListDecorator> snapshotStateListN = this._viewState.n();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(snapshotStateListN, 10));
            for (ProductListDecorator productListDecorator : snapshotStateListN) {
                Iterator<T> it = productStates.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.e(((ProductState) next).getCode(), productListDecorator.getProduct().getCode())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ProductState c17116b = (ProductState) next;
                if (c17116b != null) {
                    CouponState couponState = (CouponState) CollectionsKt.u0(c17116b.d());
                    ProductListDecorator productListDecoratorB = ProductListDecorator.Companion.b(ProductListDecorator.INSTANCE, (ProductFullDetails) c17116b.g(), c17116b.getShoppingListItem(), null, c17116b.getCartEntry(), false, c17116b.getEligibility().i(), c17116b.getEligibility().k(), false, c17116b.getProductQuery(), couponState != null ? Qr.a.d(couponState) : null, couponState != null ? couponState.getCoupon() : null, this.productMetadataStore.c(((ProductFullDetails) c17116b.g()).getCode()), c17116b.getSponsorship(), c17116b.getProductRating(), false, 0, 49300, null);
                    if (productListDecoratorB != null && (productListDecoratorU = productListDecoratorB.u(((-201326593) & 1) != 0 ? productListDecoratorB.id : null, ((-201326593) & 2) != 0 ? productListDecoratorB.isSelected : false, ((-201326593) & 4) != 0 ? productListDecoratorB.upc : null, ((-201326593) & 8) != 0 ? productListDecoratorB.title : null, ((-201326593) & 16) != 0 ? productListDecoratorB.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecoratorB.listItemId : null, ((-201326593) & 64) != 0 ? productListDecoratorB.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecoratorB.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecoratorB.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecoratorB.department : null, ((-201326593) & 1024) != 0 ? productListDecoratorB.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecoratorB.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecoratorB.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecoratorB.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecoratorB.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecoratorB.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecoratorB.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecoratorB.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecoratorB.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecoratorB.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecoratorB.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecoratorB.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecoratorB.product : null, ((-201326593) & 8388608) != 0 ? productListDecoratorB.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecoratorB.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecoratorB.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecoratorB.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecoratorB.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecoratorB.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecoratorB.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecoratorB.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecoratorB.complexPromo : null, (511 & 1) != 0 ? productListDecoratorB.isBuyAgain : false, (511 & 2) != 0 ? productListDecoratorB.isBopas : false, (511 & 4) != 0 ? productListDecoratorB.sponsorship : null, (511 & 8) != 0 ? productListDecoratorB.productRatings : null, (511 & 16) != 0 ? productListDecoratorB.showQuantityRequested : true, (511 & 32) != 0 ? productListDecoratorB.quantityRequested : productListDecorator.getQuantityRequested(), (511 & 64) != 0 ? productListDecoratorB.currentPriceDescription : null, (511 & 128) != 0 ? productListDecoratorB.productContainsTag : false, (511 & 256) != 0 ? productListDecoratorB.regularPriceDescription : null)) != null) {
                        productListDecorator = productListDecoratorU;
                    }
                }
                arrayList.add(productListDecorator);
            }
            this._viewState.n().clear();
            this._viewState.n().addAll(arrayList);
        }
    }

    private final void s0(ProductFullDetails product) {
        this._viewState.o().add(new f.GoToFindSubstitutionScreen("SubstitutionMode.OutOfStockFindSimilar", this._viewState.p().getValue().getSchoolName(), this._viewState.p().getValue().getClassName(), product));
    }

    private final EntryInQtyStepperInteraction u0() {
        return (EntryInQtyStepperInteraction) this.productInQtyStepperInteraction.getValue(this, f118442r[0]);
    }

    private final void z0(boolean fromToast) {
        this._viewState.o().add(f.e.f118484a);
        if (fromToast) {
            this.analyticsEngine.b(C14756c.a("Go to Cart"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.H0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v1.A0(this.f118136a, (TrackingData) obj);
                }
            });
        }
    }

    public final void Z0(String str) {
        this.resetStepperState.setValue(this, f118442r[1], str);
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        TeacherListsActivity teacherListsActivity = owner instanceof TeacherListsActivity ? (TeacherListsActivity) owner : null;
        if (teacherListsActivity != null) {
            final String stringExtra = teacherListsActivity.getIntent().getStringExtra("cmpid");
            this.analyticsEngine.b(C14756c.h("Teacher's List:School Search"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v1.N0(stringExtra, (TrackingData) obj);
                }
            });
        }
        io.reactivex.l<uk.c<ShoppingCart>> lVarDoOnDispose = this.cartRepository.b().subscribeOn(C13889a.b()).doOnDispose(new Lu.a() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.K0
            @Override // Lu.a
            public final void run() {
                v1.O0();
            }
        });
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.S0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.P0((Ju.b) obj);
            }
        };
        io.reactivex.l<uk.c<ShoppingCart>> lVarDistinctUntilChanged = lVarDoOnDispose.doOnSubscribe(new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.T0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.Q0(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.U0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.R0(this.f118229a, (uk.c) obj);
            }
        };
        Lu.g<? super uk.c<ShoppingCart>> gVar = new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.V0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.S0(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.W0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.H0((Throwable) obj);
            }
        };
        Dk.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.X0
            @Override // Lu.g
            public final void accept(Object obj) {
                v1.I0(function13, obj);
            }
        }), this.disposables);
        this.multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.Y0
            @Override // sp.C17115a.InterfaceC2527a
            public final void a(Object obj, sp.Y y10) {
                v1.J0(this.f118238a, obj, y10);
            }
        });
    }

    @Override // androidx.view.InterfaceC6157f
    public void onDestroy(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onDestroy(owner);
        this.disposables.dispose();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, this.cartInteractorListener, 1, null);
            this.cartInteractor.p();
        }
    }

    public final String v0() {
        return (String) this.resetStepperState.getValue(this, f118442r[1]);
    }

    /* renamed from: y0, reason: from getter */
    public final d getViewState() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(v1 v1Var, Object obj, List list) {
        Intrinsics.g(list);
        v1Var.onProductsState(obj, list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R0(v1 v1Var, uk.c cVar) {
        Intrinsics.g(cVar);
        v1Var.U0(cVar);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void T0(ClipUnclipCouponResponse response, Coupon coupon, String couponLocation) {
        StringsKt.I(response.getResult(), "Success", false, 2, null);
    }

    private final void U0(uk.c<ShoppingCart> resource) {
        String code;
        ShoppingCart shoppingCartA = resource.a();
        Integer num = null;
        if (shoppingCartA != null) {
            code = shoppingCartA.getCode();
        } else {
            code = null;
        }
        ShoppingCart shoppingCartA2 = resource.a();
        if (shoppingCartA2 != null) {
            Integer numValueOf = Integer.valueOf(shoppingCartA2.getTotalItems());
            if (numValueOf.intValue() > 0) {
                num = numValueOf;
            }
        }
        this._viewState.f().setValue(num);
        qw.a.INSTANCE.a("Setting CartID for TeacherLists view state: " + code, new Object[0]);
        FS.setUserVars(MapsKt.g(TuplesKt.a("CartID", code)));
    }

    private final void b0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new i(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(v1 v1Var, Coupon coupon, String str, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        Intrinsics.g(clipUnclipCouponResponse);
        v1Var.T0(clipUnclipCouponResponse, coupon, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void k0(ClipCouponAction action) {
        Coupon coupon = action.getDecorator().getCoupon();
        if (coupon != null) {
            a.Clip clip = new a.Clip(Pk.e.a(coupon.getOfferId()), C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.I0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v1.l0((TrackingData) obj);
                }
            }));
            o0(clip.getCoupon(), clip.getTrackingData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(v1 v1Var, TrackingData trackingData, Coupon coupon) {
        String value;
        List<AbstractC14762i> listK;
        AbstractC14762i abstractC14762i;
        Intrinsics.g(coupon);
        if (trackingData != null && (listK = trackingData.k()) != null && (abstractC14762i = (AbstractC14762i) CollectionsKt.u0(listK)) != null) {
            value = abstractC14762i.getValue();
        } else {
            value = null;
        }
        v1Var.f0(coupon, value);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void t0(SchoolItem schoolItem) {
        C15809k.d(androidx.view.d0.a(this), null, null, new k(schoolItem, null), 3, null);
    }

    private final void w0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new l(null), 3, null);
    }

    private final void x0(ClassItem classItem) {
        C15809k.d(androidx.view.d0.a(this), null, null, new m(classItem, null), 3, null);
    }
}
