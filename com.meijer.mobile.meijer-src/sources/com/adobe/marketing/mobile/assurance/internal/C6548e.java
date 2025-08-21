package com.adobe.marketing.mobile.assurance.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/e;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "assuranceStateManager", "Lcom/adobe/marketing/mobile/assurance/internal/Y;", "uiOperationHandler", "", "c", "(Lcom/adobe/marketing/mobile/assurance/internal/E;Lcom/adobe/marketing/mobile/assurance/internal/Y;)V", "<set-?>", "b", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "a", "()Lcom/adobe/marketing/mobile/assurance/internal/E;", "Lcom/adobe/marketing/mobile/assurance/internal/Y;", "()Lcom/adobe/marketing/mobile/assurance/internal/Y;", "sessionUIOperationHandler", "Lcom/adobe/marketing/mobile/assurance/internal/a;", "d", "Lcom/adobe/marketing/mobile/assurance/internal/a;", "appState", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.assurance.internal.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6548e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static E assuranceStateManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Y sessionUIOperationHandler;

    /* renamed from: a, reason: collision with root package name */
    public static final C6548e f63072a = new C6548e();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final C6544a appState = new C6544a();

    @JvmName
    public final synchronized void c(E assuranceStateManager2, Y uiOperationHandler) {
        Intrinsics.j(assuranceStateManager2, "assuranceStateManager");
        Intrinsics.j(uiOperationHandler, "uiOperationHandler");
        if (assuranceStateManager == null && sessionUIOperationHandler == null) {
            assuranceStateManager = assuranceStateManager2;
            sessionUIOperationHandler = uiOperationHandler;
            return;
        }
        R5.t.f("Assurance", "AssuranceComponentRegistry", "Components already initialized.", new Object[0]);
    }

    public final E a() {
        return assuranceStateManager;
    }

    public final Y b() {
        return sessionUIOperationHandler;
    }

    private C6548e() {
    }
}
