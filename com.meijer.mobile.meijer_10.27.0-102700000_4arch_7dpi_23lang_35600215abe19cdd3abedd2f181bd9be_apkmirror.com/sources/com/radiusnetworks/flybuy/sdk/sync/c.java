package com.radiusnetworks.flybuy.sdk.sync;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt;
import j$.time.Clock;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f120082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f120083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Clock f120084h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Ref.BooleanRef booleanRef, SyncWorker syncWorker, Clock clock) {
        super(2);
        this.f120082f = booleanRef;
        this.f120083g = syncWorker;
        this.f120084h = clock;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SdkError sdkError = (SdkError) obj2;
        this.f120082f.f142828a = sdkError != null;
        PreferenceExtensionKt.setLastConfigSyncTime(this.f120083g.f120077h, Instant.now(this.f120084h).toEpochMilli());
        return Unit.f142422a;
    }
}
