package com.meijer.mobile.meijer.activity.store;

import Bl.s;
import Bm.C3013x;
import Ci.m;
import Cj.o;
import In.I;
import In.StoreDetailState;
import Jn.f;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import Or.A;
import P0.e;
import V2.CreationExtras;
import Xq.w;
import Yq.StoreMapItem;
import Yq.StoreMarker;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.store.StoreDetailActivity;
import com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker;
import dk.C13698b;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import hi.InterfaceC14523a;
import j0.C14903g;
import j0.InterfaceC14882C;
import java.io.Serializable;
import java.util.List;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C17987a1;
import kotlin.C18029o1;
import kotlin.EnumC18023m1;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import le.C15485b;
import mv.InterfaceC15783O;
import p1.C16338g;
import pk.StoreDetails;
import pv.C16563h;
import pv.InterfaceC16553F;
import si.j;
import yr.C18370z;
import zl.AbstractC18503f;
import zl.k;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0014\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001b\u0010d\u001a\u00020_8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010wR\u0016\u0010z\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010wR\u0016\u0010~\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010hR\u0017\u0010\u0083\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001¨\u0006\u008c\u0001²\u0006\u000e\u0010\u008b\u0001\u001a\u00030\u008a\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lg/a;", "result", "", "J1", "(Lg/a;)V", "", "isNewAddressQualifierEnabled", "Lbk/a;", "y1", "(Z)Lbk/a;", "I1", "N1", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "P1", "(Lpk/h;Lpk/i;)V", "z1", "(Lpk/h;)V", "", "phoneNumber", "M1", "(Ljava/lang/String;)V", "streetAddress", "city", "state", "zip", "O1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "K1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LUn/a;", "v", "LUn/a;", "C1", "()LUn/a;", "setGeoFenceStoreSetupPermissions", "(LUn/a;)V", "geoFenceStoreSetupPermissions", "Lyo/f;", "w", "Lyo/f;", "F1", "()Lyo/f;", "setStoreManager$Meijer_playstoreRelease", "(Lyo/f;)V", "storeManager", "Lhi/a;", "x", "Lhi/a;", "getAnalyticsEngine$Meijer_playstoreRelease", "()Lhi/a;", "setAnalyticsEngine$Meijer_playstoreRelease", "(Lhi/a;)V", "analyticsEngine", "LZq/b;", "y", "LZq/b;", "getStoreInfoRepository$Meijer_playstoreRelease", "()LZq/b;", "setStoreInfoRepository$Meijer_playstoreRelease", "(LZq/b;)V", "storeInfoRepository", "LDl/e;", "z", "LDl/e;", "D1", "()LDl/e;", "setMeijerIntent$Meijer_playstoreRelease", "(LDl/e;)V", "meijerIntent", "Lzl/k;", "A", "Lzl/k;", "B1", "()Lzl/k;", "setFeatureManager$Meijer_playstoreRelease", "(Lzl/k;)V", "featureManager", "LCs/b;", "B", "LCs/b;", "G1", "()LCs/b;", "setUserManager", "(LCs/b;)V", "userManager", "LJn/f;", "C", "Lkotlin/Lazy;", "H1", "()LJn/f;", "viewModel", "Lg/c;", "Landroid/content/Intent;", "D", "Lg/c;", "orderOptionsFindStoreResultLauncher", "Landroid/net/Uri;", "E", "Landroid/net/Uri;", "uri", "F", "Lpk/h;", "", "G", "I", "previousStoreId", "H", "Lpk/i;", "Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity$a;", "Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity$a;", "storeId", "J", "deeplinkCode", "Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity$b;", "K", "Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity$b;", "storeName", "L", "selectGasStationResultLauncher", "E1", "()Z", "returnHome", "A1", "exitSearch", "L1", "isFromGasStationDetails", "a", "b", "LJn/f$e;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class StoreDetailActivity extends Hilt_StoreDetailActivity {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public k featureManager;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public Cs.b userManager;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private StoreDetails storeDetails;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int previousStoreId;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private pk.i storeSearchType;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private LockedInt storeId;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private LockedInt deeplinkCode;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private LockedString storeName;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Un.a geoFenceStoreSetupPermissions;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public yo.f storeManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Zq.b storeInfoRepository;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Jn.f.class), new h(this), new g(this), new i(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> orderOptionsFindStoreResultLauncher = registerForActivityResult(new h.i(), new e());

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> selectGasStationResultLauncher = registerForActivityResult(new h.i(), new f());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity$a;", "", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.store.StoreDetailActivity$a, reason: from toString */
    public static final /* data */ class LockedInt {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LockedInt) && this.value == ((LockedInt) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "LockedInt(value=" + this.value + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public LockedInt(int i10) {
            this.value = i10;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/store/StoreDetailActivity$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.store.StoreDetailActivity$b, reason: from toString */
    public static final /* data */ class LockedString {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LockedString) && Intrinsics.e(this.value, ((LockedString) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "LockedString(value=" + this.value + ')';
        }

        public LockedString(String value) {
            Intrinsics.j(value, "value");
            this.value = value;
        }

        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pk.i.values().length];
            try {
                iArr[pk.i.f156746d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pk.i.f156747e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pk.i.f156743a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pk.i.f156744b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pk.i.f156745c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ StoreDetailActivity f113412a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.store.StoreDetailActivity$d$a$a, reason: collision with other inner class name */
            static final class C1789a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113413a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ StoreDetailActivity f113414b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.store.StoreDetailActivity$d$a$a$a, reason: collision with other inner class name */
                static final class C1790a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113415a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ StoreDetailActivity f113416b;

                    C1790a(LocalThemeScope localThemeScope, StoreDetailActivity storeDetailActivity) {
                        this.f113415a = localThemeScope;
                        this.f113416b = storeDetailActivity;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1826692495, i10, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreDetailActivity.kt:184)");
                        }
                        LocalThemeScope localThemeScope = this.f113415a;
                        StoreDetailActivity storeDetailActivity = this.f113416b;
                        Dr.g.g(localThemeScope, C13698b.a(storeDetailActivity.y1(storeDetailActivity.B1().e(AbstractC18503f.K.f172850h)), composer, AbstractC6392a.f60445b), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-887779535, i10, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (StoreDetailActivity.kt:182)");
                    }
                    LocalThemeScope localThemeScope = this.f113413a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1826692495, true, new C1790a(localThemeScope, this.f113414b), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f113414b);
                    final StoreDetailActivity storeDetailActivity = this.f113414b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.store.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return StoreDetailActivity.d.a.C1789a.c(storeDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(o.f5080p, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1789a(LocalThemeScope localThemeScope, StoreDetailActivity storeDetailActivity) {
                    this.f113413a = localThemeScope;
                    this.f113414b = storeDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(StoreDetailActivity storeDetailActivity) {
                    if (!storeDetailActivity.onNavigateUp()) {
                        storeDetailActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<f.ViewState> f113417a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113418b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ StoreDetailActivity f113419c;

                b(z1<f.ViewState> z1Var, LocalThemeScope localThemeScope, StoreDetailActivity storeDetailActivity) {
                    this.f113417a = z1Var;
                    this.f113418b = localThemeScope;
                    this.f113419c = storeDetailActivity;
                }

                public final void b(Composer composer, int i10) {
                    String strC;
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(283429136, i10, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (StoreDetailActivity.kt:200)");
                    }
                    final Wq.a aVarR = a.c(this.f113417a).getStoreDetailState().r();
                    z1<f.ViewState> z1Var = this.f113417a;
                    if (a.c(z1Var).h() || a.c(z1Var).f()) {
                        aVarR = null;
                    }
                    if (aVarR != null) {
                        LocalThemeScope localThemeScope = this.f113418b;
                        final StoreDetailActivity storeDetailActivity = this.f113419c;
                        z1<f.ViewState> z1Var2 = this.f113417a;
                        Modifier modifierH = J.h(D.i(C18370z.f(Modifier.INSTANCE, "store_detail_primary_action", null, 2, null), localThemeScope.getAdsSpacing().getFive().getDp()), 0.0f, 1, null);
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(storeDetailActivity) | composer.D(aVarR);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.store.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StoreDetailActivity.d.a.b.c(storeDetailActivity, aVarR);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        if (storeDetailActivity.B1().e(AbstractC18503f.K.f172850h)) {
                            composer.startReplaceGroup(1531302214);
                            strC = C16338g.c(aVarR.getLabelNew(), composer, 0);
                            composer.P();
                        } else {
                            composer.startReplaceGroup(1531418185);
                            strC = C16338g.c(aVarR.getLabel(), composer, 0);
                            composer.P();
                        }
                        C3013x.b(localThemeScope, modifierH, function0, strC, (a.c(z1Var2).h() || a.c(z1Var2).f()) ? false : true, C16338g.c(Vq.c.f40136F, composer, 0), null, false, composer, LocalThemeScope.f17314g, 96);
                    }
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
                public static final Unit c(StoreDetailActivity storeDetailActivity, Wq.a aVar) {
                    storeDetailActivity.H1().E(aVar, storeDetailActivity.B1().e(AbstractC18503f.K.f172850h));
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f113420a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<f.ViewState> f113421b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ StoreDetailActivity f113422c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.store.StoreDetailActivity$d$a$c$a, reason: collision with other inner class name */
                static final class C1791a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113423a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14882C f113424b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ StoreDetailActivity f113425c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<f.ViewState> f113426d;

                    C1791a(LocalThemeScope localThemeScope, InterfaceC14882C interfaceC14882C, StoreDetailActivity storeDetailActivity, z1<f.ViewState> z1Var) {
                        this.f113423a = localThemeScope;
                        this.f113424b = interfaceC14882C;
                        this.f113425c = storeDetailActivity;
                        this.f113426d = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(StoreDetailActivity storeDetailActivity, Wq.a action) {
                        Intrinsics.j(action, "action");
                        storeDetailActivity.H1().E(action, storeDetailActivity.B1().e(AbstractC18503f.K.f172850h));
                        return Unit.f143329a;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1045169978, i10, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreDetailActivity.kt:236)");
                        }
                        LocalThemeScope localThemeScope = this.f113423a;
                        Modifier modifierH = D.h(Modifier.INSTANCE, this.f113424b);
                        StoreDetailState storeDetailState = a.c(this.f113426d).getStoreDetailState();
                        boolean zE = this.f113425c.B1().e(AbstractC18503f.g0.f172879h);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f113425c);
                        final StoreDetailActivity storeDetailActivity = this.f113425c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.store.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return StoreDetailActivity.d.a.c.C1791a.c(storeDetailActivity, (Wq.a) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        I.M(localThemeScope, modifierH, storeDetailState, zE, (Function1) objB, this.f113425c.B1().e(AbstractC18503f.K.f172850h), composer, LocalThemeScope.f17314g, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14882C f113427a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f113428b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<f.ViewState> f113429c;

                    b(InterfaceC14882C interfaceC14882C, LocalThemeScope localThemeScope, z1<f.ViewState> z1Var) {
                        this.f113427a = interfaceC14882C;
                        this.f113428b = localThemeScope;
                        this.f113429c = z1Var;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-807183410, i10, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreDetailActivity.kt:252)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        m.d(this.f113428b, androidx.compose.foundation.b.d(D.h(J.f(C18370z.f(Modifier.INSTANCE, "store_detail_loading", null, 2, null), 0.0f, 1, null), this.f113427a), this.f113428b.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), largeLoading, oVar, C13698b.a(a.c(this.f113429c).c(), composer, AbstractC6392a.f60445b), null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 48);
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

                c(LocalThemeScope localThemeScope, z1<f.ViewState> z1Var, StoreDetailActivity storeDetailActivity) {
                    this.f113420a = localThemeScope;
                    this.f113421b = z1Var;
                    this.f113422c = storeDetailActivity;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) throws Resources.NotFoundException {
                    int i11;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1922144744, i11, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (StoreDetailActivity.kt:225)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(companion, contentPadding);
                    LocalThemeScope localThemeScope = this.f113420a;
                    z1<f.ViewState> z1Var = this.f113421b;
                    StoreDetailActivity storeDetailActivity = this.f113422c;
                    C5800d.m mVarH = C5800d.f48779a.h();
                    e.Companion companion2 = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion3.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion3.e());
                    D1.c(composerA, interfaceC5884sR, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion3.f());
                    C14903g c14903g = C14903g.f139698a;
                    Modifier modifierI = J.i(J.h(C18370z.f(companion, "store_map", null, 2, null), 0.0f, 1, null), H1.h.p(280));
                    List<StoreMarker> listE = a.c(z1Var).e();
                    List<StoreMapItem> listD = a.c(z1Var).d();
                    int i12 = LocalThemeScope.f17314g;
                    w.f(localThemeScope, modifierI, listD, listE, null, 0.0f, null, null, null, null, null, null, null, null, null, null, composer, i12, 0, 32760);
                    C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                    A.F(null, ComposableLambdaKt.c(1045169978, true, new C1791a(localThemeScope, contentPadding, storeDetailActivity, z1Var), composer, 54), composer, 48, 1);
                    composer.v();
                    if (a.c(this.f113421b).h()) {
                        composer.startReplaceGroup(-2108611124);
                        LocalThemeScope localThemeScope2 = this.f113420a;
                        Q.e(localThemeScope2, Q0.b.f141966a, ComposableLambdaKt.c(-807183410, true, new b(contentPadding, localThemeScope2, this.f113421b), composer, 54), composer, i12 | 384 | (Q0.b.f141967b << 3));
                        composer.P();
                    } else if (a.c(this.f113421b).f()) {
                        composer.startReplaceGroup(-2107849888);
                        Modifier modifierH2 = D.h(androidx.compose.foundation.b.d(J.f(C18370z.f(companion, "store_detail_error", null, 2, null), 0.0f, 1, null), this.f113420a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), contentPadding);
                        LocalThemeScope localThemeScope3 = this.f113420a;
                        MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                        int iA2 = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR2 = composer.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH2);
                        Function0<InterfaceC5953g> function0A2 = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A2);
                        } else {
                            composer.s();
                        }
                        Composer composerA2 = D1.a(composer);
                        D1.c(composerA2, measurePolicyG, companion3.e());
                        D1.c(composerA2, interfaceC5884sR2, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        j.h(localThemeScope3, new q1.Label(C5806j.f48836a.g(companion, companion2.e()), null, null, null, 0, false, 0, localThemeScope3.getAdsTypography().getHeadings().getSix(), null, 382, null), C16338g.c(Vq.c.f40192y, composer, 0), null, composer, i12 | (q1.Label.f142335j << 3), 4);
                        composer.v();
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-2107071478);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws Resources.NotFoundException {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(StoreDetailActivity storeDetailActivity) {
                this.f113412a = storeDetailActivity;
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
                    ComposerKt.U(549331606, i11, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous>.<anonymous> (StoreDetailActivity.kt:174)");
                }
                z1 z1VarB = o1.b(this.f113412a.H1().C(), null, composer, 0, 1);
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.b.d(J.f(C18370z.c(Modifier.INSTANCE, false, 1, null), 0.0f, 1, null), AdsTheme.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null)), null, ComposableLambdaKt.c(-887779535, true, new C1789a(AdsTheme, this.f113412a), composer, 54), ComposableLambdaKt.c(283429136, true, new b(z1VarB, AdsTheme, this.f113412a), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1922144744, true, new c(AdsTheme, z1VarB, this.f113412a), composer, 54), composer, 3456, 12582912, 131058);
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
            public static final f.ViewState c(z1<f.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.StoreDetailActivity$onCreate$1$2$1", f = "StoreDetailActivity.kt", l = {286}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f113430a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ StoreDetailActivity f113431b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18029o1 f113432c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJn/f$d;", "effect", "", "<anonymous>", "(LJn/f$d;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.StoreDetailActivity$onCreate$1$2$1$1", f = "StoreDetailActivity.kt", l = {335}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<f.d, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f113433a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f113434b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ StoreDetailActivity f113435c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C18029o1 f113436d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f113435c, this.f113436d, continuation);
                    aVar.f113434b = obj;
                    return aVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(StoreDetailActivity storeDetailActivity, C18029o1 c18029o1, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f113435c = storeDetailActivity;
                    this.f113436d = c18029o1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void k(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f.d dVar, Continuation<? super Unit> continuation) {
                    return ((a) create(dVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f113433a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        f.d dVar = (f.d) this.f113434b;
                        if (dVar instanceof f.d.CallPhoneNumber) {
                            this.f113435c.M1(((f.d.CallPhoneNumber) dVar).getPhoneNumber());
                            Unit unit = Unit.f143329a;
                        } else if (dVar instanceof f.d.GetDirections) {
                            f.d.GetDirections getDirections = (f.d.GetDirections) dVar;
                            this.f113435c.O1(getDirections.getStreetAddress(), getDirections.getCity(), getDirections.getState(), getDirections.getZip());
                            Unit unit2 = Unit.f143329a;
                        } else if (dVar instanceof f.d.ShowError) {
                            new Qj.j(this.f113435c, ((f.d.ShowError) dVar).getResId(), new Object[0]).g();
                        } else if (dVar instanceof f.d.ShowFindStore) {
                            this.f113435c.orderOptionsFindStoreResultLauncher.a(s.f(this.f113435c, ((f.d.ShowFindStore) dVar).getStoreSearchType(), null, true, false, 0, null, false, 244, null));
                            Unit unit3 = Unit.f143329a;
                        } else if (Intrinsics.e(dVar, f.d.h.f16065a)) {
                            new C15485b(this.f113435c).setTitle(Il.h.f14919P).setCancelable(false).setMessage(Il.h.f14918O).setNegativeButton(o.f5084r, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.store.d
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    StoreDetailActivity.d.b.a.k(dialogInterface, i11);
                                }
                            }).show();
                        } else if (dVar instanceof f.d.StoreUpdated) {
                            f.d.StoreUpdated storeUpdated = (f.d.StoreUpdated) dVar;
                            this.f113435c.P1(storeUpdated.getStoreDetails(), storeUpdated.getStoreSearchType());
                            Unit unit4 = Unit.f143329a;
                        } else if (dVar instanceof f.d.FindGasStation) {
                            this.f113435c.N1();
                            Unit unit5 = Unit.f143329a;
                        } else {
                            if (dVar instanceof f.d.FailEvent) {
                                C18029o1 c18029o1 = this.f113436d;
                                String string = this.f113435c.getString(((f.d.FailEvent) dVar).getMessageResId());
                                Intrinsics.i(string, "getString(...)");
                                EnumC18023m1 enumC18023m1 = EnumC18023m1.f169431b;
                                this.f113434b = dVar;
                                this.f113433a = 1;
                                if (C18029o1.e(c18029o1, string, null, enumC18023m1, this, 2, null) == objF) {
                                    return objF;
                                }
                            } else if (dVar instanceof f.d.e) {
                                StoreDetailActivity storeDetailActivity = this.f113435c;
                                storeDetailActivity.startActivity(storeDetailActivity.D1().p(this.f113435c, true));
                                Unit unit6 = Unit.f143329a;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f143329a;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f113431b, this.f113432c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(StoreDetailActivity storeDetailActivity, C18029o1 c18029o1, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f113431b = storeDetailActivity;
                this.f113432c = c18029o1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f113430a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<f.d> interfaceC16553FB = this.f113431b.H1().B();
                    a aVar = new a(this.f113431b, this.f113432c, null);
                    this.f113430a = 1;
                    if (C16563h.k(interfaceC16553FB, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        d() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1628538373, i10, -1, "com.meijer.mobile.meijer.activity.store.StoreDetailActivity.onCreate.<anonymous> (StoreDetailActivity.kt:171)");
            }
            C18029o1 snackbarHostState = C17987a1.g(null, null, composer, 0, 3).getSnackbarHostState();
            K.b(null, ComposableLambdaKt.c(549331606, true, new a(StoreDetailActivity.this), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(StoreDetailActivity.this) | composer.V(snackbarHostState);
            StoreDetailActivity storeDetailActivity = StoreDetailActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(storeDetailActivity, snackbarHostState, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("StoreDetailActivity", (Function2) objB, composer, 6);
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
    /* synthetic */ class e implements InterfaceC14275b, FunctionAdapter {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, StoreDetailActivity.this, StoreDetailActivity.class, "handleOrderOptionsFindStoreResult", "handleOrderOptionsFindStoreResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            StoreDetailActivity.this.J1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f implements InterfaceC14275b, FunctionAdapter {
        f() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, StoreDetailActivity.this, StoreDetailActivity.class, "handleGasStationSelectionResult", "handleGasStationSelectionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a c14274a) {
            StoreDetailActivity.this.I1(c14274a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113439f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f113439f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f113439f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113440f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f113440f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f113440f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f113441f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f113442g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f113441f = function0;
            this.f113442g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f113441f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f113442g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(C14274a result) {
        setResult(-1, result.getData());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(C14274a result) {
        Intent data;
        Parcelable parcelable;
        pk.i iVar;
        if (result == null || result.getResultCode() != -1 || (data = result.getData()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) data.getParcelableExtra("com.meijer.intent.extra.STORE_DETAILS", StoreDetails.class);
        } else {
            Parcelable parcelableExtra = data.getParcelableExtra("com.meijer.intent.extra.STORE_DETAILS");
            if (!(parcelableExtra instanceof StoreDetails)) {
                parcelableExtra = null;
            }
            parcelable = (StoreDetails) parcelableExtra;
        }
        StoreDetails storeDetails = (StoreDetails) parcelable;
        if (storeDetails != null) {
            Jn.f fVarH1 = H1();
            pk.i iVar2 = this.storeSearchType;
            if (iVar2 == null) {
                Intrinsics.x("storeSearchType");
                iVar = null;
            } else {
                iVar = iVar2;
            }
            fVarH1.D(iVar, storeDetails, storeDetails.getStoreId(), L1(), B1().e(AbstractC18503f.K.f172850h));
        }
    }

    private final void K1() {
        pk.i iVar;
        int i10 = this.previousStoreId;
        LockedInt lockedInt = this.storeId;
        LockedInt lockedInt2 = null;
        if (lockedInt == null) {
            Intrinsics.x("storeId");
            lockedInt = null;
        }
        if (i10 != lockedInt.getValue()) {
            LockedInt lockedInt3 = this.storeId;
            if (lockedInt3 == null) {
                Intrinsics.x("storeId");
                lockedInt3 = null;
            }
            this.previousStoreId = lockedInt3.getValue();
            Jn.f fVarH1 = H1();
            pk.i iVar2 = this.storeSearchType;
            if (iVar2 == null) {
                Intrinsics.x("storeSearchType");
                iVar = null;
            } else {
                iVar = iVar2;
            }
            StoreDetails storeDetails = this.storeDetails;
            LockedInt lockedInt4 = this.storeId;
            if (lockedInt4 == null) {
                Intrinsics.x("storeId");
            } else {
                lockedInt2 = lockedInt4;
            }
            fVarH1.D(iVar, storeDetails, lockedInt2.getValue(), L1(), B1().e(AbstractC18503f.K.f172850h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1() {
        this.selectGasStationResultLauncher.a(s.f(this, pk.i.f156743a, getString(Vq.c.f40167f), false, true, 0, null, false, 224, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(StoreDetails storeDetails, pk.i storeSearchType) {
        if (storeSearchType != pk.i.f156747e) {
            if (storeDetails != null) {
                F1().p(yo.d.f171588a, storeDetails.getStoreId(), storeDetails.getName(), storeDetails.getState(), storeDetails.getZipCode());
            }
            if (!G1().b()) {
                Dl.e eVarD1 = D1();
                Uri uri = this.uri;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                Intrinsics.g(uri2);
                LockedInt lockedInt = this.deeplinkCode;
                if (lockedInt == null) {
                    Intrinsics.x("deeplinkCode");
                    lockedInt = null;
                }
                Intent intentS = Dl.e.S(eVarD1, this, uri2, lockedInt.getValue(), null, false, 24, null);
                if (intentS != null) {
                    Intrinsics.g(storeDetails);
                    z1(storeDetails);
                    startActivity(intentS);
                    return;
                }
                return;
            }
            if (C1().a()) {
                GeoFenceStoreSetupWorker.INSTANCE.a(this);
            }
            if (storeDetails != null) {
                z1(storeDetails);
            }
            if (E1()) {
                startActivity(D1().p(this, true));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6392a y1(boolean isNewAddressQualifierEnabled) {
        pk.i iVar = this.storeSearchType;
        LockedString lockedString = null;
        if (iVar == null) {
            Intrinsics.x("storeSearchType");
            iVar = null;
        }
        int i10 = c.$EnumSwitchMapping$0[iVar.ordinal()];
        if (i10 == 1) {
            return AbstractC6392a.INSTANCE.d(Vq.c.f40155Y, new Object[0]);
        }
        if (i10 == 2) {
            if (!isNewAddressQualifierEnabled) {
                return AbstractC6392a.INSTANCE.d(Vq.c.f40152V, new Object[0]);
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            LockedString lockedString2 = this.storeName;
            if (lockedString2 == null) {
                Intrinsics.x("storeName");
            } else {
                lockedString = lockedString2;
            }
            return companion.c(lockedString.getValue());
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        yo.f fVarF1 = F1();
        LockedInt lockedInt = this.storeId;
        if (lockedInt == null) {
            Intrinsics.x("storeId");
            lockedInt = null;
        }
        if (!fVarF1.m(lockedInt.getValue())) {
            LockedString lockedString3 = this.storeName;
            if (lockedString3 == null) {
                Intrinsics.x("storeName");
                lockedString3 = null;
            }
            if (lockedString3.getValue().length() != 0) {
                AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
                LockedString lockedString4 = this.storeName;
                if (lockedString4 == null) {
                    Intrinsics.x("storeName");
                } else {
                    lockedString = lockedString4;
                }
                return companion2.c(lockedString.getValue());
            }
        }
        return AbstractC6392a.INSTANCE.d(Vq.c.f40156Z, new Object[0]);
    }

    private final void z1(StoreDetails storeDetails) {
        setResult(-1, new Intent().putExtra("com.meijer.intent.extra.STORE_DETAILS", storeDetails).putExtra("com.meijer.intent.extra.EXIT_SEARCH", A1()));
        finish();
    }

    public final k B1() {
        k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Un.a C1() {
        Un.a aVar = this.geoFenceStoreSetupPermissions;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("geoFenceStoreSetupPermissions");
        return null;
    }

    public final Dl.e D1() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final yo.f F1() {
        yo.f fVar = this.storeManager;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("storeManager");
        return null;
    }

    public final Cs.b G1() {
        Cs.b bVar = this.userManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    public final Jn.f H1() {
        return (Jn.f) this.viewModel.getValue();
    }

    private final boolean A1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.EXIT_SEARCH", false);
    }

    private final boolean E1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.RETURN_HOME", false);
    }

    private final boolean L1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.IS_FROM_GAS_STATION_DETAILS", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(String phoneNumber) {
        startActivity(D1().A(phoneNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(String streetAddress, String city, String state, String zip) {
        Intent intentX = D1().x(this, streetAddress, city, state, zip);
        if (intentX != null) {
            startActivity(intentX);
        } else {
            new Qj.j(this, Vq.c.f40187t, new Object[0]).g();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.store.Hilt_StoreDetailActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        Parcelable parcelable;
        int intExtra;
        String stringExtra;
        Parcelable parcelable2;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.STORE_SEARCH_TYPE", pk.i.class);
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.STORE_SEARCH_TYPE");
            if (!(serializableExtra2 instanceof pk.i)) {
                serializableExtra2 = null;
            }
            serializableExtra = (pk.i) serializableExtra2;
        }
        Intrinsics.g(serializableExtra);
        this.storeSearchType = (pk.i) serializableExtra;
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            parcelable = (Parcelable) intent2.getParcelableExtra("com.meijer.intent.extra.STORE_DETAILS", StoreDetails.class);
        } else {
            Parcelable parcelableExtra = intent2.getParcelableExtra("com.meijer.intent.extra.STORE_DETAILS");
            if (!(parcelableExtra instanceof StoreDetails)) {
                parcelableExtra = null;
            }
            parcelable = (StoreDetails) parcelableExtra;
        }
        this.storeDetails = (StoreDetails) parcelable;
        StoreDetails storeDetails = this.storeDetails;
        if (storeDetails != null) {
            intExtra = storeDetails.getStoreId();
        } else {
            intExtra = getIntent().getIntExtra("com.meijer.intent.extra.STORE_ID", 0);
        }
        this.storeId = new LockedInt(intExtra);
        StoreDetails storeDetails2 = this.storeDetails;
        if (storeDetails2 == null || (stringExtra = storeDetails2.getName()) == null) {
            Intent intent3 = getIntent();
            if (intent3 != null) {
                stringExtra = intent3.getStringExtra("com.meijer.intent.extra.STORE_NAME");
            } else {
                stringExtra = null;
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        this.storeName = new LockedString(stringExtra);
        this.deeplinkCode = new LockedInt(getIntent().getIntExtra("com.meijer.intent.extra.DASHBOARD_LINK", 0));
        Intent intent4 = getIntent();
        Intrinsics.i(intent4, "getIntent(...)");
        if (i10 >= 33) {
            parcelable2 = (Parcelable) intent4.getParcelableExtra("com.meijer.intent.extra.DEEP_LINK_URI", Uri.class);
        } else {
            Parcelable parcelableExtra2 = intent4.getParcelableExtra("com.meijer.intent.extra.DEEP_LINK_URI");
            if (!(parcelableExtra2 instanceof Uri)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (Uri) parcelableExtra2;
        }
        this.uri = (Uri) parcelable2;
        K1();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1628538373, true, new d()), 1, null);
    }
}
