package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @Getter//全てのクラスフィールドについてgetterを自動生成する
 @Setter//全てのクラスフィールドについてsetterを自動生成する
 @NoArgsConstructor//引数なしコンストラクタを自動生成する
 @AllArgsConstructor //全てのクラスフィールドを引数にもつ引数ありコンストラクタを自動生成する

 public class EmployeeView {

     private Integer id; //id

     private String code; //社員番号

     private String name; //氏名

     private String password; //パスワード

     private Integer adminFlag; //管理者権限があるかどうか

     private LocalDateTime createdAt; //登録日時

     private LocalDateTime updatedAt; //更新日時

     private Integer deleteFlag; //削除された従業員かどうか（現役：0、削除済み：1）
}
