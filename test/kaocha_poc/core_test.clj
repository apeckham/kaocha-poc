(ns kaocha-poc.core-test
  (:require [clojure.test :refer :all]
            [kaocha-poc.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 3))))

(deftest b-test
  (testing "FIXME, I fail."
    (is (= #{:asdf} #{:asdf :zxcv}))))

(deftest c-test
  (testing "FIXME, I fail."
    (is (= (range 1 10) (range 1 11)))))
