package com.meijer.mobile.accounts.ux.addresses;

import Th.AddressDecorator;
import Th.AddressSuggestionDecorator;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "<init>", "()V", "i", "a", "g", "n", "c", "o", "b", "d", "m", "k", "h", "l", "j", "f", "e", "Lcom/meijer/mobile/accounts/ux/addresses/a$a;", "Lcom/meijer/mobile/accounts/ux/addresses/a$b;", "Lcom/meijer/mobile/accounts/ux/addresses/a$c;", "Lcom/meijer/mobile/accounts/ux/addresses/a$d;", "Lcom/meijer/mobile/accounts/ux/addresses/a$e;", "Lcom/meijer/mobile/accounts/ux/addresses/a$f;", "Lcom/meijer/mobile/accounts/ux/addresses/a$g;", "Lcom/meijer/mobile/accounts/ux/addresses/a$h;", "Lcom/meijer/mobile/accounts/ux/addresses/a$i;", "Lcom/meijer/mobile/accounts/ux/addresses/a$j;", "Lcom/meijer/mobile/accounts/ux/addresses/a$k;", "Lcom/meijer/mobile/accounts/ux/addresses/a$l;", "Lcom/meijer/mobile/accounts/ux/addresses/a$m;", "Lcom/meijer/mobile/accounts/ux/addresses/a$n;", "Lcom/meijer/mobile/accounts/ux/addresses/a$o;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$a;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1328a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1328a f94901a = new C1328a();

        private C1328a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1328a);
        }

        public int hashCode() {
            return -1278947749;
        }

        public String toString() {
            return "AddAddress";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$b;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f94902a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1799515330;
        }

        public String toString() {
            return "Cancel";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$c;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "addressId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$c, reason: from toString */
    public static final /* data */ class DeleteAddress extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long addressId;

        public DeleteAddress(long j10) {
            super(null);
            this.addressId = j10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteAddress) && this.addressId == ((DeleteAddress) other).addressId;
        }

        public int hashCode() {
            return Long.hashCode(this.addressId);
        }

        public String toString() {
            return "DeleteAddress(addressId=" + this.addressId + ')';
        }

        /* renamed from: a, reason: from getter */
        public final long getAddressId() {
            return this.addressId;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$d;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f94904a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 736203120;
        }

        public String toString() {
            return "DeleteAddressConfirmationCancel";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$e;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f94905a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 439800305;
        }

        public String toString() {
            return "DismissErrorNotification";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$f;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f94906a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -312287252;
        }

        public String toString() {
            return "DismissSuccessNotification";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$g;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "LTh/a;", PlaceTypes.ADDRESS, "<init>", "(LTh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTh/a;", "()LTh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$g, reason: from toString */
    public static final /* data */ class EditAddress extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator address;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditAddress) && Intrinsics.e(this.address, ((EditAddress) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "EditAddress(address=" + this.address + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditAddress(AddressDecorator address) {
            super(null);
            Intrinsics.j(address, "address");
            this.address = address;
        }

        /* renamed from: a, reason: from getter */
        public final AddressDecorator getAddress() {
            return this.address;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$h;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class h extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f94908a = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public int hashCode() {
            return 2141562223;
        }

        public String toString() {
            return "EditEnteredAddress";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$i;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class i extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f94909a = new i();

        private i() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return -1123614829;
        }

        public String toString() {
            return "FetchAllAddresses";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$j;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "LHh/a;", "field", "<init>", "(LHh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHh/a;", "()LHh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$j, reason: from toString */
    public static final /* data */ class OnFormFieldChange extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Hh.a<?> field;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnFormFieldChange) && Intrinsics.e(this.field, ((OnFormFieldChange) other).field);
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        public String toString() {
            return "OnFormFieldChange(field=" + this.field + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFormFieldChange(Hh.a<?> field) {
            super(null);
            Intrinsics.j(field, "field");
            this.field = field;
        }

        public final Hh.a<?> a() {
            return this.field;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$k;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "LTh/c;", "selectedAddress", "LTh/a;", "unsavedFormChanges", "<init>", "(LTh/c;LTh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTh/c;", "()LTh/c;", "b", "LTh/a;", "()LTh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$k, reason: from toString */
    public static final /* data */ class SaveAddress extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressSuggestionDecorator selectedAddress;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator unsavedFormChanges;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveAddress)) {
                return false;
            }
            SaveAddress saveAddress = (SaveAddress) other;
            return Intrinsics.e(this.selectedAddress, saveAddress.selectedAddress) && Intrinsics.e(this.unsavedFormChanges, saveAddress.unsavedFormChanges);
        }

        public int hashCode() {
            return (this.selectedAddress.hashCode() * 31) + this.unsavedFormChanges.hashCode();
        }

        public String toString() {
            return "SaveAddress(selectedAddress=" + this.selectedAddress + ", unsavedFormChanges=" + this.unsavedFormChanges + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveAddress(AddressSuggestionDecorator selectedAddress, AddressDecorator unsavedFormChanges) {
            super(null);
            Intrinsics.j(selectedAddress, "selectedAddress");
            Intrinsics.j(unsavedFormChanges, "unsavedFormChanges");
            this.selectedAddress = selectedAddress;
            this.unsavedFormChanges = unsavedFormChanges;
        }

        /* renamed from: a, reason: from getter */
        public final AddressSuggestionDecorator getSelectedAddress() {
            return this.selectedAddress;
        }

        /* renamed from: b, reason: from getter */
        public final AddressDecorator getUnsavedFormChanges() {
            return this.unsavedFormChanges;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$l;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "Lbk/a;", "title", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$l, reason: from toString */
    public static final /* data */ class SelectAddressSuggestion extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f94913b = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a title;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectAddressSuggestion) && Intrinsics.e(this.title, ((SelectAddressSuggestion) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "SelectAddressSuggestion(title=" + this.title + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectAddressSuggestion(AbstractC6392a title) {
            super(null);
            Intrinsics.j(title, "title");
            this.title = title;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$m;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$m, reason: from toString */
    public static final /* data */ class SetAsPrimaryAddress extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEnabled;

        public SetAsPrimaryAddress(boolean z10) {
            super(null);
            this.isEnabled = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetAsPrimaryAddress) && this.isEnabled == ((SetAsPrimaryAddress) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "SetAsPrimaryAddress(isEnabled=" + this.isEnabled + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$n;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "LTh/a;", PlaceTypes.ADDRESS, "<init>", "(LTh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTh/a;", "()LTh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$n, reason: from toString */
    public static final /* data */ class ShowDeleteAddressConfirmationView extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator address;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDeleteAddressConfirmationView) && Intrinsics.e(this.address, ((ShowDeleteAddressConfirmationView) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "ShowDeleteAddressConfirmationView(address=" + this.address + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDeleteAddressConfirmationView(AddressDecorator address) {
            super(null);
            Intrinsics.j(address, "address");
            this.address = address;
        }

        /* renamed from: a, reason: from getter */
        public final AddressDecorator getAddress() {
            return this.address;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/a$o;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "LTh/a;", PlaceTypes.ADDRESS, "<init>", "(LTh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTh/a;", "()LTh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.addresses.a$o, reason: from toString */
    public static final /* data */ class Validate extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressDecorator address;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Validate) && Intrinsics.e(this.address, ((Validate) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "Validate(address=" + this.address + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validate(AddressDecorator address) {
            super(null);
            Intrinsics.j(address, "address");
            this.address = address;
        }

        /* renamed from: a, reason: from getter */
        public final AddressDecorator getAddress() {
            return this.address;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
