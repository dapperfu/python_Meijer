package com.meijer.mobile.meijer.activity.enrollment;

import Cs.MeijerAccount;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010#\u001a\u0004\b\u001f\u0010$\"\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/a;", "", "LBh/b;", "accountRepository", "<init>", "(LBh/b;)V", "", "firstName", "lastName", "email", "password", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "phoneNumber", "pinNumber", "", "isWeeklyAdSelected", "isTextAdSelected", "d", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "storeId", "zipCode", "f", "(ILjava/lang/String;)V", "LCs/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LBh/b;", "Lcom/meijer/mobile/meijer/activity/enrollment/b;", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/b;", "createAccountState", "c", "Z", "()Z", "setWeeklyAdCheckbox", "(Z)V", "weeklyAdCheckbox", "setTextAdsCheckbox", "textAdsCheckbox", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.enrollment.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12063a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.b accountRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private CreateAccountState createAccountState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean weeklyAdCheckbox;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean textAdsCheckbox;

    /* JADX WARN: Multi-variable type inference failed */
    public C12063a(Bh.b accountRepository) {
        Intrinsics.j(accountRepository, "accountRepository");
        this.accountRepository = accountRepository;
        this.createAccountState = new CreateAccountState(null, 1, 0 == true ? 1 : 0);
    }

    public final Object a(Continuation<? super MeijerAccount> continuation) {
        return this.accountRepository.f(this.createAccountState.getMeijerAccount(), continuation);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getTextAdsCheckbox() {
        return this.textAdsCheckbox;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getWeeklyAdCheckbox() {
        return this.weeklyAdCheckbox;
    }

    public final void d(String phoneNumber, String pinNumber, boolean isWeeklyAdSelected, boolean isTextAdSelected) throws NumberFormatException {
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(pinNumber, "pinNumber");
        this.createAccountState.getMeijerAccount().E(Long.parseLong(StringsKt.y1(phoneNumber).toString()));
        this.createAccountState.getMeijerAccount().F(pinNumber);
        this.weeklyAdCheckbox = isWeeklyAdSelected;
        this.textAdsCheckbox = isTextAdSelected;
    }

    public final void e(String firstName, String lastName, String email, String password) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        this.createAccountState.getMeijerAccount().A(firstName);
        this.createAccountState.getMeijerAccount().C(lastName);
        this.createAccountState.getMeijerAccount().y(email);
        this.createAccountState.getMeijerAccount().G(password);
    }

    public final void f(int storeId, String zipCode) {
        Intrinsics.j(zipCode, "zipCode");
        this.createAccountState.getMeijerAccount().I(storeId);
        this.createAccountState.getMeijerAccount().J(zipCode);
    }
}
