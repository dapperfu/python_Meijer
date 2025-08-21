package com.bazaarvoice.bvandroidsdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVTransactionItem {
    private final String category;
    private final String imageUrl;
    private final String name;
    private final double price;
    private final int quantity;
    private final String sku;

    public static class Builder {
        private String sku;
        private String name = "";
        private String imageUrl = "";
        private String category = "";
        private double price = 0.0d;
        private int quantity = 1;

        public BVTransactionItem build() {
            return new BVTransactionItem(this);
        }

        public Builder setCategory(String str) {
            this.category = str;
            return this;
        }

        public Builder setImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setPrice(double d10) {
            this.price = d10;
            return this;
        }

        public Builder setQuantity(int i10) {
            this.quantity = i10;
            return this;
        }

        public Builder(String str) {
            this.sku = str;
        }
    }

    static class Mapper implements BVAnalyticsMapper {
        private BVTransactionItem transactionItem;

        @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
        public Map<String, Object> toRaw() {
            HashMap map = new HashMap();
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "category", this.transactionItem.getCategory());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "imageurl", this.transactionItem.getImageUrl());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "name", this.transactionItem.getName());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "quantity", this.transactionItem.getQuantity());
            BVAnalyticsUtils.mapPutSafe(map, "price", this.transactionItem.getPrice());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "sku", this.transactionItem.getSku());
            return map;
        }

        public Mapper(BVTransactionItem bVTransactionItem) {
            this.transactionItem = bVTransactionItem;
        }
    }

    private BVTransactionItem(Builder builder) {
        this.sku = builder.sku;
        this.name = builder.name;
        this.imageUrl = builder.imageUrl;
        this.category = builder.category;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public String getCategory() {
        return this.category;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getSku() {
        return this.sku;
    }
}
