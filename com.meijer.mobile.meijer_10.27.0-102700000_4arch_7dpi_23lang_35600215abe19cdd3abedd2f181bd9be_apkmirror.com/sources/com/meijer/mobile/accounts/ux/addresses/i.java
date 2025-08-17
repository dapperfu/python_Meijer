package com.meijer.mobile.accounts.ux.addresses;

import Dh.AbstractC3371d;
import Dh.AccountAddress;
import Dh.AccountAddresses;
import Dh.EnumC3372e;
import Dh.UpdateConfirmationResponse;
import Sh.AddressDecorator;
import Sh.AddressSuggestionDecorator;
import Sh.DeleteAddressDecorator;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.accounts.ux.addresses.a;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
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
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import responses.PostalAddress;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import uh.EnumC17262d;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00019B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010,J%\u00101\u001a\u00020\u000e\"\f\b\u0000\u0010/*\u0006\u0012\u0002\b\u00030.2\u0006\u00100\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u0014*\u00020#H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020D0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/i;", "Landroidx/lifecycle/c0;", "LBh/a;", "accountAddressesRepository", "LBh/c;", "accountsAMSRepository", "LTi/d;", "addressRepository", "Lgi/a;", "analyticsEngine", "Lyl/k;", "featureManager", "<init>", "(LBh/a;LBh/c;LTi/d;Lgi/a;Lyl/k;)V", "", "D", "()V", "Lak/a;", "E", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFailure", "G", "(Z)Lak/a;", "LDh/b;", "addresses", "errorMessage", "O", "(LDh/b;Lak/a;)V", "LDh/a;", PlaceTypes.ADDRESS, "skipAddressVerification", "A", "(LDh/a;Z)V", "Q", "LSh/a;", "R", "(LSh/a;)V", "accountAddress", "P", "(LDh/a;)V", "", "addressId", "C", "(J)V", "B", "LGh/a;", "T", "formField", "S", "(LGh/a;)V", "H", "(LSh/a;)Z", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "action", "I", "(Lcom/meijer/mobile/accounts/ux/addresses/a;)V", "a", "LBh/a;", "b", "LBh/c;", "c", "LTi/d;", "d", "Lgi/a;", "e", "Lyl/k;", "Ltv/B;", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "f", "Ltv/B;", "_addressesState", "Ltv/P;", "g", "Ltv/P;", "F", "()Ltv/P;", "addressesState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class i extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.a accountAddressesRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bh.c accountsAMSRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ti.d addressRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<AddressesScreenViewState> _addressesState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<AddressesScreenViewState> addressesState;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J²\u0001\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b/\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b3\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b7\u00105R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b8\u00102R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b9\u00102R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b:\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b6\u00105R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b;\u00102¨\u0006<"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "", "", "LSh/a;", "addresses", "LSh/c;", "addressSuggestions", "savedFormChanges", "unsavedFormChanges", "LSh/e;", "deleteAddressDecorator", "", "hasPendingChanges", "Lak/a;", "disclaimerPart1", "disclaimerPart2", "sheetTitle", "showModal", "showSuccessNotification", "isLoading", "errorMessage", "isEditMode", "<init>", "(Ljava/util/List;Ljava/util/List;LSh/a;LSh/a;LSh/e;ZLak/a;Lak/a;Lak/a;ZZZLak/a;Z)V", "a", "(Ljava/util/List;Ljava/util/List;LSh/a;LSh/a;LSh/e;ZLak/a;Lak/a;Lak/a;ZZZLak/a;Z)Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "LSh/a;", "j", "()LSh/a;", "n", "e", "LSh/e;", "()LSh/e;", "f", "Z", "i", "()Z", "g", "Lak/a;", "()Lak/a;", "h", "k", "l", "m", "p", "o", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.i$a, reason: from toString */
    public static final /* data */ class AddressesScreenViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AddressDecorator> addresses;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AddressSuggestionDecorator> addressSuggestions;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator savedFormChanges;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator unsavedFormChanges;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeleteAddressDecorator deleteAddressDecorator;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChanges;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a disclaimerPart1;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a disclaimerPart2;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a sheetTitle;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showModal;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showSuccessNotification;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a errorMessage;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditMode;

        public AddressesScreenViewState() {
            this(null, null, null, null, null, false, null, null, null, false, false, false, null, false, 16383, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressesScreenViewState)) {
                return false;
            }
            AddressesScreenViewState addressesScreenViewState = (AddressesScreenViewState) other;
            return Intrinsics.e(this.addresses, addressesScreenViewState.addresses) && Intrinsics.e(this.addressSuggestions, addressesScreenViewState.addressSuggestions) && Intrinsics.e(this.savedFormChanges, addressesScreenViewState.savedFormChanges) && Intrinsics.e(this.unsavedFormChanges, addressesScreenViewState.unsavedFormChanges) && Intrinsics.e(this.deleteAddressDecorator, addressesScreenViewState.deleteAddressDecorator) && this.hasPendingChanges == addressesScreenViewState.hasPendingChanges && Intrinsics.e(this.disclaimerPart1, addressesScreenViewState.disclaimerPart1) && Intrinsics.e(this.disclaimerPart2, addressesScreenViewState.disclaimerPart2) && Intrinsics.e(this.sheetTitle, addressesScreenViewState.sheetTitle) && this.showModal == addressesScreenViewState.showModal && this.showSuccessNotification == addressesScreenViewState.showSuccessNotification && this.isLoading == addressesScreenViewState.isLoading && Intrinsics.e(this.errorMessage, addressesScreenViewState.errorMessage) && this.isEditMode == addressesScreenViewState.isEditMode;
        }

        public int hashCode() {
            int iHashCode = ((((((this.addresses.hashCode() * 31) + this.addressSuggestions.hashCode()) * 31) + this.savedFormChanges.hashCode()) * 31) + this.unsavedFormChanges.hashCode()) * 31;
            DeleteAddressDecorator deleteAddressDecorator = this.deleteAddressDecorator;
            int iHashCode2 = (((iHashCode + (deleteAddressDecorator == null ? 0 : deleteAddressDecorator.hashCode())) * 31) + Boolean.hashCode(this.hasPendingChanges)) * 31;
            AbstractC5607a abstractC5607a = this.disclaimerPart1;
            int iHashCode3 = (iHashCode2 + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
            AbstractC5607a abstractC5607a2 = this.disclaimerPart2;
            int iHashCode4 = (iHashCode3 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.sheetTitle;
            int iHashCode5 = (((((((iHashCode4 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31) + Boolean.hashCode(this.showModal)) * 31) + Boolean.hashCode(this.showSuccessNotification)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
            AbstractC5607a abstractC5607a4 = this.errorMessage;
            return ((iHashCode5 + (abstractC5607a4 != null ? abstractC5607a4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEditMode);
        }

        public String toString() {
            return "AddressesScreenViewState(addresses=" + this.addresses + ", addressSuggestions=" + this.addressSuggestions + ", savedFormChanges=" + this.savedFormChanges + ", unsavedFormChanges=" + this.unsavedFormChanges + ", deleteAddressDecorator=" + this.deleteAddressDecorator + ", hasPendingChanges=" + this.hasPendingChanges + ", disclaimerPart1=" + this.disclaimerPart1 + ", disclaimerPart2=" + this.disclaimerPart2 + ", sheetTitle=" + this.sheetTitle + ", showModal=" + this.showModal + ", showSuccessNotification=" + this.showSuccessNotification + ", isLoading=" + this.isLoading + ", errorMessage=" + this.errorMessage + ", isEditMode=" + this.isEditMode + ')';
        }

        public AddressesScreenViewState(List<AddressDecorator> addresses, List<AddressSuggestionDecorator> addressSuggestions, AddressDecorator savedFormChanges, AddressDecorator unsavedFormChanges, DeleteAddressDecorator deleteAddressDecorator, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z11, boolean z12, boolean z13, AbstractC5607a abstractC5607a4, boolean z14) {
            Intrinsics.j(addresses, "addresses");
            Intrinsics.j(addressSuggestions, "addressSuggestions");
            Intrinsics.j(savedFormChanges, "savedFormChanges");
            Intrinsics.j(unsavedFormChanges, "unsavedFormChanges");
            this.addresses = addresses;
            this.addressSuggestions = addressSuggestions;
            this.savedFormChanges = savedFormChanges;
            this.unsavedFormChanges = unsavedFormChanges;
            this.deleteAddressDecorator = deleteAddressDecorator;
            this.hasPendingChanges = z10;
            this.disclaimerPart1 = abstractC5607a;
            this.disclaimerPart2 = abstractC5607a2;
            this.sheetTitle = abstractC5607a3;
            this.showModal = z11;
            this.showSuccessNotification = z12;
            this.isLoading = z13;
            this.errorMessage = abstractC5607a4;
            this.isEditMode = z14;
        }

        public static /* synthetic */ AddressesScreenViewState b(AddressesScreenViewState addressesScreenViewState, List list, List list2, AddressDecorator addressDecorator, AddressDecorator addressDecorator2, DeleteAddressDecorator deleteAddressDecorator, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z11, boolean z12, boolean z13, AbstractC5607a abstractC5607a4, boolean z14, int i10, Object obj) {
            return addressesScreenViewState.a((i10 & 1) != 0 ? addressesScreenViewState.addresses : list, (i10 & 2) != 0 ? addressesScreenViewState.addressSuggestions : list2, (i10 & 4) != 0 ? addressesScreenViewState.savedFormChanges : addressDecorator, (i10 & 8) != 0 ? addressesScreenViewState.unsavedFormChanges : addressDecorator2, (i10 & 16) != 0 ? addressesScreenViewState.deleteAddressDecorator : deleteAddressDecorator, (i10 & 32) != 0 ? addressesScreenViewState.hasPendingChanges : z10, (i10 & 64) != 0 ? addressesScreenViewState.disclaimerPart1 : abstractC5607a, (i10 & 128) != 0 ? addressesScreenViewState.disclaimerPart2 : abstractC5607a2, (i10 & 256) != 0 ? addressesScreenViewState.sheetTitle : abstractC5607a3, (i10 & 512) != 0 ? addressesScreenViewState.showModal : z11, (i10 & 1024) != 0 ? addressesScreenViewState.showSuccessNotification : z12, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? addressesScreenViewState.isLoading : z13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? addressesScreenViewState.errorMessage : abstractC5607a4, (i10 & 8192) != 0 ? addressesScreenViewState.isEditMode : z14);
        }

        public final AddressesScreenViewState a(List<AddressDecorator> addresses, List<AddressSuggestionDecorator> addressSuggestions, AddressDecorator savedFormChanges, AddressDecorator unsavedFormChanges, DeleteAddressDecorator deleteAddressDecorator, boolean hasPendingChanges, AbstractC5607a disclaimerPart1, AbstractC5607a disclaimerPart2, AbstractC5607a sheetTitle, boolean showModal, boolean showSuccessNotification, boolean isLoading, AbstractC5607a errorMessage, boolean isEditMode) {
            Intrinsics.j(addresses, "addresses");
            Intrinsics.j(addressSuggestions, "addressSuggestions");
            Intrinsics.j(savedFormChanges, "savedFormChanges");
            Intrinsics.j(unsavedFormChanges, "unsavedFormChanges");
            return new AddressesScreenViewState(addresses, addressSuggestions, savedFormChanges, unsavedFormChanges, deleteAddressDecorator, hasPendingChanges, disclaimerPart1, disclaimerPart2, sheetTitle, showModal, showSuccessNotification, isLoading, errorMessage, isEditMode);
        }

        public final List<AddressSuggestionDecorator> c() {
            return this.addressSuggestions;
        }

        public final List<AddressDecorator> d() {
            return this.addresses;
        }

        /* renamed from: e, reason: from getter */
        public final DeleteAddressDecorator getDeleteAddressDecorator() {
            return this.deleteAddressDecorator;
        }

        /* renamed from: f, reason: from getter */
        public final AbstractC5607a getDisclaimerPart1() {
            return this.disclaimerPart1;
        }

        /* renamed from: g, reason: from getter */
        public final AbstractC5607a getDisclaimerPart2() {
            return this.disclaimerPart2;
        }

        /* renamed from: h, reason: from getter */
        public final AbstractC5607a getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getHasPendingChanges() {
            return this.hasPendingChanges;
        }

        /* renamed from: j, reason: from getter */
        public final AddressDecorator getSavedFormChanges() {
            return this.savedFormChanges;
        }

        /* renamed from: k, reason: from getter */
        public final AbstractC5607a getSheetTitle() {
            return this.sheetTitle;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getShowModal() {
            return this.showModal;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getShowSuccessNotification() {
            return this.showSuccessNotification;
        }

        /* renamed from: n, reason: from getter */
        public final AddressDecorator getUnsavedFormChanges() {
            return this.unsavedFormChanges;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getIsEditMode() {
            return this.isEditMode;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ AddressesScreenViewState(List list, List list2, AddressDecorator addressDecorator, AddressDecorator addressDecorator2, DeleteAddressDecorator deleteAddressDecorator, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z11, boolean z12, boolean z13, AbstractC5607a abstractC5607a4, boolean z14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? CollectionsKt.m() : list2, (i10 & 4) != 0 ? new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null) : addressDecorator, (i10 & 8) != 0 ? new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null) : addressDecorator2, (i10 & 16) != 0 ? null : deleteAddressDecorator, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : abstractC5607a, (i10 & 128) != 0 ? null : abstractC5607a2, (i10 & 256) != 0 ? null : abstractC5607a3, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? abstractC5607a4 : null, (i10 & 8192) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$addAddress$2", f = "AddressesScreenViewModel.kt", l = {167}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94095a;

        /* renamed from: b, reason: collision with root package name */
        Object f94096b;

        /* renamed from: c, reason: collision with root package name */
        Object f94097c;

        /* renamed from: d, reason: collision with root package name */
        Object f94098d;

        /* renamed from: e, reason: collision with root package name */
        int f94099e;

        /* renamed from: f, reason: collision with root package name */
        int f94100f;

        /* renamed from: g, reason: collision with root package name */
        int f94101g;

        /* renamed from: h, reason: collision with root package name */
        int f94102h;

        /* renamed from: i, reason: collision with root package name */
        int f94103i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94104j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AccountAddress f94106l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f94107m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(this.f94106l, this.f94107m, continuation);
            bVar.f94104j = obj;
            return bVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AccountAddress accountAddress, boolean z10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f94106l = accountAddress;
            this.f94107m = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            AddressesScreenViewState addressesScreenViewState;
            Object value2;
            AddressesScreenViewState addressesScreenViewState2;
            Object value3;
            AddressesScreenViewState addressesScreenViewState3;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94103i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94104j;
                    i iVar = i.this;
                    AccountAddress accountAddress = this.f94106l;
                    boolean z10 = this.f94107m;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.c cVar = iVar.accountsAMSRepository;
                    this.f94104j = interfaceC16622O;
                    this.f94095a = interfaceC16622O;
                    this.f94096b = this;
                    this.f94097c = this;
                    this.f94098d = interfaceC16622O;
                    this.f94099e = 0;
                    this.f94100f = 0;
                    this.f94101g = 0;
                    this.f94102h = 0;
                    this.f94103i = 1;
                    objC = cVar.c(accountAddress, z10, this);
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
            i iVar2 = i.this;
            if (Result.h(objB)) {
                AbstractC3371d abstractC3371d = (AbstractC3371d) objB;
                if (abstractC3371d instanceof AbstractC3371d.Success) {
                    InterfaceC17140B interfaceC17140B = iVar2._addressesState;
                    do {
                        value3 = interfaceC17140B.getValue();
                        addressesScreenViewState3 = (AddressesScreenViewState) value3;
                    } while (!interfaceC17140B.e(value3, AddressesScreenViewState.b(addressesScreenViewState3, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState3.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, l3.f92483b, null), null, null, false, null, null, null, false, true, false, null, false, 14809, null)));
                } else {
                    if (!(abstractC3371d instanceof AbstractC3371d.Select)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC17140B interfaceC17140B2 = iVar2._addressesState;
                    do {
                        value2 = interfaceC17140B2.getValue();
                        addressesScreenViewState2 = (AddressesScreenViewState) value2;
                    } while (!interfaceC17140B2.e(value2, AddressesScreenViewState.b(addressesScreenViewState2, null, Sh.d.c((AbstractC3371d.Select) abstractC3371d), AddressDecorator.f(addressesScreenViewState2.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16377, null)));
                }
            }
            i iVar3 = i.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B3 = iVar3._addressesState;
                do {
                    value = interfaceC17140B3.getValue();
                    addressesScreenViewState = (AddressesScreenViewState) value;
                } while (!interfaceC17140B3.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), l3.f92483b, null), null, null, false, null, null, null, true, false, false, null, false, 15865, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$deleteAddress$2", f = "AddressesScreenViewModel.kt", l = {389}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94108a;

        /* renamed from: b, reason: collision with root package name */
        Object f94109b;

        /* renamed from: c, reason: collision with root package name */
        Object f94110c;

        /* renamed from: d, reason: collision with root package name */
        Object f94111d;

        /* renamed from: e, reason: collision with root package name */
        int f94112e;

        /* renamed from: f, reason: collision with root package name */
        int f94113f;

        /* renamed from: g, reason: collision with root package name */
        int f94114g;

        /* renamed from: h, reason: collision with root package name */
        int f94115h;

        /* renamed from: i, reason: collision with root package name */
        int f94116i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94117j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f94119l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f94119l = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = i.this.new c(this.f94119l, continuation);
            cVar.f94117j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            AddressesScreenViewState addressesScreenViewState;
            Object value2;
            AddressesScreenViewState addressesScreenViewState2;
            Object objB2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94116i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94117j;
                    i iVar = i.this;
                    long j10 = this.f94119l;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.a aVar = iVar.accountAddressesRepository;
                    this.f94117j = interfaceC16622O;
                    this.f94108a = interfaceC16622O;
                    this.f94109b = this;
                    this.f94110c = this;
                    this.f94111d = interfaceC16622O;
                    this.f94112e = 0;
                    this.f94113f = 0;
                    this.f94114g = 0;
                    this.f94115h = 0;
                    this.f94116i = 1;
                    objB2 = aVar.b(j10, this);
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
            i iVar2 = i.this;
            if (Result.h(objB)) {
                UpdateConfirmationResponse updateConfirmationResponse = (UpdateConfirmationResponse) objB;
                InterfaceC17140B interfaceC17140B = iVar2._addressesState;
                do {
                    value2 = interfaceC17140B.getValue();
                    addressesScreenViewState2 = (AddressesScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, AddressesScreenViewState.b(addressesScreenViewState2, null, null, AddressDecorator.f(addressesScreenViewState2.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, updateConfirmationResponse.getIsSuccess() ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10831z0, new Object[0]), l3.f92483b, null), null, !updateConfirmationResponse.getIsSuccess() ? null : addressesScreenViewState2.getDeleteAddressDecorator(), false, null, null, null, !updateConfirmationResponse.getIsSuccess(), updateConfirmationResponse.getIsSuccess(), false, null, false, 14827, null)));
            }
            i iVar3 = i.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = iVar3._addressesState;
                do {
                    value = interfaceC17140B2.getValue();
                    addressesScreenViewState = (AddressesScreenViewState) value;
                } while (!interfaceC17140B2.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10831z0, new Object[0]), l3.f92483b, null), null, null, false, null, null, null, true, false, false, null, false, 15851, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$deleteAddressV2$2", f = "AddressesScreenViewModel.kt", l = {348}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94120a;

        /* renamed from: b, reason: collision with root package name */
        Object f94121b;

        /* renamed from: c, reason: collision with root package name */
        Object f94122c;

        /* renamed from: d, reason: collision with root package name */
        Object f94123d;

        /* renamed from: e, reason: collision with root package name */
        int f94124e;

        /* renamed from: f, reason: collision with root package name */
        int f94125f;

        /* renamed from: g, reason: collision with root package name */
        int f94126g;

        /* renamed from: h, reason: collision with root package name */
        int f94127h;

        /* renamed from: i, reason: collision with root package name */
        int f94128i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94129j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f94131l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f94131l = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = i.this.new d(this.f94131l, continuation);
            dVar.f94129j = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            AddressesScreenViewState addressesScreenViewState;
            Object value2;
            AddressesScreenViewState addressesScreenViewState2;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94128i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94129j;
                    i iVar = i.this;
                    long j10 = this.f94131l;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.c cVar = iVar.accountsAMSRepository;
                    this.f94129j = interfaceC16622O;
                    this.f94120a = interfaceC16622O;
                    this.f94121b = this;
                    this.f94122c = this;
                    this.f94123d = interfaceC16622O;
                    this.f94124e = 0;
                    this.f94125f = 0;
                    this.f94126g = 0;
                    this.f94127h = 0;
                    this.f94128i = 1;
                    objE = cVar.e(j10, this);
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objE = obj;
                }
                objB = Result.b(objE);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            if (Result.h(objB)) {
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                InterfaceC17140B interfaceC17140B = iVar2._addressesState;
                do {
                    value2 = interfaceC17140B.getValue();
                    addressesScreenViewState2 = (AddressesScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, AddressesScreenViewState.b(addressesScreenViewState2, null, null, AddressDecorator.f(addressesScreenViewState2.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, zBooleanValue ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10831z0, new Object[0]), l3.f92483b, null), null, !zBooleanValue ? null : addressesScreenViewState2.getDeleteAddressDecorator(), false, null, null, null, !zBooleanValue, zBooleanValue, false, null, false, 14827, null)));
            }
            i iVar3 = i.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = iVar3._addressesState;
                do {
                    value = interfaceC17140B2.getValue();
                    addressesScreenViewState = (AddressesScreenViewState) value;
                } while (!interfaceC17140B2.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10831z0, new Object[0]), l3.f92483b, null), null, null, false, null, null, null, true, false, false, null, false, 15851, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$fetchAddresses$1", f = "AddressesScreenViewModel.kt", l = {68, 70, 77}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94132a;

        /* renamed from: b, reason: collision with root package name */
        int f94133b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh/b;", "addresses", "", "<anonymous>", "(LDh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$fetchAddresses$1$2", f = "AddressesScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<AccountAddresses, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f94135a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f94136b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f94137c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94138d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f94137c, this.f94138d, continuation);
                aVar.f94136b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, AbstractC5607a abstractC5607a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f94137c = iVar;
                this.f94138d = abstractC5607a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountAddresses accountAddresses, Continuation<? super Unit> continuation) {
                return ((a) create(accountAddresses, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f94135a == 0) {
                    ResultKt.b(obj);
                    this.f94137c.O((AccountAddresses) this.f94136b, this.f94138d);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh/b;", "addresses", "", "<anonymous>", "(LDh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$fetchAddresses$1$3", f = "AddressesScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<AccountAddresses, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f94139a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f94140b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f94141c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94142d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f94141c, this.f94142d, continuation);
                bVar.f94140b = obj;
                return bVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, AbstractC5607a abstractC5607a, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f94141c = iVar;
                this.f94142d = abstractC5607a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountAddresses accountAddresses, Continuation<? super Unit> continuation) {
                return ((b) create(accountAddresses, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f94139a == 0) {
                    ResultKt.b(obj);
                    this.f94141c.O((AccountAddresses) this.f94140b, this.f94142d);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        
            if (tv.C17154h.k(r3, r5, r24) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
        
            if (tv.C17154h.k(r4, r5, r24) == r1) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f94133b
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L25
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1c:
                java.lang.Object r1 = r0.f94132a
                ak.a r1 = (ak.AbstractC5607a) r1
                kotlin.ResultKt.b(r25)
                goto Lb1
            L25:
                kotlin.ResultKt.b(r25)
                r2 = r25
                goto L68
            L2b:
                kotlin.ResultKt.b(r25)
                com.meijer.mobile.accounts.ux.addresses.i r2 = com.meijer.mobile.accounts.ux.addresses.i.this
                tv.B r2 = com.meijer.mobile.accounts.ux.addresses.i.w(r2)
            L34:
                java.lang.Object r6 = r2.getValue()
                r7 = r6
                com.meijer.mobile.accounts.ux.addresses.i$a r7 = (com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState) r7
                r22 = 14335(0x37ff, float:2.0088E-41)
                r23 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 1
                r20 = 0
                r21 = 0
                com.meijer.mobile.accounts.ux.addresses.i$a r7 = com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                boolean r6 = r2.e(r6, r7)
                if (r6 == 0) goto L34
                com.meijer.mobile.accounts.ux.addresses.i r2 = com.meijer.mobile.accounts.ux.addresses.i.this
                r0.f94133b = r5
                java.lang.Object r2 = com.meijer.mobile.accounts.ux.addresses.i.r(r2, r0)
                if (r2 != r1) goto L68
                goto Lb0
            L68:
                ak.a r2 = (ak.AbstractC5607a) r2
                com.meijer.mobile.accounts.ux.addresses.i r5 = com.meijer.mobile.accounts.ux.addresses.i.this
                yl.k r5 = com.meijer.mobile.accounts.ux.addresses.i.v(r5)
                yl.f$c r6 = yl.AbstractC18227f.C18230c.f170570h
                boolean r5 = r5.e(r6)
                r6 = 0
                if (r5 == 0) goto L95
                com.meijer.mobile.accounts.ux.addresses.i r3 = com.meijer.mobile.accounts.ux.addresses.i.this
                Bh.c r3 = com.meijer.mobile.accounts.ux.addresses.i.t(r3)
                tv.P r3 = r3.i()
                com.meijer.mobile.accounts.ux.addresses.i$e$a r5 = new com.meijer.mobile.accounts.ux.addresses.i$e$a
                com.meijer.mobile.accounts.ux.addresses.i r7 = com.meijer.mobile.accounts.ux.addresses.i.this
                r5.<init>(r7, r2, r6)
                r0.f94132a = r2
                r0.f94133b = r4
                java.lang.Object r2 = tv.C17154h.k(r3, r5, r0)
                if (r2 != r1) goto Lb1
                goto Lb0
            L95:
                com.meijer.mobile.accounts.ux.addresses.i r4 = com.meijer.mobile.accounts.ux.addresses.i.this
                Bh.a r4 = com.meijer.mobile.accounts.ux.addresses.i.s(r4)
                tv.P r4 = r4.d()
                com.meijer.mobile.accounts.ux.addresses.i$e$b r5 = new com.meijer.mobile.accounts.ux.addresses.i$e$b
                com.meijer.mobile.accounts.ux.addresses.i r7 = com.meijer.mobile.accounts.ux.addresses.i.this
                r5.<init>(r7, r2, r6)
                r0.f94132a = r2
                r0.f94133b = r3
                java.lang.Object r2 = tv.C17154h.k(r4, r5, r0)
                if (r2 != r1) goto Lb1
            Lb0:
                return r1
            Lb1:
                kotlin.Unit r1 = kotlin.Unit.f142422a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.addresses.i.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel", f = "AddressesScreenViewModel.kt", l = {91, 93}, m = "getAccountAddresses")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94143a;

        /* renamed from: b, reason: collision with root package name */
        Object f94144b;

        /* renamed from: c, reason: collision with root package name */
        Object f94145c;

        /* renamed from: d, reason: collision with root package name */
        Object f94146d;

        /* renamed from: e, reason: collision with root package name */
        Object f94147e;

        /* renamed from: f, reason: collision with root package name */
        int f94148f;

        /* renamed from: g, reason: collision with root package name */
        int f94149g;

        /* renamed from: h, reason: collision with root package name */
        int f94150h;

        /* renamed from: i, reason: collision with root package name */
        int f94151i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94152j;

        /* renamed from: l, reason: collision with root package name */
        int f94154l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94152j = obj;
            this.f94154l |= Integer.MIN_VALUE;
            return i.this.E(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$saveAddress$2", f = "AddressesScreenViewModel.kt", l = {310}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94155a;

        /* renamed from: b, reason: collision with root package name */
        Object f94156b;

        /* renamed from: c, reason: collision with root package name */
        Object f94157c;

        /* renamed from: d, reason: collision with root package name */
        Object f94158d;

        /* renamed from: e, reason: collision with root package name */
        int f94159e;

        /* renamed from: f, reason: collision with root package name */
        int f94160f;

        /* renamed from: g, reason: collision with root package name */
        int f94161g;

        /* renamed from: h, reason: collision with root package name */
        int f94162h;

        /* renamed from: i, reason: collision with root package name */
        int f94163i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94164j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AccountAddress f94166l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = i.this.new h(this.f94166l, continuation);
            hVar.f94164j = obj;
            return hVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AccountAddress accountAddress, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f94166l = accountAddress;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            AddressesScreenViewState addressesScreenViewState;
            Object value2;
            AddressesScreenViewState addressesScreenViewState2;
            boolean isSuccess;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94163i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94164j;
                    i iVar = i.this;
                    AccountAddress accountAddress = this.f94166l;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.a aVar = iVar.accountAddressesRepository;
                    this.f94164j = interfaceC16622O;
                    this.f94155a = interfaceC16622O;
                    this.f94156b = this;
                    this.f94157c = this;
                    this.f94158d = interfaceC16622O;
                    this.f94159e = 0;
                    this.f94160f = 0;
                    this.f94161g = 0;
                    this.f94162h = 0;
                    this.f94163i = 1;
                    objE = aVar.e(accountAddress, this);
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objE = obj;
                }
                objB = Result.b(objE);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            if (Result.h(objB)) {
                UpdateConfirmationResponse updateConfirmationResponse = (UpdateConfirmationResponse) objB;
                InterfaceC17140B interfaceC17140B = iVar2._addressesState;
                do {
                    value2 = interfaceC17140B.getValue();
                    addressesScreenViewState2 = (AddressesScreenViewState) value2;
                    isSuccess = updateConfirmationResponse.getIsSuccess();
                } while (!interfaceC17140B.e(value2, AddressesScreenViewState.b(addressesScreenViewState2, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState2.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, !updateConfirmationResponse.getIsSuccess() ? AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]) : null, l3.f92483b, null), null, null, !updateConfirmationResponse.getIsSuccess(), null, null, null, !updateConfirmationResponse.getIsSuccess(), isSuccess, false, null, false, 14809, null)));
            }
            i iVar3 = i.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = iVar3._addressesState;
                do {
                    value = interfaceC17140B2.getValue();
                    addressesScreenViewState = (AddressesScreenViewState) value;
                } while (!interfaceC17140B2.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), l3.f92483b, null), null, null, false, null, null, null, true, false, false, null, false, 15865, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$updateAddress$2", f = "AddressesScreenViewModel.kt", l = {219}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.i$i, reason: collision with other inner class name */
    static final class C1320i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94167a;

        /* renamed from: b, reason: collision with root package name */
        Object f94168b;

        /* renamed from: c, reason: collision with root package name */
        Object f94169c;

        /* renamed from: d, reason: collision with root package name */
        Object f94170d;

        /* renamed from: e, reason: collision with root package name */
        int f94171e;

        /* renamed from: f, reason: collision with root package name */
        int f94172f;

        /* renamed from: g, reason: collision with root package name */
        int f94173g;

        /* renamed from: h, reason: collision with root package name */
        int f94174h;

        /* renamed from: i, reason: collision with root package name */
        int f94175i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94176j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AccountAddress f94178l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f94179m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1320i c1320i = i.this.new C1320i(this.f94178l, this.f94179m, continuation);
            c1320i.f94176j = obj;
            return c1320i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1320i(AccountAddress accountAddress, boolean z10, Continuation<? super C1320i> continuation) {
            super(2, continuation);
            this.f94178l = accountAddress;
            this.f94179m = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C1320i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            AddressesScreenViewState addressesScreenViewState;
            Object value2;
            AddressesScreenViewState addressesScreenViewState2;
            Object value3;
            AddressesScreenViewState addressesScreenViewState3;
            Object objL;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94175i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94176j;
                    i iVar = i.this;
                    AccountAddress accountAddress = this.f94178l;
                    boolean z10 = this.f94179m;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.c cVar = iVar.accountsAMSRepository;
                    this.f94176j = interfaceC16622O;
                    this.f94167a = interfaceC16622O;
                    this.f94168b = this;
                    this.f94169c = this;
                    this.f94170d = interfaceC16622O;
                    this.f94171e = 0;
                    this.f94172f = 0;
                    this.f94173g = 0;
                    this.f94174h = 0;
                    this.f94175i = 1;
                    objL = cVar.l(accountAddress, z10, this);
                    if (objL == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objL = obj;
                }
                objB = Result.b(objL);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            if (Result.h(objB)) {
                AbstractC3371d abstractC3371d = (AbstractC3371d) objB;
                if (abstractC3371d instanceof AbstractC3371d.Success) {
                    InterfaceC17140B interfaceC17140B = iVar2._addressesState;
                    do {
                        value3 = interfaceC17140B.getValue();
                        addressesScreenViewState3 = (AddressesScreenViewState) value3;
                    } while (!interfaceC17140B.e(value3, AddressesScreenViewState.b(addressesScreenViewState3, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState3.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, l3.f92483b, null), null, null, false, null, null, null, false, true, false, null, false, 14809, null)));
                } else {
                    if (!(abstractC3371d instanceof AbstractC3371d.Select)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC17140B interfaceC17140B2 = iVar2._addressesState;
                    do {
                        value2 = interfaceC17140B2.getValue();
                        addressesScreenViewState2 = (AddressesScreenViewState) value2;
                    } while (!interfaceC17140B2.e(value2, AddressesScreenViewState.b(addressesScreenViewState2, null, Sh.d.c((AbstractC3371d.Select) abstractC3371d), AddressDecorator.f(addressesScreenViewState2.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16377, null)));
                }
            }
            i iVar3 = i.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B3 = iVar3._addressesState;
                do {
                    value = interfaceC17140B3.getValue();
                    addressesScreenViewState = (AddressesScreenViewState) value;
                } while (!interfaceC17140B3.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), l3.f92483b, null), null, null, false, null, null, null, true, false, false, null, false, 15865, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.addresses.AddressesScreenViewModel$validateEnteredAddress$2", f = "AddressesScreenViewModel.kt", l = {271}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94180a;

        /* renamed from: b, reason: collision with root package name */
        Object f94181b;

        /* renamed from: c, reason: collision with root package name */
        Object f94182c;

        /* renamed from: d, reason: collision with root package name */
        Object f94183d;

        /* renamed from: e, reason: collision with root package name */
        int f94184e;

        /* renamed from: f, reason: collision with root package name */
        int f94185f;

        /* renamed from: g, reason: collision with root package name */
        int f94186g;

        /* renamed from: h, reason: collision with root package name */
        int f94187h;

        /* renamed from: i, reason: collision with root package name */
        int f94188i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94189j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AccountAddress f94191l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = i.this.new j(this.f94191l, continuation);
            jVar.f94189j = obj;
            return jVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AccountAddress accountAddress, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f94191l = accountAddress;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object obj2;
            Object value;
            AddressesScreenViewState addressesScreenViewState;
            Object value2;
            AddressesScreenViewState addressesScreenViewState2;
            Object objI;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94188i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94189j;
                    i iVar = i.this;
                    AccountAddress accountAddress = this.f94191l;
                    Result.Companion companion = Result.INSTANCE;
                    Ti.d dVar = iVar.addressRepository;
                    this.f94189j = interfaceC16622O;
                    this.f94180a = interfaceC16622O;
                    this.f94181b = this;
                    this.f94182c = this;
                    this.f94183d = interfaceC16622O;
                    this.f94184e = 0;
                    this.f94185f = 0;
                    this.f94186g = 0;
                    this.f94187h = 0;
                    this.f94188i = 1;
                    objI = dVar.i(accountAddress, this);
                    if (objI == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objI = obj;
                }
                objB = Result.b(objI);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            AccountAddress accountAddress2 = this.f94191l;
            if (Result.h(objB)) {
                PostalAddress postalAddress = (PostalAddress) objB;
                if (postalAddress != null) {
                    InterfaceC17140B interfaceC17140B = iVar2._addressesState;
                    while (true) {
                        Object value3 = interfaceC17140B.getValue();
                        AddressesScreenViewState addressesScreenViewState3 = (AddressesScreenViewState) value3;
                        PostalAddress postalAddress2 = postalAddress;
                        obj2 = objB;
                        if (interfaceC17140B.e(value3, AddressesScreenViewState.b(addressesScreenViewState3, null, Sh.d.a(postalAddress2, AccountAddress.b(accountAddress2, 0L, 0L, null, null, null, null, null, null, null, EnumC17262d.f162975f, 0L, null, null, null, null, false, null, null, null, null, 1048063, null)), AddressDecorator.f(addressesScreenViewState3.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16377, null))) {
                            break;
                        }
                        postalAddress = postalAddress2;
                        objB = obj2;
                    }
                } else {
                    obj2 = objB;
                    InterfaceC17140B interfaceC17140B2 = iVar2._addressesState;
                    do {
                        value2 = interfaceC17140B2.getValue();
                        addressesScreenViewState2 = (AddressesScreenViewState) value2;
                    } while (!interfaceC17140B2.e(value2, AddressesScreenViewState.b(addressesScreenViewState2, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState2.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16377, null)));
                    iVar2.P(accountAddress2);
                }
            } else {
                obj2 = objB;
            }
            i iVar3 = i.this;
            AccountAddress accountAddress3 = this.f94191l;
            if (Result.e(obj2) != null) {
                InterfaceC17140B interfaceC17140B3 = iVar3._addressesState;
                do {
                    value = interfaceC17140B3.getValue();
                    addressesScreenViewState = (AddressesScreenViewState) value;
                } while (!interfaceC17140B3.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, CollectionsKt.m(), AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16377, null)));
                iVar3.P(accountAddress3);
            }
            return Unit.f142422a;
        }
    }

    public i(Bh.a accountAddressesRepository, Bh.c accountsAMSRepository, Ti.d addressRepository, InterfaceC14261a analyticsEngine, yl.k featureManager) {
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(addressRepository, "addressRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(featureManager, "featureManager");
        this.accountAddressesRepository = accountAddressesRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.addressRepository = addressRepository;
        this.analyticsEngine = analyticsEngine;
        this.featureManager = featureManager;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140BA = S.a(new AddressesScreenViewState(null, null, null, null, null, false, null, null, null, false, false, false, null, false, 16383, null));
        this._addressesState = interfaceC17140BA;
        this.addressesState = C17154h.c(interfaceC17140BA);
        D();
    }

    private final void A(AccountAddress address, boolean skipAddressVerification) {
        AddressesScreenViewState value;
        AddressesScreenViewState addressesScreenViewState;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        do {
            value = interfaceC17140B.getValue();
            addressesScreenViewState = value;
        } while (!interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, true, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
        C16648k.d(d0.a(this), null, null, new b(address, skipAddressVerification, null), 3, null);
    }

    private final void B(long addressId) {
        AddressesScreenViewState value;
        AddressesScreenViewState addressesScreenViewState;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        do {
            value = interfaceC17140B.getValue();
            addressesScreenViewState = value;
        } while (!interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, true, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
        C16648k.d(d0.a(this), null, null, new c(addressId, null), 3, null);
    }

    private final void C(long addressId) {
        AddressesScreenViewState value;
        AddressesScreenViewState addressesScreenViewState;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        do {
            value = interfaceC17140B.getValue();
            addressesScreenViewState = value;
        } while (!interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, true, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
        C16648k.d(d0.a(this), null, null, new d(addressId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(kotlin.coroutines.Continuation<? super ak.AbstractC5607a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.accounts.ux.addresses.i.f
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.accounts.ux.addresses.i$f r0 = (com.meijer.mobile.accounts.ux.addresses.i.f) r0
            int r1 = r0.f94154l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94154l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.addresses.i$f r0 = new com.meijer.mobile.accounts.ux.addresses.i$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94152j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94154l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r1 = r0.f94147e
            com.meijer.mobile.accounts.ux.addresses.i r1 = (com.meijer.mobile.accounts.ux.addresses.i) r1
            java.lang.Object r2 = r0.f94146d
            com.meijer.mobile.accounts.ux.addresses.i r2 = (com.meijer.mobile.accounts.ux.addresses.i) r2
            java.lang.Object r2 = r0.f94145c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94144b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94143a
            com.meijer.mobile.accounts.ux.addresses.i r2 = (com.meijer.mobile.accounts.ux.addresses.i) r2
        L3c:
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L41
            goto Lb6
        L41:
            r6 = move-exception
            goto Lbb
        L44:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L4c:
            java.lang.Object r1 = r0.f94147e
            com.meijer.mobile.accounts.ux.addresses.i r1 = (com.meijer.mobile.accounts.ux.addresses.i) r1
            java.lang.Object r2 = r0.f94146d
            com.meijer.mobile.accounts.ux.addresses.i r2 = (com.meijer.mobile.accounts.ux.addresses.i) r2
            java.lang.Object r2 = r0.f94145c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94144b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94143a
            com.meijer.mobile.accounts.ux.addresses.i r2 = (com.meijer.mobile.accounts.ux.addresses.i) r2
            goto L3c
        L61:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L94
            yl.k r6 = v(r5)     // Catch: java.lang.Exception -> L94
            yl.f$c r2 = yl.AbstractC18227f.C18230c.f170570h     // Catch: java.lang.Exception -> L94
            boolean r6 = r6.e(r2)     // Catch: java.lang.Exception -> L94
            r2 = 0
            if (r6 == 0) goto L97
            Bh.c r6 = t(r5)     // Catch: java.lang.Exception -> L94
            r0.f94143a = r5     // Catch: java.lang.Exception -> L94
            r0.f94144b = r0     // Catch: java.lang.Exception -> L94
            r0.f94145c = r0     // Catch: java.lang.Exception -> L94
            r0.f94146d = r5     // Catch: java.lang.Exception -> L94
            r0.f94147e = r5     // Catch: java.lang.Exception -> L94
            r0.f94148f = r2     // Catch: java.lang.Exception -> L94
            r0.f94149g = r2     // Catch: java.lang.Exception -> L94
            r0.f94150h = r2     // Catch: java.lang.Exception -> L94
            r0.f94151i = r2     // Catch: java.lang.Exception -> L94
            r0.f94154l = r4     // Catch: java.lang.Exception -> L94
            java.lang.Object r6 = r6.h(r0)     // Catch: java.lang.Exception -> L94
            if (r6 != r1) goto L92
            goto Lb5
        L92:
            r1 = r5
            goto Lb6
        L94:
            r6 = move-exception
            r1 = r5
            goto Lbb
        L97:
            Bh.a r6 = s(r5)     // Catch: java.lang.Exception -> L94
            r0.f94143a = r5     // Catch: java.lang.Exception -> L94
            r0.f94144b = r0     // Catch: java.lang.Exception -> L94
            r0.f94145c = r0     // Catch: java.lang.Exception -> L94
            r0.f94146d = r5     // Catch: java.lang.Exception -> L94
            r0.f94147e = r5     // Catch: java.lang.Exception -> L94
            r0.f94148f = r2     // Catch: java.lang.Exception -> L94
            r0.f94149g = r2     // Catch: java.lang.Exception -> L94
            r0.f94150h = r2     // Catch: java.lang.Exception -> L94
            r0.f94151i = r2     // Catch: java.lang.Exception -> L94
            r0.f94154l = r3     // Catch: java.lang.Exception -> L94
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Exception -> L94
            if (r6 != r1) goto L92
        Lb5:
            return r1
        Lb6:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L41
            goto Lcc
        Lbb:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        Lcc:
            boolean r6 = kotlin.Result.g(r6)
            ak.a r6 = r1.G(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.addresses.i.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final AbstractC5607a G(boolean isFailure) {
        if (isFailure) {
            return AbstractC5607a.INSTANCE.d(Fh.h.f10727k1, new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(AccountAddresses addresses, AbstractC5607a errorMessage) {
        List<AccountAddress> listB;
        if (this.featureManager.e(AbstractC18227f.C18230c.f170570h)) {
            listB = addresses.b();
        } else {
            List<AccountAddress> listB2 = addresses.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB2) {
                if (((AccountAddress) obj).getAddressType() == EnumC3372e.f6514d) {
                    arrayList.add(obj);
                }
            }
            listB = arrayList;
        }
        int i10 = 5;
        List listB1 = CollectionsKt.b1(CollectionsKt.Z0(listB, new g()), 5);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            arrayList2.add(Sh.b.b((AccountAddress) it.next()));
        }
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        while (true) {
            AddressesScreenViewState value = interfaceC17140B.getValue();
            AddressesScreenViewState addressesScreenViewState = value;
            AbstractC5607a abstractC5607aD = null;
            AbstractC5607a abstractC5607aD2 = C5608b.a(errorMessage) ? arrayList2.size() < i10 ? AbstractC5607a.INSTANCE.d(Fh.h.f10622V1, new Object[0]) : AbstractC5607a.INSTANCE.d(Fh.h.f10753o, new Object[0]) : null;
            if (C5608b.a(errorMessage) && arrayList2.size() < i10) {
                abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10488C0, Integer.valueOf(arrayList2.size()));
            }
            if (interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, arrayList2, null, null, null, null, false, abstractC5607aD2, abstractC5607aD, null, false, false, false, errorMessage, false, 10046, null))) {
                return;
            } else {
                i10 = 5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(AccountAddress accountAddress) {
        AddressesScreenViewState value;
        AddressesScreenViewState addressesScreenViewState;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        do {
            value = interfaceC17140B.getValue();
            addressesScreenViewState = value;
        } while (!interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, true, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
        C16648k.d(d0.a(this), null, null, new h(accountAddress, null), 3, null);
    }

    private final void Q(AccountAddress address, boolean skipAddressVerification) {
        AddressesScreenViewState value;
        AddressesScreenViewState addressesScreenViewState;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        do {
            value = interfaceC17140B.getValue();
            addressesScreenViewState = value;
        } while (!interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, true, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
        C16648k.d(d0.a(this), null, null, new C1320i(address, skipAddressVerification, null), 3, null);
    }

    private final void R(AddressDecorator address) {
        AddressesScreenViewState value;
        AddressesScreenViewState addressesScreenViewState;
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
        do {
            value = interfaceC17140B.getValue();
            addressesScreenViewState = value;
        } while (!interfaceC17140B.e(value, AddressesScreenViewState.b(addressesScreenViewState, null, null, AddressDecorator.f(addressesScreenViewState.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, true, null, 12287, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
        C16648k.d(d0.a(this), null, null, new j(Sh.b.a(address), null), 3, null);
    }

    private final <T extends Gh.a<?>> void S(T formField) {
        i iVar = this;
        AddressDecorator addressDecoratorU = iVar._addressesState.getValue().getUnsavedFormChanges().u(formField);
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = iVar._addressesState;
        while (true) {
            AddressesScreenViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, AddressesScreenViewState.b(value, null, null, null, addressDecoratorU, null, iVar.H(addressDecoratorU), null, null, null, false, false, false, null, false, 16343, null))) {
                return;
            } else {
                iVar = this;
            }
        }
    }

    public final P<AddressesScreenViewState> F() {
        return this.addressesState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(a action) {
        AddressesScreenViewState value;
        a.ShowDeleteAddressConfirmationView showDeleteAddressConfirmationView;
        AddressesScreenViewState value2;
        AddressesScreenViewState addressesScreenViewState;
        AddressDecorator addressDecoratorF;
        AddressesScreenViewState value3;
        AddressesScreenViewState value4;
        AddressesScreenViewState addressesScreenViewState2;
        ArrayList arrayList;
        AddressesScreenViewState value5;
        AddressesScreenViewState value6;
        AddressesScreenViewState addressesScreenViewState3;
        AddressesScreenViewState value7;
        AddressesScreenViewState value8;
        String str;
        AddressesScreenViewState value9;
        a.EditAddress editAddress;
        AddressesScreenViewState value10;
        String str2;
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, a.i.f94064a)) {
            D();
            return;
        }
        if (Intrinsics.e(action, a.C1319a.f94056a)) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B = this._addressesState;
            do {
                value10 = interfaceC17140B.getValue();
                str2 = null;
            } while (!interfaceC17140B.e(value10, AddressesScreenViewState.b(value10, null, null, new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, str2, false, null, 16383, null), new AddressDecorator(0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, str2, null, false, null, 16383, null), null, false, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10683e, new Object[0]), true, false, false, null, false, 6387, null)));
            this.analyticsEngine.h(C14476c.a("account: address: Add New Address Initiation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.addresses.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.J((TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof a.EditAddress) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B2 = this._addressesState;
            do {
                value9 = interfaceC17140B2.getValue();
                editAddress = (a.EditAddress) action;
            } while (!interfaceC17140B2.e(value9, AddressesScreenViewState.b(value9, null, null, editAddress.getAddress(), editAddress.getAddress(), null, false, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10523H0, new Object[0]), true, false, false, null, true, 6387, null)));
            this.analyticsEngine.h(C14476c.a("account: address: Edit Address Initiation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.addresses.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.K((TrackingData) obj);
                }
            });
            return;
        }
        if (Intrinsics.e(action, a.b.f94057a)) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B3 = this._addressesState;
            do {
                value8 = interfaceC17140B3.getValue();
                str = null;
            } while (!interfaceC17140B3.e(value8, AddressesScreenViewState.b(value8, null, CollectionsKt.m(), new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, str, false, null, 16383, null), new AddressDecorator(0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, str, null, false, null, 16383, null), null, false, null, null, null, false, false, false, null, false, 15809, null)));
            return;
        }
        if (Intrinsics.e(action, a.f.f94061a)) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B4 = this._addressesState;
            do {
                value7 = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value7, AddressesScreenViewState.b(value7, null, null, null, null, null, false, null, null, null, false, false, false, null, false, 15359, null)));
            return;
        }
        if (Intrinsics.e(action, a.e.f94060a)) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B5 = this._addressesState;
            do {
                value6 = interfaceC17140B5.getValue();
                addressesScreenViewState3 = value6;
            } while (!interfaceC17140B5.e(value6, AddressesScreenViewState.b(addressesScreenViewState3, null, null, AddressDecorator.f(addressesScreenViewState3.getSavedFormChanges(), 0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 8191, null), null, null, false, null, null, null, false, false, false, null, false, 16379, null)));
            return;
        }
        if (Intrinsics.e(action, a.d.f94059a)) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B6 = this._addressesState;
            do {
                value5 = interfaceC17140B6.getValue();
            } while (!interfaceC17140B6.e(value5, AddressesScreenViewState.b(value5, null, null, null, null, null, false, null, null, null, false, false, false, null, false, 16367, null)));
            return;
        }
        if (action instanceof a.Validate) {
            if (!this.featureManager.e(AbstractC18227f.C18230c.f170570h)) {
                R(((a.Validate) action).getAddress());
            } else if (this._addressesState.getValue().getIsEditMode()) {
                Q(Sh.b.a(((a.Validate) action).getAddress()), false);
            } else {
                A(Sh.b.a(((a.Validate) action).getAddress()), false);
            }
            this.analyticsEngine.h(C14476c.a(this._addressesState.getValue().getIsEditMode() ? "account: address: Edit Address Confirmation" : "account: address: Add New Address Confirmation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.addresses.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.L((TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof a.SelectAddressSuggestion) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B7 = this._addressesState;
            do {
                value4 = interfaceC17140B7.getValue();
                addressesScreenViewState2 = value4;
                List<AddressSuggestionDecorator> listC = addressesScreenViewState2.c();
                arrayList = new ArrayList(CollectionsKt.x(listC, 10));
                for (AddressSuggestionDecorator addressSuggestionDecorator : listC) {
                    arrayList.add(AddressSuggestionDecorator.b(addressSuggestionDecorator, null, null, Intrinsics.e(addressSuggestionDecorator.getTitle(), ((a.SelectAddressSuggestion) action).getTitle()), null, 11, null));
                }
            } while (!interfaceC17140B7.e(value4, AddressesScreenViewState.b(addressesScreenViewState2, null, arrayList, null, null, null, false, null, null, null, false, false, false, null, false, 16381, null)));
            return;
        }
        if (action instanceof a.OnFormFieldChange) {
            S(((a.OnFormFieldChange) action).a());
            return;
        }
        if (action instanceof a.SaveAddress) {
            if (!this.featureManager.e(AbstractC18227f.C18230c.f170570h)) {
                a.SaveAddress saveAddress = (a.SaveAddress) action;
                P(Sh.d.b(saveAddress.getSelectedAddress(), Sh.b.a(saveAddress.getUnsavedFormChanges())));
                return;
            } else if (this._addressesState.getValue().getIsEditMode()) {
                a.SaveAddress saveAddress2 = (a.SaveAddress) action;
                Q(Sh.d.b(saveAddress2.getSelectedAddress(), Sh.b.a(saveAddress2.getUnsavedFormChanges())), true);
                return;
            } else {
                a.SaveAddress saveAddress3 = (a.SaveAddress) action;
                A(Sh.d.b(saveAddress3.getSelectedAddress(), Sh.b.a(saveAddress3.getUnsavedFormChanges())), true);
                return;
            }
        }
        if (Intrinsics.e(action, a.h.f94063a)) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B8 = this._addressesState;
            do {
                value3 = interfaceC17140B8.getValue();
            } while (!interfaceC17140B8.e(value3, AddressesScreenViewState.b(value3, null, CollectionsKt.m(), null, null, null, false, null, null, null, false, false, false, null, false, 16381, null)));
            return;
        }
        if (action instanceof a.SetAsPrimaryAddress) {
            InterfaceC17140B<AddressesScreenViewState> interfaceC17140B9 = this._addressesState;
            do {
                value2 = interfaceC17140B9.getValue();
                addressesScreenViewState = value2;
                addressDecoratorF = AddressDecorator.f(addressesScreenViewState.getUnsavedFormChanges(), 0L, null, null, null, null, null, null, null, null, ((a.SetAsPrimaryAddress) action).getIsEnabled(), null, null, false, null, 15871, null);
            } while (!interfaceC17140B9.e(value2, AddressesScreenViewState.b(addressesScreenViewState, null, null, null, addressDecoratorF, null, H(addressDecoratorF.v()), null, null, null, false, false, false, null, false, 16343, null)));
            return;
        }
        if (action instanceof a.DeleteAddress) {
            if (this.featureManager.e(AbstractC18227f.C18230c.f170570h)) {
                C(((a.DeleteAddress) action).getAddressId());
            } else {
                B(((a.DeleteAddress) action).getAddressId());
            }
            this.analyticsEngine.h(C14476c.a("account: address: Delete Address Confirmation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.addresses.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.M((TrackingData) obj);
                }
            });
            return;
        }
        if (!(action instanceof a.ShowDeleteAddressConfirmationView)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC17140B<AddressesScreenViewState> interfaceC17140B10 = this._addressesState;
        do {
            value = interfaceC17140B10.getValue();
            showDeleteAddressConfirmationView = (a.ShowDeleteAddressConfirmationView) action;
        } while (!interfaceC17140B10.e(value, AddressesScreenViewState.b(value, null, null, null, null, new DeleteAddressDecorator(showDeleteAddressConfirmationView.getAddress().getId(), showDeleteAddressConfirmationView.getAddress().getFirstName().c().e() + ' ' + showDeleteAddressConfirmationView.getAddress().getLastName().c().e(), showDeleteAddressConfirmationView.getAddress().getStreetAddress().c().e(), showDeleteAddressConfirmationView.getAddress().getApartment().getInformation(), showDeleteAddressConfirmationView.getAddress().getCity().c().e() + ", " + showDeleteAddressConfirmationView.getAddress().getState().c().e() + ", " + showDeleteAddressConfirmationView.getAddress().getZipCode().c().e()), false, null, null, null, false, false, false, null, false, 16367, null)));
        this.analyticsEngine.h(C14476c.a("account: address: Delete Address Initiation"), new Function1() { // from class: com.meijer.mobile.accounts.ux.addresses.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.N((TrackingData) obj);
            }
        });
    }

    private final void D() {
        C16648k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    private final boolean H(AddressDecorator addressDecorator) {
        if (addressDecorator.getFirstName().f().isValid() && addressDecorator.getLastName().f().isValid() && ((addressDecorator.getPhoneNumber().c().e().length() == 0 || addressDecorator.getPhoneNumber().f().isValid()) && addressDecorator.getStreetAddress().f().isValid() && addressDecorator.getCity().f().isValid() && addressDecorator.getState().f().isValid() && addressDecorator.getZipCode().f().isValid())) {
            if (!Intrinsics.e(addressDecorator.v(), new AddressDecorator(0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null).v())) {
                if (!Intrinsics.e(addressDecorator.v(), this._addressesState.getValue().getSavedFormChanges().v())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
