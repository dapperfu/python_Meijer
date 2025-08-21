package com.bazaarvoice.bvandroidsdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public final class CurationsFeedRequest {
    final Long after;
    final String author;
    final Long before;
    final String display;
    final Boolean explicit_permission;
    final String externalId;
    final Integer featured;
    final List<String> groups;
    final Boolean has_geotag;
    final Boolean has_link;
    final Boolean has_photo;
    final Boolean has_photo_or_video;
    final Boolean has_video;
    final Boolean include_comments;
    final Double latitude;
    final Integer limit;
    final Double longitude;
    final CurationsMedia media;
    final Integer per_group_limit;
    final List<String> tags;
    final Boolean withProductData;

    public static final class Builder {
        Long after;
        String author;
        Long before;
        String display;
        Boolean explicit_permission;
        String externalId;
        Integer featured;
        List<String> groups;
        Boolean has_geotag;
        Boolean has_link;
        Boolean has_photo;
        Boolean has_photo_or_video;
        Boolean has_video;
        Boolean include_comments;
        Double latitude;
        Integer limit;
        Double longitude;
        CurationsMedia media;
        Integer per_group_limit;
        List<String> tags;
        Boolean withProductData;

        Builder(CurationsFeedRequest curationsFeedRequest) {
            this.groups = curationsFeedRequest.groups;
            this.tags = curationsFeedRequest.tags;
            this.author = curationsFeedRequest.author;
            this.externalId = curationsFeedRequest.externalId;
            this.display = curationsFeedRequest.display;
            this.after = curationsFeedRequest.after;
            this.before = curationsFeedRequest.before;
            this.featured = curationsFeedRequest.featured;
            Integer num = curationsFeedRequest.limit;
            this.limit = num;
            this.per_group_limit = num;
            this.has_geotag = curationsFeedRequest.has_geotag;
            this.withProductData = curationsFeedRequest.withProductData;
            this.has_link = curationsFeedRequest.has_link;
            this.has_photo = curationsFeedRequest.has_photo;
            this.has_video = curationsFeedRequest.has_video;
            this.has_photo_or_video = curationsFeedRequest.has_photo_or_video;
            this.include_comments = curationsFeedRequest.include_comments;
            this.explicit_permission = curationsFeedRequest.explicit_permission;
            this.media = curationsFeedRequest.media;
            this.latitude = curationsFeedRequest.latitude;
            this.longitude = curationsFeedRequest.longitude;
        }

        public Builder after(Long l10) {
            this.after = l10;
            return this;
        }

        public Builder authorTokenOrAlias(String str) {
            this.author = str;
            return this;
        }

        public Builder before(Long l10) {
            this.before = l10;
            return this;
        }

        public CurationsFeedRequest build() {
            return new CurationsFeedRequest(this);
        }

        public Builder display(String str) {
            this.display = str;
            return this;
        }

        @Deprecated
        public Builder explicitPermission(Boolean bool) {
            this.explicit_permission = bool;
            return this;
        }

        public Builder externalId(String str) {
            this.externalId = str;
            return this;
        }

        public Builder featured(Integer num) {
            this.featured = num;
            return this;
        }

        public Builder hasGeoTag(Boolean bool) {
            this.has_geotag = bool;
            return this;
        }

        public Builder hasLink(Boolean bool) {
            this.has_link = bool;
            return this;
        }

        public Builder hasPhoto(Boolean bool) {
            this.has_photo = bool;
            return this;
        }

        public Builder hasPhotoOrVideo(Boolean bool) {
            this.has_photo_or_video = bool;
            return this;
        }

        public Builder hasVideo(Boolean bool) {
            this.has_video = bool;
            return this;
        }

        public Builder includeComments(Boolean bool) {
            this.include_comments = bool;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder location(Double d10, Double d11) {
            this.latitude = d10;
            this.longitude = d11;
            return this;
        }

        public Builder media(CurationsMedia curationsMedia) {
            this.media = curationsMedia;
            return this;
        }

        @Deprecated
        public Builder perGroupLimit(Integer num) {
            this.per_group_limit = num;
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = list;
            return this;
        }

        public Builder withProductData(Boolean bool) {
            this.withProductData = bool;
            return this;
        }

        public Builder(List<String> list) {
            this.groups = list;
        }
    }

    private CurationsFeedRequest(Builder builder) {
        this.groups = builder.groups;
        this.tags = builder.tags;
        this.author = builder.author;
        this.externalId = builder.externalId;
        this.display = builder.display;
        this.after = builder.after;
        this.before = builder.before;
        this.featured = builder.featured;
        this.limit = builder.limit;
        this.per_group_limit = builder.per_group_limit;
        this.has_geotag = builder.has_geotag;
        this.withProductData = builder.withProductData;
        this.has_link = builder.has_link;
        this.has_photo = builder.has_photo;
        this.has_video = builder.has_video;
        this.has_photo_or_video = builder.has_photo_or_video;
        this.include_comments = builder.include_comments;
        this.explicit_permission = builder.explicit_permission;
        this.media = builder.media;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private static String getMediaFormatted(CurationsMedia curationsMedia) {
        if (!StringUtils.isEmpty(curationsMedia.getMediaType())) {
            return String.format("{'%1$s':{'width':%2$d,'height':%3$d}}", curationsMedia.getMediaType(), Integer.valueOf(curationsMedia.getWidth()), Integer.valueOf(curationsMedia.getHeight()));
        }
        throw new IllegalStateException("MediaType cannot be null");
    }

    String toUrlQueryString() {
        Double d10;
        BVSDK bvsdk = BVSDK.getInstance();
        BVUserProvidedData bvUserProvidedData = bvsdk.getBvUserProvidedData();
        HttpUrl.a aVarK = HttpUrl.m(bvsdk.getBvWorkerData().getRootApiUrls().getBazaarvoiceApiRootUrl()).k();
        aVarK.a("curations/c3/content/get").b("client", bvUserProvidedData.getBvConfig().getClientId()).b("passkey", bvUserProvidedData.getBvConfig().getApiKeyCurations());
        List<String> list = this.groups;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = this.groups.iterator();
            while (it.hasNext()) {
                aVarK.b("groups", it.next());
            }
        }
        List<String> list2 = this.tags;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<String> it2 = this.tags.iterator();
            while (it2.hasNext()) {
                aVarK.b("tags", it2.next());
            }
        }
        if (!StringUtils.isEmpty(this.author)) {
            aVarK.b("author", this.author);
        }
        if (!StringUtils.isEmpty(this.externalId)) {
            aVarK.b("externalId", this.externalId);
        }
        if (!StringUtils.isEmpty(this.display)) {
            aVarK.b("display", this.display);
        }
        Long l10 = this.after;
        if (l10 != null) {
            aVarK.b("after", String.valueOf(l10));
        }
        Long l11 = this.before;
        if (l11 != null) {
            aVarK.b("before", String.valueOf(l11));
        }
        Integer num = this.featured;
        if (num != null) {
            aVarK.b("featured", String.valueOf(num));
        }
        Integer num2 = this.limit;
        if (num2 != null) {
            aVarK.b("limit", String.valueOf(num2));
        }
        Integer num3 = this.per_group_limit;
        if (num3 != null) {
            aVarK.b("per_group_limit", String.valueOf(num3));
        }
        Boolean bool = this.has_geotag;
        if (bool != null) {
            aVarK.b("has_geotag", String.valueOf(bool));
        }
        Boolean bool2 = this.withProductData;
        if (bool2 != null) {
            aVarK.b("withProductData", String.valueOf(bool2));
        }
        Boolean bool3 = this.has_link;
        if (bool3 != null) {
            aVarK.b("has_link", String.valueOf(bool3));
        }
        Boolean bool4 = this.has_photo;
        if (bool4 != null) {
            aVarK.b("has_photo", String.valueOf(bool4));
        }
        Boolean bool5 = this.has_video;
        if (bool5 != null) {
            aVarK.b("has_video", String.valueOf(bool5));
        }
        Boolean bool6 = this.has_photo_or_video;
        if (bool6 != null) {
            aVarK.b("has_photo_or_video", String.valueOf(bool6));
        }
        Boolean bool7 = this.include_comments;
        if (bool7 != null) {
            aVarK.b("include_comments", String.valueOf(bool7));
        }
        Boolean bool8 = this.explicit_permission;
        if (bool8 != null) {
            aVarK.b("explicit_permission", String.valueOf(bool8));
        }
        CurationsMedia curationsMedia = this.media;
        if (curationsMedia != null) {
            aVarK.b("media", getMediaFormatted(curationsMedia));
        }
        Double d11 = this.latitude;
        if (d11 != null && (d10 = this.longitude) != null) {
            aVarK.b("geolocation", StringUtils.componentsSeparatedBy(Arrays.asList(d11, d10), ","));
        }
        if (bvsdk.getBvUserProvidedData().getBvMobileInfo().getBvSdkVersion() != null) {
            aVarK.b("_bvAndroidSdkVersion", bvsdk.getBvUserProvidedData().getBvMobileInfo().getBvSdkVersion());
        }
        return aVarK.g().getUrl();
    }
}
