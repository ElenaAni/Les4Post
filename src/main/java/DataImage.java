import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
@Setter
@Getter
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import mport com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class DataImage {
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("url")
        private String url;
        @JsonProperty("bio")
        private Object bio;
        @JsonProperty("avatar")
        private String avatar;
        @JsonProperty("avatar_name")
        private String avatarName;
        @JsonProperty("cover")
        private String cover;
        @JsonProperty("cover_name")
        private String coverName;
        @JsonProperty("reputation")
        private Integer reputation;
        @JsonProperty("reputation_name")
        private String reputationName;
        @JsonProperty("created")
        private Integer created;
        @JsonProperty("pro_expiration")
        private Boolean proExpiration;
        @JsonProperty("user_follow")
        private UserFollow userFollow;
        @JsonProperty("is_blocked")
        private Boolean isBlocked;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();
        private final static long serialVersionUID = 2761547574850347905L;


        public void Data() {
        }


        public DataImage(Integer id, String url, Object bio, String avatar, String avatarName, String cover, String coverName, Integer reputation, String reputationName, Integer created, Boolean proExpiration, UserFollow userFollow, Boolean isBlocked) {
            super();
            this.id = id;
            this.url = url;
            this.bio = bio;
            this.avatar = avatar;
            this.avatarName = avatarName;
            this.cover = cover;
            this.coverName = coverName;
            this.reputation = reputation;
            this.reputationName = reputationName;
            this.created = created;
            this.proExpiration = proExpiration;
            this.userFollow = userFollow;
            this.isBlocked = isBlocked;
        }

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        public DataImage withId(Integer id) {
            this.id = id;
            return this;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        public DataImage withUrl(String url) {
            this.url = url;
            return this;
        }

        @JsonProperty("bio")
        public Object getBio() {
            return bio;
        }

        @JsonProperty("bio")
        public void setBio(Object bio) {
            this.bio = bio;
        }

        public DataImage withBio(Object bio) {
            this.bio = bio;
            return this;
        }

        @JsonProperty("avatar")
        public String getAvatar() {
            return avatar;
        }

        @JsonProperty("avatar")
        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public DataImage withAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        @JsonProperty("avatar_name")
        public String getAvatarName() {
            return avatarName;
        }

        @JsonProperty("avatar_name")
        public void setAvatarName(String avatarName) {
            this.avatarName = avatarName;
        }

        public DataImage withAvatarName(String avatarName) {
            this.avatarName = avatarName;
            return this;
        }

        @JsonProperty("cover")
        public String getCover() {
            return cover;
        }

        @JsonProperty("cover")
        public void setCover(String cover) {
            this.cover = cover;
        }

        public DataImage withCover(String cover) {
            this.cover = cover;
            return this;
        }

        @JsonProperty("cover_name")
        public String getCoverName() {
            return coverName;
        }

        @JsonProperty("cover_name")
        public void setCoverName(String coverName) {
            this.coverName = coverName;
        }

        public DataImage withCoverName(String coverName) {
            this.coverName = coverName;
            return this;
        }

        @JsonProperty("reputation")
        public Integer getReputation() {
            return reputation;
        }

        @JsonProperty("reputation")
        public void setReputation(Integer reputation) {
            this.reputation = reputation;
        }

        public DataImage withReputation(Integer reputation) {
            this.reputation = reputation;
            return this;
        }

        @JsonProperty("reputation_name")
        public String getReputationName() {
            return reputationName;
        }

        @JsonProperty("reputation_name")
        public void setReputationName(String reputationName) {
            this.reputationName = reputationName;
        }

        public DataImage withReputationName(String reputationName) {
            this.reputationName = reputationName;
            return this;
        }

        @JsonProperty("created")
        public Integer getCreated() {
            return created;
        }

        @JsonProperty("created")
        public void setCreated(Integer created) {
            this.created = created;
        }

        public DataImage withCreated(Integer created) {
            this.created = created;
            return this;
        }

        @JsonProperty("pro_expiration")
        public Boolean getProExpiration() {
            return proExpiration;
        }

        @JsonProperty("pro_expiration")
        public void setProExpiration(Boolean proExpiration) {
            this.proExpiration = proExpiration;
        }

        public DataImage withProExpiration(Boolean proExpiration) {
            this.proExpiration = proExpiration;
            return this;
        }

        @JsonProperty("user_follow")
        public UserFollow getUserFollow() {
            return userFollow;
        }

        @JsonProperty("user_follow")
        public void setUserFollow(UserFollow userFollow) {
            this.userFollow = userFollow;
        }

        public DataImage withUserFollow(UserFollow userFollow) {
            this.userFollow = userFollow;
            return this;
        }

        @JsonProperty("is_blocked")
        public Boolean getIsBlocked() {
            return isBlocked;
        }

        @JsonProperty("is_blocked")
        public void setIsBlocked(Boolean isBlocked) {
            this.isBlocked = isBlocked;
        }

        public DataImage withIsBlocked(Boolean isBlocked) {
            this.isBlocked = isBlocked;
            return this;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        public DataImage withAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
            return this;
        }




}
