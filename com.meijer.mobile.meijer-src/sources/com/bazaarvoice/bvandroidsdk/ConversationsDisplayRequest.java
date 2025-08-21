package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
abstract class ConversationsDisplayRequest extends ConversationsRequest {
    private final List<QueryPair> extraParams;
    private final List<Filter> filters;
    private final List<Sort> sorts;

    static abstract class Builder<BuilderType> {
        private final List<Filter> filters = new ArrayList();
        private final List<QueryPair> extraParams = new ArrayList();
        private final List<Sort> sorts = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addAdditionalField(String str, String str2) {
            this.extraParams.add(new QueryPair(str, str2));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderType addCustomDisplayParameter(String str, String str2) {
            this.extraParams.add(new QueryPair(str, str2));
            return this;
        }

        protected void addFilter(Filter filter) {
            this.filters.add(filter);
        }

        protected void addSort(Sort sort) {
            this.sorts.add(sort);
        }
    }

    static class QueryPair {
        private final String key;
        private final String value;

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public QueryPair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    List<QueryPair> getExtraParams() {
        return this.extraParams;
    }

    List<Filter> getFilters() {
        return this.filters;
    }

    List<Sort> getSorts() {
        return this.sorts;
    }

    ConversationsDisplayRequest(Builder builder) {
        this.filters = builder.filters;
        this.extraParams = builder.extraParams;
        this.sorts = builder.sorts;
    }
}
