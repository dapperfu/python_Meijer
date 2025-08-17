package com.meijer.mobile.meijer.activity.substitution;

import Ao.C2930u;
import Ao.U;
import Ao.W;
import Co.ProductFullDetails;
import Co.StockInfo;
import Gp.ProductRatings;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.meijer.activity.substitution.SuggestedItemDecorator;
import ej.Entry;
import ej.EntryChange;
import ej.ShoppingCart;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.S;
import ur.AbstractC17302a;
import vl.CartEntry;
import vr.AbstractC17604a;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import wr.InterfaceC17847a;

@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 Ã\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006w{\u007fu}yB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J)\u0010+\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020%2\n\u0010(\u001a\u00060&j\u0002`'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,JA\u00102\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\n\u0010(\u001a\u00060&j\u0002`'2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010/¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0014H\u0014¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00142\u000e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J%\u0010?\u001a\u00020\u00142\u0006\u0010?\u001a\u00020>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@06H\u0016¢\u0006\u0004\b?\u0010BJ\r\u0010C\u001a\u00020\u0014¢\u0006\u0004\bC\u00105J)\u0010G\u001a\u00020\u0014\"\u0004\b\u0000\u0010+2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00028\u00000DH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00142\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0014H\u0002¢\u0006\u0004\bM\u00105J!\u0010O\u001a\u00020N2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bO\u0010PJ%\u0010T\u001a\u00020\u00142\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00120Q2\u0006\u0010S\u001a\u00020-H\u0002¢\u0006\u0004\bT\u0010UJ!\u0010X\u001a\u0004\u0018\u00010N2\u0006\u0010V\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020\u001bH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020&2\u0006\u0010[\u001a\u00020&H\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00142\u0006\u0010^\u001a\u00020!H\u0002¢\u0006\u0004\b_\u0010$J+\u0010c\u001a\u00020\u00142\f\u0010`\u001a\b\u0012\u0004\u0012\u00020-0Q2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0QH\u0002¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020\u00142\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@06H\u0002¢\u0006\u0004\be\u0010:J\u001d\u0010f\u001a\u00020\u00142\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@06H\u0002¢\u0006\u0004\bf\u0010:J\u001f\u0010i\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010m\u001a\u00020\u00142\b\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020o2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0014H\u0002¢\u0006\u0004\br\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0088\u0001\u001a\u00070/j\u0003`\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008d\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0080\u0001R9\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0087\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0087\u0001R\u0018\u0010S\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R.\u0010¢\u0001\u001a\u0004\u0018\u00010)2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u0017\u0010¥\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001f\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R$\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010«\u00018\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u001f\u0010µ\u0001\u001a\n\u0012\u0005\u0012\u00030²\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001RE\u0010»\u0001\u001a\u000b\u0018\u00010/j\u0005\u0018\u0001`\u0085\u00012\u0010\u0010\u008f\u0001\u001a\u000b\u0018\u00010/j\u0005\u0018\u0001`\u0085\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u0091\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u001c\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030²\u00010¼\u00018F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010Â\u0001\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lwr/a;", "Lpp/g;", "repository", "Lhl/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lgi/a;", "analyticsEngine", "LKp/g;", "productReviewManager", "Lyl/k;", "featureManager", "<init>", "(Lpp/g;Lhl/m;Lwr/f;Lgi/a;LKp/g;Lyl/k;)V", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "item", "", "V", "(Lcom/meijer/mobile/meijer/activity/substitution/H;)V", "Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "action", "W", "(Lcom/meijer/mobile/meijer/activity/substitution/D$b;)V", "Lmk/i;", "original", "Lmk/f;", "alternative", "g0", "(Lmk/i;Lmk/f;)V", "", "overrideItemAlreadyInCart", "i0", "(Z)V", "Lvs/b;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LPp/c;", "substituteMode", "T", "(Lvs/b;ILPp/c;)V", "LCo/h;", "product", "", "schoolName", "classroomName", "O", "(LCo/h;ILPp/c;Ljava/lang/String;Ljava/lang/String;)V", "onCleared", "()V", "Ltk/c;", "Lej/C;", "cartResource", "observeCart", "(Ltk/c;)V", "LNu/a;", "getDisposable", "()LNu/a;", "Lur/a;", "processedRequest", "Lej/j;", "entryChange", "(Lur/a;Ltk/c;)V", "j0", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "L", "Lhi/f;", "t0", "(Lmk/i;Lmk/f;)Lhi/f;", "", "decorator", "itemToSubstitute", "q0", "(Ljava/util/List;LCo/h;)V", "itemToRemove", "itemToAdd", "f0", "(Lmk/i;Lmk/i;)Lhi/f;", "title", "body", "n0", "(II)V", "showSpinner", "o0", "suggestedProducts", "LGp/c;", "productRatings", "Y", "(Ljava/util/List;Ljava/util/List;)V", "K", "k0", "", "quantityToUpdate", "u0", "(LCo/h;D)V", "Lej/i;", "entry", "p0", "(Lej/i;)V", "Lvs/f$a;", "h0", "(LCo/h;)Lvs/f$a;", "X", "a", "Lpp/g;", "b", "Lhl/m;", "c", "Lwr/f;", "d", "Lgi/a;", "e", "LKp/g;", "f", "Lyl/k;", "g", "Z", "findSimilarInitialHasLoaded", "h", "Lej/C;", "shoppingCart", "Lcom/meijer/mobile/core/model/common/ResourceId;", "i", "Ljava/lang/String;", "cartId", "j", "I", "productRank", "k", "trackingDoNotAddBackup", "Lcom/meijer/mobile/meijer/activity/substitution/D$d;", "<set-?>", "l", "Lkotlin/properties/ReadWriteProperty;", "P", "()Lcom/meijer/mobile/meijer/activity/substitution/D$d;", "l0", "(Lcom/meijer/mobile/meijer/activity/substitution/D$d;)V", "productInQtyStepperInteraction", "m", "teacherListSchoolName", "n", "teacherListClassroomName", "o", "LCo/h;", "value", "p", "LPp/c;", "S", "()LPp/c;", "substitutionMode", "q", "LNu/a;", "disposables", "Ltv/B;", "Lcom/meijer/mobile/meijer/activity/substitution/D$g;", "r", "Ltv/B;", "_viewState", "Ltv/P;", "s", "Ltv/P;", "U", "()Ltv/P;", "viewState", "Ltv/A;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "t", "Ltv/A;", "_events", "u", "Q", "()Ljava/lang/String;", "m0", "(Ljava/lang/String;)V", "resetStepperState", "Ltv/F;", "getEvents", "()Ltv/F;", "events", "R", "()Lcom/meijer/mobile/meijer/activity/substitution/H;", "selectedProduct", "v", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class D extends c0 implements InterfaceC6015f, InterfaceC17847a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pp.g repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Kp.g productReviewManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean findSimilarInitialHasLoaded;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ShoppingCart shoppingCart;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int productRank;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean trackingDoNotAddBackup;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty productInQtyStepperInteraction;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String teacherListSchoolName;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String teacherListClassroomName;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ProductFullDetails itemToSubstitute;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Pp.c substitutionMode;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<e> _events;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty resetStepperState;

    /* renamed from: w, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f112601w = {Reflection.f(new MutablePropertyReference1Impl(D.class, "productInQtyStepperInteraction", "getProductInQtyStepperInteraction()Lcom/meijer/mobile/meijer/activity/substitution/FindSubstitutionViewModel$EntryInQtyStepperInteraction;", 0)), Reflection.f(new MutablePropertyReference1Impl(D.class, "resetStepperState", "getResetStepperState()Ljava/lang/String;", 0))};

    /* renamed from: x, reason: collision with root package name */
    public static final int f112602x = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$1", f = "FindSubstitutionViewModel.kt", l = {177}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112624a;

        /* renamed from: b, reason: collision with root package name */
        Object f112625b;

        /* renamed from: c, reason: collision with root package name */
        Object f112626c;

        /* renamed from: d, reason: collision with root package name */
        Object f112627d;

        /* renamed from: e, reason: collision with root package name */
        int f112628e;

        /* renamed from: f, reason: collision with root package name */
        int f112629f;

        /* renamed from: g, reason: collision with root package name */
        int f112630g;

        /* renamed from: h, reason: collision with root package name */
        int f112631h;

        /* renamed from: i, reason: collision with root package name */
        int f112632i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112633j;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = D.this.new a(continuation);
            aVar.f112633j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112632i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f112633j;
                    D d10 = D.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = d10.cartInteractor;
                    this.f112633j = interfaceC16622O;
                    this.f112624a = interfaceC16622O;
                    this.f112625b = this;
                    this.f112626c = this;
                    this.f112627d = interfaceC16622O;
                    this.f112628e = 0;
                    this.f112629f = 0;
                    this.f112630g = 0;
                    this.f112631h = 0;
                    this.f112632i = 1;
                    if (wr.f.n(fVar, true, false, this, 2, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.l(thE, "fetchLatestCart failed in FindSubstitutionViewModel", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "", "<init>", "()V", "a", "d", "e", "b", "c", "Lcom/meijer/mobile/meijer/activity/substitution/D$b$a;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b$b;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b$c;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b$d;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$b$a;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "", "touchX", "touchY", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$b$a, reason: from toString */
        public static final /* data */ class CollapseQuantityStepperAction extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int touchX;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int touchY;

            public CollapseQuantityStepperAction(int i10, int i11) {
                super(null);
                this.touchX = i10;
                this.touchY = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CollapseQuantityStepperAction)) {
                    return false;
                }
                CollapseQuantityStepperAction collapseQuantityStepperAction = (CollapseQuantityStepperAction) other;
                return this.touchX == collapseQuantityStepperAction.touchX && this.touchY == collapseQuantityStepperAction.touchY;
            }

            public int hashCode() {
                return (Integer.hashCode(this.touchX) * 31) + Integer.hashCode(this.touchY);
            }

            public String toString() {
                return "CollapseQuantityStepperAction(touchX=" + this.touchX + ", touchY=" + this.touchY + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getTouchX() {
                return this.touchX;
            }

            /* renamed from: b, reason: from getter */
            public final int getTouchY() {
                return this.touchY;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00060\u0002j\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$b$b;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/core/model/common/ResourceId;", "a", "Ljava/lang/String;", "resourceId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class ResetActiveStepper extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String resourceId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResetActiveStepper) && Intrinsics.e(this.resourceId, ((ResetActiveStepper) other).resourceId);
            }

            public int hashCode() {
                return this.resourceId.hashCode();
            }

            public String toString() {
                return "ResetActiveStepper(resourceId=" + this.resourceId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getResourceId() {
                return this.resourceId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$b$c;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f112638a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1467944009;
            }

            public String toString() {
                return "SelectDoNotSubstitute";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$b$d;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "LCo/h;", "product", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(LCo/h;DLandroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "getQuantityToUpdate", "()D", "c", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$b$d, reason: from toString */
        public static final /* data */ class StepperStateChangedAction extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double quantityToUpdate;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Rect stepperHitRect;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepperStateChangedAction)) {
                    return false;
                }
                StepperStateChangedAction stepperStateChangedAction = (StepperStateChangedAction) other;
                return Intrinsics.e(this.product, stepperStateChangedAction.product) && Double.compare(this.quantityToUpdate, stepperStateChangedAction.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, stepperStateChangedAction.stepperHitRect);
            }

            public int hashCode() {
                return (((this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode();
            }

            public String toString() {
                return "StepperStateChangedAction(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StepperStateChangedAction(ProductFullDetails product, double d10, Rect stepperHitRect) {
                super(null);
                Intrinsics.j(product, "product");
                Intrinsics.j(stepperHitRect, "stepperHitRect");
                this.product = product;
                this.quantityToUpdate = d10;
                this.stepperHitRect = stepperHitRect;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            /* renamed from: b, reason: from getter */
            public final Rect getStepperHitRect() {
                return this.stepperHitRect;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\u0010¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$b$e;", "Lcom/meijer/mobile/meijer/activity/substitution/D$b;", "LCo/h;", "product", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "", "position", "<init>", "(LCo/h;DLandroid/graphics/Rect;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "b", "()LCo/h;", "D", "c", "()D", "Landroid/graphics/Rect;", "getStepperHitRect", "()Landroid/graphics/Rect;", "d", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$b$e, reason: from toString */
        public static final /* data */ class UpdateEntryAction extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double quantityToUpdate;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Rect stepperHitRect;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int position;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateEntryAction)) {
                    return false;
                }
                UpdateEntryAction updateEntryAction = (UpdateEntryAction) other;
                return Intrinsics.e(this.product, updateEntryAction.product) && Double.compare(this.quantityToUpdate, updateEntryAction.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, updateEntryAction.stepperHitRect) && this.position == updateEntryAction.position;
            }

            public int hashCode() {
                return (((((this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode()) * 31) + Integer.hashCode(this.position);
            }

            public String toString() {
                return "UpdateEntryAction(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ", position=" + this.position + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateEntryAction(ProductFullDetails product, double d10, Rect stepperHitRect, int i10) {
                super(null);
                Intrinsics.j(product, "product");
                Intrinsics.j(stepperHitRect, "stepperHitRect");
                this.product = product;
                this.quantityToUpdate = d10;
                this.stepperHitRect = stepperHitRect;
                this.position = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            /* renamed from: b, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            /* renamed from: c, reason: from getter */
            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$d;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "resourceId", "Landroid/graphics/Rect;", "stepperHitRect", "", "loadingState", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "c", "Z", "getLoadingState", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$d, reason: from toString */
    public static final /* data */ class EntryInQtyStepperInteraction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String resourceId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Rect stepperHitRect;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean loadingState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryInQtyStepperInteraction)) {
                return false;
            }
            EntryInQtyStepperInteraction entryInQtyStepperInteraction = (EntryInQtyStepperInteraction) other;
            return Intrinsics.e(this.resourceId, entryInQtyStepperInteraction.resourceId) && Intrinsics.e(this.stepperHitRect, entryInQtyStepperInteraction.stepperHitRect) && this.loadingState == entryInQtyStepperInteraction.loadingState;
        }

        public int hashCode() {
            return (((this.resourceId.hashCode() * 31) + this.stepperHitRect.hashCode()) * 31) + Boolean.hashCode(this.loadingState);
        }

        public String toString() {
            return "EntryInQtyStepperInteraction(resourceId=" + this.resourceId + ", stepperHitRect=" + this.stepperHitRect + ", loadingState=" + this.loadingState + ')';
        }

        public EntryInQtyStepperInteraction(String resourceId, Rect stepperHitRect, boolean z10) {
            Intrinsics.j(resourceId, "resourceId");
            Intrinsics.j(stepperHitRect, "stepperHitRect");
            this.resourceId = resourceId;
            this.stepperHitRect = stepperHitRect;
            this.loadingState = z10;
        }

        /* renamed from: a, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        /* renamed from: b, reason: from getter */
        public final Rect getStepperHitRect() {
            return this.stepperHitRect;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "", "<init>", "()V", "c", "d", "b", "a", "e", "Lcom/meijer/mobile/meijer/activity/substitution/D$e$a;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e$b;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e$c;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e$d;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$e$a;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "", "messageResId", "actionResId", "Lej/i;", "entry", "<init>", "(IILej/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lej/i;", "getEntry", "()Lej/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$e$a, reason: from toString */
        public static final /* data */ class AddToCartSuccessEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Entry entry;

            public AddToCartSuccessEvent(int i10, int i11, Entry entry) {
                super(null);
                this.messageResId = i10;
                this.actionResId = i11;
                this.entry = entry;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToCartSuccessEvent)) {
                    return false;
                }
                AddToCartSuccessEvent addToCartSuccessEvent = (AddToCartSuccessEvent) other;
                return this.messageResId == addToCartSuccessEvent.messageResId && this.actionResId == addToCartSuccessEvent.actionResId && Intrinsics.e(this.entry, addToCartSuccessEvent.entry);
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId)) * 31;
                Entry entry = this.entry;
                return iHashCode + (entry == null ? 0 : entry.hashCode());
            }

            public String toString() {
                return "AddToCartSuccessEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", entry=" + this.entry + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$e$b;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f112652a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1597789117;
            }

            public String toString() {
                return "ItemAlreadyInCartEvent";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$e$c;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "", "title", "body", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$e$c, reason: from toString */
        public static final /* data */ class ShowErrorMessageEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int body;

            public ShowErrorMessageEvent(int i10, int i11) {
                super(null);
                this.title = i10;
                this.body = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowErrorMessageEvent)) {
                    return false;
                }
                ShowErrorMessageEvent showErrorMessageEvent = (ShowErrorMessageEvent) other;
                return this.title == showErrorMessageEvent.title && this.body == showErrorMessageEvent.body;
            }

            public int hashCode() {
                return (Integer.hashCode(this.title) * 31) + Integer.hashCode(this.body);
            }

            public String toString() {
                return "ShowErrorMessageEvent(title=" + this.title + ", body=" + this.body + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getBody() {
                return this.body;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$e$d;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$e$d, reason: from toString */
        public static final /* data */ class SuccessfullySubstituted extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public SuccessfullySubstituted(TrackingData trackingData) {
                super(null);
                this.trackingData = trackingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuccessfullySubstituted) && Intrinsics.e(this.trackingData, ((SuccessfullySubstituted) other).trackingData);
            }

            public int hashCode() {
                TrackingData trackingData = this.trackingData;
                if (trackingData == null) {
                    return 0;
                }
                return trackingData.hashCode();
            }

            public String toString() {
                return "SuccessfullySubstituted(trackingData=" + this.trackingData + ')';
            }

            /* renamed from: a, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$e$e;", "Lcom/meijer/mobile/meijer/activity/substitution/D$e;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$e$e, reason: collision with other inner class name and from toString */
        public static final /* data */ class UpdateToCartFailedEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public UpdateToCartFailedEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateToCartFailedEvent) && this.messageResId == ((UpdateToCartFailedEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "UpdateToCartFailedEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$f;", "", "", "isLoading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$f, reason: from toString */
    public static final /* data */ class LoadingState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingState) && this.isLoading == ((LoadingState) other).isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "LoadingState(isLoading=" + this.isLoading + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public LoadingState(boolean z10) {
            this.isLoading = z10;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/D$g;", "", "", "Lcom/meijer/mobile/meijer/activity/substitution/H;", "productSuggestions", "Lcom/meijer/mobile/meijer/activity/substitution/D$f;", "loadingState", "", "itemSelected", "doNotSubstituteSelected", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/meijer/activity/substitution/D$f;ZZ)V", "a", "(Ljava/util/List;Lcom/meijer/mobile/meijer/activity/substitution/D$f;ZZ)Lcom/meijer/mobile/meijer/activity/substitution/D$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Lcom/meijer/mobile/meijer/activity/substitution/D$f;", "e", "()Lcom/meijer/mobile/meijer/activity/substitution/D$f;", "c", "Z", "d", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.D$g, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SuggestedItemDecorator> productSuggestions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LoadingState loadingState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean itemSelected;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean doNotSubstituteSelected;

        public ViewState() {
            this(null, null, false, false, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, LoadingState loadingState, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.productSuggestions;
            }
            if ((i10 & 2) != 0) {
                loadingState = viewState.loadingState;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.itemSelected;
            }
            if ((i10 & 8) != 0) {
                z11 = viewState.doNotSubstituteSelected;
            }
            return viewState.a(list, loadingState, z10, z11);
        }

        public final ViewState a(List<SuggestedItemDecorator> productSuggestions, LoadingState loadingState, boolean itemSelected, boolean doNotSubstituteSelected) {
            Intrinsics.j(productSuggestions, "productSuggestions");
            Intrinsics.j(loadingState, "loadingState");
            return new ViewState(productSuggestions, loadingState, itemSelected, doNotSubstituteSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.productSuggestions, viewState.productSuggestions) && Intrinsics.e(this.loadingState, viewState.loadingState) && this.itemSelected == viewState.itemSelected && this.doNotSubstituteSelected == viewState.doNotSubstituteSelected;
        }

        public int hashCode() {
            return (((((this.productSuggestions.hashCode() * 31) + this.loadingState.hashCode()) * 31) + Boolean.hashCode(this.itemSelected)) * 31) + Boolean.hashCode(this.doNotSubstituteSelected);
        }

        public String toString() {
            return "ViewState(productSuggestions=" + this.productSuggestions + ", loadingState=" + this.loadingState + ", itemSelected=" + this.itemSelected + ", doNotSubstituteSelected=" + this.doNotSubstituteSelected + ')';
        }

        public ViewState(List<SuggestedItemDecorator> productSuggestions, LoadingState loadingState, boolean z10, boolean z11) {
            Intrinsics.j(productSuggestions, "productSuggestions");
            Intrinsics.j(loadingState, "loadingState");
            this.productSuggestions = productSuggestions;
            this.loadingState = loadingState;
            this.itemSelected = z10;
            this.doNotSubstituteSelected = z11;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getDoNotSubstituteSelected() {
            return this.doNotSubstituteSelected;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getItemSelected() {
            return this.itemSelected;
        }

        /* renamed from: e, reason: from getter */
        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final List<SuggestedItemDecorator> f() {
            return this.productSuggestions;
        }

        public /* synthetic */ ViewState(List list, LoadingState loadingState, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new LoadingState(false) : loadingState, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pp.c.values().length];
            try {
                iArr[Pp.c.f28365c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$addCartEntry$1", f = "FindSubstitutionViewModel.kt", l = {672}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112662a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112662a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = D.this._events;
                e.UpdateToCartFailedEvent updateToCartFailedEvent = new e.UpdateToCartFailedEvent(C17135b.f161993P0);
                this.f112662a = 1;
                if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$addCartEntry$2", f = "FindSubstitutionViewModel.kt", l = {681}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112664a;

        /* renamed from: b, reason: collision with root package name */
        Object f112665b;

        /* renamed from: c, reason: collision with root package name */
        Object f112666c;

        /* renamed from: d, reason: collision with root package name */
        Object f112667d;

        /* renamed from: e, reason: collision with root package name */
        int f112668e;

        /* renamed from: f, reason: collision with root package name */
        int f112669f;

        /* renamed from: g, reason: collision with root package name */
        int f112670g;

        /* renamed from: h, reason: collision with root package name */
        int f112671h;

        /* renamed from: i, reason: collision with root package name */
        int f112672i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112673j;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = D.this.new j(continuation);
            jVar.f112673j = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112672i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f112673j;
                    D d10 = D.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = d10.cartInteractor;
                    this.f112673j = interfaceC16622O;
                    this.f112664a = interfaceC16622O;
                    this.f112665b = this;
                    this.f112666c = this;
                    this.f112667d = interfaceC16622O;
                    this.f112668e = 0;
                    this.f112669f = 0;
                    this.f112670g = 0;
                    this.f112671h = 0;
                    this.f112672i = 1;
                    if (fVar.m(false, false, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.l(thE, "fetchLatestCart failed in FindSubstitutionViewModel", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$addCartEntry$3", f = "FindSubstitutionViewModel.kt", l = {694}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112675a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ tk.c<EntryChange> f112677c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new k(this.f112677c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(tk.c<EntryChange> cVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f112677c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Entry entry;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112675a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = D.this._events;
                int i11 = C17135b.f162019f;
                int i12 = C17135b.f162001T0;
                EntryChange entryChange = (EntryChange) ((c.Success) this.f112677c).a();
                if (entryChange != null) {
                    entry = entryChange.getEntry();
                } else {
                    entry = null;
                }
                e.AddToCartSuccessEvent addToCartSuccessEvent = new e.AddToCartSuccessEvent(i11, i12, entry);
                this.f112675a = 1;
                if (interfaceC17139A.emit(addToCartSuccessEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$fetchSimilarItems$1", f = "FindSubstitutionViewModel.kt", l = {509, 512}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112678a;

        /* renamed from: b, reason: collision with root package name */
        Object f112679b;

        /* renamed from: c, reason: collision with root package name */
        Object f112680c;

        /* renamed from: d, reason: collision with root package name */
        Object f112681d;

        /* renamed from: e, reason: collision with root package name */
        Object f112682e;

        /* renamed from: f, reason: collision with root package name */
        int f112683f;

        /* renamed from: g, reason: collision with root package name */
        int f112684g;

        /* renamed from: h, reason: collision with root package name */
        int f112685h;

        /* renamed from: i, reason: collision with root package name */
        int f112686i;

        /* renamed from: j, reason: collision with root package name */
        int f112687j;

        /* renamed from: k, reason: collision with root package name */
        int f112688k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f112689l;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f112691n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f112692o;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = D.this.new l(this.f112691n, this.f112692o, continuation);
            lVar.f112689l = obj;
            return lVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ProductFullDetails productFullDetails, int i10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f112691n = productFullDetails;
            this.f112692o = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.substitution.D.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$getSuggestions$1", f = "FindSubstitutionViewModel.kt", l = {473, 475}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112693a;

        /* renamed from: b, reason: collision with root package name */
        Object f112694b;

        /* renamed from: c, reason: collision with root package name */
        Object f112695c;

        /* renamed from: d, reason: collision with root package name */
        Object f112696d;

        /* renamed from: e, reason: collision with root package name */
        Object f112697e;

        /* renamed from: f, reason: collision with root package name */
        int f112698f;

        /* renamed from: g, reason: collision with root package name */
        int f112699g;

        /* renamed from: h, reason: collision with root package name */
        int f112700h;

        /* renamed from: i, reason: collision with root package name */
        int f112701i;

        /* renamed from: j, reason: collision with root package name */
        int f112702j;

        /* renamed from: k, reason: collision with root package name */
        int f112703k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f112704l;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ CartProductListDecorator f112706n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f112707o;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = D.this.new m(this.f112706n, this.f112707o, continuation);
            mVar.f112704l = obj;
            return mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(CartProductListDecorator cartProductListDecorator, int i10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f112706n = cartProductListDecorator;
            this.f112707o = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.substitution.D.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$proactiveSubstitute$1", f = "FindSubstitutionViewModel.kt", l = {266, 273}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112708a;

        /* renamed from: b, reason: collision with root package name */
        Object f112709b;

        /* renamed from: c, reason: collision with root package name */
        Object f112710c;

        /* renamed from: d, reason: collision with root package name */
        Object f112711d;

        /* renamed from: e, reason: collision with root package name */
        int f112712e;

        /* renamed from: f, reason: collision with root package name */
        int f112713f;

        /* renamed from: g, reason: collision with root package name */
        int f112714g;

        /* renamed from: h, reason: collision with root package name */
        int f112715h;

        /* renamed from: i, reason: collision with root package name */
        int f112716i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112717j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.i f112719l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ mk.f f112720m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = D.this.new n(this.f112719l, this.f112720m, continuation);
            nVar.f112717j = obj;
            return nVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(mk.i iVar, mk.f fVar, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f112719l = iVar;
            this.f112720m = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:(1:(5:6|35|(1:37)|38|39)(2:7|8))(4:9|46|10|11))(8:14|40|15|16|42|17|(1:20)|34)|44|21|22|30|(1:32)|35|(0)|38|39|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
        
            if (r8.emit(r9, r14) == r1) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.substitution.D.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$reactiveSubstitute$2$1", f = "FindSubstitutionViewModel.kt", l = {327, 351}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112721a;

        /* renamed from: b, reason: collision with root package name */
        Object f112722b;

        /* renamed from: c, reason: collision with root package name */
        Object f112723c;

        /* renamed from: d, reason: collision with root package name */
        Object f112724d;

        /* renamed from: e, reason: collision with root package name */
        int f112725e;

        /* renamed from: f, reason: collision with root package name */
        int f112726f;

        /* renamed from: g, reason: collision with root package name */
        int f112727g;

        /* renamed from: h, reason: collision with root package name */
        int f112728h;

        /* renamed from: i, reason: collision with root package name */
        int f112729i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112730j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.i f112732l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ mk.i f112733m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f112734n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$reactiveSubstitute$2$1$2$1", f = "FindSubstitutionViewModel.kt", l = {336}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112735a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D f112736b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ mk.i f112737c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ mk.i f112738d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f112736b, this.f112737c, this.f112738d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D d10, mk.i iVar, mk.i iVar2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f112736b = d10;
                this.f112737c = iVar;
                this.f112738d = iVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112735a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f112736b._events;
                    e.SuccessfullySubstituted successfullySubstituted = new e.SuccessfullySubstituted(this.f112736b.f0(this.f112737c, this.f112738d));
                    this.f112735a = 1;
                    if (interfaceC17139A.emit(successfullySubstituted, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = D.this.new o(this.f112732l, this.f112733m, this.f112734n, continuation);
            oVar.f112730j = obj;
            return oVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(mk.i iVar, mk.i iVar2, boolean z10, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f112732l = iVar;
            this.f112733m = iVar2;
            this.f112734n = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
        
            if (r6.emit(r8, r17) == r2) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.substitution.D.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$removeCartEntry$1", f = "FindSubstitutionViewModel.kt", l = {727}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112739a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112739a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = D.this._events;
                e.UpdateToCartFailedEvent updateToCartFailedEvent = new e.UpdateToCartFailedEvent(C17135b.f161993P0);
                this.f112739a = 1;
                if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.substitution.FindSubstitutionViewModel$showErrorMessage$1", f = "FindSubstitutionViewModel.kt", l = {452}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112741a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f112743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f112744d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10, int i11, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f112743c = i10;
            this.f112744d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new q(this.f112743c, this.f112744d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112741a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = D.this._events;
                e.ShowErrorMessageEvent showErrorMessageEvent = new e.ShowErrorMessageEvent(this.f112743c, this.f112744d);
                this.f112741a = 1;
                if (interfaceC17139A.emit(showErrorMessageEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class r extends ObservableProperty<EntryInQtyStepperInteraction> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f112745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Object obj, D d10) {
            super(obj);
            this.f112745b = d10;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, EntryInQtyStepperInteraction oldValue, EntryInQtyStepperInteraction newValue) {
            Intrinsics.j(property, "property");
            this.f112745b.X();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class s extends ObservableProperty<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f112746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Object obj, D d10) {
            super(obj);
            this.f112746b = d10;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
            Intrinsics.j(property, "property");
            this.f112746b.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(ProductFullDetails productFullDetails) {
        StockInfo stockInfo;
        boolean z10 = false;
        if (productFullDetails != null && (stockInfo = productFullDetails.getStockInfo()) != null && stockInfo.e()) {
            z10 = true;
        }
        return !z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(D d10, ProductFullDetails productFullDetails) {
        ProductFullDetails productFullDetails2 = null;
        String code = productFullDetails != null ? productFullDetails.getCode() : null;
        ProductFullDetails productFullDetails3 = d10.itemToSubstitute;
        if (productFullDetails3 == null) {
            Intrinsics.y("itemToSubstitute");
        } else {
            productFullDetails2 = productFullDetails3;
        }
        return !StringsKt.H(code, productFullDetails2.getCode(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b0(ProductFullDetails productFullDetails) {
        return (productFullDetails == null || productFullDetails.getIsAgeRestricted()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(ProductFullDetails productFullDetails) {
        return (productFullDetails == null || productFullDetails.getIsAlcohol()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(int title, int body) {
        o0(false);
        C16648k.d(d0.a(this), null, null, new q(title, body, null), 3, null);
    }

    public final void i0(boolean overrideItemAlreadyInCart) {
        mk.i iVarB;
        o0(true);
        SuggestedItemDecorator suggestedItemDecoratorR = R();
        if (suggestedItemDecoratorR == null || (iVarB = mk.k.b(Co.l.g(suggestedItemDecoratorR.getId()), 1.0d)) == null) {
            return;
        }
        ProductFullDetails productFullDetails = this.itemToSubstitute;
        if (productFullDetails == null) {
            Intrinsics.y("itemToSubstitute");
            productFullDetails = null;
        }
        C16648k.d(d0.a(this), null, null, new o(mk.k.b(Co.l.g(productFullDetails.getCode()), 0.0d), iVarB, overrideItemAlreadyInCart, null), 3, null);
    }

    @Override // wr.InterfaceC17847a
    public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
        Intrinsics.j(challenge, "challenge");
    }

    public D(pp.g repository, hl.m cartRepository, wr.f cartInteractor, InterfaceC14261a analyticsEngine, Kp.g productReviewManager, yl.k featureManager) {
        Intrinsics.j(repository, "repository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(productReviewManager, "productReviewManager");
        Intrinsics.j(featureManager, "featureManager");
        this.repository = repository;
        this.cartRepository = cartRepository;
        this.cartInteractor = cartInteractor;
        this.analyticsEngine = analyticsEngine;
        this.productReviewManager = productReviewManager;
        this.featureManager = featureManager;
        this.cartId = "-1";
        Delegates delegates = Delegates.f142874a;
        this.productInQtyStepperInteraction = new r(null, this);
        this.disposables = new Nu.a();
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, false, false, 15, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        this._events = C17146H.b(0, 0, null, 7, null);
        this.resetStepperState = new s(null, this);
        wr.f.r(cartInteractor, false, this, 1, null);
        cartInteractor.p();
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
        L();
    }

    private final void K(tk.c<EntryChange> entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        if (!(entryChange instanceof c.Failure)) {
            if (entryChange instanceof c.Success) {
                EntryChange entryChange2 = (EntryChange) ((c.Success) entryChange).a();
                p0(entryChange2 != null ? entryChange2.getEntry() : null);
                C16648k.d(d0.a(this), null, null, new k(entryChange, null), 3, null);
                return;
            } else {
                if (!(entryChange instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.f142422a;
                return;
            }
        }
        c.Failure failure = (c.Failure) entryChange;
        Throwable error = failure.getError();
        HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
        if (httpException == null || httpException.code() != 503) {
            uw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
            C16648k.d(d0.a(this), null, null, new i(null), 3, null);
            EntryChange entryChange3 = (EntryChange) failure.a();
            m0((entryChange3 == null || (entry = entryChange3.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode());
        } else {
            n0(C17135b.f161963A0, C17135b.f162060z0);
        }
        C16648k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    private final void L() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return D.M(this.f112598a, (String) obj);
            }
        };
        Ck.a.a(lVarSubscribeOn.subscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.activity.substitution.C
            @Override // Pu.g
            public final void accept(Object obj) {
                D.N(function1, obj);
            }
        }), this.disposables);
    }

    private final EntryInQtyStepperInteraction P() {
        return (EntryInQtyStepperInteraction) this.productInQtyStepperInteraction.getValue(this, f112601w[0]);
    }

    private final String Q() {
        return (String) this.resetStepperState.getValue(this, f112601w[1]);
    }

    private final SuggestedItemDecorator R() {
        Object next;
        Iterator<T> it = this._viewState.getValue().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SuggestedItemDecorator) next).getIsSelected()) {
                break;
            }
        }
        return (SuggestedItemDecorator) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            List<SuggestedItemDecorator> listF = viewState.f();
            arrayList = new ArrayList(CollectionsKt.x(listF, 10));
            for (SuggestedItemDecorator suggestedItemDecorator : listF) {
                String id2 = suggestedItemDecorator.getId();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionP = P();
                arrayList.add(suggestedItemDecorator.a((27135 & 1) != 0 ? suggestedItemDecorator.id : null, (27135 & 2) != 0 ? suggestedItemDecorator.formattedPrice : null, (27135 & 4) != 0 ? suggestedItemDecorator.price : 0.0d, (27135 & 8) != 0 ? suggestedItemDecorator.description : null, (27135 & 16) != 0 ? suggestedItemDecorator.summary : null, (27135 & 32) != 0 ? suggestedItemDecorator.imageUrl : null, (27135 & 64) != 0 ? suggestedItemDecorator.isSelected : false, (27135 & 128) != 0 ? suggestedItemDecorator.unit : null, (27135 & 256) != 0 ? suggestedItemDecorator.substitutionMode : null, (27135 & 512) != 0 ? suggestedItemDecorator.inQtyStepperInteraction : Intrinsics.e(id2, entryInQtyStepperInteractionP != null ? entryInQtyStepperInteractionP.getResourceId() : null), (27135 & 1024) != 0 ? suggestedItemDecorator.resetStepperState : Intrinsics.e(Q(), suggestedItemDecorator.getId()), (27135 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedItemDecorator.product : null, (27135 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedItemDecorator.cartEntry : h0(suggestedItemDecorator.getProduct()), (27135 & 8192) != 0 ? suggestedItemDecorator.maxQuantityAllowed : 0.0d, (27135 & 16384) != 0 ? suggestedItemDecorator.productRatings : null));
            }
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, arrayList, null, false, false, 14, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(List<ProductFullDetails> suggestedProducts, List<ProductRatings> productRatings) {
        int i10;
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        Object next;
        ProductFullDetails productFullDetails = this.itemToSubstitute;
        ProductFullDetails productFullDetails2 = null;
        if (productFullDetails == null) {
            Intrinsics.y("itemToSubstitute");
            productFullDetails = null;
        }
        boolean zH = StringsKt.H(productFullDetails.getUnit(), "pound", true);
        List listS = CollectionsKt.s(new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(D.Z((ProductFullDetails) obj));
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(D.a0(this.f112880a, (ProductFullDetails) obj));
            }
        });
        ProductFullDetails productFullDetails3 = this.itemToSubstitute;
        if (productFullDetails3 == null) {
            Intrinsics.y("itemToSubstitute");
            productFullDetails3 = null;
        }
        if (!productFullDetails3.getIsAgeRestricted()) {
            listS.add(new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(D.b0((ProductFullDetails) obj));
                }
            });
        }
        ProductFullDetails productFullDetails4 = this.itemToSubstitute;
        if (productFullDetails4 == null) {
            Intrinsics.y("itemToSubstitute");
            productFullDetails4 = null;
        }
        if (!productFullDetails4.getIsAlcohol()) {
            listS.add(new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(D.c0((ProductFullDetails) obj));
                }
            });
        }
        if (zH) {
            listS.add(new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(D.d0((ProductFullDetails) obj));
                }
            });
        } else {
            listS.add(new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(D.e0((ProductFullDetails) obj));
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : suggestedProducts) {
            ProductFullDetails productFullDetails5 = (ProductFullDetails) obj;
            List list = listS;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ((Function1) it.next()).invoke(productFullDetails5)).booleanValue()) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        Pp.c cVar = this.substitutionMode;
        if ((cVar == null ? -1 : h.$EnumSwitchMapping$0[cVar.ordinal()]) == 1) {
            this.findSimilarInitialHasLoaded = true;
            i10 = 15;
        } else {
            i10 = 4;
        }
        List<ProductFullDetails> listB1 = CollectionsKt.b1(arrayList2, i10);
        ArrayList<SuggestedItemDecorator> arrayList3 = new ArrayList(CollectionsKt.x(listB1, 10));
        for (ProductFullDetails productFullDetails6 : listB1) {
            SuggestedItemDecorator.Companion companion = SuggestedItemDecorator.INSTANCE;
            Pp.c cVar2 = this.substitutionMode;
            Iterator<T> it2 = productRatings.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.e(productFullDetails6.getCode(), ((ProductRatings) next).getProductId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            arrayList3.add(SuggestedItemDecorator.Companion.b(companion, productFullDetails6, cVar2, false, false, null, (ProductRatings) next, 28, null));
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            arrayList = new ArrayList(CollectionsKt.x(arrayList3, 10));
            for (SuggestedItemDecorator suggestedItemDecorator : arrayList3) {
                String id2 = suggestedItemDecorator.getId();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionP = P();
                arrayList.add(suggestedItemDecorator.a((27135 & 1) != 0 ? suggestedItemDecorator.id : null, (27135 & 2) != 0 ? suggestedItemDecorator.formattedPrice : null, (27135 & 4) != 0 ? suggestedItemDecorator.price : 0.0d, (27135 & 8) != 0 ? suggestedItemDecorator.description : null, (27135 & 16) != 0 ? suggestedItemDecorator.summary : null, (27135 & 32) != 0 ? suggestedItemDecorator.imageUrl : null, (27135 & 64) != 0 ? suggestedItemDecorator.isSelected : false, (27135 & 128) != 0 ? suggestedItemDecorator.unit : null, (27135 & 256) != 0 ? suggestedItemDecorator.substitutionMode : null, (27135 & 512) != 0 ? suggestedItemDecorator.inQtyStepperInteraction : Intrinsics.e(id2, entryInQtyStepperInteractionP != null ? entryInQtyStepperInteractionP.getResourceId() : null), (27135 & 1024) != 0 ? suggestedItemDecorator.resetStepperState : Intrinsics.e(Q(), suggestedItemDecorator.getId()), (27135 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedItemDecorator.product : null, (27135 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedItemDecorator.cartEntry : h0(suggestedItemDecorator.getProduct()), (27135 & 8192) != 0 ? suggestedItemDecorator.maxQuantityAllowed : 0.0d, (27135 & 16384) != 0 ? suggestedItemDecorator.productRatings : null));
            }
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, arrayList, new LoadingState(false), false, false, 12, null)));
        ProductFullDetails productFullDetails7 = this.itemToSubstitute;
        if (productFullDetails7 == null) {
            Intrinsics.y("itemToSubstitute");
        } else {
            productFullDetails2 = productFullDetails7;
        }
        q0(arrayList3, productFullDetails2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d0(ProductFullDetails productFullDetails) {
        return StringsKt.H(productFullDetails != null ? productFullDetails.getUnit() : null, "lb", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e0(ProductFullDetails productFullDetails) {
        return !StringsKt.H(productFullDetails != null ? productFullDetails.getUnit() : null, "lb", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ProductListDecorator.CartEntryDecorator h0(ProductFullDetails product) {
        List<Entry> listP;
        ShoppingCart shoppingCart = this.shoppingCart;
        Entry entry = null;
        if (shoppingCart != null && (listP = shoppingCart.p()) != null) {
            Iterator<T> it = listP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.e(((Entry) next).m().getCode(), product.getCode())) {
                    entry = next;
                    break;
                }
            }
            entry = entry;
        }
        CartEntry.Companion companion = CartEntry.INSTANCE;
        if (entry == null) {
            entry = new Entry(0, product, 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32765, null);
        }
        CartEntry cartEntryA = companion.a(entry);
        return new ProductListDecorator.CartEntryDecorator(cartEntryA.getEntryNumber(), cartEntryA.getQuantity(), product.getQtyIncrement());
    }

    private final void k0(tk.c<EntryChange> entryChange) {
        if ((entryChange instanceof c.Success) || !(entryChange instanceof c.Failure)) {
            return;
        }
        c.Failure failure = (c.Failure) entryChange;
        uw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
        if (failure.getError() instanceof HttpException) {
            Throwable error = failure.getError();
            Intrinsics.h(error, "null cannot be cast to non-null type retrofit2.HttpException");
            if (((HttpException) error).code() == 503) {
                n0(yr.Q.f170963F, yr.Q.f170962E);
                return;
            }
        }
        C16648k.d(d0.a(this), null, null, new p(null), 3, null);
    }

    private final void l0(EntryInQtyStepperInteraction entryInQtyStepperInteraction) {
        this.productInQtyStepperInteraction.setValue(this, f112601w[0], entryInQtyStepperInteraction);
    }

    private final void m0(String str) {
        this.resetStepperState.setValue(this, f112601w[1], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(boolean showSpinner) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, new LoadingState(showSpinner), false, false, 13, null)));
    }

    private final void p0(Entry entry) {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        C2930u c2930u = C2930u.f1407a;
        String str = this.cartId;
        String strValueOf = String.valueOf(this.productRank);
        ShoppingCart shoppingCart = this.shoppingCart;
        ProductFullDetails productFullDetails = null;
        List<Entry> listP = shoppingCart != null ? shoppingCart.p() : null;
        String str2 = this.teacherListSchoolName;
        String str3 = this.teacherListClassroomName;
        ProductFullDetails productFullDetails2 = this.itemToSubstitute;
        if (productFullDetails2 == null) {
            Intrinsics.y("itemToSubstitute");
        } else {
            productFullDetails = productFullDetails2;
        }
        interfaceC14261a.e(c2930u.p0(entry, str, strValueOf, listP, str2, str3, productFullDetails.getCode()));
    }

    private final void q0(final List<SuggestedItemDecorator> decorator, final ProductFullDetails itemToSubstitute) {
        Pp.c cVar = this.substitutionMode;
        if ((cVar == null ? -1 : h.$EnumSwitchMapping$0[cVar.ordinal()]) == 1) {
            this.analyticsEngine.h(C14476c.a("Find Similar"), new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return D.r0(itemToSubstitute, this, decorator, (TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.h(C14476c.h("Find Substitution Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.substitution.A
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return D.s0(itemToSubstitute, this, decorator, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(ProductFullDetails productFullDetails, D d10, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("find similar page");
        track.h("productID", productFullDetails.getCode());
        track.h("cartID", d10.cartId);
        if (list.isEmpty()) {
            track.h("zeroSimilarProducts", "1");
        }
        String str = d10.teacherListSchoolName;
        if (str != null) {
            track.h("schoolSelected", str);
        }
        String str2 = d10.teacherListClassroomName;
        if (str2 != null) {
            track.h("classSelected", str2);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new W.Details(((SuggestedItemDecorator) it.next()).getId(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097178, 16383, null));
        }
        track.e(W.j(arrayList));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(ProductFullDetails productFullDetails, D d10, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("find substitution page");
        track.h("productID", productFullDetails.getCode());
        track.h("cartID", d10.cartId);
        ShoppingCart shoppingCart = d10.shoppingCart;
        List<Entry> listP = shoppingCart != null ? shoppingCart.p() : null;
        if (listP == null) {
            listP = CollectionsKt.m();
        }
        track.h("Cart Items Count", String.valueOf(listP.size()));
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new W.Details(((SuggestedItemDecorator) it.next()).getId(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1572890, 16383, null));
        }
        track.e(W.j(arrayList));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingData t0(mk.i original, mk.f alternative) {
        ProductFullDetails productFullDetailsA;
        StockInfo stockInfo;
        List<Entry> listP;
        ProductFullDetails productFullDetails = this.itemToSubstitute;
        Boolean boolValueOf = null;
        if (productFullDetails == null) {
            Intrinsics.y("itemToSubstitute");
            productFullDetails = null;
        }
        double actualQuantity = h0(productFullDetails).getActualQuantity();
        Ao.S s10 = Ao.S.f1194a;
        String strH2 = original.h2();
        String code = alternative != null ? alternative.getCode() : null;
        String str = this.cartId;
        ShoppingCart shoppingCart = this.shoppingCart;
        String strValueOf = String.valueOf((shoppingCart == null || (listP = shoppingCart.p()) == null) ? null : Integer.valueOf(listP.size()));
        boolean z10 = this.trackingDoNotAddBackup;
        double value = Co.l.a(original.getProduct()).getPrice().getValue() * actualQuantity;
        if (alternative != null && (productFullDetailsA = Co.l.a(alternative)) != null && (stockInfo = productFullDetailsA.getStockInfo()) != null) {
            boolValueOf = Boolean.valueOf(stockInfo.c());
        }
        return s10.f(strH2, code, str, strValueOf, Double.valueOf(actualQuantity), Double.valueOf(value), boolValueOf, z10);
    }

    private final void u0(ProductFullDetails product, double quantityToUpdate) {
        wr.f.M(this.cartInteractor, product, quantityToUpdate, true, null, 8, null);
    }

    public final void O(ProductFullDetails product, int storeId, Pp.c substituteMode, String schoolName, String classroomName) {
        Intrinsics.j(product, "product");
        Intrinsics.j(substituteMode, "substituteMode");
        o0(true);
        this.substitutionMode = substituteMode;
        this.itemToSubstitute = product;
        this.teacherListSchoolName = schoolName;
        this.teacherListClassroomName = classroomName;
        C16648k.d(d0.a(this), null, null, new l(product, storeId, null), 3, null);
    }

    /* renamed from: S, reason: from getter */
    public final Pp.c getSubstitutionMode() {
        return this.substitutionMode;
    }

    public final void T(CartProductListDecorator item, int storeId, Pp.c substituteMode) {
        Intrinsics.j(item, "item");
        Intrinsics.j(substituteMode, "substituteMode");
        o0(true);
        this.substitutionMode = substituteMode;
        this.itemToSubstitute = item.getProduct();
        C16648k.d(d0.a(this), null, null, new m(item, storeId, null), 3, null);
    }

    public final tv.P<ViewState> U() {
        return this.viewState;
    }

    public final void V(SuggestedItemDecorator item) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        Intrinsics.j(item, "item");
        if (this.substitutionMode != Pp.c.f28365c) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
                viewState = value;
                List<SuggestedItemDecorator> listF = viewState.f();
                arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                for (SuggestedItemDecorator suggestedItemDecorator : listF) {
                    arrayList.add(suggestedItemDecorator.a((27135 & 1) != 0 ? suggestedItemDecorator.id : null, (27135 & 2) != 0 ? suggestedItemDecorator.formattedPrice : null, (27135 & 4) != 0 ? suggestedItemDecorator.price : 0.0d, (27135 & 8) != 0 ? suggestedItemDecorator.description : null, (27135 & 16) != 0 ? suggestedItemDecorator.summary : null, (27135 & 32) != 0 ? suggestedItemDecorator.imageUrl : null, (27135 & 64) != 0 ? suggestedItemDecorator.isSelected : Intrinsics.e(suggestedItemDecorator.getId(), item.getId()), (27135 & 128) != 0 ? suggestedItemDecorator.unit : null, (27135 & 256) != 0 ? suggestedItemDecorator.substitutionMode : null, (27135 & 512) != 0 ? suggestedItemDecorator.inQtyStepperInteraction : false, (27135 & 1024) != 0 ? suggestedItemDecorator.resetStepperState : false, (27135 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedItemDecorator.product : null, (27135 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedItemDecorator.cartEntry : null, (27135 & 8192) != 0 ? suggestedItemDecorator.maxQuantityAllowed : 0.0d, (27135 & 16384) != 0 ? suggestedItemDecorator.productRatings : null));
                }
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, arrayList, null, true, false, 2, null)));
        }
    }

    public final void W(b action) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        Intrinsics.j(action, "action");
        if (action instanceof b.CollapseQuantityStepperAction) {
            EntryInQtyStepperInteraction entryInQtyStepperInteractionP = P();
            if (entryInQtyStepperInteractionP != null) {
                b.CollapseQuantityStepperAction collapseQuantityStepperAction = (b.CollapseQuantityStepperAction) action;
                if (entryInQtyStepperInteractionP.getStepperHitRect().contains(collapseQuantityStepperAction.getTouchX(), collapseQuantityStepperAction.getTouchY())) {
                    return;
                }
                l0(null);
                return;
            }
            return;
        }
        if (action instanceof b.StepperStateChangedAction) {
            b.StepperStateChangedAction stepperStateChangedAction = (b.StepperStateChangedAction) action;
            l0(new EntryInQtyStepperInteraction(stepperStateChangedAction.getProduct().getCode(), stepperStateChangedAction.getStepperHitRect(), false));
            m0(null);
            return;
        }
        if (action instanceof b.ResetActiveStepper) {
            m0(((b.ResetActiveStepper) action).getResourceId());
            return;
        }
        if (action instanceof b.UpdateEntryAction) {
            b.UpdateEntryAction updateEntryAction = (b.UpdateEntryAction) action;
            this.productRank = updateEntryAction.getPosition() + 1;
            u0(updateEntryAction.getProduct(), updateEntryAction.getQuantityToUpdate());
        } else {
            if (!(action instanceof b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.trackingDoNotAddBackup = true;
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
                viewState = value;
                List<SuggestedItemDecorator> listF = viewState.f();
                arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                for (SuggestedItemDecorator suggestedItemDecorator : listF) {
                    arrayList.add(suggestedItemDecorator.a((27135 & 1) != 0 ? suggestedItemDecorator.id : null, (27135 & 2) != 0 ? suggestedItemDecorator.formattedPrice : null, (27135 & 4) != 0 ? suggestedItemDecorator.price : 0.0d, (27135 & 8) != 0 ? suggestedItemDecorator.description : null, (27135 & 16) != 0 ? suggestedItemDecorator.summary : null, (27135 & 32) != 0 ? suggestedItemDecorator.imageUrl : null, (27135 & 64) != 0 ? suggestedItemDecorator.isSelected : false, (27135 & 128) != 0 ? suggestedItemDecorator.unit : null, (27135 & 256) != 0 ? suggestedItemDecorator.substitutionMode : null, (27135 & 512) != 0 ? suggestedItemDecorator.inQtyStepperInteraction : false, (27135 & 1024) != 0 ? suggestedItemDecorator.resetStepperState : false, (27135 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedItemDecorator.product : null, (27135 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedItemDecorator.cartEntry : null, (27135 & 8192) != 0 ? suggestedItemDecorator.maxQuantityAllowed : 0.0d, (27135 & 16384) != 0 ? suggestedItemDecorator.productRatings : null));
                }
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, arrayList, null, false, true, 6, null)));
        }
    }

    public final void g0(mk.i original, mk.f alternative) {
        Intrinsics.j(original, "original");
        C16648k.d(d0.a(this), null, null, new n(original, alternative, null), 3, null);
    }

    @Override // wr.InterfaceC17847a
    /* renamed from: getDisposable, reason: from getter */
    public Nu.a getDisposables() {
        return this.disposables;
    }

    public final InterfaceC17144F<e> getEvents() {
        return C17154h.b(this._events);
    }

    public final void j0() {
        wr.f.r(this.cartInteractor, false, this, 1, null);
    }

    @Override // wr.InterfaceC17847a
    public void observeCart(tk.c<ShoppingCart> cartResource) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        if (cartResource == null) {
            return;
        }
        if (cartResource instanceof c.Failure) {
            uw.a.INSTANCE.f(((c.Failure) cartResource).getError(), "Resource.Failure<Cart>", new Object[0]);
            return;
        }
        if (!(cartResource instanceof c.Success)) {
            uw.a.INSTANCE.a("What else can it be?", new Object[0]);
            return;
        }
        this.shoppingCart = (ShoppingCart) ((c.Success) cartResource).a();
        if (this.substitutionMode == Pp.c.f28365c && this.findSimilarInitialHasLoaded) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
                viewState = value;
                List<SuggestedItemDecorator> listF = viewState.f();
                arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                for (SuggestedItemDecorator suggestedItemDecorator : listF) {
                    arrayList.add(suggestedItemDecorator.a((27135 & 1) != 0 ? suggestedItemDecorator.id : null, (27135 & 2) != 0 ? suggestedItemDecorator.formattedPrice : null, (27135 & 4) != 0 ? suggestedItemDecorator.price : 0.0d, (27135 & 8) != 0 ? suggestedItemDecorator.description : null, (27135 & 16) != 0 ? suggestedItemDecorator.summary : null, (27135 & 32) != 0 ? suggestedItemDecorator.imageUrl : null, (27135 & 64) != 0 ? suggestedItemDecorator.isSelected : false, (27135 & 128) != 0 ? suggestedItemDecorator.unit : null, (27135 & 256) != 0 ? suggestedItemDecorator.substitutionMode : null, (27135 & 512) != 0 ? suggestedItemDecorator.inQtyStepperInteraction : false, (27135 & 1024) != 0 ? suggestedItemDecorator.resetStepperState : false, (27135 & RecyclerView.m.FLAG_MOVED) != 0 ? suggestedItemDecorator.product : null, (27135 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? suggestedItemDecorator.cartEntry : h0(suggestedItemDecorator.getProduct()), (27135 & 8192) != 0 ? suggestedItemDecorator.maxQuantityAllowed : 0.0d, (27135 & 16384) != 0 ? suggestedItemDecorator.productRatings : null));
                }
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, arrayList, new LoadingState(false), false, false, 12, null)));
        }
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        wr.f.r(this.cartInteractor, false, this, 1, null);
    }

    @Override // wr.InterfaceC17847a
    public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
        Intrinsics.j(processedRequest, "processedRequest");
        Intrinsics.j(entryChange, "entryChange");
        if (processedRequest instanceof AbstractC17302a.Add) {
            K(entryChange);
        } else if (processedRequest instanceof AbstractC17302a.Remove) {
            k0(entryChange);
        } else if (!(processedRequest instanceof AbstractC17302a.Update) && !Intrinsics.e(processedRequest, AbstractC17302a.b.f163256b)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(D d10, String str) {
        Intrinsics.g(str);
        d10.cartId = str;
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingData f0(mk.i itemToRemove, mk.i itemToAdd) {
        ProductFullDetails productFullDetails;
        ProductFullDetails productFullDetails2;
        mk.b bVarF;
        mk.f product = itemToAdd.getProduct();
        if (product instanceof ProductFullDetails) {
            productFullDetails = (ProductFullDetails) product;
        } else {
            productFullDetails = null;
        }
        if (productFullDetails == null) {
            productFullDetails2 = new ProductFullDetails(itemToAdd.h2(), null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null);
        } else {
            productFullDetails2 = productFullDetails;
        }
        SuggestedItemDecorator suggestedItemDecorator = (SuggestedItemDecorator) CollectionsKt.u0(this._viewState.getValue().f());
        if (suggestedItemDecorator == null || (bVarF = Co.l.f(null, null, suggestedItemDecorator.getPrice(), null, 0.0d, null, 59, null)) == null) {
            return null;
        }
        W.f1200a.n(new W.SubstitutionPair(itemToAdd, itemToRemove, ProductFullDetails.b(productFullDetails2, null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131073, 268435455, null), null, 8, null));
        return U.f1199a.b(itemToRemove, itemToAdd, productFullDetails2, bVarF.getValue());
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
