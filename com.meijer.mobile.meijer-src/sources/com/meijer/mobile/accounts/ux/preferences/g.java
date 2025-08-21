package com.meijer.mobile.accounts.ux.preferences;

import Eh.CustomerPropertiesResponse;
import Eh.Preference;
import Eh.p;
import Xh.PreferenceGroup;
import Xh.PreferenceItem;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.preferences.k;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002:8B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J#\u0010\"\u001a\u0004\u0018\u00010!*\b\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J1\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018*\b\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b+\u0010,J-\u00100\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00152\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010$0.¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020C0G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020N0R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/g;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/accounts/ux/preferences/a;", "preferenceItemProvider", "LCh/d;", "preferencesRepository", "LCh/c;", "accountsAMSRepository", "Lzl/k;", "featureManager", "Lhi/a;", "analyticsEngine", "LCs/b;", "userProvider", "<init>", "(Lcom/meijer/mobile/accounts/ux/preferences/a;LCh/d;LCh/c;Lzl/k;Lhi/a;LCs/b;)V", "", "J", "()V", "", "LEh/p;", "", "savedPreferencesMap", "unsavedPreferencesMap", "", "LEh/o;", "v", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;", "I", "K", "B", "LXh/a;", "preferenceKey", "LXh/b;", "x", "(Ljava/util/List;LEh/p;)LXh/b;", "Lbk/a;", "categoryTitle", "updatedPreferenceItem", "M", "(Ljava/util/List;Lbk/a;LXh/b;)Ljava/util/List;", "updatedPreference", "", "A", "(LXh/b;)Ljava/lang/String;", "isNotificationsEnabled", "", "inlineErrorsMap", "C", "(ZLjava/util/Map;)V", "L", "(Z)V", "Lcom/meijer/mobile/accounts/ux/preferences/k;", "action", "E", "(Lcom/meijer/mobile/accounts/ux/preferences/k;)V", "a", "Lcom/meijer/mobile/accounts/ux/preferences/a;", "b", "LCh/d;", "c", "LCh/c;", "d", "Lzl/k;", "e", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "f", "Lpv/B;", "_preferenceViewState", "Lpv/P;", "g", "Lpv/P;", "y", "()Lpv/P;", "preferenceViewState", "Lpv/A;", "Lcom/meijer/mobile/accounts/ux/preferences/g$a;", "h", "Lpv/A;", "_eventFlow", "Lpv/F;", "i", "Lpv/F;", "w", "()Lpv/F;", "eventFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class g extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.accounts.ux.preferences.a preferenceItemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ch.d preferencesRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ch.c accountsAMSRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<PreferenceScreenViewState> _preferenceViewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<PreferenceScreenViewState> preferenceViewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<a> _eventFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<a> eventFlow;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/g$a;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/accounts/ux/preferences/g$a$a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/g$a$a;", "Lcom/meijer/mobile/accounts/ux/preferences/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.preferences.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1348a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1348a f95469a = new C1348a();

            private C1348a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1348a);
            }

            public int hashCode() {
                return 1989194373;
            }

            public String toString() {
                return "LaunchSettings";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J¸\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b/\u0010.R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b,\u00105R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00105R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b6\u0010$R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u0010$R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b3\u0010$¨\u00069"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "", "", "isLoading", "isNotificationsEnabled", "isVerificationLoading", "hasPendingChanges", "showSuccessNotification", "Lbk/a;", "errorMessage", "showErrorCard", "", "email", "resendEmailErrorTitle", "resendEmailErrorDescription", "", "LXh/a;", "preferences", "unsavedPreferences", "showUnverifiedEmailMessage", "showVerificationSentMessage", "showModal", "<init>", "(ZZZZZLbk/a;ZLjava/lang/String;Lbk/a;Lbk/a;Ljava/util/List;Ljava/util/List;ZZZ)V", "a", "(ZZZZZLbk/a;ZLjava/lang/String;Lbk/a;Lbk/a;Ljava/util/List;Ljava/util/List;ZZZ)Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "o", "()Z", "b", "p", "c", "q", "d", "e", "k", "f", "Lbk/a;", "()Lbk/a;", "g", "i", "h", "Ljava/lang/String;", "j", "Ljava/util/List;", "()Ljava/util/List;", "l", "n", "m", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.preferences.g$b, reason: from toString */
    public static final /* data */ class PreferenceScreenViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isNotificationsEnabled;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isVerificationLoading;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChanges;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showSuccessNotification;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a errorMessage;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showErrorCard;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a resendEmailErrorTitle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a resendEmailErrorDescription;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PreferenceGroup> preferences;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PreferenceGroup> unsavedPreferences;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showUnverifiedEmailMessage;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showVerificationSentMessage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showModal;

        public PreferenceScreenViewState() {
            this(false, false, false, false, false, null, false, null, null, null, null, null, false, false, false, 32767, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreferenceScreenViewState)) {
                return false;
            }
            PreferenceScreenViewState preferenceScreenViewState = (PreferenceScreenViewState) other;
            return this.isLoading == preferenceScreenViewState.isLoading && this.isNotificationsEnabled == preferenceScreenViewState.isNotificationsEnabled && this.isVerificationLoading == preferenceScreenViewState.isVerificationLoading && this.hasPendingChanges == preferenceScreenViewState.hasPendingChanges && this.showSuccessNotification == preferenceScreenViewState.showSuccessNotification && Intrinsics.e(this.errorMessage, preferenceScreenViewState.errorMessage) && this.showErrorCard == preferenceScreenViewState.showErrorCard && Intrinsics.e(this.email, preferenceScreenViewState.email) && Intrinsics.e(this.resendEmailErrorTitle, preferenceScreenViewState.resendEmailErrorTitle) && Intrinsics.e(this.resendEmailErrorDescription, preferenceScreenViewState.resendEmailErrorDescription) && Intrinsics.e(this.preferences, preferenceScreenViewState.preferences) && Intrinsics.e(this.unsavedPreferences, preferenceScreenViewState.unsavedPreferences) && this.showUnverifiedEmailMessage == preferenceScreenViewState.showUnverifiedEmailMessage && this.showVerificationSentMessage == preferenceScreenViewState.showVerificationSentMessage && this.showModal == preferenceScreenViewState.showModal;
        }

        public int hashCode() {
            int iHashCode = ((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isNotificationsEnabled)) * 31) + Boolean.hashCode(this.isVerificationLoading)) * 31) + Boolean.hashCode(this.hasPendingChanges)) * 31) + Boolean.hashCode(this.showSuccessNotification)) * 31;
            AbstractC6392a abstractC6392a = this.errorMessage;
            int iHashCode2 = (((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.showErrorCard)) * 31) + this.email.hashCode()) * 31;
            AbstractC6392a abstractC6392a2 = this.resendEmailErrorTitle;
            int iHashCode3 = (iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.resendEmailErrorDescription;
            return ((((((((((iHashCode3 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0)) * 31) + this.preferences.hashCode()) * 31) + this.unsavedPreferences.hashCode()) * 31) + Boolean.hashCode(this.showUnverifiedEmailMessage)) * 31) + Boolean.hashCode(this.showVerificationSentMessage)) * 31) + Boolean.hashCode(this.showModal);
        }

        public String toString() {
            return "PreferenceScreenViewState(isLoading=" + this.isLoading + ", isNotificationsEnabled=" + this.isNotificationsEnabled + ", isVerificationLoading=" + this.isVerificationLoading + ", hasPendingChanges=" + this.hasPendingChanges + ", showSuccessNotification=" + this.showSuccessNotification + ", errorMessage=" + this.errorMessage + ", showErrorCard=" + this.showErrorCard + ", email=" + this.email + ", resendEmailErrorTitle=" + this.resendEmailErrorTitle + ", resendEmailErrorDescription=" + this.resendEmailErrorDescription + ", preferences=" + this.preferences + ", unsavedPreferences=" + this.unsavedPreferences + ", showUnverifiedEmailMessage=" + this.showUnverifiedEmailMessage + ", showVerificationSentMessage=" + this.showVerificationSentMessage + ", showModal=" + this.showModal + ')';
        }

        public PreferenceScreenViewState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC6392a abstractC6392a, boolean z15, String email, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, List<PreferenceGroup> preferences, List<PreferenceGroup> unsavedPreferences, boolean z16, boolean z17, boolean z18) {
            Intrinsics.j(email, "email");
            Intrinsics.j(preferences, "preferences");
            Intrinsics.j(unsavedPreferences, "unsavedPreferences");
            this.isLoading = z10;
            this.isNotificationsEnabled = z11;
            this.isVerificationLoading = z12;
            this.hasPendingChanges = z13;
            this.showSuccessNotification = z14;
            this.errorMessage = abstractC6392a;
            this.showErrorCard = z15;
            this.email = email;
            this.resendEmailErrorTitle = abstractC6392a2;
            this.resendEmailErrorDescription = abstractC6392a3;
            this.preferences = preferences;
            this.unsavedPreferences = unsavedPreferences;
            this.showUnverifiedEmailMessage = z16;
            this.showVerificationSentMessage = z17;
            this.showModal = z18;
        }

        public static /* synthetic */ PreferenceScreenViewState b(PreferenceScreenViewState preferenceScreenViewState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC6392a abstractC6392a, boolean z15, String str, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, List list, List list2, boolean z16, boolean z17, boolean z18, int i10, Object obj) {
            return preferenceScreenViewState.a((i10 & 1) != 0 ? preferenceScreenViewState.isLoading : z10, (i10 & 2) != 0 ? preferenceScreenViewState.isNotificationsEnabled : z11, (i10 & 4) != 0 ? preferenceScreenViewState.isVerificationLoading : z12, (i10 & 8) != 0 ? preferenceScreenViewState.hasPendingChanges : z13, (i10 & 16) != 0 ? preferenceScreenViewState.showSuccessNotification : z14, (i10 & 32) != 0 ? preferenceScreenViewState.errorMessage : abstractC6392a, (i10 & 64) != 0 ? preferenceScreenViewState.showErrorCard : z15, (i10 & 128) != 0 ? preferenceScreenViewState.email : str, (i10 & 256) != 0 ? preferenceScreenViewState.resendEmailErrorTitle : abstractC6392a2, (i10 & 512) != 0 ? preferenceScreenViewState.resendEmailErrorDescription : abstractC6392a3, (i10 & 1024) != 0 ? preferenceScreenViewState.preferences : list, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? preferenceScreenViewState.unsavedPreferences : list2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? preferenceScreenViewState.showUnverifiedEmailMessage : z16, (i10 & 8192) != 0 ? preferenceScreenViewState.showVerificationSentMessage : z17, (i10 & 16384) != 0 ? preferenceScreenViewState.showModal : z18);
        }

        public final PreferenceScreenViewState a(boolean isLoading, boolean isNotificationsEnabled, boolean isVerificationLoading, boolean hasPendingChanges, boolean showSuccessNotification, AbstractC6392a errorMessage, boolean showErrorCard, String email, AbstractC6392a resendEmailErrorTitle, AbstractC6392a resendEmailErrorDescription, List<PreferenceGroup> preferences, List<PreferenceGroup> unsavedPreferences, boolean showUnverifiedEmailMessage, boolean showVerificationSentMessage, boolean showModal) {
            Intrinsics.j(email, "email");
            Intrinsics.j(preferences, "preferences");
            Intrinsics.j(unsavedPreferences, "unsavedPreferences");
            return new PreferenceScreenViewState(isLoading, isNotificationsEnabled, isVerificationLoading, hasPendingChanges, showSuccessNotification, errorMessage, showErrorCard, email, resendEmailErrorTitle, resendEmailErrorDescription, preferences, unsavedPreferences, showUnverifiedEmailMessage, showVerificationSentMessage, showModal);
        }

        /* renamed from: c, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getHasPendingChanges() {
            return this.hasPendingChanges;
        }

        public final List<PreferenceGroup> f() {
            return this.preferences;
        }

        /* renamed from: g, reason: from getter */
        public final AbstractC6392a getResendEmailErrorDescription() {
            return this.resendEmailErrorDescription;
        }

        /* renamed from: h, reason: from getter */
        public final AbstractC6392a getResendEmailErrorTitle() {
            return this.resendEmailErrorTitle;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getShowErrorCard() {
            return this.showErrorCard;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getShowModal() {
            return this.showModal;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getShowSuccessNotification() {
            return this.showSuccessNotification;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getShowUnverifiedEmailMessage() {
            return this.showUnverifiedEmailMessage;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getShowVerificationSentMessage() {
            return this.showVerificationSentMessage;
        }

        public final List<PreferenceGroup> n() {
            return this.unsavedPreferences;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getIsNotificationsEnabled() {
            return this.isNotificationsEnabled;
        }

        /* renamed from: q, reason: from getter */
        public final boolean getIsVerificationLoading() {
            return this.isVerificationLoading;
        }

        public /* synthetic */ PreferenceScreenViewState(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, AbstractC6392a abstractC6392a, boolean z15, String str, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, List list, List list2, boolean z16, boolean z17, boolean z18, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? null : abstractC6392a, (i10 & 64) != 0 ? false : z15, (i10 & 128) != 0 ? "" : str, (i10 & 256) != 0 ? null : abstractC6392a2, (i10 & 512) == 0 ? abstractC6392a3 : null, (i10 & 1024) != 0 ? CollectionsKt.m() : list, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? CollectionsKt.m() : list2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z16, (i10 & 8192) != 0 ? false : z17, (i10 & 16384) != 0 ? false : z18);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f7584b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f7585c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f7586d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f7587e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f7589g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f7588f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenViewModel$loadEmailVerificationPreferences$2", f = "PreferenceScreenViewModel.kt", l = {355}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95485a;

        /* renamed from: b, reason: collision with root package name */
        Object f95486b;

        /* renamed from: c, reason: collision with root package name */
        Object f95487c;

        /* renamed from: d, reason: collision with root package name */
        Object f95488d;

        /* renamed from: e, reason: collision with root package name */
        int f95489e;

        /* renamed from: f, reason: collision with root package name */
        int f95490f;

        /* renamed from: g, reason: collision with root package name */
        int f95491g;

        /* renamed from: h, reason: collision with root package name */
        int f95492h;

        /* renamed from: i, reason: collision with root package name */
        int f95493i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95494j;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = g.this.new d(continuation);
            dVar.f95494j = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95493i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95494j;
                    g gVar = g.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.d dVar = gVar.preferencesRepository;
                    this.f95494j = interfaceC15783O;
                    this.f95485a = interfaceC15783O;
                    this.f95486b = this;
                    this.f95487c = this;
                    this.f95488d = interfaceC15783O;
                    this.f95489e = 0;
                    this.f95490f = 0;
                    this.f95491g = 0;
                    this.f95492h = 0;
                    this.f95493i = 1;
                    objC = dVar.c(this);
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objC = obj;
                }
                objB = Result.b(objC);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            g gVar2 = g.this;
            if (Result.h(objB)) {
                CustomerPropertiesResponse customerPropertiesResponse = (CustomerPropertiesResponse) objB;
                InterfaceC16549B interfaceC16549B = gVar2._preferenceViewState;
                do {
                    value2 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value2, PreferenceScreenViewState.b((PreferenceScreenViewState) value2, false, false, false, false, false, null, false, null, null, null, null, null, !customerPropertiesResponse.getHasEmailVerified(), false, false, 20475, null)));
            }
            g gVar3 = g.this;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = gVar3._preferenceViewState;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, PreferenceScreenViewState.b((PreferenceScreenViewState) value, false, false, false, false, false, null, false, null, null, null, null, null, true, false, false, 20475, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenViewModel$loadPreferences$2", f = "PreferenceScreenViewModel.kt", l = {66}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95496a;

        /* renamed from: b, reason: collision with root package name */
        Object f95497b;

        /* renamed from: c, reason: collision with root package name */
        Object f95498c;

        /* renamed from: d, reason: collision with root package name */
        Object f95499d;

        /* renamed from: e, reason: collision with root package name */
        int f95500e;

        /* renamed from: f, reason: collision with root package name */
        int f95501f;

        /* renamed from: g, reason: collision with root package name */
        int f95502g;

        /* renamed from: h, reason: collision with root package name */
        int f95503h;

        /* renamed from: i, reason: collision with root package name */
        int f95504i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95505j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f95507l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Map<p, AbstractC6392a> f95508m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, Map<p, AbstractC6392a> map, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f95507l = z10;
            this.f95508m = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(this.f95507l, this.f95508m, continuation);
            eVar.f95505j = obj;
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
            Object objB2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95504i;
            boolean z10 = false;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95505j;
                    g gVar = g.this;
                    boolean z11 = this.f95507l;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.accounts.ux.preferences.a aVar = gVar.preferenceItemProvider;
                    this.f95505j = interfaceC15783O;
                    this.f95496a = interfaceC15783O;
                    this.f95497b = this;
                    this.f95498c = this;
                    this.f95499d = interfaceC15783O;
                    this.f95500e = 0;
                    this.f95501f = 0;
                    this.f95502g = 0;
                    this.f95503h = 0;
                    this.f95504i = 1;
                    objB2 = aVar.b(z11, this);
                    if (objB2 == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objB2 = obj;
                }
                objB = Result.b(objB2);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            g gVar2 = g.this;
            Map<p, AbstractC6392a> map = this.f95508m;
            if (Result.h(objB)) {
                List list = (List) objB;
                InterfaceC16549B interfaceC16549B = gVar2._preferenceViewState;
                while (true) {
                    Object value2 = interfaceC16549B.getValue();
                    PreferenceScreenViewState preferenceScreenViewState = (PreferenceScreenViewState) value2;
                    List<PreferenceGroup> list2 = list;
                    int i11 = 10;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                    for (PreferenceGroup preferenceGroup : list2) {
                        List<PreferenceItem> listD = preferenceGroup.d();
                        boolean z12 = z10;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listD, 10));
                        for (PreferenceItem preferenceItemB : listD) {
                            if (map.containsKey(preferenceItemB.getPreferenceKey())) {
                                preferenceItemB = PreferenceItem.b(preferenceItemB, null, null, false, false, null, map.get(preferenceItemB.getPreferenceKey()), 31, null);
                            }
                            arrayList2.add(preferenceItemB);
                        }
                        arrayList.add(PreferenceGroup.b(preferenceGroup, null, arrayList2, 1, null));
                        z10 = z12;
                    }
                    boolean z13 = z10;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list2, 10));
                    for (PreferenceGroup preferenceGroup2 : list2) {
                        List<PreferenceItem> listD2 = preferenceGroup2.d();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(listD2, i11));
                        for (PreferenceItem preferenceItemB2 : listD2) {
                            if (map.containsKey(preferenceItemB2.getPreferenceKey())) {
                                preferenceItemB2 = PreferenceItem.b(preferenceItemB2, null, null, false, false, null, map.get(preferenceItemB2.getPreferenceKey()), 31, null);
                            }
                            arrayList4.add(preferenceItemB2);
                        }
                        arrayList3.add(PreferenceGroup.b(preferenceGroup2, null, arrayList4, 1, null));
                        i11 = 10;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.C(arrayList5, ((PreferenceGroup) it.next()).d());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList5, 10)), 16));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        Pair pairA = TuplesKt.a(((PreferenceItem) it2.next()).getPreferenceKey(), Boxing.a(!r9.getEnabled()));
                        linkedHashMap.put(pairA.c(), pairA.d());
                    }
                    if (interfaceC16549B.e(value2, PreferenceScreenViewState.b(preferenceScreenViewState, false, false, false, false, false, null, false, null, null, null, arrayList, arrayList3, ((Boolean) linkedHashMap.getOrDefault(p.f7587e, Boxing.a(z13))).booleanValue(), false, false, 25530, null))) {
                        break;
                    }
                    z10 = z13;
                }
            }
            g gVar3 = g.this;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = gVar3._preferenceViewState;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, PreferenceScreenViewState.b((PreferenceScreenViewState) value, false, false, false, false, false, null, true, null, null, null, CollectionsKt.m(), null, false, false, false, 31674, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenViewModel$onAction$4", f = "PreferenceScreenViewModel.kt", l = {488}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95509a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95509a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._eventFlow;
                a.C1348a c1348a = a.C1348a.f95469a;
                this.f95509a = 1;
                if (interfaceC16548A.emit(c1348a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenViewModel$savePreferences$1", f = "PreferenceScreenViewModel.kt", l = {126}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.accounts.ux.preferences.g$g, reason: collision with other inner class name */
    static final class C1349g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95511a;

        /* renamed from: b, reason: collision with root package name */
        Object f95512b;

        /* renamed from: c, reason: collision with root package name */
        Object f95513c;

        /* renamed from: d, reason: collision with root package name */
        Object f95514d;

        /* renamed from: e, reason: collision with root package name */
        int f95515e;

        /* renamed from: f, reason: collision with root package name */
        int f95516f;

        /* renamed from: g, reason: collision with root package name */
        int f95517g;

        /* renamed from: h, reason: collision with root package name */
        int f95518h;

        /* renamed from: i, reason: collision with root package name */
        int f95519i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95520j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<Preference> f95522l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Map<p, Boolean> f95523m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.preferences.g$g$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.f7584b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.f7586d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.f7585c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[p.f7587e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1349g(List<Preference> list, Map<p, Boolean> map, Continuation<? super C1349g> continuation) {
            super(2, continuation);
            this.f95522l = list;
            this.f95523m = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1349g c1349g = g.this.new C1349g(this.f95522l, this.f95523m, continuation);
            c1349g.f95520j = obj;
            return c1349g;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1349g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:125:0x03bf A[LOOP:0: B:22:0x008c->B:125:0x03bf, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0343 A[EDGE_INSN: B:136:0x0343->B:104:0x0343 BREAK  A[LOOP:0: B:22:0x008c->B:125:0x03bf], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 1033
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.preferences.g.C1349g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenViewModel$sendValidationEmail$2", f = "PreferenceScreenViewModel.kt", l = {311, 313}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95524a;

        /* renamed from: b, reason: collision with root package name */
        Object f95525b;

        /* renamed from: c, reason: collision with root package name */
        Object f95526c;

        /* renamed from: d, reason: collision with root package name */
        Object f95527d;

        /* renamed from: e, reason: collision with root package name */
        int f95528e;

        /* renamed from: f, reason: collision with root package name */
        int f95529f;

        /* renamed from: g, reason: collision with root package name */
        int f95530g;

        /* renamed from: h, reason: collision with root package name */
        int f95531h;

        /* renamed from: i, reason: collision with root package name */
        int f95532i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95533j;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = g.this.new h(continuation);
            hVar.f95533j = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
        
            if (r2 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.preferences.g.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(com.meijer.mobile.accounts.ux.preferences.a preferenceItemProvider, Ch.d preferencesRepository, Ch.c accountsAMSRepository, zl.k featureManager, InterfaceC14523a analyticsEngine, Cs.b userProvider) {
        Intrinsics.j(preferenceItemProvider, "preferenceItemProvider");
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userProvider, "userProvider");
        this.preferenceItemProvider = preferenceItemProvider;
        this.preferencesRepository = preferencesRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<PreferenceScreenViewState> interfaceC16549BA = S.a(new PreferenceScreenViewState(false, false, false, false, false, null, false, userProvider.h(), null, null, null, null, false, false, false, 32639, null));
        this._preferenceViewState = interfaceC16549BA;
        this.preferenceViewState = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<a> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
    }

    private final void B() {
        PreferenceScreenViewState value;
        InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B = this._preferenceViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, PreferenceScreenViewState.b(value, false, false, true, false, false, null, false, null, null, null, null, null, false, false, false, 32763, null)));
        C15809k.d(d0.a(this), null, null, new d(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void D(g gVar, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new LinkedHashMap();
        }
        gVar.C(z10, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f143329a;
    }

    private final void I() {
        PreferenceScreenViewState value;
        PreferenceScreenViewState preferenceScreenViewState;
        ArrayList arrayList;
        InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B = this._preferenceViewState;
        do {
            value = interfaceC16549B.getValue();
            preferenceScreenViewState = value;
            List<PreferenceGroup> listF = preferenceScreenViewState.f();
            arrayList = new ArrayList(CollectionsKt.x(listF, 10));
            for (PreferenceGroup preferenceGroup : listF) {
                List<PreferenceItem> listD = preferenceGroup.d();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(PreferenceItem.b((PreferenceItem) it.next(), null, null, false, false, null, null, 31, null));
                }
                arrayList.add(PreferenceGroup.b(preferenceGroup, null, arrayList2, 1, null));
            }
        } while (!interfaceC16549B.e(value, PreferenceScreenViewState.b(preferenceScreenViewState, true, false, false, false, false, null, false, null, null, null, arrayList, null, false, false, false, 31710, null)));
    }

    private final void K() {
        PreferenceScreenViewState value;
        InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B = this._preferenceViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, PreferenceScreenViewState.b(value, false, false, true, false, false, null, false, null, null, null, null, null, false, false, false, 32763, null)));
        C15809k.d(d0.a(this), null, null, new h(null), 3, null);
    }

    private final List<PreferenceGroup> M(List<PreferenceGroup> list, AbstractC6392a abstractC6392a, PreferenceItem preferenceItem) {
        List<PreferenceGroup> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (PreferenceGroup preferenceGroupB : list2) {
            if (Intrinsics.e(preferenceGroupB.getCategoryTitle(), abstractC6392a)) {
                List<PreferenceItem> listD = preferenceGroupB.d();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listD, 10));
                Iterator<T> it = listD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PreferenceItem preferenceItem2 = (PreferenceItem) it.next();
                    if (Intrinsics.e(preferenceItem2.getTitle(), preferenceItem != null ? preferenceItem.getTitle() : null)) {
                        preferenceItem2 = preferenceItem;
                    }
                    arrayList2.add(preferenceItem2);
                }
                preferenceGroupB = PreferenceGroup.b(preferenceGroupB, null, arrayList2, 1, null);
            }
            arrayList.add(preferenceGroupB);
        }
        return arrayList;
    }

    private final List<Preference> v(Map<p, Boolean> savedPreferencesMap, Map<p, Boolean> unsavedPreferencesMap) {
        ArrayList arrayList = new ArrayList();
        p pVar = p.f7584b;
        if (!Intrinsics.e(savedPreferencesMap.get(pVar), unsavedPreferencesMap.get(pVar))) {
            Boolean bool = unsavedPreferencesMap.get(pVar);
            arrayList.add(new Preference(pVar, bool != null ? bool.booleanValue() : false, null, null, 12, null));
        }
        p pVar2 = p.f7586d;
        if (!Intrinsics.e(savedPreferencesMap.get(pVar2), unsavedPreferencesMap.get(pVar2))) {
            Boolean bool2 = unsavedPreferencesMap.get(pVar2);
            arrayList.add(new Preference(pVar2, bool2 != null ? bool2.booleanValue() : false, null, null, 12, null));
        }
        p pVar3 = p.f7585c;
        if (!Intrinsics.e(savedPreferencesMap.get(pVar3), unsavedPreferencesMap.get(pVar3))) {
            Boolean bool3 = unsavedPreferencesMap.get(pVar3);
            arrayList.add(new Preference(pVar3, bool3 != null ? bool3.booleanValue() : false, null, null, 12, null));
        }
        p pVar4 = p.f7587e;
        if (!Intrinsics.e(savedPreferencesMap.get(pVar4), unsavedPreferencesMap.get(pVar4))) {
            Boolean bool4 = unsavedPreferencesMap.get(pVar4);
            arrayList.add(new Preference(pVar4, bool4 != null ? bool4.booleanValue() : false, null, null, 12, null));
        }
        return arrayList;
    }

    private final PreferenceItem x(List<PreferenceGroup> list, p pVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((PreferenceGroup) it.next()).d());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((PreferenceItem) next).getPreferenceKey() == pVar) {
                break;
            }
        }
        return (PreferenceItem) next;
    }

    public final void C(boolean isNotificationsEnabled, Map<p, AbstractC6392a> inlineErrorsMap) {
        PreferenceScreenViewState value;
        Intrinsics.j(inlineErrorsMap, "inlineErrorsMap");
        InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B = this._preferenceViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, PreferenceScreenViewState.b(value, true, isNotificationsEnabled, false, false, false, null, false, null, null, null, null, null, false, false, false, 32764, null)));
        C15809k.d(d0.a(this), null, null, new e(isNotificationsEnabled, inlineErrorsMap, null), 3, null);
    }

    public final void E(k action) {
        PreferenceScreenViewState value;
        PreferenceScreenViewState value2;
        PreferenceScreenViewState value3;
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, k.b.f95538a)) {
            D(this, this._preferenceViewState.getValue().getIsNotificationsEnabled(), null, 2, null);
            return;
        }
        if (Intrinsics.e(action, k.i.f95546a)) {
            J();
            this.analyticsEngine.b(C14756c.a("account: preferences: Save"), new Function1() { // from class: com.meijer.mobile.accounts.ux.preferences.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.F((TrackingData) obj);
                }
            });
            return;
        }
        if (Intrinsics.e(action, k.d.f95540a)) {
            InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B = this._preferenceViewState;
            do {
                value3 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value3, PreferenceScreenViewState.b(value3, false, false, false, false, false, null, false, null, null, null, null, null, false, false, false, 32751, null)));
            return;
        }
        if (Intrinsics.e(action, k.c.f95539a)) {
            InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B2 = this._preferenceViewState;
            do {
                value2 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value2, PreferenceScreenViewState.b(value2, false, false, false, false, false, null, false, null, null, null, null, null, false, false, false, 32735, null)));
            return;
        }
        if (action instanceof k.OnPreferenceChange) {
            k.OnPreferenceChange onPreferenceChange = (k.OnPreferenceChange) action;
            if (onPreferenceChange.getUpdatedPreference().getPreferenceKey() == p.f7589g) {
                C15809k.d(d0.a(this), null, null, new f(null), 3, null);
            } else {
                List<PreferenceGroup> listM = M(this._preferenceViewState.getValue().n(), onPreferenceChange.getPreferenceGroup().getCategoryTitle(), onPreferenceChange.getUpdatedPreference());
                InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B3 = this._preferenceViewState;
                while (true) {
                    PreferenceScreenViewState value4 = interfaceC16549B3.getValue();
                    List<PreferenceGroup> list = listM;
                    if (interfaceC16549B3.e(value4, PreferenceScreenViewState.b(value4, false, false, false, !Intrinsics.e(r5.f(), listM), false, null, false, null, null, null, null, list, false, false, false, 30711, null))) {
                        break;
                    } else {
                        listM = list;
                    }
                }
            }
            this.analyticsEngine.b(C14756c.a(A(onPreferenceChange.getUpdatedPreference())), new Function1() { // from class: com.meijer.mobile.accounts.ux.preferences.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.G((TrackingData) obj);
                }
            });
            return;
        }
        if ((action instanceof k.e) || Intrinsics.e(action, k.h.f95545a)) {
            K();
            this.analyticsEngine.b(C14756c.a("account: preferences: Tap here for Email verification"), new Function1() { // from class: com.meijer.mobile.accounts.ux.preferences.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.H((TrackingData) obj);
                }
            });
        } else if (action instanceof k.g) {
            B();
        } else {
            if (!Intrinsics.e(action, k.a.f95537a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B4 = this._preferenceViewState;
            do {
                value = interfaceC16549B4.getValue();
            } while (!interfaceC16549B4.e(value, PreferenceScreenViewState.b(value, false, false, false, false, false, null, false, null, null, null, null, null, false, false, false, 16383, null)));
        }
    }

    public final void L(boolean isNotificationsEnabled) {
        PreferenceScreenViewState value;
        List<PreferenceGroup> listF = this._preferenceViewState.getValue().f();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AbstractC6392a abstractC6392aD = companion.d(Gh.h.f12893g4, new Object[0]);
        List<PreferenceGroup> listF2 = this._preferenceViewState.getValue().f();
        p pVar = p.f7589g;
        PreferenceItem preferenceItemX = x(listF2, pVar);
        List<PreferenceGroup> listM = M(listF, abstractC6392aD, preferenceItemX != null ? PreferenceItem.b(preferenceItemX, null, null, isNotificationsEnabled, false, null, null, 59, null) : null);
        List<PreferenceGroup> listN = this._preferenceViewState.getValue().n();
        AbstractC6392a abstractC6392aD2 = companion.d(Gh.h.f12893g4, new Object[0]);
        PreferenceItem preferenceItemX2 = x(this._preferenceViewState.getValue().n(), pVar);
        List<PreferenceGroup> listM2 = M(listN, abstractC6392aD2, preferenceItemX2 != null ? PreferenceItem.b(preferenceItemX2, null, null, isNotificationsEnabled, false, null, null, 59, null) : null);
        InterfaceC16549B<PreferenceScreenViewState> interfaceC16549B = this._preferenceViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, PreferenceScreenViewState.b(value, false, isNotificationsEnabled, false, false, false, null, false, null, null, null, listM, listM2, false, false, false, 29693, null)));
    }

    public final InterfaceC16553F<a> w() {
        return this.eventFlow;
    }

    public final P<PreferenceScreenViewState> y() {
        return this.preferenceViewState;
    }

    private final String A(PreferenceItem updatedPreference) {
        switch (c.$EnumSwitchMapping$0[updatedPreference.getPreferenceKey().ordinal()]) {
            case 1:
                if (updatedPreference.getChecked()) {
                    return "account: preferences: My Meijer News Email toggle on";
                }
                return "account: preferences: My Meijer News Email toggle off";
            case 2:
                if (updatedPreference.getChecked()) {
                    return "account: preferences: mPerks Rewards Email toggle on";
                }
                return "account: preferences: mPerks Rewards Email toggle off";
            case 3:
                if (updatedPreference.getChecked()) {
                    return "account: preferences: Text Me Savings and Offers toggle on";
                }
                return "account: preferences: Text Me Savings and Offers toggle off";
            case 4:
                if (updatedPreference.getChecked()) {
                    return "account: preferences: Digital Receipts toggle on";
                }
                return "account: preferences: Digital Receipts toggle off";
            case 5:
                if (updatedPreference.getChecked()) {
                    return "account: preferences: Notifications toggle on";
                }
                return "account: preferences: Notifications toggle off";
            case 6:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void J() {
        I();
        List<PreferenceGroup> listF = this._preferenceViewState.getValue().f();
        ArrayList<PreferenceItem> arrayList = new ArrayList();
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((PreferenceGroup) it.next()).d());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList, 10)), 16));
        for (PreferenceItem preferenceItem : arrayList) {
            Pair pairA = TuplesKt.a(preferenceItem.getPreferenceKey(), Boolean.valueOf(preferenceItem.getChecked()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        List<PreferenceGroup> listN = this._preferenceViewState.getValue().n();
        ArrayList<PreferenceItem> arrayList2 = new ArrayList();
        Iterator<T> it2 = listN.iterator();
        while (it2.hasNext()) {
            CollectionsKt.C(arrayList2, ((PreferenceGroup) it2.next()).d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList2, 10)), 16));
        for (PreferenceItem preferenceItem2 : arrayList2) {
            Pair pairA2 = TuplesKt.a(preferenceItem2.getPreferenceKey(), Boolean.valueOf(preferenceItem2.getChecked()));
            linkedHashMap2.put(pairA2.c(), pairA2.d());
        }
        C15809k.d(d0.a(this), null, null, new C1349g(v(linkedHashMap, linkedHashMap2), linkedHashMap2, null), 3, null);
    }
}
