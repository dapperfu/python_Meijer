package com.meijer.mobile.storeinfo.api.model.errors;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/errors/ValidationErrors;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiError;", "errors", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ValidationErrors extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StoreInfoApiError> errors;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable cause;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationErrors() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationErrors)) {
            return false;
        }
        ValidationErrors validationErrors = (ValidationErrors) other;
        return Intrinsics.e(this.errors, validationErrors.errors) && Intrinsics.e(this.cause, validationErrors.cause);
    }

    public int hashCode() {
        int iHashCode = this.errors.hashCode() * 31;
        Throwable th2 = this.cause;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ValidationErrors(errors=" + this.errors + ", cause=" + this.cause + ')';
    }

    public /* synthetic */ ValidationErrors(List list, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationErrors(List<StoreInfoApiError> errors, Throwable th2) {
        super("Validation failed: " + errors.size() + " error(s)", th2);
        Intrinsics.j(errors, "errors");
        this.errors = errors;
        this.cause = th2;
    }
}
