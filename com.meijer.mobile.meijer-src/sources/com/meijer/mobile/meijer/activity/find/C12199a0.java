package com.meijer.mobile.meijer.activity.find;

import Kr.PermissionRequestDecorator;
import Pj.a;
import Yq.StoreMapItem;
import android.location.LocationManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pk.StoreDetails;
import pv.C16563h;
import pv.InterfaceC16549B;
import ys.C18372b;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0002FDB3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b1\u00102J!\u00106\u001a\u00020\u00152\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020403¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u001c¢\u0006\u0004\b=\u0010\u001fJ\r\u0010>\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 ¢\u0006\u0004\b@\u0010#J\u0015\u0010B\u001a\u00020\u00152\u0006\u0010A\u001a\u000204¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020O0S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010Y\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\u001eR\u0014\u0010h\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/a0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lyo/f;", "storeManager", "Landroid/location/LocationManager;", "locationManager", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "searchStoresCall", "LZq/b;", "storeInfoRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lyo/f;Landroid/location/LocationManager;Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;LZq/b;Lhi/a;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lpk/h;", "y", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "E", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/gms/maps/model/LatLng;", "location", "F", "(Lcom/google/android/gms/maps/model/LatLng;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "query", "I", "(Ljava/lang/String;)V", "", "stores", "H", "(Ljava/util/List;)V", "", "error", "G", "(Ljava/lang/Throwable;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "Lpk/i;", "searchType", "O", "(Lpk/i;)V", "latLng", "K", "(Lcom/google/android/gms/maps/model/LatLng;)V", "", "", "permissions", "L", "(Ljava/util/Map;)V", "LTq/k;", PlaceTypes.STORE, "M", "(LTq/k;)V", "searchQuery", "N", "P", "()V", "D", "isPickUpMode", "B", "(Z)V", "a", "Lyo/f;", "b", "Landroid/location/LocationManager;", "c", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "d", "LZq/b;", "e", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/find/a0$b;", "f", "Lpv/B;", "_viewState", "Lpv/P;", "g", "Lpv/P;", "A", "()Lpv/P;", "viewState", "value", "h", "Lpk/i;", "x", "()Lpk/i;", "i", "Lcom/google/android/gms/maps/model/LatLng;", "currentLocation", "j", "Lpk/h;", "preferredStore", "k", "currentIndex", "C", "()Z", "isGpsTurnedOn", "l", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12199a0 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: m, reason: collision with root package name */
    public static final int f107438m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocationManager locationManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SearchStoresCall searchStoresCall;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private pk.i searchType;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private LatLng currentLocation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private StoreDetails preferredStore;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ°\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b1\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b8\u0010BR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b/\u0010C\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b:\u0010D\u001a\u0004\b<\u0010ER\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\b\u0019\u0010GR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020H0\f8\u0006¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\b5\u0010;R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020H0\f8\u0006¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\b-\u0010;¨\u0006M"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/a0$b;", "", "Lpk/h;", "preferredStore", "homeStore", "cartStore", "Lpk/i;", "searchType", "LTq/k;", "searchStore", "Lcom/google/android/gms/maps/model/LatLng;", "currentLocation", "", "stores", "currentStores", "LPj/a;", "storesLoadingState", "LKr/b;", "LKr/a;", "permissionRequest", "", "searchQuery", "Lbk/a;", "resultLabel", "", "isPickUpMode", "<init>", "(Lpk/h;Lpk/h;Lpk/h;Lpk/i;LTq/k;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;Ljava/util/List;LPj/a;LKr/b;Ljava/lang/String;Lbk/a;Z)V", "a", "(Lpk/h;Lpk/h;Lpk/h;Lpk/i;LTq/k;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;Ljava/util/List;LPj/a;LKr/b;Ljava/lang/String;Lbk/a;Z)Lcom/meijer/mobile/meijer/activity/find/a0$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lpk/h;", "h", "()Lpk/h;", "b", "getHomeStore", "c", "getCartStore", "d", "Lpk/i;", "k", "()Lpk/i;", "e", "LTq/k;", "getSearchStore", "()LTq/k;", "f", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "g", "Ljava/util/List;", "l", "()Ljava/util/List;", "i", "LPj/a;", "m", "()LPj/a;", "j", "LKr/b;", "()LKr/b;", "Ljava/lang/String;", "Lbk/a;", "()Lbk/a;", "Z", "()Z", "LYq/d;", "n", "mapItems", "o", "currentMapItems", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails preferredStore;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails homeStore;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails cartStore;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final pk.i searchType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tq.k searchStore;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final LatLng currentLocation;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StoreDetails> stores;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StoreDetails> currentStores;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a storesLoadingState;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final PermissionRequestDecorator<Kr.a> permissionRequest;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchQuery;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a resultLabel;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPickUpMode;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final List<StoreMapItem> mapItems;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final List<StoreMapItem> currentMapItems;

        public ViewState() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.preferredStore, viewState.preferredStore) && Intrinsics.e(this.homeStore, viewState.homeStore) && Intrinsics.e(this.cartStore, viewState.cartStore) && this.searchType == viewState.searchType && Intrinsics.e(this.searchStore, viewState.searchStore) && Intrinsics.e(this.currentLocation, viewState.currentLocation) && Intrinsics.e(this.stores, viewState.stores) && Intrinsics.e(this.currentStores, viewState.currentStores) && Intrinsics.e(this.storesLoadingState, viewState.storesLoadingState) && Intrinsics.e(this.permissionRequest, viewState.permissionRequest) && Intrinsics.e(this.searchQuery, viewState.searchQuery) && Intrinsics.e(this.resultLabel, viewState.resultLabel) && this.isPickUpMode == viewState.isPickUpMode;
        }

        public int hashCode() {
            StoreDetails storeDetails = this.preferredStore;
            int iHashCode = (storeDetails == null ? 0 : storeDetails.hashCode()) * 31;
            StoreDetails storeDetails2 = this.homeStore;
            int iHashCode2 = (iHashCode + (storeDetails2 == null ? 0 : storeDetails2.hashCode())) * 31;
            StoreDetails storeDetails3 = this.cartStore;
            int iHashCode3 = (((iHashCode2 + (storeDetails3 == null ? 0 : storeDetails3.hashCode())) * 31) + this.searchType.hashCode()) * 31;
            Tq.k kVar = this.searchStore;
            int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            LatLng latLng = this.currentLocation;
            int iHashCode5 = (((((((iHashCode4 + (latLng == null ? 0 : latLng.hashCode())) * 31) + this.stores.hashCode()) * 31) + this.currentStores.hashCode()) * 31) + this.storesLoadingState.hashCode()) * 31;
            PermissionRequestDecorator<Kr.a> permissionRequestDecorator = this.permissionRequest;
            return ((((((iHashCode5 + (permissionRequestDecorator != null ? permissionRequestDecorator.hashCode() : 0)) * 31) + this.searchQuery.hashCode()) * 31) + this.resultLabel.hashCode()) * 31) + Boolean.hashCode(this.isPickUpMode);
        }

        public String toString() {
            return "ViewState(preferredStore=" + this.preferredStore + ", homeStore=" + this.homeStore + ", cartStore=" + this.cartStore + ", searchType=" + this.searchType + ", searchStore=" + this.searchStore + ", currentLocation=" + this.currentLocation + ", stores=" + this.stores + ", currentStores=" + this.currentStores + ", storesLoadingState=" + this.storesLoadingState + ", permissionRequest=" + this.permissionRequest + ", searchQuery=" + this.searchQuery + ", resultLabel=" + this.resultLabel + ", isPickUpMode=" + this.isPickUpMode + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(StoreDetails storeDetails, StoreDetails storeDetails2, StoreDetails storeDetails3, pk.i searchType, Tq.k kVar, LatLng latLng, List<StoreDetails> stores, List<StoreDetails> currentStores, Pj.a storesLoadingState, PermissionRequestDecorator<? extends Kr.a> permissionRequestDecorator, String searchQuery, AbstractC6392a resultLabel, boolean z10) {
            Intrinsics.j(searchType, "searchType");
            Intrinsics.j(stores, "stores");
            Intrinsics.j(currentStores, "currentStores");
            Intrinsics.j(storesLoadingState, "storesLoadingState");
            Intrinsics.j(searchQuery, "searchQuery");
            Intrinsics.j(resultLabel, "resultLabel");
            this.preferredStore = storeDetails;
            this.homeStore = storeDetails2;
            this.cartStore = storeDetails3;
            this.searchType = searchType;
            this.searchStore = kVar;
            this.currentLocation = latLng;
            this.stores = stores;
            this.currentStores = currentStores;
            this.storesLoadingState = storesLoadingState;
            this.permissionRequest = permissionRequestDecorator;
            this.searchQuery = searchQuery;
            this.resultLabel = resultLabel;
            this.isPickUpMode = z10;
            List<StoreDetails> list = stores;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            int i10 = 0;
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.w();
                }
                arrayList.add(new StoreMapItem(i11, (StoreDetails) obj, this.preferredStore, this.homeStore, this.cartStore, this.searchType, null, null, null, null, false, null, null, 8128, null));
                i11 = i12;
            }
            this.mapItems = arrayList;
            List<StoreDetails> list2 = this.currentStores;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                int i13 = i10;
                if (!it.hasNext()) {
                    this.currentMapItems = arrayList2;
                    return;
                }
                Object next = it.next();
                i10 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.w();
                }
                arrayList2.add(new StoreMapItem(i13, (StoreDetails) next, this.isPickUpMode ? this.preferredStore : null, this.homeStore, this.cartStore, this.searchType, null, null, null, null, false, null, null, 8128, null));
            }
        }

        public static /* synthetic */ ViewState b(ViewState viewState, StoreDetails storeDetails, StoreDetails storeDetails2, StoreDetails storeDetails3, pk.i iVar, Tq.k kVar, LatLng latLng, List list, List list2, Pj.a aVar, PermissionRequestDecorator permissionRequestDecorator, String str, AbstractC6392a abstractC6392a, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeDetails = viewState.preferredStore;
            }
            return viewState.a(storeDetails, (i10 & 2) != 0 ? viewState.homeStore : storeDetails2, (i10 & 4) != 0 ? viewState.cartStore : storeDetails3, (i10 & 8) != 0 ? viewState.searchType : iVar, (i10 & 16) != 0 ? viewState.searchStore : kVar, (i10 & 32) != 0 ? viewState.currentLocation : latLng, (i10 & 64) != 0 ? viewState.stores : list, (i10 & 128) != 0 ? viewState.currentStores : list2, (i10 & 256) != 0 ? viewState.storesLoadingState : aVar, (i10 & 512) != 0 ? viewState.permissionRequest : permissionRequestDecorator, (i10 & 1024) != 0 ? viewState.searchQuery : str, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.resultLabel : abstractC6392a, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.isPickUpMode : z10);
        }

        public final ViewState a(StoreDetails preferredStore, StoreDetails homeStore, StoreDetails cartStore, pk.i searchType, Tq.k searchStore, LatLng currentLocation, List<StoreDetails> stores, List<StoreDetails> currentStores, Pj.a storesLoadingState, PermissionRequestDecorator<? extends Kr.a> permissionRequest, String searchQuery, AbstractC6392a resultLabel, boolean isPickUpMode) {
            Intrinsics.j(searchType, "searchType");
            Intrinsics.j(stores, "stores");
            Intrinsics.j(currentStores, "currentStores");
            Intrinsics.j(storesLoadingState, "storesLoadingState");
            Intrinsics.j(searchQuery, "searchQuery");
            Intrinsics.j(resultLabel, "resultLabel");
            return new ViewState(preferredStore, homeStore, cartStore, searchType, searchStore, currentLocation, stores, currentStores, storesLoadingState, permissionRequest, searchQuery, resultLabel, isPickUpMode);
        }

        /* renamed from: c, reason: from getter */
        public final LatLng getCurrentLocation() {
            return this.currentLocation;
        }

        public final List<StoreMapItem> d() {
            return this.currentMapItems;
        }

        public final List<StoreDetails> e() {
            return this.currentStores;
        }

        public final List<StoreMapItem> f() {
            return this.mapItems;
        }

        public final PermissionRequestDecorator<Kr.a> g() {
            return this.permissionRequest;
        }

        /* renamed from: h, reason: from getter */
        public final StoreDetails getPreferredStore() {
            return this.preferredStore;
        }

        /* renamed from: i, reason: from getter */
        public final AbstractC6392a getResultLabel() {
            return this.resultLabel;
        }

        /* renamed from: j, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        /* renamed from: k, reason: from getter */
        public final pk.i getSearchType() {
            return this.searchType;
        }

        public final List<StoreDetails> l() {
            return this.stores;
        }

        /* renamed from: m, reason: from getter */
        public final Pj.a getStoresLoadingState() {
            return this.storesLoadingState;
        }

        public /* synthetic */ ViewState(StoreDetails storeDetails, StoreDetails storeDetails2, StoreDetails storeDetails3, pk.i iVar, Tq.k kVar, LatLng latLng, List list, List list2, Pj.a aVar, PermissionRequestDecorator permissionRequestDecorator, String str, AbstractC6392a abstractC6392a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : storeDetails, (i10 & 2) != 0 ? null : storeDetails2, (i10 & 4) != 0 ? null : storeDetails3, (i10 & 8) != 0 ? pk.i.f156745c : iVar, (i10 & 16) != 0 ? null : kVar, (i10 & 32) != 0 ? null : latLng, (i10 & 64) != 0 ? CollectionsKt.m() : list, (i10 & 128) != 0 ? CollectionsKt.m() : list2, (i10 & 256) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 512) == 0 ? permissionRequestDecorator : null, (i10 & 1024) != 0 ? "" : str, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? AbstractC6392a.INSTANCE.d(Vq.c.f40190w, new Object[0]) : abstractC6392a, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? true : z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel", f = "FindStoreViewModel.kt", l = {170}, m = "getStoreDetails")
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f107465a;

        /* renamed from: b, reason: collision with root package name */
        Object f107466b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f107467c;

        /* renamed from: e, reason: collision with root package name */
        int f107469e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f107467c = obj;
            this.f107469e |= Integer.MIN_VALUE;
            return C12199a0.this.y(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel", f = "FindStoreViewModel.kt", l = {192}, m = "loadStoresByDistance")
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f107470a;

        /* renamed from: b, reason: collision with root package name */
        Object f107471b;

        /* renamed from: c, reason: collision with root package name */
        Object f107472c;

        /* renamed from: d, reason: collision with root package name */
        Object f107473d;

        /* renamed from: e, reason: collision with root package name */
        Object f107474e;

        /* renamed from: f, reason: collision with root package name */
        int f107475f;

        /* renamed from: g, reason: collision with root package name */
        int f107476g;

        /* renamed from: h, reason: collision with root package name */
        int f107477h;

        /* renamed from: i, reason: collision with root package name */
        int f107478i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f107479j;

        /* renamed from: l, reason: collision with root package name */
        int f107481l;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f107479j = obj;
            this.f107481l |= Integer.MIN_VALUE;
            return C12199a0.this.F(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel$onResume$1", f = "FindStoreViewModel.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107482a;

        /* renamed from: b, reason: collision with root package name */
        Object f107483b;

        /* renamed from: c, reason: collision with root package name */
        Object f107484c;

        /* renamed from: d, reason: collision with root package name */
        Object f107485d;

        /* renamed from: e, reason: collision with root package name */
        int f107486e;

        /* renamed from: f, reason: collision with root package name */
        int f107487f;

        /* renamed from: g, reason: collision with root package name */
        int f107488g;

        /* renamed from: h, reason: collision with root package name */
        int f107489h;

        /* renamed from: i, reason: collision with root package name */
        int f107490i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f107491j;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C12199a0.this.new e(continuation);
            eVar.f107491j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object objY;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107490i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f107491j;
                    C12199a0 c12199a0 = C12199a0.this;
                    Result.Companion companion = Result.INSTANCE;
                    int iB = c12199a0.storeManager.b();
                    this.f107491j = interfaceC15783O;
                    this.f107482a = interfaceC15783O;
                    this.f107483b = this;
                    this.f107484c = this;
                    this.f107485d = interfaceC15783O;
                    this.f107486e = 0;
                    this.f107487f = 0;
                    this.f107488g = 0;
                    this.f107489h = 0;
                    this.f107490i = 1;
                    objY = c12199a0.y(iB, this);
                    if (objY == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objY = obj;
                }
                objB = Result.b(objY);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.u(thE, "Failed to load home store.", new Object[0]);
            }
            C12199a0 c12199a02 = C12199a0.this;
            if (Result.h(objB)) {
                StoreDetails storeDetails = (StoreDetails) objB;
                InterfaceC16549B interfaceC16549B = c12199a02._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, storeDetails, null, null, null, null, null, null, null, null, null, null, false, 8189, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel$onResume$2", f = "FindStoreViewModel.kt", l = {87}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107493a;

        /* renamed from: b, reason: collision with root package name */
        Object f107494b;

        /* renamed from: c, reason: collision with root package name */
        Object f107495c;

        /* renamed from: d, reason: collision with root package name */
        Object f107496d;

        /* renamed from: e, reason: collision with root package name */
        int f107497e;

        /* renamed from: f, reason: collision with root package name */
        int f107498f;

        /* renamed from: g, reason: collision with root package name */
        int f107499g;

        /* renamed from: h, reason: collision with root package name */
        int f107500h;

        /* renamed from: i, reason: collision with root package name */
        int f107501i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f107502j;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C12199a0.this.new f(continuation);
            fVar.f107502j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object objY;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107501i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f107502j;
                    C12199a0 c12199a0 = C12199a0.this;
                    Result.Companion companion = Result.INSTANCE;
                    int iL = c12199a0.storeManager.l();
                    this.f107502j = interfaceC15783O;
                    this.f107493a = interfaceC15783O;
                    this.f107494b = this;
                    this.f107495c = this;
                    this.f107496d = interfaceC15783O;
                    this.f107497e = 0;
                    this.f107498f = 0;
                    this.f107499g = 0;
                    this.f107500h = 0;
                    this.f107501i = 1;
                    objY = c12199a0.y(iL, this);
                    if (objY == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objY = obj;
                }
                objB = Result.b(objY);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.u(thE, "Failed to load cart store.", new Object[0]);
            }
            C12199a0 c12199a02 = C12199a0.this;
            if (Result.h(objB)) {
                StoreDetails storeDetails = (StoreDetails) objB;
                InterfaceC16549B interfaceC16549B = c12199a02._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, storeDetails, null, null, null, null, null, null, null, null, null, false, 8187, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel$searchStores$3", f = "FindStoreViewModel.kt", l = {234}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107504a;

        /* renamed from: b, reason: collision with root package name */
        Object f107505b;

        /* renamed from: c, reason: collision with root package name */
        Object f107506c;

        /* renamed from: d, reason: collision with root package name */
        Object f107507d;

        /* renamed from: e, reason: collision with root package name */
        int f107508e;

        /* renamed from: f, reason: collision with root package name */
        int f107509f;

        /* renamed from: g, reason: collision with root package name */
        int f107510g;

        /* renamed from: h, reason: collision with root package name */
        int f107511h;

        /* renamed from: i, reason: collision with root package name */
        int f107512i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f107513j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f107515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f107515l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = C12199a0.this.new g(this.f107515l, continuation);
            gVar.f107513j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f107512i
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                java.lang.Object r0 = r10.f107507d
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r10.f107506c
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = r10.f107505b
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = r10.f107504a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r10.f107513j
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L24
                r9 = r10
                goto L6b
            L24:
                r0 = move-exception
                r11 = r0
                r9 = r10
                goto L9d
            L29:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L31:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f107513j
                mv.O r11 = (mv.InterfaceC15783O) r11
                com.meijer.mobile.meijer.activity.find.a0 r1 = com.meijer.mobile.meijer.activity.find.C12199a0.this
                java.lang.String r4 = r10.f107515l
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L9a
                com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall r3 = com.meijer.mobile.meijer.activity.find.C12199a0.n(r1)     // Catch: java.lang.Exception -> L9a
                boolean r7 = com.meijer.mobile.meijer.activity.find.C12199a0.r(r1)     // Catch: java.lang.Exception -> L9a
                pk.i r8 = r1.getSearchType()     // Catch: java.lang.Exception -> L9a
                r10.f107513j = r11     // Catch: java.lang.Exception -> L9a
                r10.f107504a = r11     // Catch: java.lang.Exception -> L9a
                r10.f107505b = r10     // Catch: java.lang.Exception -> L9a
                r10.f107506c = r10     // Catch: java.lang.Exception -> L9a
                r10.f107507d = r11     // Catch: java.lang.Exception -> L9a
                r11 = 0
                r10.f107508e = r11     // Catch: java.lang.Exception -> L9a
                r10.f107509f = r11     // Catch: java.lang.Exception -> L9a
                r10.f107510g = r11     // Catch: java.lang.Exception -> L9a
                r10.f107511h = r11     // Catch: java.lang.Exception -> L9a
                r10.f107512i = r2     // Catch: java.lang.Exception -> L9a
                r5 = 3000(0xbb8, float:4.204E-42)
                r6 = 10
                r9 = r10
                java.lang.Object r11 = r3.getObservable(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L92
                if (r11 != r0) goto L6b
                return r0
            L6b:
                java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Exception -> L92
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L92
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.x(r11, r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L92
            L7c:
                boolean r1 = r11.hasNext()     // Catch: java.lang.Exception -> L92
                if (r1 == 0) goto L95
                java.lang.Object r1 = r11.next()     // Catch: java.lang.Exception -> L92
                com.meijer.mobile.storeinfo.api.model.Store r1 = (com.meijer.mobile.storeinfo.api.model.Store) r1     // Catch: java.lang.Exception -> L92
                com.meijer.mobile.storeinfo.api.model.Store$a r2 = com.meijer.mobile.storeinfo.api.model.Store.INSTANCE     // Catch: java.lang.Exception -> L92
                pk.h r1 = r2.a(r1)     // Catch: java.lang.Exception -> L92
                r0.add(r1)     // Catch: java.lang.Exception -> L92
                goto L7c
            L92:
                r0 = move-exception
            L93:
                r11 = r0
                goto L9d
            L95:
                java.lang.Object r11 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L92
                goto Lae
            L9a:
                r0 = move-exception
                r9 = r10
                goto L93
            L9d:
                kotlin.coroutines.CoroutineContext r0 = r10.getContext()
                mv.E0.i(r0)
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r11 = kotlin.ResultKt.a(r11)
                java.lang.Object r11 = kotlin.Result.b(r11)
            Lae:
                com.meijer.mobile.meijer.activity.find.a0 r0 = com.meijer.mobile.meijer.activity.find.C12199a0.this
                boolean r1 = kotlin.Result.h(r11)
                if (r1 == 0) goto Lbc
                r1 = r11
                java.util.List r1 = (java.util.List) r1
                com.meijer.mobile.meijer.activity.find.C12199a0.v(r0, r1)
            Lbc:
                com.meijer.mobile.meijer.activity.find.a0 r0 = com.meijer.mobile.meijer.activity.find.C12199a0.this
                java.lang.Throwable r11 = kotlin.Result.e(r11)
                if (r11 == 0) goto Lc7
                com.meijer.mobile.meijer.activity.find.C12199a0.u(r0, r11)
            Lc7:
                kotlin.Unit r11 = kotlin.Unit.f143329a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12199a0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel$setCurrentLocation$2", f = "FindStoreViewModel.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107516a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12199a0.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107516a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12199a0 c12199a0 = C12199a0.this;
                this.f107516a = 1;
                if (c12199a0.E(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.FindStoreViewModel$setPreferredStore$1", f = "FindStoreViewModel.kt", l = {158, 165}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.a0$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107518a;

        /* renamed from: b, reason: collision with root package name */
        Object f107519b;

        /* renamed from: c, reason: collision with root package name */
        Object f107520c;

        /* renamed from: d, reason: collision with root package name */
        Object f107521d;

        /* renamed from: e, reason: collision with root package name */
        Object f107522e;

        /* renamed from: f, reason: collision with root package name */
        int f107523f;

        /* renamed from: g, reason: collision with root package name */
        int f107524g;

        /* renamed from: h, reason: collision with root package name */
        int f107525h;

        /* renamed from: i, reason: collision with root package name */
        int f107526i;

        /* renamed from: j, reason: collision with root package name */
        int f107527j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f107528k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Tq.k f107530m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = C12199a0.this.new i(this.f107530m, continuation);
            iVar.f107528k = obj;
            return iVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Tq.k kVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f107530m = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
        
            if (r0.E(r24) != r2) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12199a0.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12199a0(yo.f storeManager, LocationManager locationManager, SearchStoresCall searchStoresCall, Zq.b storeInfoRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(searchStoresCall, "searchStoresCall");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.storeManager = storeManager;
        this.locationManager = locationManager;
        this.searchStoresCall = searchStoresCall;
        this.storeInfoRepository = storeInfoRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(null, null, null, null, storeManager.a(), null, null, null, null, null, null, null, false, 8174, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C() {
        LocationManager locationManager = this.locationManager;
        return locationManager != null && locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(Continuation<? super Unit> continuation) {
        LatLng latLngA = this.currentLocation;
        if (latLngA == null) {
            StoreDetails storeDetails = this.preferredStore;
            latLngA = storeDetails != null ? Yq.f.a(storeDetails) : null;
        }
        if (latLngA == null) {
            return Unit.f143329a;
        }
        Object objF = F(latLngA, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(com.google.android.gms.maps.model.LatLng r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12199a0.F(com.google.android.gms.maps.model.LatLng, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Throwable error) {
        ViewState value;
        qw.a.INSTANCE.u(error, "Search failed for query '" + this.viewState.getValue().getSearchQuery() + '\'', new Object[0]);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, null, null, CollectionsKt.m(), null, new a.Failed(null, AbstractC6392a.INSTANCE.d(Vq.c.f40135E, new Object[0]), 1, null), null, null, null, false, 7871, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(List<StoreDetails> stores) {
        ViewState value;
        ViewState value2;
        List<StoreDetails> list = stores;
        if (list.isEmpty()) {
            qw.a.INSTANCE.a("No Stores Found for query '" + this.viewState.getValue().getSearchQuery() + '\'', new Object[0]);
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, null, null, stores, null, new a.Failed(null, AbstractC6392a.INSTANCE.d(Vq.c.f40191x, new Object[0]), 1, null), null, null, null, false, 7871, null)));
            return;
        }
        qw.a.INSTANCE.a("Found " + list.size() + " stores for query '" + this.viewState.getValue().getSearchQuery() + '\'', new Object[0]);
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
        do {
            value2 = interfaceC16549B2.getValue();
        } while (!interfaceC16549B2.e(value2, ViewState.b(value2, null, null, null, null, null, null, stores, null, new a.NotLoading(null, 1, null), null, null, null, false, 7871, null)));
        D(stores);
    }

    private final void I(final String query) {
        ViewState value;
        if (this.viewState.getValue().getStoresLoadingState().getIsLoading()) {
            return;
        }
        if (this.searchType == pk.i.f156743a) {
            this.analyticsEngine.b(C14756c.a("event: gas station look up"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12199a0.J(query, (TrackingData) obj);
                }
            });
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, null, null, null, null, new a.Loading(null, null, 3, null), null, null, AbstractC6392a.INSTANCE.d(C18372b.f172068s, new Object[0]), false, 5887, null)));
        C15809k.d(androidx.view.d0.a(this), null, null, new g(query, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("fuel detail");
        track.v("menu");
        track.h("stationsearch", str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(int r6, kotlin.coroutines.Continuation<? super pk.StoreDetails> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.find.C12199a0.c
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.find.a0$c r0 = (com.meijer.mobile.meijer.activity.find.C12199a0.c) r0
            int r1 = r0.f107469e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107469e = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.a0$c r0 = new com.meijer.mobile.meijer.activity.find.a0$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f107467c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f107469e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f107466b
            com.meijer.mobile.storeinfo.api.model.Store$a r6 = (com.meijer.mobile.storeinfo.api.model.Store.Companion) r6
            kotlin.ResultKt.b(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            com.meijer.mobile.storeinfo.api.model.Store$a r7 = com.meijer.mobile.storeinfo.api.model.Store.INSTANCE
            Zq.b r2 = r5.storeInfoRepository
            r0.f107466b = r7
            r0.f107465a = r6
            r0.f107469e = r3
            java.lang.Object r6 = r2.e(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r4 = r7
            r7 = r6
            r6 = r4
        L4c:
            com.meijer.mobile.storeinfo.api.model.StoreInfo r7 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r7
            java.util.List r7 = r7.a()
            java.lang.Object r7 = kotlin.collections.CollectionsKt.s0(r7)
            com.meijer.mobile.storeinfo.api.model.Store r7 = (com.meijer.mobile.storeinfo.api.model.Store) r7
            pk.h r6 = r6.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12199a0.y(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final pv.P<ViewState> A() {
        return this.viewState;
    }

    public final void B(boolean isPickUpMode) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, null, null, null, null, null, null, null, null, isPickUpMode, l3.f93322b, null)));
    }

    public final void D(List<StoreDetails> stores) {
        ViewState value;
        Intrinsics.j(stores, "stores");
        List listB1 = CollectionsKt.b1(CollectionsKt.j0(stores, this.currentIndex), 5);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, null, null, null, CollectionsKt.P0(this.viewState.getValue().e(), listB1), null, null, null, null, false, 8063, null)));
        this.currentIndex += listB1.size();
    }

    public final void K(LatLng latLng) {
        ViewState value;
        ViewState viewStateB;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewStateB = ViewState.b(value, null, null, null, null, null, latLng, null, null, null, null, null, null, false, 8159, null);
        } while (!interfaceC16549B.e(value, viewStateB));
        this.currentLocation = viewStateB.getCurrentLocation();
        C15809k.d(androidx.view.d0.a(this), null, null, new h(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(java.util.Map<java.lang.String, java.lang.Boolean> r21) {
        /*
            r20 = this;
            java.lang.String r0 = "permissions"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            java.util.Collection r0 = r1.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L1c
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L20
            Kr.b r0 = new Kr.b
            java.util.Set r2 = r1.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.j1(r2)
            bk.a$a r4 = bk.AbstractC6392a.INSTANCE
            int r5 = yr.Q.f171740H
            java.lang.Object[] r6 = new java.lang.Object[r3]
            bk.a r5 = r4.d(r5, r6)
            int r6 = yr.Q.f171782p
            java.lang.Object[] r3 = new java.lang.Object[r3]
            bk.a r3 = r4.d(r6, r3)
            Kr.a$a r4 = new Kr.a$a
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.j1(r1)
            r4.<init>(r1)
            r0.<init>(r2, r5, r3, r4)
        L62:
            r11 = r0
            r0 = r20
            goto L92
        L66:
            boolean r0 = r20.C()
            if (r0 != 0) goto L90
            Kr.b r0 = new Kr.b
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.j1(r1)
            bk.a$a r2 = bk.AbstractC6392a.INSTANCE
            int r4 = yr.Q.f171741I
            java.lang.Object[] r5 = new java.lang.Object[r3]
            bk.a r4 = r2.d(r4, r5)
            int r5 = yr.Q.f171783q
            java.lang.Object[] r3 = new java.lang.Object[r3]
            bk.a r2 = r2.d(r5, r3)
            Kr.a$b r3 = Kr.a.b.f17668a
            r0.<init>(r1, r4, r2, r3)
            goto L62
        L90:
            r0 = 0
            goto L62
        L92:
            pv.B<com.meijer.mobile.meijer.activity.find.a0$b> r1 = r0._viewState
        L94:
            java.lang.Object r2 = r1.getValue()
            r3 = r1
            r1 = r2
            com.meijer.mobile.meijer.activity.find.a0$b r1 = (com.meijer.mobile.meijer.activity.find.C12199a0.ViewState) r1
            r15 = 7679(0x1dff, float:1.076E-41)
            r16 = 0
            r4 = r2
            r2 = 0
            r5 = r3
            r3 = 0
            r6 = r4
            r4 = 0
            r7 = r5
            r5 = 0
            r8 = r6
            r6 = 0
            r9 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r12 = r9
            r9 = 0
            r13 = r10
            r10 = 0
            r14 = r12
            r12 = 0
            r17 = r13
            r13 = 0
            r18 = r14
            r14 = 0
            r19 = r17
            r0 = r18
            com.meijer.mobile.meijer.activity.find.a0$b r1 = com.meijer.mobile.meijer.activity.find.C12199a0.ViewState.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r19
            boolean r1 = r0.e(r4, r1)
            if (r1 == 0) goto Lcb
            return
        Lcb:
            r1 = r0
            r0 = r20
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.C12199a0.L(java.util.Map):void");
    }

    public final void M(Tq.k store) {
        Intrinsics.j(store, "store");
        C15809k.d(androidx.view.d0.a(this), null, null, new i(store, null), 3, null);
    }

    public final void N(String searchQuery) {
        String searchQuery2 = searchQuery;
        Intrinsics.j(searchQuery2, "searchQuery");
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            InterfaceC16549B<ViewState> interfaceC16549B2 = interfaceC16549B;
            if (interfaceC16549B2.e(value, ViewState.b(value, null, null, null, null, null, null, null, null, null, null, searchQuery2, null, false, 7167, null))) {
                return;
            }
            searchQuery2 = searchQuery;
            interfaceC16549B = interfaceC16549B2;
        }
    }

    public final void O(pk.i searchType) {
        ViewState value;
        pk.i iVar;
        ViewState viewStateB;
        M(searchType == pk.i.f156747e ? this.storeManager.a() : this.storeManager.h());
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            ViewState viewState = value;
            pk.i iVar2 = pk.i.f156747e;
            if (searchType != iVar2) {
                iVar = this.storeManager.g() == 0 ? pk.i.f156745c : pk.i.f156744b;
            } else {
                iVar = searchType;
            }
            viewStateB = ViewState.b(viewState, null, null, null, iVar, searchType == iVar2 ? this.storeManager.a() : this.storeManager.h(), null, null, null, null, null, null, null, false, 8167, null);
        } while (!interfaceC16549B.e(value, viewStateB));
        this.searchType = viewStateB.getSearchType();
    }

    public final void P() {
        I(this.viewState.getValue().getSearchQuery());
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        if (this.storeManager.b() != 0) {
            C15809k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
        }
        if (this.storeManager.l() != 0) {
            C15809k.d(androidx.view.d0.a(this), null, null, new f(null), 3, null);
        }
    }

    /* renamed from: x, reason: from getter */
    public final pk.i getSearchType() {
        return this.searchType;
    }
}
