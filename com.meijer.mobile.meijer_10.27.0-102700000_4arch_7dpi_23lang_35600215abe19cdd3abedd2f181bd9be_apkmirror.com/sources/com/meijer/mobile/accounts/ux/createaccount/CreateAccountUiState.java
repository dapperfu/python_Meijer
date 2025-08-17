package com.meijer.mobile.accounts.ux.createaccount;

import Th.CreateAccountDecorator;
import com.meijer.mobile.accounts.ux.createaccount.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/l;", "", "LTh/d;", "createAccountDecorator", "Lcom/meijer/mobile/accounts/ux/createaccount/k;", "createAccountState", "<init>", "(LTh/d;Lcom/meijer/mobile/accounts/ux/createaccount/k;)V", "a", "(LTh/d;Lcom/meijer/mobile/accounts/ux/createaccount/k;)Lcom/meijer/mobile/accounts/ux/createaccount/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LTh/d;", "c", "()LTh/d;", "b", "Lcom/meijer/mobile/accounts/ux/createaccount/k;", "d", "()Lcom/meijer/mobile/accounts/ux/createaccount/k;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.accounts.ux.createaccount.l, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class CreateAccountUiState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CreateAccountDecorator createAccountDecorator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k createAccountState;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateAccountUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountUiState)) {
            return false;
        }
        CreateAccountUiState createAccountUiState = (CreateAccountUiState) other;
        return Intrinsics.e(this.createAccountDecorator, createAccountUiState.createAccountDecorator) && Intrinsics.e(this.createAccountState, createAccountUiState.createAccountState);
    }

    public int hashCode() {
        return (this.createAccountDecorator.hashCode() * 31) + this.createAccountState.hashCode();
    }

    public String toString() {
        return "CreateAccountUiState(createAccountDecorator=" + this.createAccountDecorator + ", createAccountState=" + this.createAccountState + ')';
    }

    public CreateAccountUiState(CreateAccountDecorator createAccountDecorator, k createAccountState) {
        Intrinsics.j(createAccountDecorator, "createAccountDecorator");
        Intrinsics.j(createAccountState, "createAccountState");
        this.createAccountDecorator = createAccountDecorator;
        this.createAccountState = createAccountState;
    }

    public static /* synthetic */ CreateAccountUiState b(CreateAccountUiState createAccountUiState, CreateAccountDecorator createAccountDecorator, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            createAccountDecorator = createAccountUiState.createAccountDecorator;
        }
        if ((i10 & 2) != 0) {
            kVar = createAccountUiState.createAccountState;
        }
        return createAccountUiState.a(createAccountDecorator, kVar);
    }

    public final CreateAccountUiState a(CreateAccountDecorator createAccountDecorator, k createAccountState) {
        Intrinsics.j(createAccountDecorator, "createAccountDecorator");
        Intrinsics.j(createAccountState, "createAccountState");
        return new CreateAccountUiState(createAccountDecorator, createAccountState);
    }

    /* renamed from: c, reason: from getter */
    public final CreateAccountDecorator getCreateAccountDecorator() {
        return this.createAccountDecorator;
    }

    /* renamed from: d, reason: from getter */
    public final k getCreateAccountState() {
        return this.createAccountState;
    }

    public /* synthetic */ CreateAccountUiState(CreateAccountDecorator createAccountDecorator, k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CreateAccountDecorator(null, null, null, null, null, null, null, null, null, null, null, false, false, false, 16383, null) : createAccountDecorator, (i10 & 2) != 0 ? new k.FormFields(null, 1, null) : kVar);
    }
}
