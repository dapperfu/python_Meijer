package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVTransactionItem;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVTransaction {
    private final String city;
    private final String country;
    private final String currency;
    private final List<BVTransactionItem> items;
    private final String orderId;
    private final Map<String, String> otherParams;
    private final double shipping;
    private final String state;
    private final double tax;
    private final double total;

    public static class Builder {
        private String orderId = "";
        private double total = 0.0d;
        private List<BVTransactionItem> items = new ArrayList();
        private Map<String, String> otherParams = new HashMap();
        private double tax = 0.0d;
        private double shipping = 0.0d;
        private String city = "";
        private String state = "";
        private String country = "";
        private String currency = "";

        public BVTransaction build() {
            return new BVTransaction(this);
        }

        public Builder setCity(String str) {
            this.city = str;
            return this;
        }

        public Builder setCountry(String str) {
            this.country = str;
            return this;
        }

        public Builder setCurrency(String str) {
            this.currency = str;
            return this;
        }

        public Builder setItems(List<BVTransactionItem> list) {
            this.items = list;
            return this;
        }

        public Builder setOrderId(String str) {
            this.orderId = str;
            return this;
        }

        public Builder setOtherParams(Map<String, String> map) {
            this.otherParams = map;
            return this;
        }

        public Builder setShipping(double d10) {
            this.shipping = d10;
            return this;
        }

        public Builder setState(String str) {
            this.state = str;
            return this;
        }

        public Builder setTax(double d10) {
            this.tax = d10;
            return this;
        }

        public Builder setTotal(double d10) {
            this.total = d10;
            return this;
        }
    }

    static class Mapper implements BVAnalyticsMapper {
        private BVTransaction transaction;

        @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
        public Map<String, Object> toRaw() {
            HashMap map = new HashMap();
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "city", this.transaction.getCity());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, PlaceTypes.COUNTRY, this.transaction.getCountry());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "currency", this.transaction.getCurrency());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "orderId", this.transaction.getOrderId());
            BVAnalyticsUtils.mapPutSafe(map, "shipping", this.transaction.getShipping());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "state", this.transaction.getState());
            BVAnalyticsUtils.mapPutSafe(map, "tax", this.transaction.getTax());
            BVAnalyticsUtils.mapPutSafe(map, "total", this.transaction.getTotal());
            if (this.transaction.getItems() != null && !this.transaction.getItems().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (BVTransactionItem bVTransactionItem : this.transaction.getItems()) {
                    if (bVTransactionItem != null) {
                        arrayList.add(new BVTransactionItem.Mapper(bVTransactionItem));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((BVTransactionItem.Mapper) it.next()).toRaw());
                }
                BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "items", (List<Map<String, Object>>) arrayList2);
            }
            if (this.transaction.getOtherParams() != null && !this.transaction.getOtherParams().isEmpty()) {
                BVAnalyticsUtils.mapPutAllSafe(map, Collections.unmodifiableMap(this.transaction.getOtherParams()));
            }
            return map;
        }

        public Mapper(BVTransaction bVTransaction) {
            this.transaction = bVTransaction;
        }
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCurrency() {
        return this.currency;
    }

    public List<BVTransactionItem> getItems() {
        return this.items;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public Map<String, String> getOtherParams() {
        return this.otherParams;
    }

    public double getShipping() {
        return this.shipping;
    }

    public String getState() {
        return this.state;
    }

    public double getTax() {
        return this.tax;
    }

    public double getTotal() {
        return this.total;
    }

    BVTransaction(Builder builder) {
        this.orderId = builder.orderId;
        this.total = builder.total;
        this.items = builder.items;
        this.otherParams = builder.otherParams;
        this.tax = builder.tax;
        this.shipping = builder.shipping;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.currency = builder.currency;
    }
}
